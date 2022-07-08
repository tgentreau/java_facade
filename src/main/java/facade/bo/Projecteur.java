package facade.bo;

public class Projecteur extends Appareils{
    private String entree;
    private LecteurDVD lecteurDVD;

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    @Override
    public void marche() {
        System.out.println("Le projecteur est en marche");
    }

    @Override
    public void arret() {
        System.out.println("Le projecteur est arrêté");
    }

    public void modeTV() {
        System.out.println("Le projecteur passe en mode tv");
    }

    public void modeGrandEcran() {
        System.out.println("Le projecteur passe en mode grand écran");
    }
}
