import java.io.Console;

public class TestRectangle {
    public static void main(String[] args) {
        Console c = System.console();
        Rectangle[] array = new Rectangle[10];
        int totalArea = 0;

        for(int i = 0; i < array.length; i++) {
            Rectangle r1 = new Rectangle();
            boolean needsWidth = true;
            boolean needsHeight = true;

            while(needsHeight || needsWidth) {
                System.out.println("Rectangle " + i);
                if(needsWidth) {
                    System.out.println("Syota Leveys");
                    try {
                        int width = Integer.parseInt(c.readLine());
                        r1.setWidth(width);
                        needsWidth = false;
                    } catch (NumberFormatException e) {
                        System.out.println("Error - Anna numero");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error - " + e.getMessage());
                    }
                }
                if(needsHeight) {
                    System.out.println("Syota Korkeus");
                    try {
                        int height = Integer.parseInt(c.readLine());
                        r1.setHeight(height);
                        needsHeight = false;
                    } catch (NumberFormatException e) {
                        System.out.println("Error - Anna numero");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error - " + e.getMessage());
                    }
                }
            }
            array[i] = r1;
            totalArea += array[i].getArea();
        }
        System.out.println("Suorakaiteiden pinta-alojen summa on: " + totalArea);
    }
}
