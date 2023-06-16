package sae_201;
import java.util.ArrayList;
import java.util.List;
import ardoise.Forme;
import ardoise.Segment;

import ardoise.*;

public class FormeComposee1 extends Forme {
    private ArrayList<sae_201.Forme> formes;
    private ArrayList<Segment> segments;

    public FormeComposee1(ArrayList<sae_201.Forme> f) {
        super(""); // Appel explicite du constructeur de la classe Forme
        segments = new ArrayList<Segment>();
        this.formes = f;
        for (int j = 0; j < f.size(); j++) {
            for (int i = 0; i < f.get(j).dessiner().size(); i++) {
                segments.add(f.get(j).dessiner().get(i));
            }
        }
    }

    public void FormeComposee(ArrayList<sae_201.Forme> f) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void deplacer(int x, int y) {
        for (int j = 0; j < formes.size(); j++) {
            formes.get(j).deplacer(x, y);
        }
    }

    @Override
    public ArrayList<Segment> dessiner() {
        List<Segment> totale = new ArrayList<Segment>();
        for (int i = 0; i < formes.size(); i++) {
            totale.addAll(formes.get(i).dessiner());
        }
        return (ArrayList<Segment>) totale;
    }

	@Override
	public String typeForme() {
		// TODO Auto-generated method stub
		return "FormeComposee1";
	}
}
