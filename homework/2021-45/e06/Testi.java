

class Ihminen {
    private String name;

    public Ihminen(String n) {
        setName(n);
    }

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
    private int salary;

    public Ohjelmoija(String name) {
        super(name);
    }

    public void setPalkka(int p) {
        if(p < 1000 || p > 10000) {
            throw new IllegalArgumentException("Vaara Palkka");
        } else {
            this.salary = p;
        }
    }
    public int getPalkka() {
        return salary;
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
        Ohjelmoija jeppe = new Ohjelmoija("Jeesus");
        Ihminen jorma = new Ihminen("Jumala");
        jeppe.nuku();
        jeppe.syo();
        jeppe.juo();
        jeppe.lisaanny();
        jeppe.osallistu();
        jeppe.ohjelmoi();
        jorma.syo();
    }
}
