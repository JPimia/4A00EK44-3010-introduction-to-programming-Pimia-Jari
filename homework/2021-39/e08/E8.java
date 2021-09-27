import  java.io.Console;

public class E8 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Kuinka korkea tehdaan: ");
        int korkeus = Integer.parseInt(c.readLine());

        square(korkeus);
    }

    public static void square (int korkeus){
        for(int i = 0; i < korkeus;  i++){
            System.out.println(charRepeat("X", korkeus));
        }
    }

    public static String charRepeat (String merkki, int amount){
        String mj = "";
        for(int i = 0; i < amount; i++){
            mj += merkki;
        }
        return mj;
    }
}
