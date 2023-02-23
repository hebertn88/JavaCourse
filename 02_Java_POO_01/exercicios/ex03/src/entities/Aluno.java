package entities;

public class Aluno {
    public String nome;
    public double nota1, nota2, nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltando() {
        if (this.notaFinal() < 60.00 ) {
            return 60.00 - this.notaFinal();
        } else {
            return 0.00;
        }
    }
}
