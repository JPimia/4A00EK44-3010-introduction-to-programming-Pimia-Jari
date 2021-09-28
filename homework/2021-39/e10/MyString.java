public class MyString {
    public static void main(String[] args) {
        String mj = MyString.replaceAll("abc:abc:", 'a', "terve");

        System.out.println(mj);
    }

    public static String replaceAll (String source, char character, String replacement) {
        String mj = "";
        for(int i = 0; i < source.length(); i++){
            if(source.charAt(i) == character){
                mj += replacement;
            } else {
                mj += source.charAt(i);
            }
        }
        return mj;
    }
}
