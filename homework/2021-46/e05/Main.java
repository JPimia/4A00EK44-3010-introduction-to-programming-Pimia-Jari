interface MyytavaTuote {
    public void myy();
}

class Koira implements MyytavaTuote {
    public void myy() {
        System.out.println("Koira myyty");
    }
}

class Main {
    public static void main(String [] args) {

        class EnergiaJuoma implements MyytavaTuote {
            public void myy() {
                System.out.println("Energiajuoma myyty");
            }
        }
        myy(new EnergiaJuoma());
        myy(new Koira());
        myy(new MyytavaTuote() {
            @Override
            public void myy() {
                System.out.println("Anonyymi myyty");
            }
        });
    }
    public static void myy(MyytavaTuote m) {
        m.myy();
    }
}