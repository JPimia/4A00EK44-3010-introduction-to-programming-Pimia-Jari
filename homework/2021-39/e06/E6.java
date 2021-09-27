public class E6 {
    public static void main(String[] args) {

        char merkki = 'X';
        int amount = 10;

        charRepeat(merkki, amount);
    }

    public static void charRepeat (char merkki, int amount){
        for(int i = 0; i < amount; i++){
            System.out.print(merkki);
        }
    }
}
