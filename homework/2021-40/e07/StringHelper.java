public class StringHelper {
    public static void main(String[] args) {
        String [] taulukko = StringHelper.split("tiina:pekka:kalle", ':');
        System.out.println(taulukko[0]); // tulostaa "tiina"
    }

    public static String[] split (String text, char seporator) {
        int index = 0;
        String mj = "";
        String[] array = new String [countChars(seporator, text) + 1];

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != seporator){
                mj += text.charAt(i);
            } else {
                array[index] = mj;
                index++;
                mj = "";
            }
        }
        array[index] = mj;
        return array;
    }

    public static int countChars (char merkki, String mjono) {
        int foundChars = 0;

        for(int i = 0; i < mjono.length(); i++){
            if(mjono.charAt(i) == merkki){
                foundChars++;
            }
        }
        return foundChars;
    }
}