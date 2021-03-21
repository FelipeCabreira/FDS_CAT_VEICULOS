package Models.Transaction;

import Models.Interfaces.Veiculo;

public class VeiculoPassageiros implements Veiculo {
    public int numPassageiros=0;
    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nPass) {
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.valor=valor;
        this.numPassageiros=nPass;
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

    private int nroPass (){
        return 0;
    }
}
