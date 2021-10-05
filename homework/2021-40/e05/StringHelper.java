public class StringHelper {
    public static void main(String[] args) {
        
        System.out.println(equals("perunat", "peruna"));
        System.out.println(equals("luumu", "luumu"));
        System.out.println(equals("Banaani", "banaani"));
    }

    public static boolean equals (String a, String b) {
        
        if(a.length() == b.length()){
            for(int i = 0; i < a.length(); i++) {
                
                if(a.charAt(i) != b.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
