abstract class Nisakas {
    public void synnyta() {
        System.out.println("synnytan lapsen.");
    }
}

class Koira extends Nisakas {

}

public class Testi {
    public static void main(String[] args) {
        Koira musti = new Koira();
        musti.synnyta();
    }
}
