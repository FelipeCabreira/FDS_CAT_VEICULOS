package Models.Transaction;

import Models.Interfaces.Veiculo;

public class VeiculoUtilitario implements Veiculo {
    public  String placa;
    public  String marca;
    public  String modelo;
    public  int ano;
    public  double valor;
    public int capTon;
    public int numEixos;
    
    
    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int cap, int nEixos) {
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.valor=valor;
        this.capTon=cap;
        this.numEixos=nEixos;
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

    private int capCargaTon(){
        return 0;
    }

    private int nroEixos(){
        return 0;
    }
}
