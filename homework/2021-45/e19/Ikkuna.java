
import javax.swing.*;
import java.awt.event.*;


class Ikkuna extends JFrame implements ActionListener, Runnable {

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
        Thread t = new Thread(this);
        t.start();
    }
    public void run () {
        int steps = 50;
        while(true) {

            if(steps < 0) {
                setLocation(getX() -1, getY());
            } else {
                setLocation(getX() +1, getY());
            }
            try {
                Thread.sleep(100);
            } catch(Exception e) {
                e.printStackTrace();
            }
            if(steps > -50) {
                steps--;
            } else {
                steps = 50;
            }
        }
    }

    public static void main(String [] args) {
        new Ikkuna();
    }
    
}
