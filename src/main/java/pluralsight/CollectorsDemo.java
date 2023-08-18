package pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class CollectorsDemo {

    public static List<Person> createPeople(){
        return Arrays.asList(new Person("sara" , 42),
       new Person("bob" , 39),
       new Person("sara" , 36),
       new Person("jack" , 42),
       new Person("jill" , 39),
       new Person("bob" , 36));
    }
    public static void main(String[] args) {

        List<Person> people = createPeople();
        System.out.println(
        people.stream()
                .collect(Collectors.toMap(
                        person -> person.getName()+"-"+person.getAge(),
                        person->person))
        );
    }
}
