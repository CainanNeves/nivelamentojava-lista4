package main.java;

public class Main {
    public static void main(String[] args) {
        Cachorro athena = new Cachorro();
        athena.comer();
        athena.comer();
        System.out.println(athena.getComidaIngerida());
    }
}