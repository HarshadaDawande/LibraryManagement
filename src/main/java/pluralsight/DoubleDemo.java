package main.java.pluralsight;

public class DoubleDemo {

    public static void main(String[] args) {
        double x;
        double y;
        double z;

        x=10.123; y=5.123; z=15.246;
        x=10.5; y=5.5; z=16;
        System.out.println(x+y);
        System.out.println(x + y == z);
//        assertThat(36.34 + 21.35, is(closeTo(57.69, 0.001)));
//        assertEquals(36.34 + 21.35, 57.69);
//        assertThat(36.34 + 21.35, is(57.69));
//        assertEquals(36.34 + 21.35, 57.69, 0.001);
    }
}
