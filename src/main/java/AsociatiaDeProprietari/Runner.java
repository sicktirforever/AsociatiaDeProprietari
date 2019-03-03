package AsociatiaDeProprietari;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Runner {

    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {



        Apartament ap1 = new Apartament(3, 1);
        Apartament ap3 = new Apartament(4,3);
        Apartament ap2 = new Apartament(2,2);

        ArrayList<Apartament> apartaments = new ArrayList<Apartament>();

        apartaments.add(ap3);
        apartaments.add(ap1);
        apartaments.add(ap2);

        Locatar loc1 = new Locatar("Andrei", ap1);
        Locatar loc2 = new Locatar("Mihai", ap1);

        Locatar loc4 = new Locatar("Florian", ap3);
        Locatar loc3 = new Locatar("Gigel", ap2);

        ap1.addLocatar(loc1);
        ap1.addLocatar(loc2);

        ap3.addLocatar(loc4);
        ap2.addLocatar(loc3);

       Asociatia asociatia = new Asociatia(apartaments);

       LOGGER.info(String.valueOf(asociatia));

       LOGGER.info(String.valueOf(asociatia.getAllLocatariDupaAp()));

       LOGGER.info(String.valueOf(asociatia.getAllLocatari()));
        System.out.println(asociatia);


        System.out.println(asociatia.getAllLocatari());

        System.out.println(asociatia.getAllLocatariDupaAp());


        asociatia.save();
    }
    }

