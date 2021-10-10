import java.io.Console;

public class E10 {
    static int totalMoney = 25;
    static int bet = 1;
    public static void main(String[] args) {
        Console c = System.console();
        

        while (totalMoney >= bet){
            System.out.println("Paina Entteria pelataksesi");
            c.readLine();
            System.out.println(random('@', '!', '#'));
            totalMoney--;
        }

    }

    public static String random (char a, char b, char c) {
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
        
        tulos(arvotutMerkit);
        return arvotutMerkit;
    }

    public static void tulos (String result) { 
        

        if(result.equals("@@@")){
            System.out.println("Voitit!");
            totalMoney +=3;
        } else if(result.equals("!!!")) {
            System.out.println("Voitit!");
            totalMoney +=3;
        } else if(result.equals("###")){
            System.out.println("Voitit!");
            totalMoney +=3;
        } else {
            System.out.println("Havisit, yrita uudelleen");
        }
    }
}
