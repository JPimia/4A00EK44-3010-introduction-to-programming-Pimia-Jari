public class Sovellus {
    public static void main(String[] args) {
        int[] numbers = new int [10];
        int argument = Integer.parseInt(args[0]);
        

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100);
            

            if(numbers[i] == argument){
                System.out.println("Loytyi!");
            } else {
                System.out.println("Ei loytynyt!");

            }
        }
    }
}