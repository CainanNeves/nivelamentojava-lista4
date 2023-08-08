package main.java;

public class Cachorro extends AnimalTerrestreAB{


    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void moverse() {
        super.moverse();
        this.setCaminhoPercorrido(10);
    }

    @Override
    public void dormir() {
        super.dormir();
        this.setHorasDormidas(10);
    }
}
