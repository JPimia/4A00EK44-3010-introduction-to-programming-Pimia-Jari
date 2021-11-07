public class Rectangle {
    public int width;
    public int height;

    public void finalize () {
        System.out.println("Deleteing : " + this);
    }
}
