package Planta;

public class Planta {
    private String nome;

    public Planta(String nome) {
        this.nome = nome;
    }

    public void Crescer() {
        System.out.println(nome + " Está crescendo ");
    }
}
