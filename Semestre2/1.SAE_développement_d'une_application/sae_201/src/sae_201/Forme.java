package sae_201;
import java.util.List;

import ardoise.*;

public abstract class Forme {
    protected String nom;
    private String type;

    public Forme(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public abstract List<Segment> dessiner();

    public void deplacer(int x, int y) {
        // Déplac  er la forme en mettant à jour les coordonnées de chaque point
        List<Segment> segments = dessiner();
        for (Segment segment : segments) {
            PointPlan point1 = segment.getPointArrivee();
            PointPlan point2 = segment.getPointArrivee();
            point1.setOrdonnee(point1.getOrdonnee() + x);
            point1.setAbscisse(point1.getAbscisse() + y);
            point2.setOrdonnee(point2.getOrdonnee() + x);
            point2.setAbscisse(point2.getAbscisse() + y);
        }
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
