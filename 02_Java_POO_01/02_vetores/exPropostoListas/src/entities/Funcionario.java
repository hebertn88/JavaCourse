package entities;

public class Funcionario {
    private final Integer id;
    private final String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId(){
        return id;
    }

    public void aumentaSalario(Double porcentagem) {
        salario += salario * porcentagem / 100;
    }
    public String toString(){
        return String.format("%d, %s, %.2f", id, nome, salario);
    }

    
}
