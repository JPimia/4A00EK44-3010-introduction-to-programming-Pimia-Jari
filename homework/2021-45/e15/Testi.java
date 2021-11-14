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


class Testi {
    public static void main(String [] args) {
        Ihminen jeppe = new Ihminen();
        Koira musti =  new Koira();
        metodi(jeppe);
        metodi(musti);

    }
    public static void metodi(Nisakas a) {
        //a.nuuhkiPyllyä(); // ei toimi koska, parametrinä on nisakas eikä koira
        //a.luoTaidetta(); // ei toimi koska, parametrinä on nisakas eikä ihminen
        a.ääntelehdi(); // toimii, koska kaikki ääntelehtii
    }
}

