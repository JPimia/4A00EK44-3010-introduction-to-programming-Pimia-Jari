import java.io.Console;

public class Kertaus {
    static boolean totuusArvo;
    static int rahaSumma;
    static int bet;
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Monta euroa pelataan?");
        rahaSumma = Integer.parseInt(c.readLine());

        while(rahaSumma > 0) {
            System.out.println("Anna panoksesi?");
            bet = Integer.parseInt(c.readLine());

            System.out.println(arvonta('#', '@', '!'));
            voitettiinko(totuusArvo);
            rahaSumma -= bet;
        }
    }

    public static String arvonta (char a, char b, char c) {
        String arvotutMerkit = "";
        
        for(int i = 0; i < 3; i++) {
            int random = (int) (Math.random() * 3);

            switch(random) {
                case 0: arvotutMerkit += a;
                break;
                case 1: arvotutMerkit += b;
                break;
                case 2: arvotutMerkit += c;
                break;
            }
        }
        tulos(arvotutMerkit, totuusArvo);
        return arvotutMerkit;
    }

    public static boolean tulos (String arvotutMerkit, boolean trueFalse) {
        if(arvotutMerkit.charAt(0) == arvotutMerkit.charAt(1) && arvotutMerkit.charAt(1) == arvotutMerkit.charAt(2)) {
            return totuusArvo = true;
        } else {
            return totuusArvo = false;
            
        }
        
    }
    public static void voitettiinko (boolean result) {
        if(result) {
            System.out.println("Voitit, uusi saldosi on: " + (rahaSumma + bet * 3));
            rahaSumma += bet * 3;
        } else {
            System.out.println("Havisit\nSaldosi on: " + (rahaSumma - bet));
            rahaSumma -= bet;
        }
    }
}
