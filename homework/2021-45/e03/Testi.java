

class Ihminen {
    private String name;

    public void setName (String n) {
        if(n.length() <= 0) {
            throw new IllegalArgumentException("liian lyhyt nimi");
        } else {
            this.name = n;
        }
    }
    public String getName() {
        return name;
    }
    public void nuku () {
        System.out.println(name + " ei nuku ikina");
    }
    public void syo () {
        System.out.println(name + " syo pizzaa");
    }
    public void juo () {
        System.out.println(name + " juo kaljaa");
    }
    public void lisaanny () {
        System.out.println(name + " lisaantyy");
    }
    
}

class Ohjelmoija extends Ihminen {
    public Ohjelmoija(String name) {
        setName(name);
    }
    public void osallistu() {
        System.out.println(getName() + " bilettaa");
    }
    public void ohjelmoi() {
        System.out.println(getName() + " ohjelmoi");
    }
}

public class Testi {
    public static void main(String[] args) {
        Ohjelmoija human = new Ohjelmoija("Jeesus");
        human.nuku();
        human.syo();
        human.juo();
        human.lisaanny();
        human.osallistu();
        human.ohjelmoi();
    }
}
