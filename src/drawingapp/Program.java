package drawingapp;

import javax.swing.JFrame;

public class Program {
    public void run(){

        Canvas canva = new Canvas();
        Pen dollar = new Pen(canva);

        // Point p1 = new Point();
        // p1.set(200,200);
        // Point p2 = new Point();
        // p2.set(120,130);
        // Point p3 = p1.add(p2);

        // dollar.setPosition(p1);

        dollar.moveto(new Point(200,50));
        // dollar.display();

        dollar.lineTo(new Point(250,200));
        dollar.lineTo(new Point(100,100));
        dollar.lineTo(new Point(300,100));
        dollar.lineTo(new Point(150,200));
        dollar.lineTo(new Point(200,50));

        JFrame frame = new JFrame("Zoobia's Canvas");
        frame.setSize(400, 400);
         frame.add(canva);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
