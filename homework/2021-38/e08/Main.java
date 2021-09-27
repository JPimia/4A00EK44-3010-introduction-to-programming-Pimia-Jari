import java.io.Console;

class Main {
    public static void main(String [] args) {
        Console c = System.console();
       // luodaan taulukko jonka koko on 10.
        int [] taulukko = new int[10];        
        int summa = 0;
                
        for(int i = 0; i < taulukko.length; i++){
            System.out.println("Anna kokonaislukuja");
            int number = Integer.parseInt(c.readLine());
            taulukko[i] = number;
        }
        //tallennetaan summaan taulukon lukujen summa
        for(int i = 0; i < taulukko.length; i++){
            summa += taulukko[i];
        }
        System.out.print("Taulukon lukujen summa on: " + summa);
    }
}