
import javax.swing.*;
import java.awt.event.*;


class Ikkuna extends JFrame implements ActionListener {

    private JButton ok;


    public Ikkuna() {
        ok = new JButton("ok");
        setTitle("Otsikko");
        add(ok);
        ok.addActionListener(this);

        setSize(500,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        setTitle("Otsikko 2");
        System.out.println("Click");
    }

    public static void main(String [] args) {
        new Ikkuna();
    }
    
}
