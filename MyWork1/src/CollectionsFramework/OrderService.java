package CollectionsFramework;

import java.util.*;

public class OrderService {
    private final Map<String, OrderDetails> ordersMap = new HashMap<>();

    // Вспомогательный класс для хранения связи Заказа и его позиций
    private static class OrderDetails {
        final Order order;
        final List<String> items;

        OrderDetails(Order order) {
            this.order = order;
            this.items = new ArrayList<>();
        }
    }

    public void addItem(Order order, String item) {
        ordersMap.computeIfAbsent(order.getId(), k -> new OrderDetails(order))
                .items.add(item);
    }

    public List<String> getItems(Order order) {
        if (order == null) return Collections.emptyList();
        OrderDetails details = ordersMap.get(order.getId());
        return details != null ? details.items : Collections.emptyList();
    }

    public void removeOrder(Order order) {
        if (order == null) return;
        ordersMap.remove(order.getId());
    }

    public List<Order> getOrdersSortedByDate() {
        List<Order> orders = new ArrayList<>();
        for (OrderDetails details : ordersMap.values()) {
            orders.add(details.order);
        }
        orders.sort(Comparator.comparing(Order::getDate, Comparator.nullsLast(Date::compareTo)));
        return orders;
    }
}

class Order {
    private String id;
    private Date date;

    public Order(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return  true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date);
    }

    @Override
    public String toString() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return "Заказ{id='" + id + "', дата=" + sdf.format(date) + "}";
    }
}

class OrderServiceTest {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Calendar cal = Calendar.getInstance();

        cal.set(2026, Calendar.OCTOBER, 1);
        Date dateFuture = cal.getTime(); // 1 октября 2026

        cal.set(2026, Calendar.SEPTEMBER, 30);
        Date datePresent = cal.getTime(); // 30 сентября 2026

        cal.set(2026, Calendar.SEPTEMBER, 15);
        Date datePast = cal.getTime();

        Order order1 = new Order("ORD-001", datePresent);
        Order order2 = new Order("ORD-002", datePast);
        Order order3 = new Order("ORD-003", dateFuture);

        System.out.println("--- 🧪 Шаг 1: Добавление товаров в заказы ---");
        orderService.addItem(order1, "Ноутбук");
        orderService.addItem(order1, "Мышка");

        orderService.addItem(order2, "Смартфон");

        orderService.addItem(order3, "Книга по Java");

        System.out.println("Товары для заказа ORD-001: " + orderService.getItems(order1));
        System.out.println("Товары для заказа ORD-003: " + orderService.getItems(order3));

        System.out.println("\n--- 📅 Шаг 2: Тестирование сортировки по дате ---");
        System.out.println("Ожидаемый порядок: ORD-002 (15 сент), ORD-001 (30 сент), ORD-003 (1 окт)");

        int rank = 1;
        for (Order order : orderService.getOrdersSortedByDate()) {
            System.out.println(rank++ + ". " + order);
        }

        System.out.println("\n--- ❌ Шаг 3: Удаление заказа ---");
        System.out.println("Удаляем заказ ORD-001...");
        orderService.removeOrder(order1);

        System.out.println("Список товаров удаленного заказа (должен быть пустой): " + orderService.getItems(order1));
        System.out.println("Оставшиеся заказы в системе после сортировки:");

        rank = 1;
        for (Order order : orderService.getOrdersSortedByDate()) {
            System.out.println(rank++ + ". " + order);
        }
    }
}
