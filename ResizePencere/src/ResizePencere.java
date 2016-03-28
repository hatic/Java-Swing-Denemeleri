import javax.swing.JFrame;
import java.awt.Toolkit;

/**
 * Created by USER on 17.4.2015.
 */
public class ResizePencere {
    public static void main(String[] args) {

        JFrame f=new JFrame("Türkiye");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.setLocation(0,0);
        f.setVisible(true);
        f.setResizable(false);

    }
}
