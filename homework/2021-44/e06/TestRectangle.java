public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 5;
        System.out.println(rect.countSurfaceArea());
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
