public class Sovellus {
    public static void main(String[] args) {
        int[] numbers = new int [10];
        int argument = Integer.parseInt(args[0]);
        boolean stop = true;
        

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100);
            

            if(numbers[i] == argument){
                System.out.println("Loytyi!");
                stop = false;
            } else if(i == numbers.length-1) {
                System.out.println("Ei loytynyt!");                
            }
            
            if(stop == false){
                break;
            }
        }
    }
}