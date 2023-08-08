package main.java;

public abstract class AnimalAB implements AnimalIF{
    String nome;
    String tipoAnimal;
    int idade;
    String habitat;
    float altura;
    float peso;
    int comidaIngerida;
    float caminhoPercorrido;
    float horasDormidas;

    @Override
    public void comer() {
        System.out.println("Estou comendo");
    }

    @Override
    public void moverse() {
        System.out.println("Estou me movendo");
    }

    @Override
    public void dormir() {
        System.out.println("Estou dormindo!");
    }
}
