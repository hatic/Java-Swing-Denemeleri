import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * Pencereyi kapattýðýmýzda adapter sayesinde programý sonlandýran kod
 */
public class PencereKapatAdapter {
    public static void main(String[] args) {
        JFrame pencere=new JFrame("Pencere Kapat Adapter");
        pencere.setSize(400,500);//pencere boyutu ayarla
        pencere.setVisible(true);//pencereyi görünür yap
        pencere.addWindowListener(new PencereKapat());//listenerý çaðýr
    }
    }
class PencereKapat extends WindowAdapter{
    public void windowClosing(WindowEvent e){

        System.exit(0);

    }
}
