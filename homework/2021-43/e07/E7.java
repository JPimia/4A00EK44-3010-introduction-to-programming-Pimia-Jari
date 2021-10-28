import java.io.Console;

public class E7 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Anna luku");
        int number = Integer.parseInt(c.readLine());

        int tulos = 0;

        for(int i = 1; i <= number; i++) {
            tulos += i;
        }
        System.out.println(tulos);
    }
}
