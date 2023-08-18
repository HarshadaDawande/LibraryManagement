package streams_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Application {

    private static List<City> citiesJapan = Arrays.asList(
            City.builder().name("Tokyo").pollution(10000).build(),
            City.builder().name("Kyoto").pollution(5000).build()
    );
    private static List<City> citiesIndia = Arrays.asList(
            City.builder().name("Mumbai").pollution(5000).build(),
            City.builder().name("Nagpur").pollution(2000).build(),
            City.builder().name("Delhi").pollution(3000).build()
    );
    private static List<Country> countries = Arrays.asList(
            Country.builder().name("Japan").cities(citiesJapan).build(),
            Country.builder().name("India").cities(citiesIndia).build()
    );

    public static void main(String[] args) {
        for (Country country : countries) {
            City maxPollutedCity = country.getCities().stream().max(Comparator.comparingInt(City::getPollution))
                .orElseThrow(NoSuchElementException::new);
            System.out.println(maxPollutedCity.getName());
        }
        countries.stream()
                .map(country1 -> country1.getCities().stream()
                        .max(Comparator.comparingInt(City::getPollution))).toList()
                .forEach(System.out::println);
        countries.stream()
                .map(country1 -> (long) country1.getCities().size())
                .sorted(Comparator.reverseOrder())
                .toList()
                .forEach(System.out::println);
    }

    private static List<City> getLargestCities() {
        return countries.stream()
                .map(country1 -> country1.getCities().stream().max(Comparator.comparingInt(City::getPollution)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
