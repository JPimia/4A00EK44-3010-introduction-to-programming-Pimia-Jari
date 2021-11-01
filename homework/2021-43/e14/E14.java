import java.io.Console;

public class E14 {
    public static void main(String[] args) {
        Console c = System.console();
        String mj = "esimerkki";

        System.out.println("Alkuosan pituus: ");
        int pituus = Integer.parseInt(c.readLine());

        for(int i = 0; i < pituus; i++){
            System.out.print(mj.charAt(i));
        }
    }
}
