
class Bird {
    public void lennä() {
        System.out.println("lintu lentaa");
    }
}
class Main extends Bird {
    public static void main(String [] args) {
        

        class Anonymous extends Bird {
            @Override
            public void lennä() {
                System.out.println("Anonyymi lentaa");
            }
        };

        class Struthioniformes extends Bird {
            @Override
            public void lennä() {
                System.out.println("Strutsi yrittaa lentaa");
            }
        }
        
        Anonymous nimeton = new Anonymous();
        Struthioniformes pulu2 = new Struthioniformes();
        Bird pulu = new Bird();
        pulu.lennä();
        pulu2.lennä();
        nimeton.lennä();
        lennä(new Anonymous(){});
    }
    public static void lennä(Bird b) {
        b.lennä();
    }
}