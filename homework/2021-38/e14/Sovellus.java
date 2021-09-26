public class Sovellus {
    public static void main(String[] args) {
        int[] numbers = new int [10];
        int argument = Integer.parseInt(args[0]);
        boolean stop = false;
        

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100);
            

            if(numbers[i] == argument){ // katsotaan löytykö luku
                System.out.println("Loytyi!"); 
                stop = true; // jos löyty ohjelma sammuu
            } else if(i == numbers.length-1) { // jos ei löydy ja taulukko on täys, tulostetaan ei löytynyt
                System.out.println("Ei loytynyt!");
            }

            if(stop == true){ // luku löyty ja ohjelma sammmuu
                break;
            }
        }
    }
}