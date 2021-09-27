public class E7 {
    public static void main(String[] args) {

        String merkki = "X";
        int amount = 10;

        System.out.print(charRepeat(merkki, amount));
    }

    public static String charRepeat (String merkki, int amount){
        String mj = "";
        for(int i = 0; i < amount; i++){
            mj += merkki;
        }
        return mj;
    }
}
