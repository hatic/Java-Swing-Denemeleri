import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

/**
 * Created by USER on 17.4.2015.
 */
public class AltPencere extends JFrame {
    public AltPencere(int x, int y){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x,y);
        Dimension boyut=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((boyut.width-getSize().width)/3,(boyut.height-getSize().height)/3);
    }

    public static void main(String[] args) {

        AltPencere pencere=new AltPencere(900,300);
        pencere.setVisible(true);
    }

}
