import java.util.ArrayList;

public class Rectangle extends Polygone{
    public Rectangle(String nom , Point p1 , Point p2 , Point p3 , Point p4){
        super(nom, new ArrayList<Point>(){{
            add(p1);
            add(p2);
            add(p3);
            add(p4);
        }});
    }
    public double perimetre(){
        double longueur = getPoints().get(0).distance(getPoints().get(1));
        double largeur = getPoints().get(1).distance(getPoints().get(2));
        return 2*(longueur + largeur);
    }

    @Override
    public String typeFigure() {
        return "Rectangle";
    }

}
