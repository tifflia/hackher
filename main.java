import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Main extends JPanel {

    public static final int WIDTH = 1024;
    public static final int HEIGHT = 768;
    public static final int FPS = 60;
    World world;


    class Runner implements Runnable {
        public void run() {
            while(true){
                repaint();
                try {
                    Thread.sleep(1000/FPS);
                }
                catch(InterruptedException e){}
            }
        }
    }

    public Main() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        Thread mainThread = new Thread(new Runner());
        mainThread.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sign Language Learner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Main mainInstance = new Main();
        frame.setContentPane(mainInstance);

        frame.pack();
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }
}