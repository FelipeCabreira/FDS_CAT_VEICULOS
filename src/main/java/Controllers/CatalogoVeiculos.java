package Controllers;


import java.util.ArrayList;

import Models.Interfaces.Veiculo;
import Models.Transaction.VeiculoPassageiros;
import Models.Transaction.VeiculoPasseio;
import Models.Transaction.VeiculoUtilitario;

public class CatalogoVeiculos {
    private ArrayList<Veiculo> vcat;


    public void initVcat(){
        vcat=new ArrayList<>(10);
        vcat.add(new VeiculoPassageiros("FGS123","GM","Dala",2000,20000,4));
        vcat.add(new VeiculoPassageiros("WER123","KL","Dok",2001,20100,7));
        vcat.add(new VeiculoPassageiros("FGU123","JY","Dill",2009,20500,2));

        vcat.add(new VeiculoUtilitario("FII123","JJ","Dill",2008,20500,5,4)); 
        vcat.add(new VeiculoUtilitario("FLL123","JK","Dill",2007,20500,5,4)); 
        vcat.add(new VeiculoUtilitario("FKK123","JL","Dill",2002,20500,5,4)); 

        vcat.add(new VeiculoPasseio("FFF123","HJ","Dill",2006,20500,15));     
        vcat.add(new VeiculoPasseio("FYY123","AJ","Dill",2005,20500,15));     
        vcat.add(new VeiculoPasseio("FAA123","OJ","Dill",2003,20500,15)); 
    }

    public CatalogoVeiculos() {
        VeiculoPassageiros vp;
        vp = new VeiculoPassageiros();
        System.out.println("INSTANCIA DE VP" + vp);
    }



}
