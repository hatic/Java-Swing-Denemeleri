import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
/**
 * Created by USER on 28.3.2016.
 */
public class PencereEvent  extends JFrame implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Pencere acildi");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Pencere Kapatiliyor..");
        System.exit(0);

    }

    public void windowClosed(WindowEvent event){
        System.out.println("Pencere Kapatildi !");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Pencere ikon durumuna gecirildi");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

        System.out.println("Pencere ikon durumundan cikarildi");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Pencere aktif duruma gecti");


    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Pencere deaktif duruma gecti");


    }
    public PencereEvent(){
        setSize(400,400);
        addWindowListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PencereEvent();
    }
}
