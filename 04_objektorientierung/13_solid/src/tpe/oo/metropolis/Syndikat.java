package tpe.oo.metropolis;

public class Syndikat implements Koerperschaftsteuerpflichtig {

    protected String name;
    protected Schurke[] schurken = new Schurke[2];

    public Syndikat(String name) {
        this.name = name;
    }

    public double koerperschaftsteuer() {
        double steuer = 0;
        double summe = 0;

        for (Schurke s : schurken) {
            if (s != null) {
                steuer = steuer + s.einkommensteuer();
                summe = summe + s.getEinkommen();
            }
        }
        return steuer + (summe * STEUERSATZ);

    }

    public void setSchurken(Schurke schurke) {
        int position = 0;

        while (true) {
            if (schurken[schurken.length - 1] != null) {

                System.out.println(
                        "Sorry " + schurke.name + " das Syndikat ist voll");
                return;
            }

            if (schurken[position] == null) {
                System.out.println(schurke.getName() + " " + "Hat sich dem "
                        + this.name + " angeschlossen");
                schurken[position] = schurke;
                return;
            }

            position++;

        }

    }

    @Override
    public double steuer() {

        return koerperschaftsteuer();
    }
}
