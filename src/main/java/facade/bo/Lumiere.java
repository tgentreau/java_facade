package facade.bo;

public class Lumiere extends Appareils{
    @Override
    public void marche() {
        System.out.println("La lumière est en marche");
    }

    @Override
    public void arret() {
        System.out.println("La lumière est arrêté");
    }

    public void attenuer(int valeur) {
        System.out.println("La lumière est attenuer de " + valeur);
    }
}
