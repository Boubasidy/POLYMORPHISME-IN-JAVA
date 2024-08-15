public class Point {
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    private double x ;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private  double y ;
    public Point(double dx , double dy){
        this.x = dx ;
        this.y = dy ;
    }
    public String toString(){
        return "("+this.x + ","+this.y+")";
    }
    public double distance(Point p2){
        double dx = x - p2.x;
        double dy = y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void translation (double dx , double dy){
        this.x += dx;
        this.y+= dy;
    }
}
