package Controllers;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Models.Interfaces.Veiculo;
import Models.Transaction.VeiculoPassageiros;
import Models.Transaction.VeiculoPasseio;
import Models.Transaction.VeiculoUtilitario;

public class CatalogoVeiculos {
    private int countVeiculos;
    private ArrayList<String> listVeiculos = new ArrayList<String>();
    private ArrayList<Veiculo> vcat = new ArrayList<>(10);

    public CatalogoVeiculos() {
        countVeiculos = 0;
    }

    public void initVcat() {
        vcat.add(new VeiculoPassageiros("FGS123", "GM", "Dala", 2000, 20000, 4));
        vcat.add(new VeiculoPassageiros("WER123", "KL", "Dok", 2001, 20100, 7));
        vcat.add(new VeiculoPassageiros("FGU123", "JY", "Dill", 2009, 20500, 2));

        vcat.add(new VeiculoUtilitario("FII123", "JJ", "Dill", 2008, 20500, 5, 4));
        vcat.add(new VeiculoUtilitario("FLL123", "GM", "Dill", 2007, 20500, 5, 4));
        vcat.add(new VeiculoUtilitario("FKK123", "JL", "Dill", 2003, 20500, 5, 4));

        vcat.add(new VeiculoPasseio("FFF123", "HJ", "Dill", 2006, 20500, 15));
        vcat.add(new VeiculoPasseio("FYY123", "AJ", "Dill", 2005, 20500, 15));
        vcat.add(new VeiculoPasseio("FAA123", "OJ", "Dill", 2003, 20500, 15));
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



}
