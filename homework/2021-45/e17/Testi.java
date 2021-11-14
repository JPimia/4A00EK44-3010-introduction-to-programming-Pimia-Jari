interface MyytavaAsia {
    public void myy();
}

class EnergiaJuoma implements MyytavaAsia {
    
    public void myy() {
        System.out.println("energiajuoma myyty");
        
    }
}

class Koira implements MyytavaAsia {

    public void myy() {
        System.out.println("koira myyty");
    }
}

class Testi {
    public static void main(String [] args) {
        EnergiaJuoma ed = new EnergiaJuoma();
        Koira musti = new Koira();
        metodi(ed);
        metodi(musti);
    }
    public static void metodi(MyytavaAsia a) {
        a.myy(); // Oliot energiajuoma sekä koira pystyy molemmat välittään metodille.
    }
}
