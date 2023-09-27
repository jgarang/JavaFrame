import javax.swing.*;
import java.awt.*;

public class Jframe {
    Jframe() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("My first Jframe");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground((new Color(0x123456)));
        ImageIcon myimage = new ImageIcon("logo.jpg");
        frame.setIconImage(myimage.getImage());

    }
}
