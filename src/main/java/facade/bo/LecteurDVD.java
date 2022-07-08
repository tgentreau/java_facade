package facade.bo;

public class LecteurDVD extends Appareils{

    private boolean audioSurrond;
    private boolean audioStereo;

    public boolean isAudioSurrond() {
        return audioSurrond;
    }

    public void setAudioSurrond(boolean audioSurrond) {
        this.audioSurrond = audioSurrond;
    }

    public boolean isAudioStereo() {
        return audioStereo;
    }

    public void setAudioStereo(boolean audioStereo) {
        this.audioStereo = audioStereo;
    }

    @Override
    public void marche() {
        System.out.println("Le lecteur dvd est en marche");
    }

    @Override
    public void arret() {
        System.out.println("Le lecteur dvd est arrêté");
    }

    public void ejecter() {
        System.out.println("Le lecteur dvd éjecte le dvd");
    }

    public void pause() {

    }

    public void jouer() {
        System.out.println("Le lecteur dvd joue le dvd");
    }

    public void stop() {
        System.out.println("Le lecture dvd stoppe le dvd");
    }
}
