
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
class Testi {
    public static void main(String[] args) {
        Ihminen human = new Ihminen();
        human.nuku();
        human.syo();
        human.juo();
        human.lisaanny();
    }
}
