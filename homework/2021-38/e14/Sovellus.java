public class Sovellus {
    public static void main(String[] args) {
        int[] numbers = new int [10];
        int argument = Integer.parseInt(args[0]);
        boolean numberFound = false;
        

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100);
            
            if(numbers[i] == argument){ // jos luku löytyy numberFound = true
                numberFound = true;
            }
        }

        if(numberFound){ // jos true tulostetaan loytyi
            System.out.println("Loytyi!");
        } else { // false = ei löytynyt
            System.out.println("Ei loytynyt!");
        }
    }
}