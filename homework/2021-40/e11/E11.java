import java.io.Console;

public class E11 {
    static int totalMoney = 25;
    static int bet = 1;
    
    public static void main(String[] args) {
        Console c = System.console();
        

        while (totalMoney >= bet){
            System.out.println("Milla panoksella pelataan");
            int panos = Integer.parseInt(c.readLine());
            System.out.println(random('@', '!', '#', panos));
            totalMoney-=panos;
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

    public static void tulos (String result, int panoss) { 
        

        if(result.equals("@@@")){
            System.out.println("Voitit!");
            totalMoney +=3 * panoss;
        } else if(result.equals("!!!")) {
            System.out.println("Voitit!");
            totalMoney +=3 * panoss;
        } else if(result.equals("###")){
            System.out.println("Voitit!");
            totalMoney +=3 * panoss;
        } else {
            System.out.println("Havisit, yrita uudelleen");
        }
        System.out.println("Saldosi on: " + totalMoney);
    }
}
