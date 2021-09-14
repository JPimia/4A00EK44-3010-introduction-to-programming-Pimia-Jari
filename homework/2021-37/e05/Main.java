import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna joku nimi?");
        String nimi = c.readLine();

        for(int i = nimi.length() -1 ; i >= 0; i-=2){
            System.out.println(nimi.charAt(i));
        }
    }
}