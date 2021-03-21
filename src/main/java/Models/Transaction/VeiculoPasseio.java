package Models.Transaction;

import Models.Interfaces.Veiculo;

public class VeiculoPasseio implements Veiculo {
    public double kmLitro=0;
    
    
    public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valor, int kmLt) {
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.valor=valor;
        this.kmLitro=kmLt;
    }

    @Override
    public String getPlaca() {
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public int getAno() {
        return 0;
    }

    @Override
    public double getValor() {
        return 0;
    }

    private double consumoKmLt(){
        return 0;
    }
}
