import java.io.Console;

public class E15 {
    public static void main(String[] args) {
        Console c = System.console();
        String mj = "esimerkki";

        System.out.println("Loppuosan pituus: ");
        int pituus = Integer.parseInt(c.readLine());

        for(int i = 0; i < mj.length(); i++){
            if(i > pituus) {
                System.out.print(mj.charAt(i));
            }
        }
    }
}
