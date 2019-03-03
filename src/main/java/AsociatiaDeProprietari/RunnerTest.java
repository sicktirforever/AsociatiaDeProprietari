package AsociatiaDeProprietari;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class RunnerTest {

    public static void main(String[] args) {


        Asociatia asociatia1 = null;
        String filename = "C:\\Users\\Andrei\\Desktop\\Asociatia.txt";

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            asociatia1 = (Asociatia) in.readObject();

            in.close();
            file.close();


        }

        catch (IOException ex){
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex){
            System.out.println("ClassNotFound is caught");
        }

        System.out.println(asociatia1.getAllLocatariDupaAp());
        System.out.println(asociatia1.getAllLocatari());
    }
}
