import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimation extends JPanel implements ActionListener
{
                private int x = 0;
                private int y = 100;
                private Timer timer;

        public SimpleAnimation()
        {
            timer = new Timer(10, this);
            timer.start();
        }

                @Override
                protected void paintComponent(Graphics g)
            {
                    super.paintComponent(g);
                    g.setColor(Color.BLUE);
                    g.fillOval(x, y, 50, 50);
            }

            @Override
            public void actionPerformed(ActionEvent e)
    {
            x += 2;
                 if (x > getWidth())
            {
                 x = -50;
            }
        repaint();
    }

                    public static void main(String[] args)
            {
                JFrame frame = new JFrame("Simple Animation");
                SimpleAnimation animation = new SimpleAnimation();
                frame.add(animation);
                frame.setSize(600, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
}




