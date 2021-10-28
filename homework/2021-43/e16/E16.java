import java.io.Console;

public class E16 {
    public static void main(String[] args) {
        Console c = System.console();
        int summa = 0;

        System.out.println("anna taulukolle koko");
        int arraySize = Integer.parseInt(c.readLine());

        int[] array = new int [arraySize];

        System.out.println("tayta taulukko numeroilla");

        for(int i = 0; i < arraySize; i++) {
            int number = Integer.parseInt(c.readLine());
            array[i] = number;
            summa += array[i];
        }
        System.out.println("Keskiarvo on: " + ((float) summa / arraySize));
    }
}
