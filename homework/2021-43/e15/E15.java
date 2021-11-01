import java.io.Console;

public class E15 {
    public static void main(String[] args) {
        Console c = System.console();
        String mj = "esimerkki";

        System.out.println("Loppuosan pituus: ");
        int pituus = Integer.parseInt(c.readLine());

        for(int i = 5; i < mj.length(); i++){
            System.out.print(mj.charAt(i));
        }
    }
}
