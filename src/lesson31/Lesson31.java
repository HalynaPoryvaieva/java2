package lesson31;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Lesson31 extends JFrame {

    private Random random;

    private final Color[] COLORS = {Color.red, Color.green, Color.black, Color.blue};
    private  int CIRCLE_COUNT=100;

    public static void main(String[] args) {
        new Lesson31();
    }

    public Lesson31() {
        setTitle("Hello, Swing!");  // заголовок окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии
        setSize(500, 500); // размеры окна
        setLocationRelativeTo(null);// позиция на экране

        random=new Random();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getX()+","+e.getY());
                canvas.repaint();
            }
        });

        JButton btnDraw = new JButton("Draw");
        JButton btnExit = new JButton("Exit");

        add(btnDraw, BorderLayout.NORTH);
        add(btnDraw, BorderLayout.SOUTH);

        btnDraw.addActionListener(e -> System.out.println("Draw!"));
        btnExit.addActionListener(e -> System.exit(0));

        Panel btPanel = new Panel();
        btPanel.setLayout(new GridLayout());
        btPanel.add(btnDraw);
        btPanel.add(btnDraw);

        add(btPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true); // сделать видимым
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i=0;i<CIRCLE_COUNT;i++){
                int d=random.nextInt(20)+60;
                int x=random.nextInt(getWidth()-d);
                int y=random.nextInt(getHeight()-d);
                Color color=COLORS[random.nextInt(COLORS.length)];
                g.setColor(color);
                g.fillOval(x,y,d,d);
                g.setColor(Color.black);
                g.drawOval(x,y,d,d);

            }
        }
    }
}
