import javax.swing.JFrame;
import javax.xml.stream.events.StartDocument;
import java.awt.*;
import javax.swing.SwingUtilities;

public class Start {

    private JFrame window;
    public Start(){
        window = new JFrame("calculator");
        window.setSize(265, 350);
        window.add(new Panel());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new  Runnable(){
            @Override
            public void run() {
                new Start();
            }
        });
    }
}