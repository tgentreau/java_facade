package facade.bo;

public class LecteurCD extends Appareils{
    @Override
    public void marche() {
        System.out.println("Le lecteur cd est mis en marche");
    }

    @Override
    public void arret() {
        System.out.println("Le lecteur cd est mis à l'arrêt");
    }

    public void ejecter() {
        System.out.println("Le lecteur cd ejecte le cd");
    }

    public void pause() {
        System.out.println("Le lecteur cd met en pause le cd");
    }

    public void jouer() {
        System.out.println("Le lecteur cd joue un cd");
    }

    public void stop() {
        System.out.println("Le lecteur se met en stop");
    }
}
