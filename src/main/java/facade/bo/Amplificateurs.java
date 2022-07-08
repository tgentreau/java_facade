package facade.bo;

public class Amplificateurs extends Appareils{
    private String cd;
    private String dvd;
    private boolean sonStereo;
    private boolean sonSurround;
    private int volume;
    private Tuner tuner;
    @Override
    public void marche() {
        System.out.println("L'amplificateur est en marche");
    }

    @Override
    public void arret() {
        System.out.println("L'amplificateur est mis à l'arrêt");
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public boolean isSonStereo() {
        return sonStereo;
    }

    public void setSonStereo(boolean sonStereo) {
        this.sonStereo = sonStereo;
    }

    public boolean isSonSurround() {
        return sonSurround;
    }

    public void setSonSurround(boolean sonSurround) {
        this.sonSurround = sonSurround;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }
}
