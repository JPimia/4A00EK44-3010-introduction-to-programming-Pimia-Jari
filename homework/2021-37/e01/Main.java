import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna nimesi?");
        String nimi = c.readLine();

        if(nimi.equals("jussi")){
            System.out.println("On sulla tyhma nimi");
        } else {
            System.out.println("onpas sulla hieno nimi");
        }
    }
}
