package drawingapp;

public class Pen {
    private Point position;
    private Canvas cvs;

    public Pen(Canvas cvs) {
        this.cvs = cvs;
        this.position = new Point(0,0); // is necessary because when a pen object is created, your position var is just an empty reference 
    }

    public void moveto(Point z) {
        Point newpoint = new Point(z);
        this.position = newpoint;
        System.out.println("PEN MOVE TO: "+z);
    }

    public void lineTo(Point z) {
        System.out.println("Drawing line from " + position + " to " + z);
        Point startcopy = new Point (position.getx(),position.gety());
        Point endcopy = new Point (z.getx(), z.gety());
        cvs.addline(startcopy,endcopy);
        position.set(z.getx(),z.gety());  
    }

    public void display() {
        System.out.println("Pen is at (" + position.getx() + "," + position.gety() + ")");
    }

    public void setPosition(Point p) {
        this.position = new Point(p);
    }

    public Point getPosition() {
        return this.position;
    }
}