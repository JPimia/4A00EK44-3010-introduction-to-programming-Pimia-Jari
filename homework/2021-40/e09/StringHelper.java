public class StringHelper {
    public static void main(String[] args) {
        
        // Tulostaa true
        System.out.println( StringHelper.contains("koirarotu", "raro") );

        // Tulostaa false
        System.out.println( StringHelper.contains("koirarotu", "tampio") );

    }

    public static boolean contains (String a, String b) {
        int nextCharIndex = 0;

        if(b.length() == 0){
            return true;
        }
        if(a.length() >= b.length()){
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == b.charAt(nextCharIndex)){
                    nextCharIndex++;
                    if(nextCharIndex == b.length()){
                        return true;
                    }
                } else {
                    nextCharIndex = 0;
                }
            }
        } 
        return false;
    }
}
