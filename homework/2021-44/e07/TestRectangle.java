public class TestRectangle {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        r1.setWidth(30);
        System.out.println(r1.getWidth()); // 30

        Rectangle r2 = new Rectangle();
        r2.setWidth(-30);
        System.out.println(r2.getWidth()); // 0

    }
}
