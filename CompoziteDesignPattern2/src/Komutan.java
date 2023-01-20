import java.util.ArrayList;
import java.util.List;

public class Komutan extends Asker{ //composite yapısı

    List<Asker> askerler = new ArrayList<>();

    public Komutan(String isim, Rutbe rutbe) {
        super(isim, rutbe);
    }

    @Override
    public void askerEkle(Asker asker) {
        askerler.add(asker);
    }

    @Override
    public void askerSil(Asker asker) {
        askerler.remove(asker);
    }

    @Override
    public void emirGerceklestir() {
        System.out.println(rutbe +" " + isim);
        for (Asker asker : askerler){
            asker.emirGerceklestir();
        }
    }

}
