import java.util.ArrayList;
import java.util.List;

import Controllers.CatalogoVeiculos;
import Models.Interfaces.Veiculo;

public class FdsCatVeiculos {
    public static void main(String[] args) {
        CatalogoVeiculos cv = new CatalogoVeiculos();
        cv.initVcat();
        List<Veiculo> lv;


        Veiculo vv= cv.consultaPorPlaca("FLL123");
        if(vv==null){
            System.out.println("Placa nao encontrada");
        }else{
            vv.printAtrib();
        }


       lv= cv.consultaPorMarca("GM");
        if(lv.isEmpty()){
            System.out.println("Marca nao encontrada");
        }else{
            for (Veiculo veiculo : lv) {
                veiculo.printAtrib();
            }
        }


        lv= cv.consultaPorAno(2003);
        if(lv.isEmpty()){
            System.out.println("Ano nao encontrado");
        }else{
            for (Veiculo veiculo : lv) {
                veiculo.printAtrib();
            }
        }

        
        lv= cv.consultaPorTipo("Passageiro");
        if(lv.isEmpty()){
            System.out.println("Tipo nao encontrado");
        }else{
            for (Veiculo veiculo : lv) {
                veiculo.printAtrib();
            }
        }

    
    }
}
