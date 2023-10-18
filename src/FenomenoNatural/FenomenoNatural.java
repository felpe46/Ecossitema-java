package FenomenoNatural;

public class FenomenoNatural {
    private String nome;

    public FenomenoNatural(String nome) {
        this.nome = nome;
    }

    public void Ocorrer() {
        System.out.println("Uma " + nome + " está ocorrendo");
    }
}