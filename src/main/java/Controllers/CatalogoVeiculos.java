package Controllers;


import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Models.Interfaces.Veiculo;
import Models.Transaction.VeiculoPassageiros;
import Models.Transaction.VeiculoPasseio;
import Models.Transaction.VeiculoUtilitario;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;



public class CatalogoVeiculos {
    private int countVeiculos;
    private ArrayList<String> listVeiculos = new ArrayList<String>();
    private ArrayList<Veiculo> vcat = new ArrayList<>(10);

    public CatalogoVeiculos() {
        countVeiculos = 0;
    }

    public void initVcat(String pathVeiculosFile) {
        readFileCsv(pathVeiculosFile);

    }

    public int getCountVehicle() {
        return countVeiculos;
    }

    public void setCountVehicle(int countVeiculos) {
        this.countVeiculos = countVeiculos;
    }

    public ArrayList<String> getListVeiculos() {
        return listVeiculos;
    }

    public void setListVeiculos(ArrayList<String> listVeiculos) {
        this.listVeiculos = listVeiculos;
    }

    public void addCountVehicle() {
        this.countVeiculos++;

    }

    public Veiculo consultaPorPlaca(String busca) {

        Veiculo vres = null;
        for (Veiculo veiculo : vcat) {
            if (busca.compareToIgnoreCase(veiculo.getPlaca()) == 0) {
                vres = veiculo;
                break;
            }
        }
        return vres;
    }

    public List<Veiculo> consultaPorMarca(String busca) {

        ArrayList<Veiculo> vres = new ArrayList<>();
        for (Veiculo veiculo : vcat) {
            if (busca.compareToIgnoreCase(veiculo.getMarca()) == 0) {
                vres.add(veiculo);

            }
        }
        return vres;
    }

    public List<Veiculo> consultaPorAno(int busca) {

        ArrayList<Veiculo> vres = new ArrayList<>();
        for (Veiculo veiculo : vcat) {
            if (busca == veiculo.getAno()) {
                vres.add(veiculo);

            }
        }
        return vres;
    }

    public List<Veiculo> consultaPorTipo(String busca) {

        ArrayList<Veiculo> vres = new ArrayList<>();
        for (Veiculo veiculo : vcat) {
            if (busca.compareToIgnoreCase(veiculo.getTipo()) == 0) {
                vres.add(veiculo);

            }
        }
        return vres;
    }


    public void readFileCsv(String pathVeiculoFile) {

        try {
            System.out.println("Reading CSV FILE");
            Reader read = Files.newBufferedReader(Paths.get(pathVeiculoFile));
            CSVParser csvParser = new CSVParser(read, CSVFormat.DEFAULT);

            for (CSVRecord csvRecord : csvParser) {
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1);
                String modelo = csvRecord.get(2);
                double preco = Double.parseDouble(csvRecord.get(3));
                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Placa : " + placa);
                System.out.println("Marca : " + marca);
                System.out.println("Modelo : " + modelo);
                System.out.println("Preco : " + preco);
                System.out.println("---------------\n\n");
            }

        } catch (InvalidPathException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }

    }

}
