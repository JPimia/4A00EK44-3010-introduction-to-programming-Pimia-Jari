
class E9 {
    static int a;
    static int b;
    static int summa;
    public static void main(String [] args) {
        asetaA();
        asetaB();
        laskeYhteen();
        tulosta();
    }

    public static void asetaA() {
        a = 5;
    }

    public static void asetaB() {
        b = 5;
    }

    public static void laskeYhteen() {
        summa = a + b;
    }

    public static void tulosta() {
        System.out.println(summa);
    }
}