import java.io.Console;

public class E6 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("anna luku: ");
        int numA = Integer.parseInt(c.readLine());

        System.out.println("anna luku: ");
        int numB = Integer.parseInt(c.readLine());


        for(int i = numA; i <= numB; i++) {
            System.out.print(i);
        }
    }
}
