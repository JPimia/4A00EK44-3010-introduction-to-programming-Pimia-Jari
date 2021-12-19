import java.io.Console;

public class Jokusaato {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Anna timantille korkeus");
        int height = Integer.parseInt(c.readLine());
        char[][] array = new char[height][height];

        for(int i = 0; i <= height; i++) {
            for(int j = height; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
