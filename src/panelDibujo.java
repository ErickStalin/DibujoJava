import java.awt.Graphics;
import javax.swing.JPanel;

public class panelDibujo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura = getWidth();
        int altura = getHeight();

        g.drawLine(0,0,100,0);
        g.drawLine(0,100,100,100);
        g.drawLine(0,50,50,50);
        g.drawLine(0,0,100,0);
    }

}