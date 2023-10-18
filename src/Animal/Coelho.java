package Animal;

public class Coelho {
    private String nome;
    private char representacao = 'C';

    public Coelho(String nome,char representacao) {
        this.nome = nome;
        this.representacao = 'C';
    }

    public void Comer() {
        System.out.println(nome + " Vai comer as plantas ");
    }
}