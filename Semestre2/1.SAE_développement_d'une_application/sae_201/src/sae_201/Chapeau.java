package sae_201;

import java.util.ArrayList;
import java.util.List;
import ardoise.*;
import ardoise.Forme;
import ardoise.PointPlan;

import ardoise.Segment;

public class Chapeau extends Forme {
    private PointPlan point1;
    private PointPlan point2;
    private PointPlan point3;

    public Chapeau(PointPlan point1, PointPlan point2, PointPlan point3) {
        super("Chapeau");
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    
    @Override
    public String typeForme() {
        return "Chapeau";
    }

    @Override
    public ArrayList<Segment> dessiner() {
        List<Segment> segments = new ArrayList<>();

        // Ajouter les segments du chapeau à la liste
        segments.add(new Segment(point1, point2));
        segments.add(new Segment(point2, point3));

        return (ArrayList<Segment>) segments;
    }

	@Override
	public void deplacer(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	public String getType() {
		// TODO Auto-generated method stub
		return "chapeau";
	}


}
