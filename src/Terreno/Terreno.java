package Terreno;


public class Terreno {
    private String tipo;

    public Terreno(String tipo) {
        this.tipo = tipo;
    }

    public void Descricao() {
        System.out.println("Este terreno é do tipo " + tipo + " plana");
    }
}