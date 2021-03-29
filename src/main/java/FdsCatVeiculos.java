import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
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
        consultVehicleCatalog();
    }

    public static void consultVehicleCatalog() {
        consultasVeiculoPasseio();
        consultasVeiculoPassageiros();
        consultasVeiculoUtilitario();
    }

    public static void consultasVeiculoPasseio() {
        CatalogoVeiculos cv = new CatalogoVeiculos();

        String path = "src/main/java/DB_VeiculoPasseio.csv";

        cv.initVcat(path);
        System.out.println("FILE - VEICULO PASSEIO");

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

    public static void consultasVeiculoPassageiros() {
        CatalogoVeiculos cv2 = new CatalogoVeiculos();

        String path = "src/main/java/DB_VeiculoPassageiros.csv";

        cv2.initVcat(path);
        System.out.println("FILE - VEICULO PASSAGEIROS");

        List<Veiculo> lv2;

        Veiculo vv2 = cv2.consultaPorPlaca("FLL123");
        if (vv2 == null) {
            System.out.println("Placa nao encontrada");
        } else {
            vv2.printAtrib();
        }

        lv2 = cv2.consultaPorMarca("GM");
        if (lv2.isEmpty()) {
            System.out.println("Marca nao encontrada");
        } else {
            for (Veiculo veiculo : lv2) {
                veiculo.printAtrib();
            }
        }

        lv2 = cv2.consultaPorAno(2003);
        if (lv2.isEmpty()) {
            System.out.println("Ano nao encontrado");
        } else {
            for (Veiculo veiculo : lv2) {
                veiculo.printAtrib();
            }
        }
    }

    public static void consultasVeiculoUtilitario() {

        CatalogoVeiculos cv3 = new CatalogoVeiculos();

        String path = "src/main/java/DB_VeiculoUtilitario.csv";

        cv3.initVcat(path);
        System.out.println("FILE - VEICULO UTILITARIO");

        List<Veiculo> lv3;

        Veiculo vv3 = cv3.consultaPorPlaca("FLL123");
        if (vv3 == null) {
            System.out.println("Placa nao encontrada");
        } else {
            vv3.printAtrib();
        }

        lv3 = cv3.consultaPorMarca("GM");
        if (lv3.isEmpty()) {
            System.out.println("Marca nao encontrada");
        } else {
            for (Veiculo veiculo : lv3) {
                veiculo.printAtrib();
            }
        }

        lv3 = cv3.consultaPorAno(2003);
        if (lv3.isEmpty()) {
            System.out.println("Ano nao encontrado");
        } else {
            for (Veiculo veiculo : lv3) {
                veiculo.printAtrib();
            }
        }
    }

}
