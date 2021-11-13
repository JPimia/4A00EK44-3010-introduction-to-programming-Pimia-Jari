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
    public static void main(String[] args) {
        Koira musti = new Koira();
        Ihminen jeppe = new Ihminen();
        musti.nuuhkiPyllyä();
        jeppe.luoTaidetta();
        musti.ääntelehdi();
        jeppe.ääntelehdi();
    }
}
