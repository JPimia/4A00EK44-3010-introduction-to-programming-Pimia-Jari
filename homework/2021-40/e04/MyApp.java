
class MyApp {
    public static void main(String [] args) {
        System.out.println( tulosta('x', itseisarvo(-3)) );
        System.out.println( tulosta('a', itseisarvo(4))  );
    }

    public static String tulosta (char merkki, int maara) {
        String mj = "";
        for(int i = 0; i < maara; i++) {
            mj += merkki;
        }
        return mj;
    }

    public static int itseisarvo (int arvo) {
        if(arvo < 0){
            return -arvo;
        }
        return arvo;
    }
}