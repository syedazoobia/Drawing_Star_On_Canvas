package drawingapp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Canvas extends JPanel {
    
    private List<Line> cvs_lines = new ArrayList<>();

    public void addline(Point p1, Point p2){
        cvs_lines.add(new Line(p1, p2));
        System.out.println("Line from ("+p1.getx() +" , "+p1.gety()+") to ("+p2.getx()+" , "+ p2.gety()+")");
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Line Line:cvs_lines){
        g.drawLine(Line.start.getx(),Line.start.gety(),Line.end.getx(),Line.end.gety());        }
    }
}
