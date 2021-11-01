import java.io.Console;

public class E2 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("anna luku: ");
        int numA = Integer.parseInt(c.readLine());

        System.out.println("anna luku: ");
        int numB = Integer.parseInt(c.readLine());


        if(numA + numB == 10) {
            System.out.print("Se oli kymppi!");
        } else {
            System.out.print("Se ei ollut kymppi!");
        }
    }
}
