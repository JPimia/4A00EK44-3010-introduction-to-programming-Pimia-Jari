import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        String kaannettyjono = "";
        String muokattujono = "";

        System.out.println("anna merkkijono");
        String merkkijono = c.readLine();

        for(int i = merkkijono.length()-1; i >= 0; i--) { //käy merkkijonon läpi väärinpäin
            char merkki = merkkijono.charAt(i); //hakee yksittäisen merkin

            if(merkki != ',' && merkki != '.' && merkki != ' '){ //poistaa nämä merkit
                kaannettyjono = kaannettyjono + merkki;
            }
        }

        for(int i = 0; i < merkkijono.length(); i++) { //käy merkkijonon läpi oikeinpäin
            char merkki = merkkijono.charAt(i); //hakee yksittäisen merkin

            if(merkki != ',' && merkki != '.' && merkki != ' '){ //poistaa nämä merkit
                muokattujono = muokattujono + merkki;
            }
        }

        if(muokattujono.equalsIgnoreCase(kaannettyjono)){
            System.out.println("Merkkijono on palindromi");
        } else {
            System.out.println("Merkkijono ei ole palindromi");
        }
    }
} 