package facade.bo;

public class MachineAPopcorn extends Appareils{
    @Override
    public void marche() {
        System.out.println("La machine a popcorn est en marche");
    }

    @Override
    public void arret() {
        System.out.println("La machine a popcorn est arrêté");
    }

    public void eclater() {
        System.out.println("Les popcorns éclatent");
    }
}
