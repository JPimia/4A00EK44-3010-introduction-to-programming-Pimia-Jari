import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        boolean loop = true;
        int indeksi = 0;


        System.out.println("Anna nimia");
        String [] nimiTaulukko = new String[10];

        do {
            String name = c.readLine(); // kysytään eka nimiä
            if(name.equalsIgnoreCase("lopeta")){
                loop = false;
            } else {
                nimiTaulukko[indeksi] = name; // tallennetaan nimiä taulukkoon
                indeksi++;

                if(indeksi >= nimiTaulukko.length){ // jos taulukko on täynnä
                    String [] newArray = new String [2*nimiTaulukko.length]; // tee uusi joka on 2x vanha taulukko
                    for(int i = 0; i < nimiTaulukko.length; i++){ 
                        newArray[i] = nimiTaulukko[i]; // siirretään sisältö vanhasta uuteen
                    }
                    nimiTaulukko = newArray; // korvaa vanha uudella
                }
            }
        } while (loop);

        System.out.println("annetut nimet:");

        for(int i = 0; i < indeksi; i++){
            System.out.println(nimiTaulukko[i]);
        }
    }
}