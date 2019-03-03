package AsociatiaDeProprietari;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Apartament implements Comparable<Apartament>, Serializable {

    private static final long serialVersionUID = -5796522851114579481L;
    private int numarCamere;
    private ArrayList<Locatar> locatari;
    private int numarApartement;

    public Apartament(int numarCamere, int numarApartement){
        this.locatari = new ArrayList<Locatar>();
        this.numarApartement = numarApartement;
        this.numarCamere = numarCamere;

    }

    public String toString(){
        return "Apartamentul cu numarul: " + numarApartement + " si cu " + numarCamere + " camere: are urmatorii locatari:  " + locatari;
    }

    public void addLocatar(Locatar locatar){

        if (locatari != null && locatar != null) {

            locatari.add(locatar);
        }


    }

    public void removeLocatar(Locatar locatar){

        if (locatari != null && locatar != null)

        locatari.remove(locatar);
    }



    public ArrayList<Locatar> getLocatari() {
        return locatari;
    }



    public ArrayList<Locatar> getAllLocatarSort(){

        System.out.println("Locatari name sorting: ");

        Collections.sort(locatari, Locatar.ComparatorByName);

        return locatari;
    }


    public int getNumarApartement() {
        return numarApartement;
    }

    @Override
    public int compareTo(Apartament o) {
        return this.numarApartement - o.numarApartement;
    }
}
