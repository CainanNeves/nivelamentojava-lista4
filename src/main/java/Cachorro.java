package main.java;

public class Cachorro extends AnimalTerrestreAB{


    @Override
    public void comer() {
        super.comer();
        this.comidaIngerida += 5;
    }

    @Override
    public void moverse() {
        super.moverse();
        this.caminhoPercorrido += 10;
    }

    @Override
    public void dormir() {
        super.dormir();
        this.horasDormidas += 8;
    }
}
