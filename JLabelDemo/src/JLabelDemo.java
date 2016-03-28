import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by USER on 28.3.2016.
 */
public class JLabelDemo {
    public static void main(String[] args) {
        JFrame jframe=new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //konumu ekran geniþliðine göre ayarladýk
        jframe.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2,(Toolkit.getDefaultToolkit().getScreenSize().height)/2);

        JLabel jlabel=new JLabel("Do Not Click");
        jlabel.setForeground(Color.RED);
        jlabel.setFont(new Font("Serif",Font.BOLD,30));
        jframe.add(jlabel);//JLabel Jframe'i arka plan kabul edecek

        jlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()>1)
                    System.exit(0);
            }
        });
        jframe.pack();//frame'iiçindeki bileþenlere göm ebatýný ayarla
        jframe.setVisible(true);

    }
}
