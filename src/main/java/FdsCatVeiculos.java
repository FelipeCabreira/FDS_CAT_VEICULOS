import Controllers.CatalogoVeiculos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FdsCatVeiculos {
    public static void main(String[] args) {
        consoleApplication();
    }

    public static void consoleApplication() {
        System.out.println("");
        startVehicleCatalog();

    }

    public static void startVehicleCatalog() {
        CatalogoVeiculos cv = new CatalogoVeiculos();

        try {
            System.out.println(">>>>> Class instancied");
            System.out.println(">>>>> ######");
            System.out.println(">>>>> ######");
            File file = new File("C:\\Users\\felipe_cabreira\\IdeaProjects\\PUCRS\\FDS\\src\\main\\resources\\DB_Veiculos.txt");
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
