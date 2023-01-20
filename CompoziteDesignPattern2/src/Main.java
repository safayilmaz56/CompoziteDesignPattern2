public class Main {
    public static void main(String[] args) {
        Komutan general = new Komutan("Safa",Rutbe.General);

        general.askerEkle(new Er("Hasan",Rutbe.Albay));
        general.askerEkle(new Er("Osman",Rutbe.Albay));

        Komutan albay = new Komutan("Serkan",Rutbe.Binbasi);
        Komutan yarbay = new Komutan("Emre",Rutbe.Yarbay);

        yarbay.askerEkle(new Er("Süleyman",Rutbe.Binbasi));
        yarbay.askerEkle(new Er("Kaan",Rutbe.Binbasi));

        albay.askerEkle(yarbay);
        albay.askerEkle(new Er("Yusuf",Rutbe.Yarbay));

        general.askerEkle(albay);
        general.emirGerceklestir();

    }
}