package entities;

public class PessoaFisica extends Contribuinte {
    Double gastosSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        double soma = 0;
        if (rendaAnual < 20000) {
            soma = rendaAnual * 0.15 - gastosSaude * 0.5;
        } else {
            soma = rendaAnual * 0.25 - gastosSaude * 0.5;
        }

        if (soma > 0) {
            return soma;
        }

        return 0;

    }
}
