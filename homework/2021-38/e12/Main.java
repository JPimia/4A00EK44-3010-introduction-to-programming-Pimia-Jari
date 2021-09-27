

public class Main {
    public static void main(String[] args) {
        String[] ksp = new String[] {
            "kivi", "sakset", "paperi"
        };

        int random = (int) (Math.random() * ksp.length);
        System.out.println(ksp[random]);
    }
}
