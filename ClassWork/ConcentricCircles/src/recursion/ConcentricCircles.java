

package recursion;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ConcentricCircles {

    public static void main(String[] args) {
         JFrame window = new JFrame("Concentric Circles");
         JPanel drawableArea = new JPanel();
         drawableArea.setLayout(null);
         JButton hi = new JButton();
         hi.setText("Hello there!");
         hi.setBounds(10, 10, 100, 100);
         JLabel generalKenobi = new JLabel("General Kenobi");
         generalKenobi.setBounds(200, 10, 100, 100);
         drawableArea.add(generalKenobi);
         drawableArea.add(hi);
         window.add(drawableArea);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setSize(800,600);
         window.setVisible(true);
    }

}
