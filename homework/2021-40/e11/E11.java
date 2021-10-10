import java.io.Console;

public class E11 {
    static boolean gameRunning = true;
    static int totalMoney = 25;
    static int bet = 1;
    
    public static void main(String[] args) {
        Console c = System.console();
        

        while (gameRunning){
            System.out.println(totalMoney + " Euroa Pelivaraa. Anna panos?\n---");
            int panos = Integer.parseInt(c.readLine());
            random('@', '!', '#', panos);
            totalMoney-=panos;
            if(panos > totalMoney){
                tarkistus(panos);
            }
        }
    }

    public static String random (char a, char b, char c, int bet) {
        String arvotutMerkit = "";

        for(int i = 0; i < 3; i++){
            int arvottuNumero = (int) (Math.random() * 3);
            if(arvottuNumero == 0){
                arvotutMerkit += a;
            } else if(arvottuNumero == 1) {
                arvotutMerkit += b;
            } else {
                arvotutMerkit += c;
            }
        }
        
        tulos(arvotutMerkit, bet);
        return arvotutMerkit;
    }

    public static void tulos (String result, int panos) { 
        boolean totuusarvo = false;

        if(result.charAt(0) == result.charAt(1) && result.charAt(1) == result.charAt(2)){
            totuusarvo = true;
        } else {
            totuusarvo = false;
        }
        if(totuusarvo){
            totalMoney +=3 * panos;
            System.out.println(result + "\nVoitit!");
            bet = 1;
        } else {
            System.out.println(result + "\nHavisit, yrita uudelleen\n");
            bet = 1;
        }
    }
    public static void tarkistus (int panos) {
        if(panos > totalMoney && totalMoney > 0){
            System.out.println("---Liian Suuri Panos---");
        } else if (totalMoney <= 0){
            System.out.println("---Rahat Loppuivat");
            gameRunning = false;
        }
    }
}
