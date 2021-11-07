public class Rectangle {
    private int height;
    private int width;

    public boolean equals(Rectangle r) {
        return r.height == height && r.width == width;
    }

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

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
}
