
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Rectangle rect1 = rect;
        System.out.println(rect);
        //Tulostaa muistipaikan, koska toString kutsutaan.
        System.out.println(rect1);
        //Tulostaa saman muistipaikan, koska rect1 = rect.
        rect.height = 5;
        rect.width = 5;
        System.out.println(rect1.width + ", " + rect1.height);
        //Tulostaa 5, 5 koska muuttujat viittaavat samaanm objektiin.
    }
}
