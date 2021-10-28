import java.io.Console;

public class E8 {
    public static void main(String[] args) {
        Console c = System.console();
        int summa = 0;
        int maara = 0;
        boolean loop = true;

        while(loop){
            System.out.println("Anna positiivinen luku");
            int number = Integer.parseInt(c.readLine());

            if(number > 0) {
                summa += number;
                maara++;
            } else {
                loop = false;
            }
        }
        System.out.println("Lukujen keskiarvo on: " + ((float) summa / maara));
    }
}
