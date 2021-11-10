package main.java.pluralsight;

class Piano{
    void playPiano() {
        System.out.println("Piano Playing...");
    }
}
public class AnonimousClass {
    public static void main(String[] args) {
        Piano p = new Piano(){
            @Override
            void playPiano() {
                System.out.println("Piano Playing...from inner class");
            }
        };
        p.playPiano();
    }
}
