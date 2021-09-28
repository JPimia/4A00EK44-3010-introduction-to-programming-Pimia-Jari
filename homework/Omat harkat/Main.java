import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        
        System.out.println("Kuinka korkee tehaan");
        int korkeus = Integer.parseInt(c.readLine());

        for(int rivi = 0; rivi < korkeus; rivi++){
            if(rivi == 0 || rivi == korkeus -1){
                square('X', korkeus);
            } else {
                tulosta('X', ' ', korkeus, rivi);
            }
            System.out.println();
        }
    }

    public static void square (char merkki, int korkeus){
        for(int i = 0; i < korkeus; i++){
            System.out.print(merkki);
        }
    }
    

    public static void tulosta (char a, char b, int rivi, int korkeus){
        for(int i = 0; i < rivi; i++){
            if(i == 0 || i == rivi - 1 || i == korkeus || i == rivi-korkeus-1){
                System.out.print(a);
            } else {
                System.out.print(b);
            }
        }
    }
}
