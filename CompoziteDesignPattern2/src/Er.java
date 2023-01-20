import jdk.jshell.spi.ExecutionControl;

public class Er extends Asker{
    public Er(String isim, Rutbe rutbe) {
        super(isim, rutbe);
    }

    @Override
    public void askerEkle(Asker asker) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("erler erisemez");
    }

    @Override
    public void askerSil(Asker asker) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("erler erisemez");

    }

    @Override
    public void emirGerceklestir() {
        System.out.println(isim + " " + rutbe);
    }
}
