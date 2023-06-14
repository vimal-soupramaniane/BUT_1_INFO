package sae_201;
import java.util.ArrayList;
import java.util.List;
import ardoise.Forme;
import ardoise.Segment;

import ardoise.*;

public class Quadrilatere extends Forme {
    private PointPlan point1;
    private PointPlan point2;

  

    public Quadrilatere(String nom, PointPlan point1, PointPlan point2) {
        super(nom);
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        List<Segment> segments = new ArrayList<>();

        // Ajouter les segments du quadrilatère à la liste
        segments.add(new Segment(point1, point2));
        segments.add(new Segment(point2, point1));

        return (ArrayList<Segment>) segments;
    }

	@Override
	public void deplacer(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String typeForme() {
		// TODO Auto-generated method stub
		return "quadrilatere";
	}
}
