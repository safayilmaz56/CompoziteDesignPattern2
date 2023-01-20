import jdk.jshell.spi.ExecutionControl;

public abstract class Asker { //component yapısı
    protected String isim;
    protected Rutbe rutbe;

    public Asker(String isim, Rutbe rutbe) {
        this.isim = isim;
        this.rutbe = rutbe;
    }
    public abstract void askerEkle(Asker asker) throws ExecutionControl.NotImplementedException;
    public abstract void askerSil(Asker asker) throws ExecutionControl.NotImplementedException;
    public abstract void emirGerceklestir();
}
