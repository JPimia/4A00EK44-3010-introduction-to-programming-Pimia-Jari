
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle (50,50);
        Rectangle r2 = new Rectangle (50,50);

        if(r1 == r2) {
            //tänne ei päästä koska ei ole sama muistipaikka.
        }
    }
}
