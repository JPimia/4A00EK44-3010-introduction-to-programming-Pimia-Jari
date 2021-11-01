import java.io.Console;

public class E5 {
    public static void main(String[] args) {
        Console c = System.console();
        String nimi;

        do {
            System.out.print("Anna nimi joka on yli 2 merkkia: ");
            nimi = c.readLine();
        } while(nimi.length() < 2);

        System.out.println("Annoit nimen: " + nimi);
    }
}

