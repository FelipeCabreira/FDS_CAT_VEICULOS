import java.util.ArrayList;
import java.util.List;

import Controllers.CatalogoVeiculos;
import Models.Interfaces.Veiculo;

public class FdsCatVeiculos {
    public static void main(String[] args) {
        CatalogoVeiculos cv = new CatalogoVeiculos();
        cv.initVcat();
        List<Veiculo> lv= cv.consultaPorPlaca("FL3123");
        if(lv.isEmpty()){
            System.out.println("Placa nao encontrada");
        }else{
            System.out.println(lv.get(0));
            lv.get(0).printAtrib();
        }
       lv= cv.consultaPorMarca("GM");
        if(lv.isEmpty()){
            System.out.println("Marca nao encontrada");
        }else{
            for (Veiculo veiculo : lv) {
                veiculo.printAtrib();
            }
        }
    
    }
}
