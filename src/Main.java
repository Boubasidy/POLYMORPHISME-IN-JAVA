import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cercle c = new Cercle("Petit cercle", new Point(10 , 2) , 5  );
        Rectangle rec = new Rectangle("A" , new Point(2,3) , new Point( 4,5) , new Point(1,4) , new Point(2,5));

        // Création du premier rectangle

        // Création de deux autres rectangles
        Rectangle rec2 = new Rectangle("B", new Point(5, 6), new Point(7, 8), new Point(6, 7), new Point(5, 8));
        Rectangle rec3 = new Rectangle("C", new Point(0, 1), new Point(1, 2), new Point(1, 1), new Point(0, 2));

        // Création de deux autres cercles
        Cercle c2 = new Cercle("Grand cercle", new Point(15, 15), 10);
        Cercle c3 = new Cercle("Cercle moyen", new Point(5, 5), 7);

        // Création de trois triangles
        Triangle t1 = new Triangle("Triangle 1", new Point(1, 1), new Point(2, 3), new Point(3, 1));
        Triangle t2 = new Triangle("Triangle 2", new Point(4, 5), new Point(6, 7), new Point(8, 5));
        Triangle t3 = new Triangle("Triangle 3", new Point(0, 0), new Point(2, 2), new Point(2, 0));
        ArrayList<FormeGeometrique> formes = new ArrayList<>();
        formes.add(c);
        formes.add(c2);
        formes.add(c3);
        formes.add(rec);
        formes.add(rec2);
        formes.add(rec3);
        formes.add(t1);
        formes.add(t2);
        formes.add(t3);

        for (FormeGeometrique p : formes){
            p.translation(2,3);
        }

        System.out.println("les affichages des figures sont : ");
        for (FormeGeometrique p : formes){
            System.out.println(p.toString());
        }

    }
}