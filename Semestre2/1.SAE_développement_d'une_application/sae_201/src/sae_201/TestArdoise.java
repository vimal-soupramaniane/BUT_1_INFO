package sae_201;
import ardoise.*;
import java.util.ArrayList;
import java.util.Collection;


public class TestArdoise {

    public static void main(String[] args) {
        ThreadA ardoise = new ThreadA();
        ardoise.start();
    }

    static class ThreadA extends Thread {
        @Override
        public void run() {
            Ardoise art = new Ardoise();

            PointPlan point1 = new PointPlan(118, 13);
            PointPlan point2 = new PointPlan(123, 20);
            PointPlan point3 = new PointPlan(128, 13);

            Chapeau Oiseau1 = new Chapeau(point1, point2, point3);

            point1 = new PointPlan(133, 30);
            point2 = new PointPlan(136, 32);
            point3 = new PointPlan(138, 30);

            Chapeau Oiseau2 = new Chapeau(point1, point2, point3);

            point1 = new PointPlan(142, 14);
            point2 = new PointPlan(144, 17);
            point3 = new PointPlan(146, 14);

            Chapeau Oiseau3 = new Chapeau(point1, point2, point3);

            point1 = new PointPlan(9, 100);
            point2 = new PointPlan(20, 100);
            Quadrilatere Tour = new Quadrilatere("Tour", point1, point2, point3, point4);

            point1 = new PointPlan(80, 140);
            point2 = new PointPlan(180, 140);
            point3 = new PointPlan(180, 198);
            point4 = new PointPlan(180, 198);
            Quadrilatere Corps_maison = new Quadrilatere("Corps_maison", point1, point2, point3, point4);

            point1 = new PointPlan(120, 170);
            point2 = new PointPlan(140, 170);
            point3 = new PointPlan(140, 198);
            point4 = new PointPlan(180, 198);
            Quadrilatere porte_maison = new Quadrilatere("porte_maison", point1, point2,, point3, point4);

            point1 = new PointPlan(80, 140);
            point2 = new PointPlan(130, 100);
            point3 = new PointPlan(140, 198);
            point4 = new PointPlan(180, 198);
            PointPlan point31 = new PointPlan(180, 140);



            point1 = new PointPlan(170, 52);
            point2 = new PointPlan(173, 45);
            point31 = new PointPlan(177, 52);

            Chapeau branche1 = new Chapeau(point1, point2, point31);

            point1 = new PointPlan(177, 52);
            point2 = new PointPlan(184, 57);
            point31 = new PointPlan(177, 60);

            Chapeau branche2 = new Chapeau(point1, point2, point31);

            point1 = new PointPlan(177, 60);
            point2 = new PointPlan(174, 66);
            point31 = new PointPlan(170, 60);

            Chapeau branche3 = new Chapeau(point1, point2, point31);

            point1 = new PointPlan(170, 60);
            point2 = new PointPlan(164, 57);
            point31 = new PointPlan(170, 52);

            Chapeau branche4 = new Chapeau(point1, point2, point31);

            point1 = new PointPlan(3, 14);
            point2 = new PointPlan(43, 3);
            point31 = new PointPlan(112, 14);

            Triangle montagne1 = new Triangle("montagne1", point1, point2, point31);

            point1 = new PointPlan(152, 7);
            point2 = new PointPlan(166, 3);
            point31 = new PointPlan(172, 7);

            Triangle montagne2 = new Triangle("montagne2", point1, point2, point31);

            art.ajouterForme(Oiseau1);
            art.ajouterForme(Oiseau2);
            art.ajouterForme(Oiseau3);
            art.ajouterForme(Tour);
            art.ajouterForme(branche1);
            art.ajouterForme(branche2);
            art.ajouterForme(branche3);
            art.ajouterForme(branche4);
            art.ajouterForme(montagne1);
            art.ajouterForme(montagne2);

            try {
                art.dessinerGraphique();
                sleep(3000);
                art.deplacer(Oiseau1.getType(), 10, 20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
