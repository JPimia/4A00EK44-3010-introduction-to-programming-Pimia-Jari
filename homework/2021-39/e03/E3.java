import java.io.Console;

class E3 {

    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna nimi");
        String nimi = c.readLine();
        tulostaJokinNimi(nimi);
    }
    public static void tulostaJokinNimi(String nimi) {
        System.out.println(nimi);
    }
}