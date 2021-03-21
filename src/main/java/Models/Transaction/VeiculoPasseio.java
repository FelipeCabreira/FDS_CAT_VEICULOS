package Models.Transaction;

import Models.Interfaces.Veiculo;

public class VeiculoPasseio implements Veiculo {
    public  String placa;
    public  String marca;
    public  String modelo;
    public  int ano;
    public  double valor;
    public double kmLitro;
    
    
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
        return this.placa;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public double getValor() {
        return 0;
    }

    private double consumoKmLt(){
        return 0;
    }

    @Override
    public void printAtrib() {
        System.out.println("Tipo: Passeio Placa: "+this.placa+" Marca: "+this.marca+" Modelo: "+this.modelo+" Ano: "+this.ano+" Valor: "+this.valor+" Consumo KM por Litro: "+this.kmLitro );
        
    }
}
