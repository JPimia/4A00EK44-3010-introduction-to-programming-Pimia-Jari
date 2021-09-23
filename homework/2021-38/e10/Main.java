import java.io.Console;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        boolean loop = true;


        System.out.println("Anna nimia");
        String [] nimiTaulukko = new String[10];

        do {
            for(int i = 0; i < nimiTaulukko.length; i++){
                
                nimiTaulukko[i] = c.readLine();

                if(nimiTaulukko[i].equals("lopeta")){
                    loop = false;
                    break;
                }
            }
        } while (loop);
        
    }
}