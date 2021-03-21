import java.util.ArrayList;

import Controllers.CatalogoVeiculos;
import Models.Interfaces.Veiculo;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FdsCatVeiculos {
    public static void main(String[] args) {
        try {
            initialize();

        } catch (NullPointerException e) {
            System.out.println("ERROR MAIN: " + e.getMessage());
        }
    }

    public static void initialize() {

        System.out.println("ALO");
        populateVehicleList();
        consultVehicleCatalog();
    }

    public static void consultVehicleCatalog() {
        CatalogoVeiculos cv = new CatalogoVeiculos();

        cv.initVcat();
        List<Veiculo> lv;


        Veiculo vv = cv.consultaPorPlaca("FLL123");
        if (vv == null) {
            System.out.println("Placa nao encontrada");
        } else {
            vv.printAtrib();
        }


        lv = cv.consultaPorMarca("GM");
        if (lv.isEmpty()) {
            System.out.println("Marca nao encontrada");
        } else {
            for (Veiculo veiculo : lv) {
                veiculo.printAtrib();
            }
        }


        lv = cv.consultaPorAno(2003);
        if (lv.isEmpty()) {
            System.out.println("Ano nao encontrado");
        } else {
            for (Veiculo veiculo : lv) {
                veiculo.printAtrib();
            }
        }


        lv = cv.consultaPorTipo("Passageiro");
        if (lv.isEmpty()) {
            System.out.println("Tipo nao encontrado");
        } else {
            for (Veiculo veiculo : lv) {
                veiculo.printAtrib();
            }
        }
    }

    public static void populateVehicleList() {
        CatalogoVeiculos cv = new CatalogoVeiculos();

        try {
            System.out.println(">>>>> Class instancied");
            System.out.println(">>>>> ######");
            System.out.println(">>>>> ######");
            File file = new File("./\\src\\main\\resources\\DB_Veiculos.txt");
            System.out.println(">>>>> File: ... ---- " + file.getName());
            System.out.println(">>>>> Reading file from: ... ---- " + file.getPath());
            ArrayList<String> names = new ArrayList<String>();
            Scanner in = new Scanner(file);
            System.out.println(">>>>> Scanner instancied");
            System.out.println(">>>>> Reading file");

            while (in.hasNextLine()) {
                cv.addCountVehicle();
                names.add(in.nextLine());
            }
            System.out.println("A total of " + cv.getCountVehicle() + " vehicles were added to the list");
            System.out.println(">>>>> Finished");
            System.out.println(">>>>> #######");
            System.out.println(">>>>> #######");
            System.out.println(">>>>> Sort file");
            Collections.sort(names);
            for (int i = 0; i < names.size(); ++i) {
                System.out.println(names.get(i));
            }
            System.out.println(">>>>> Finished");


        } catch (IOException io) {
            System.out.println("Error: " + io.getMessage());
        }

    }

}
