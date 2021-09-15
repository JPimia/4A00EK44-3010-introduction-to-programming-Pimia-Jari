import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        
        while(true){
            System.out.println("Anna nimia");
            String nimi = c.readLine();

            if(nimi.equals("lopeta")){
                break;
            }
        }
    }
}