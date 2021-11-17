interface MyytavaTuote {
    public void myy();
}
class Koira implements MyytavaTuote {
    public void myy() {
        System.out.println("koira myyty");
    }
}
class Main {

    public static void main(String [] args) {
        class EnergiaJuoma implements MyytavaTuote {
            public void myy() {
                System.out.println("energiajuoma myyty");
            }
        }

        myy(new EnergiaJuoma());
        myy(new Koira());
        myy(() -> System.out.println("Anonyymi myyty"));
        myy(() -> metodi());
        myy(Main::metodi);
        Main joonas = new Main();
        Main joonas2 = new Main();
        joonas2.vitunViitta();
        myy(joonas::vitunViitta);
    }
    public static void myy(MyytavaTuote m) {
        m.myy();
    }
    public static void metodi() {
        System.out.println("Helppoo ja kivaa");
    }
    public void vitunViitta () {
        myy(this::kyrpaJyra);
    }
    public void kyrpaJyra () {
        metodi();
    }
}