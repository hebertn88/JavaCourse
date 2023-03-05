package entities;

public class Estudante {
    private final String nome;
    private final String email;

    public Estudante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return String.format("%s, %s", nome, email);
    }
}
