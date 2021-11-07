public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Rectangle rect1 = rect;
        System.out.println(rect1);
        rect1 = null;
        kaynnistaRoskienKeruu();
    }
    
    public static void kaynnistaRoskienKeruu () {

    // Käynnistetään roskien keruu.
        System.gc();
        // Odotellaan sekunnin verran.
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
