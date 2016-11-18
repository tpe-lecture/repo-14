package tpe.oo.metropolis;

public class Buerger extends Mensch implements Einkommensteuerpflichtig {

    protected Buerger(String name, int einkommen) {
        super(name, einkommen);

    }

    @Override
    public int einkommensteuer() {

        return 0;
    }

    @Override
    public int steuer() {
        // TODO Auto-generated method stub
        return 0;
    }

}
