package hashcode_equals.entities.application;

import hashcode_equals.entities.Client;

public class Program {

    public static void main(String[] args) {
//        String a = "Maria";
//        String b = "Alex";
//        System.out.println(a.equals(b));

//        String a = "Alex";
//        String b = "Maria";
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "teste";
        String s2 = "teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

        System.out.println(s1 == s2);
    }
}
