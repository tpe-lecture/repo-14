package tpe.oo.metropolis;

public class Syndikat implements Koerperschaftsteuerpflichtig {

    protected String name;
    protected Schurke[] schurken = new Schurke[2];

    public Syndikat(String name) {
        this.name = name;
    }

    @Override
    public int koerperschaftsteuer() {
        int steuer = 0;
        int summe = 0;

        for (Schurke s : schurken) {
            if (s != null) {
                steuer = steuer + s.einkommensteuer();
                summe = summe + s.getEinkommen();
            }
        }
        return (int) (steuer + (summe * STEUERSATZ));

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
                schurken[position] = schurke;
                System.out.println(schurke.getName() + " " + "Hat sich dem "
                        + this.name + " angeschlossen");

                return;
            }

            position++;

        }

    }

    @Override
    public int steuer() {

        return koerperschaftsteuer();
    }
}
