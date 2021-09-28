public class E11 {
    public static void main(String[] args) {
        String mj = "saippuakauppias";

        

        System.out.println(isPalindrome(mj));
    }

    public static boolean isPalindrome(String original) {
        for(int i = original.length()-1; i >= 0 ; i--){
            if(original.charAt(i) != original.charAt(original.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
