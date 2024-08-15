import java.util.ArrayList;

public abstract class Polygone extends FormeGeometrique{
    public ArrayList<Point> getPoints() {
        return Points;
    }

    public void setPoints(ArrayList<Point> points) {
        Points = points;
    }

    private ArrayList<Point> Points;
    public Polygone(String nom , ArrayList<Point> points ){
        super(nom);
        this.Points = new ArrayList<>(points); 
    }
    public String toString(){
        StringBuilder chaine = new StringBuilder(super.toString());
        for (Point p : getPoints()){
            chaine.append(p.toString());
        }
        return chaine.toString() + " avec un perimètre de : "+ perimetre();
    }
    public void translation(double dx , double dy){
         for (Point p : getPoints()){
             p.translation(dx,dy);
         }
    }
}
