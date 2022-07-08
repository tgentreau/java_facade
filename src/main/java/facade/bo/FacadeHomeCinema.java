package facade.bo;

public class FacadeHomeCinema {
    MachineAPopcorn machineAPopcorn = new MachineAPopcorn();
    Lumiere lumiere = new Lumiere();
    Ecran ecran = new Ecran();
    Projecteur projecteur = new Projecteur();
    Amplificateurs amplificateurs = new Amplificateurs();
    LecteurDVD lecteurDVD = new LecteurDVD();

    LecteurCD lecteurCD = new LecteurCD();

    Tuner tuner = new Tuner();

    public void regarderFilm() {
        machineAPopcorn.marche();
        machineAPopcorn.eclater();
        lumiere.attenuer(10);
        ecran.baisser();
        projecteur.marche();
        projecteur.setEntree("dvd");
        projecteur.modeGrandEcran();
        amplificateurs.marche();
        amplificateurs.setDvd("le dvd");
        amplificateurs.setSonSurround(true);
        amplificateurs.setVolume(8);
        lecteurDVD.marche();
        lecteurDVD.jouer();
    }

    public void arreterFilm() {
        machineAPopcorn.arret();
        lumiere.arret();
        ecran.monter();
        projecteur.arret();
        amplificateurs.arret();
        lecteurDVD.ejecter();
        lecteurDVD.arret();
    }

    public void ecouterCD() {
        machineAPopcorn.marche();
        machineAPopcorn.eclater();
        lumiere.attenuer(8);
        lecteurCD.marche();
        lecteurCD.jouer();
    }

    public void arreterCD() {
        machineAPopcorn.arret();
        lumiere.arret();
        lecteurCD.arret();
    }

    public void ecouterRadio() {
        machineAPopcorn.marche();
        machineAPopcorn.eclater();
        tuner.marche();
        tuner.setFm(true);
    }

    public void arreterRadio() {
        machineAPopcorn.arret();
        tuner.arret();
    }
}
