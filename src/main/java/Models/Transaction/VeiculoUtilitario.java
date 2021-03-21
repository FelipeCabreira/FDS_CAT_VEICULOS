package Models.Transaction;

import Models.Interfaces.Veiculo;

public class VeiculoUtilitario implements Veiculo    {
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
