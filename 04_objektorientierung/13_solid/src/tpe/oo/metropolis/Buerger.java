package tpe.oo.metropolis;

public class Buerger extends Mensch implements Einkommensteuerpflichtig {

    protected Buerger(String name, double einkommen) {
        super(name, einkommen);

    }

    @Override
    public double einkommensteuer() {

        return 0;
    }

    @Override
    public double steuer() {
        // TODO Auto-generated method stub
        return 0;
    }

}
