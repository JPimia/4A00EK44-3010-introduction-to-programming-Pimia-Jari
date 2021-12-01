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
        int[] nextArray = new int[array.length/2];

        for(int i = 0; i < array.length; i+=2) {
                nextArray[i] = array[i];
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
    public static char[][] exam5(int height) {

        char[][] array = new char [height][height];

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < height; j++) {
                if(i == height -1 || j == height -1 || i == 0 || j == 0 || i == j || i == height - i - 1) {
                    array[i][j] = 'X';
                } else {
                    array[i][j] = '-';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        return array;
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
        abstract class Kuvio {
            private int x;
            private int y;
            abstract public double getArea ();

            public void setX (int x) {
                if(x >= 0) {
                    this.x = x;
                } else {
                    throw new IllegalArgumentException("Only positive saatana");
                }
            }

            public int getX () {
                return x;
            }

            public void setY (int y) {
                if(y >= 0) {
                    this.y = y;
                } else {
                    throw new IllegalArgumentException("Only positive saatana");
                }
            }

            public int getY () {
                return y;
            }

            public Kuvio (int x, int y) {
                setX(x);
                setY(y);
            }

            public String toString () {
                return "X = " + x + ", y = " + y;
            }

        }
        class Ympyra extends Kuvio {
            private int radius;

            public Ympyra (int x, int y, int radius) {
                super(x, y);
                setRadius(radius);
            }
            public double getArea () {
                return Math.PI * radius * radius;
            }
            public void setRadius (int radius) {
                if(radius >= 0) {
                    this.radius = radius;
                } else {
                    throw new IllegalArgumentException("Only positive saatana");
                }
            }
            public int getRadius () {
                return radius;
            }

            public String toString () {
                return super.toString() + ", radius = " + radius;
            }
        }

        class Suorakaide extends Kuvio {
            private int height;
            private int width;

            public Suorakaide (int x, int y, int h, int w) {
                super(x, y);
                setHeight(h);
                setWidth(w);
            }
            public double getArea () {
                return width * height;
            }
            public void setHeight (int height) {
                if(height >= 0) {
                    this.height = height;
                } else {
                    throw new IllegalArgumentException("Only positive saatana");
                }
            }

            public void setWidth (int width) {
                if(width >= 0) {
                    this.width = width;
                } else {
                    throw new IllegalArgumentException("Only positive saatana");
                }
            }

            public int getHeight () {
                return height;
            }

            public int getWidth () {
                return width;
            }

            public String toString () {
                return super.toString() + ", width = " + width + ", height = " + height;
            }
        }
        Ympyra y = new Ympyra(1, 3, 5);
        Suorakaide s = new Suorakaide(2, 2, 5, 5);
        System.out.println(s.getArea());
        System.out.println(y.getArea());
    }

    public static void main (String[] args) {
        int[] finalArray = {1,2,3,4};

        //exam2();
        //exam3("x", 7);
        //exam4(finalArray);
        //exam5(5);
        exam6();
    }
}

// End of file