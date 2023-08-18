package streams_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Application {

    private static List<City> citiesJapan = Arrays.asList(
            City.builder().name("Tokyo").pollution(10000).build(),
            City.builder().name("Kyoto").pollution(5000).build()
    );
    private static List<City> citiesIndia = Arrays.asList(
            City.builder().name("Mumbai").pollution(2000).build(),
            City.builder().name("Delhi").pollution(3000).build()
    );
    private static List<Country> countries = Arrays.asList(
            Country.builder().name("Japan").cities(citiesJapan).build(),
            Country.builder().name("Japan").cities(citiesIndia).build()
    );

    public static void main(String[] args) {
        for (Country country : countries) {
            City maxPollutedCity = country.getCities().stream().max(Comparator.comparingInt(City::getPollution))
                .orElseThrow(NoSuchElementException::new);
            System.out.println(maxPollutedCity.getName());
        }
        countries.stream()
                .map(country1 -> country1.getCities().stream().max(Comparator.comparingInt(City::getPollution)))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    private static List<Optional<City>> getLargestCities() {
        return countries.stream()
                .map(country1 -> country1.getCities().stream().max(Comparator.comparingInt(City::getPollution)))
//                .map(Optional::orElseThrow)
                .collect(Collectors.toList());
    }
}
