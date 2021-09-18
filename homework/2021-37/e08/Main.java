import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        String kaannettyjono = "";

        System.out.println("anna merkkijono");
        String merkkijono = c.readLine();

        for(int i = merkkijono.length()-1; i >= 0; i--) { 
            kaannettyjono = kaannettyjono + merkkijono.charAt(i); // kaannettyjono kokoaa sanaa kirjain kerrallaan
        }

        if(merkkijono.equals(kaannettyjono)){
            System.out.println("Merkkijono on palindromi");
        } else {
            System.out.println("Merkkijono ei ole palindromi");
        }
    }
}