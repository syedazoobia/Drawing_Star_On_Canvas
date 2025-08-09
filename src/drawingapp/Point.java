package drawingapp;

public class Point {
    private int x, y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setx(int x){
        this.x = x;
    }
    public int getx(){
        return x;
    }

    public void sety(int y){
        this.y = y;
    }
    public int gety(){
        return y;
    }

    public Point add(Point other){
        return new Point(this.x + other.x, this.y + other.y);
    }

    @Override
    public String toString(){
        return "( "+ x + "," + y +" )";
    }
}
