package Controllers;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CatalogoVeiculos {
    private int countVeiculos;
    private ArrayList<String> listVeiculos = new ArrayList<String>();

    public CatalogoVeiculos() {
        countVeiculos = 0;
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

}
