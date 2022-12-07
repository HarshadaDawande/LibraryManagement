package main.java.pluralsight;

/*
Whenever it is invoked on the same object more than once during an execution of a Java application,
hashCode() must consistently return the same value,
provided no information used in equals comparisons on the object is modified.
This value doesn't need to stay consistent from one execution of an application to another execution of the same application.
If two objects are equal according to the equals(Object) method,
calling the hashCode() method on each of the two objects must produce the same value.
If two objects are unequal according to the equals(java.lang.Object) method,
calling the hashCode method on each of the two objects doesn't need to produce distinct integer results.
However, developers should be aware that producing distinct integer results for unequal objects improves the performance of hash tables.
 */
public class StringOperations {
    public static void main(String[] args) {
        String str1 = new String("Harshada");
        String str2 = "harshada";
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
