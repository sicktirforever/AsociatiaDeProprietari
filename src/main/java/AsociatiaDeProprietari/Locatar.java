package AsociatiaDeProprietari;

import java.io.Serializable;
import java.util.Comparator;

public class Locatar implements Serializable {


    private static final long serialVersionUID = -1289140295281808508L;
    private String name;
    private Apartament apartament;

    public Locatar(String name, Apartament apartament){
        this.name = name;
        this.apartament = apartament;
    }

    public String toString(){
        return this.name + " " + this.apartament.getNumarApartement();
    }



    public static class ComparatorByNume implements Comparator<Locatar>{


        @Override
        public int compare(Locatar o1, Locatar o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static class ComparatorByApartament implements Comparator<Locatar>{


        @Override
        public int compare(Locatar o1, Locatar o2) {

            return o1.apartament.compareTo(o2.apartament);

        }
    }
    public static Comparator<Locatar> ComparatorByName = new Comparator<Locatar>() {
        @Override
        public int compare(Locatar o1, Locatar o2) {

            return o1.name.compareTo(o2.name);
        }

    };
}
