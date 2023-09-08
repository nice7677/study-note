package kr.springboot.functionalinterface;

public class App {

    public static void main(String[] args) {

        Book ddd = new Ddd();

        ddd.read();

        Book objects = new Objects();

        objects.read();


    }

}
