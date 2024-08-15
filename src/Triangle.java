import java.util.ArrayList;

public class Triangle extends Polygone{
    public Triangle(String nom , Point p1, Point p2 , Point p3){
        super(nom , new ArrayList<>(){{
            add(p1);
            add(p2);
            add(p3);
        }});
    }

    @Override
    public double perimetre() {
        double cote1 = getPoints().get(0).distance(getPoints().get(1));
        double cote2 = getPoints().get(1).distance(getPoints().get(2));
        double cote3 = getPoints().get(2).distance(getPoints().get(0));
        return cote1+cote2+cote3;
    }

    @Override
    public String typeFigure() {
        return "Triangle";
    }
}
