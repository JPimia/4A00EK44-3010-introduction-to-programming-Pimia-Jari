import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna jokin nimi:");
        String nimi = c.readLine();

        // i = 0 -> nimi.length() - 1   
        // jussi
        // 01234

        for(int i = 0; i < nimi.length(); i++) {
            System.out.println(nimi.charAt(i));
        }
    }
}