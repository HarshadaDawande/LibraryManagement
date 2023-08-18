package streams_practice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Application2 {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                Movie.builder().name("Movie1").directorName("D1").year(LocalDate.of(2000, 01, 01)).build(),
                Movie.builder().name("Movie2").directorName("D1").year(LocalDate.of(2001, 01, 01)).build(),
                Movie.builder().name("Movie3").directorName("D2").year(LocalDate.of(2002, 01, 01)).build(),
                Movie.builder().name("Movie4").directorName("D2").year(LocalDate.of(2000, 01, 01)).build()
        );
        Stream<String> directorMovie =
                movies.stream()
                        .map(Movie::getDirectorName);
        System.out.println(directorMovie.collect(Collectors.joining(",")));

        Map<String, Long> directorMovieCounts = movies.stream()
                .collect(
                        Collectors.groupingBy(Movie::getDirectorName, Collectors.counting()));
        System.out.println(directorMovieCounts);

        Map<LocalDate, Long> yearMovieCounts = movies.stream()
                .collect(
                        Collectors.groupingBy(Movie::getYear, Collectors.counting()));
        System.out.println(yearMovieCounts);
    }
}
