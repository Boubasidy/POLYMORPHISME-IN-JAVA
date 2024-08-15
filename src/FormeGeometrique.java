public abstract class  FormeGeometrique {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom ;
    public abstract double perimetre();
    public FormeGeometrique(String nom ){
        this.nom = nom ;
    }
    public abstract String typeFigure();

    @Override
    public String toString() {
        return typeFigure()+" de nom "+getNom();
    }

    public void translation(double i , double j) {
    }
}
