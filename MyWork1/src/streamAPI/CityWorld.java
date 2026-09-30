package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CityWorld {
    public static void main(String[] args) {
        List<City> cities = Arrays.asList(new City("Russia", "Moscow")
                , new City("Belarus", "Minsk"), new City("Ukraine", "Kiev")
                , new City("Russia", "Tver"), new City("Russia", "Smolensk"));

       String result = cities.stream()
               .filter(city -> "Russia".equals(city.getCountry()))
               .map(City::getName)
               .sorted(Comparator.comparingInt(String::length).reversed())
               .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

class City {
    private String country;
    private String name;

    public City(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
