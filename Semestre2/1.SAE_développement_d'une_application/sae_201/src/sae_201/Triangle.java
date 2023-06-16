package sae_201;

import java.util.ArrayList;
import java.util.List;
import ardoise.Forme;
import ardoise.Segment;
import ardoise.*;

public class Triangle extends Forme {
    private PointPlan point1;
    private PointPlan point2;
    private PointPlan point3;

    public Triangle(String nom, PointPlan point1, PointPlan point2, PointPlan point3) {
        super(nom);
        this.setPoint1(point1);
        this.setPoint2(point2);
        this.setPoint3(point3);
    }

    @Override
 
    public ArrayList<Segment> dessiner() {
        List<Segment> segments = new ArrayList<>();

        // Créer les segments du triangle en utilisant les points
        Segment segment1 = new Segment(getPoint1(), getPoint2());
        Segment segment2 = new Segment(getPoint2(), getPoint3());
        Segment segment3 = new Segment(getPoint3(), getPoint1());

        // Ajouter les segments à la liste
        segments.add(segment1);
        segments.add(segment2);
        segments.add(segment3);

        return (ArrayList<Segment>) segments;
    }

	public PointPlan getPoint1() {
		return point1;
	}

	public void setPoint1(PointPlan point1) {
		this.point1 = point1;
	}

	public PointPlan getPoint3() {
		return point3;
	}

	public void setPoint3(PointPlan point3) {
		this.point3 = point3;
	}

	public PointPlan getPoint2() {
		return point2;
	}

	public void setPoint2(PointPlan point2) {
		this.point2 = point2;
	}

	@Override
	public void deplacer(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String typeForme() {
		// TODO Auto-generated method stub
		return "triangle";
	}
}