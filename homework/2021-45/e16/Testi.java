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
        ed.myy();
        musti.myy();
    }
}
