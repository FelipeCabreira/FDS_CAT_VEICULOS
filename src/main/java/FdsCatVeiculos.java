import java.util.ArrayList;
import java.util.List;

import Controllers.CatalogoVeiculos;
import Models.Interfaces.Veiculo;

public class FdsCatVeiculos {
    public static void main(String[] args) {
        CatalogoVeiculos cv = new CatalogoVeiculos();
        cv.initVcat();
        List<Veiculo> lv= cv.consultaPorPlaca("FAA123");
        System.out.println(lv.get(0));
    
    }
}
