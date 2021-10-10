public class StringHelper {
    public static void main(String[] args) {
        
        String [] stringArray = {"12", "22", "33"};
        int [] intArray = StringHelper.toIntArray(stringArray);
    }

    public static int[] toIntArray (String[] array) {
        int[] lista = new int [array.length];

        for(int i = 0; i < array.length; i++){
            lista[i] = Integer.parseInt(array[i]);
        }
        return lista;
    }
}
