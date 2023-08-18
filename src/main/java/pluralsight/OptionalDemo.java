package pluralsight;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Throwable {

        Person person1 = new Person("Harshada" , 42);
        Person person2 = new Person("xxxx" ,
                0);

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional optionalAge = Optional.ofNullable(person1.getAge());
        System.out.println(optionalAge);

        Optional optionalAge2 = Optional.ofNullable(person2.getAge());
        System.out.println(optionalAge2.orElseThrow(()->new IllegalArgumentException("Email not present")));
        System.out.println(optionalAge2.orElse(100));
    }
}
