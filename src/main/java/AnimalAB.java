package main.java;

public abstract class AnimalAB implements AnimalIF{
    private String nome;
    private String tipoAnimal;
    private int idade;
    private String habitat;
    private float altura;
    private float peso;
    private int comidaIngerida;
    private float caminhoPercorrido;
    private float horasDormidas;

    public int getComidaIngerida() {
        return comidaIngerida;
    }

    public void setComidaIngerida(int comidaIngerida) {
        this.comidaIngerida = comidaIngerida;
    }

    public float getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public void setCaminhoPercorrido(float caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    public float getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(float horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void comer() {
        this.comidaIngerida += 10;
        System.out.println("Estou comendo!");
    }
    public void moverse() {
        System.out.println("Estou me movendo");
    }

    public void dormir() {
        System.out.println("Vou dormir!");
    }
}
