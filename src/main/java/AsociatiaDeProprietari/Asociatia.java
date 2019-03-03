package AsociatiaDeProprietari;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Asociatia implements Serializable {


    private static final long serialVersionUID = -7640748582590397102L;
    private ArrayList<Apartament> apartamente;



    public Asociatia(ArrayList<Apartament> apartamente){
        this.apartamente = apartamente;
    }

    public String toString(){
        return "" + apartamente;
    }

    public ArrayList<Locatar> getAllLocatari(){

        ArrayList<Locatar> tempLocatari = new ArrayList<Locatar>();

        for (Apartament ap : apartamente){
            tempLocatari.addAll(ap.getLocatari());
        }
        Collections.sort(tempLocatari, new Locatar.ComparatorByNume());

        return tempLocatari;
    }

    public ArrayList<Locatar> getAllLocatariDupaAp(){

        ArrayList<Locatar> tempLocatari = new ArrayList<Locatar>();
        for (Apartament ap : apartamente){
            tempLocatari.addAll(ap.getLocatari());
        }

        Collections.sort(tempLocatari, new Locatar.ComparatorByApartament());

        return tempLocatari;
    }

    public void save(){

        String filename = "C:\\Users\\Andrei\\Desktop\\Asociatia.txt";

        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);

            out.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println("IOException is caught");
        }
    }




}
