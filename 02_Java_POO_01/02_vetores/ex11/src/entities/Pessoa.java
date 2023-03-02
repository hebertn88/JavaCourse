package entities;

public class Pessoa {
    private char genero;
    private double altura;

    public Pessoa(char genero, double altura) {
        this.genero = genero;
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
