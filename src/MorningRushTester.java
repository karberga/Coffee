import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.*;
/**
 * 
 */

/**
 * @author grant
 *
 */
public class MorningRushTester
{
    final static int initialGulps = 5;
    
    JFrame frame = new JFrame();
    JButton button = new JButton("Add Coffee");
    
    private static final int DELAY = 1000;
    
    public MorningRushTester()
    {    
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        class DrinkCoffee implements ActionListener
        {

            private int gulps;

            public DrinkCoffee(int inGulps)
            {
                gulps = inGulps;
            }

            @Override
            public void actionPerformed(ActionEvent event)
            {
                if (gulps > 0)
                {
                    System.out.println(gulps);
                }
                else if (gulps == 0)
                {
                    System.out.println("Go to school");
                    JOptionPane.showMessageDialog(null, "Make another?");
                    gulps = initialGulps;
                }
                --gulps;
            }
        }

        
     DrinkCoffee dc = new DrinkCoffee(initialGulps);
     Timer t = new Timer(DELAY, dc);
     t.start();

     JOptionPane.showMessageDialog(null, "Just about to go to school.");
     System.exit(0);
    }

}
