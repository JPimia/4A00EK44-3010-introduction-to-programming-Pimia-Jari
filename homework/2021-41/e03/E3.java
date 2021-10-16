public class E3 {
    public static void main(String[] args) {
        int[][] array = {{1,3,9}, {2,7,3}};

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
