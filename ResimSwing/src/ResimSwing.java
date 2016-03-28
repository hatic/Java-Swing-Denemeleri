import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.net.URL;
import javax.swing.JLabel;

/**
 * Created by USER on 18.4.2015.
 */
public class ResimSwing extends JFrame {
    public static void main(String[] args) {
        ResimSwing rs=new ResimSwing();
       // URL url=ResimSwing.class.getResource("icon.jpg");
        Icon icon=new ImageIcon(ResimSwing.class.getResource("icon.jpg")) ;

        rs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rs.add(new JLabel(icon));
        rs.pack();
        rs.setVisible(true);
    }


}
