package Controllers;


import java.util.ArrayList;

import Models.Interfaces.Veiculo;
import Models.Transaction.VeiculoPassageiros;

public class CatalogoVeiculos {
    private ArrayList<Veiculo> vcat;


    public void initVcat(){
        vcat=new ArrayList<>(10);    
    }

    public CatalogoVeiculos() {
        VeiculoPassageiros vp;
        vp = new VeiculoPassageiros();
        System.out.println("INSTANCIA DE VP" + vp);
    }



}
