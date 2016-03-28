import java.awt.Dimension;
import java.awt.Toolkit;


/**
 * Created by USER on 17.4.2015.
 */
public class EkranGenislik {
    public static void main(String[] args) {

        Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(d);
    }
}
