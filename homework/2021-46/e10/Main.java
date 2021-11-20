
import javax.swing.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton click;
    public MyWindow() {
        click = new JButton("click");
        click.addActionListener(this::clicked);
        //click.addActionListener(e -> clicked(e));
        add(click);
    }
    public void clicked(ActionEvent e) {
        System.out.println("clicked");
    }
}

class Main {
    public static void main(String [] args) {
        MyWindow window = new MyWindow();
        window.setTitle("window");
        window.setSize(400,400);
        window.setVisible(true);
    }
}