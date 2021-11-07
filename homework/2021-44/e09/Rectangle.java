public class Rectangle {
    private int height;
    private int width;

    public void setWidth (int width) {
        if(width < 0) {
            throw new IllegalArgumentException("Anna positiivinen luku");
        } else {
            this.width = width;
        }
        
    }
    public void setHeight (int height) {
        if(height < 0) {
            throw new IllegalArgumentException("Anna positiivinen luku");
        } else {
            this.height = height;
        }
    }
    public int getWidth () {
        return width;
    }
    public int getHeight () {
        return height;
    }
    public int getArea() {
        return width * height;
    }
}
