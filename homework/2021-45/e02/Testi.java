
class Ihminen {
    public void nuku () {
        System.out.println("ihminen nukkuu");
    }
    public void syo () {
        System.out.println("ihminen syo");
    }
    public void juo () {
        System.out.println("ihminen juo");
    }
    public void lisaanny () {
        System.out.println("ihminen lisaantyy");
    }
    
}

class Ohjelmoija extends Ihminen {
    public void osallistu() {
        System.out.println("party party!");
    }
    public void ohjelmoi() {
        System.out.println("ohjelmoi ohjelmoi!");
    }
}

public class Testi {
    public static void main(String[] args) {
        Ohjelmoija human = new Ohjelmoija();
        human.nuku();
        human.syo();
        human.juo();
        human.lisaanny();
        human.osallistu();
        human.ohjelmoi();
    }
}
