public class Cercle extends FormeGeometrique{
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    private Point centre ;

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    private double rayon;
    public Cercle(String nom , Point a , double r){
        super(nom);
        this.centre = a;
        this.rayon = r;
    }
    public String typeFigure(){
        return "Cercle";
    }
    public double perimetre(){
        return 2*Math.PI* getRayon();
    }
    public String toString(){
       return  super.toString() + " de position : "+getCentre().toString() + " de rayon : "+getRayon() + " de perimetre :  "+perimetre();
    }
    public void translation(double dx , double dy){
            this.centre.translation(dx,dy);
    }

}
