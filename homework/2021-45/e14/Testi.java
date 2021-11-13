abstract class Nisakas {
    public void synnyta() {
        System.out.println("synnytan lapsen.");
    }
    abstract void ääntelehdi();
}

class Koira extends Nisakas {
    public void nuuhkiPyllyä() {
        System.out.println("nuuhkii toisen koiran pyllya");
    }
    public void ääntelehdi() {
        System.out.println("hauhau");
    }
}

class Ihminen extends Nisakas {
    public void luoTaidetta() {
        System.out.println("luo taidetta");
    }
    public void ääntelehdi() {
        System.out.println("alamolo");
    }
}

public class Testi {
    public static void main(String [] args) {
        Koira musti = new Koira();
        Ihminen kalle = new Ihminen();

        method1(musti); // method 1 ottaa parametrikseen koira tai siitä periytyvät.
        method2(kalle); // method 2 ottaa parametrikseen ihminen tai siitä periytyvät.
        method3(musti); // koira periytyy nisakkaasta.
        method3(kalle); // ihminen periytyy nisakkaasta.
        method4(musti); // kaikki menee läpi koska kaikki periytyy objectista.
        method4("jeesus"); // kaikki menee läpi koska kaikki periytyy objectista.
        method4(true); // kaikki menee läpi koska kaikki periytyy objectista.
        method4(123123); // kaikki menee läpi koska kaikki periytyy objectista.
        
    }
    public static void method1(Koira a) {

    }
    public static void method2(Ihminen a) {

    }
    public static void method3(Nisakas a) {

    }
    public static void method4(Object a) {

    }
}

