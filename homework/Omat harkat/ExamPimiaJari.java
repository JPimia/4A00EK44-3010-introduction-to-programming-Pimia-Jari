import java.io.Console;

// TAMK TIKO / KONETENTTI / Java (kokonaistentti)
//
// PALAUTUS
//
//     Tallenna tama tiedosto omalle nimellesi (ilman skandeja):
//
//     ExamSukunimiEtunimi.java (esim. ExamMeikalainenMatti.java)
//
//     Palauta osoitteeseen
//
//           https://www.dropbox.com/request/BNrFXNEwxuW8hy2OPNzL
//
// YLEISET OHJEET
//
//     1. Kirjoita ohjelma kokonaisuudessaan *englanniksi*;
//        muuttujat yms.
//     2. Ratkaise kukin tehtava siihen varatussa paikassa
//     3. Kirjoita ohjelma kokonaisuudessaan noudattaen
//        Java-standardia ja kommentoi lauseita tarpeen mukaan.
//
//     Javadoc-kommentteja EI TARVITSE kirjoittaa ellei
//     tehtavassa erikseen siita mainita.
//
//     HUOM. alla olevat metodit ovat pohjia (ts. "template"),
//     joita tulee muokata tehtavien mukaisiksi.
//
//     HUOM. vastauksissa ei saa kayttaa dynaamisia taulukoita (listoja), kuten
//     ArrayList tai LinkedList. Kaikki toteutetaan listojen sijaan taulukoilla.
//
// ARVIOINTI
//
//     Koko tentti:
//     40 % = 1, 60 % = 2, 70 % = 3, 80 % = 4, 90 % = 5.
//
//     Java-standardin noudattamatta jattaminen, koodin epaselvyys
//     tai muuttujien puutteellinen nimeaminen saattavat vahentaa
//     pisteita.

class ExamPimiaJari {

    // KONTROLLILAUSEIDEN OSAAMINEN (if) - 4 p
    //
    // Kysy kayttajalta nimi. Jos kayttajan nimi on "Vilma" tulosta
    // ruudulle "sinun mummo osaa koodata". Muussa tapauksessa
    // tulosta "sinun mummosi ei osaa koodata."

    public static void exam1() {
        Console c = System.console();
        String n = c.readLine();
        
    }

    // SILMUKOIDEN OSAAMINEN (for, while) - 4 p
    //
    // Kysy kayttajalta kokonaislukuja kunnes annettujen
    // kokonaislukujen summa ylittaa 100.
    //
    // Esimerkkituloste
    // anna luku: 5
    // anna luku: 10
    // anna luku: 50
    // anna luku: 70
    // Ohjelma paattyi, lukujen summa > 100

    public static void exam2() {
        Console c = System.console();
        

        int summa = 0;

        for(int i = 0; i < 100; i++) {
            System.out.println("anna luku:");
            int number = Integer.parseInt(c.readLine());
            summa += number;
            
            if(summa > 100) {
                System.out.println("Lukujen summa on 100 tai yli joten ohjelma paattyy");
                break;
            }
        }
    }

    // METODIEN OSAAMINEN (method) - 2 p. JAVADOC - 2 p
    //
    // Muokkaa alla olevaa metodia ohjeistuksen mukaiseksi ja testaa sita
    // kutsumalla main() metodista kasin:
    //
    // - Ota metodin sisaantuloargumentteina, parametreina, merkki ja kokonaisluku
    // - Metodi palauttaa merkkijonon jossa on annettua merkkia kokonaisluvun verran.
    //
    // Esimerkki, jos metodille annetaan 'x' ja 3, metodi palauttaa "xxx".
    //            jos metodille annetaan 'a' ja 7, metodi palauttaa "aaaaaaa"
    //
    // Kommentoi tekemäsi metodi JavaDoc standardin mukaisesti.

    /**
     * Prints given number of characters in one row.
     * 
     * @param character letter that will be printed.
     * @param amount how many times character will be printed.
     */

    public static void exam3(String character, int amount) {
        String printedCharacters = "";

        for(int i = 0; i < amount; i++) {
            printedCharacters += character;
        }
        System.out.println(printedCharacters);
    }

    // TAULUKOIDEN OSAAMINEN (arrays 1D) - 4 p
    //
    // Muokkaa alla olevaa metodia ohjeistuksen mukaiseksi ja testaa sita
    // kutsumalla main() metodista kasin:
    //
    // - Ota metodin sisaantuloargumentteina, parametreina, kokonaislukutaulukko
    // - Metodi palauttaa taulukon jossa on joka toinen luku parametrina saadusta
    //   taulukosta
    //
    // Esimerkki, jos metodille annetaan taulukko {1,2,3,4}, metodi
    // palauttaa taulukon {1, 3}
    //
    public static int[] exam4(int[] array) {
        int[] nextArray = new int[4];

        for(int i = 0; i < array.length; i+=2) {
            
                nextArray[i] = array[i];
                System.out.println(nextArray[i]);
            
        }
        return nextArray;
    }

    // TAULUKOIDEN OSAAMINEN (arrays 2D) - 4 p
    //
    // Muokkaa alla olevaa metodia ohjeistuksen mukaiseksi ja testaa sita
    // kutsumalla main() metodista kasin:
    //
    // - metodi ottaa sisaantuloparametrina (argumentti) kokonaisluvun
    // - metodi palauttaa 2d merkkitaulukon jossa on seuraava kuvio. Kuvion
    //   korkeus on sama kuin annettu argumentti
    //
    // ----X
    // ----X
    // ----X
    // ----X
    // XXXXX
    //
    // Esimerkki: metodille lahetetaan taulukko koko 3, metodi
    // palauttaa 2d taulukon joka sisältää seuraavia merkkejä
    //
    // --X
    // --X
    // XXX
    public static void exam5(int height) {
        char character = 'X';
        int row = height;

        String[][] array = new String [5][5];

        for(int i = 0; i < height; i++) {
            if(height == 0 || height == -1) {
                array[i][] 

            }
            for(int j = 0) {

            }
        }
    }

    // OLIO-OHJELMOINNIN JA KOKONAISUUDEN HALLINTA - 6 p
    // Toteuta luokkakaavio luokille Kuvio, Ympyra ja Suorakaide.
    // Jokaisella kuviolla on olemassa sijainti (x ja y). Jokaiselta
    // kuviolta löytyy metodi joka palauttaa kuvion pinta-alan.
    // Suorakaide ja Ympyrä oliot voidaan luoda seuraavasti
    //
    // Ympyra y = new Ympyra(1, 3, 5); // x = 1, y = 3, radius = 5
    // Suorakaide s = new Suorakaide(2, 2, 5, 5) // x = 2, y = 2, h = 5, w = 5
    //
    // Ympyran ja suorakaiteen kaikki attribuutit voidaan
    // tulostaa konsoliin seuraavasti
    //
    // System.out.println(y); // x = 1, y = 3, radius = 5
    // System.out.println(x); // x = 2, y = 2, h = 5, w = 5
    //
    // Toteuta toiminnallisuus siten, että kaikki annetut arvot on oltava
    // positiivisia.
    //
    // Testaa luokkiasi luomalla niistä olioita exam6 metodista kasin.

    public static void exam6() {

    }

    public static void main (String[] args) {
        int[] finalArray = {1,2,3,4};

        //exam2();
        //exam3("x", 7);
        //exam4(finalArray);
        exam5(5);

    }
}

// End of file
