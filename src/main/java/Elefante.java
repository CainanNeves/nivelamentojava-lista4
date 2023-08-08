package main.java;

public class Elefante extends AnimalTerrestreAB{
    @Override
    public void comer() {
        super.comer();
        this.comidaIngerida += 10;
    }

    @Override
    public void moverse() {
        super.moverse();
        this.caminhoPercorrido += 2;
    }

    @Override
    public void dormir() {
        super.dormir();
        this.horasDormidas += 14;
    }
}
