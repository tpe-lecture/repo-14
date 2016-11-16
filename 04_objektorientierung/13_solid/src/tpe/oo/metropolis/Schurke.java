package tpe.oo.metropolis;

public class Schurke extends Mutant implements Einkommensteuerpflichtig {
    protected Superkraft schwaeche;

    public Schurke(String name, double einkommen, String mutation,
            Superkraft schwaeche) {
        super(name, einkommen, mutation);
        this.schwaeche = schwaeche;
    }

    @Override
    public double einkommensteuer() {
        double ohneAbzug = 0;
        if (einkommen <= 20000) {
            ohneAbzug = einkommen;
            einkommen = ohneAbzug * 0.92;
            return ohneAbzug * STEUERSATZ1;
        }
        else if (einkommen > 20000 && einkommen <= 40000) {
            ohneAbzug = einkommen;
            einkommen = ohneAbzug - ((20000 * STEUERSATZ1)
                    + ((ohneAbzug - 20000) * STEUERSATZ2));
            return (20000 * STEUERSATZ1) + ((ohneAbzug - 20000) * STEUERSATZ2);

        }
        else if (einkommen > 40000 && einkommen <= 60000) {
            ohneAbzug = einkommen;
            einkommen = ohneAbzug
                    - ((20000 * STEUERSATZ1) + (20000 * STEUERSATZ2)
                            + ((ohneAbzug - 40000) * STEUERSATZ3));
            return ((20000 * STEUERSATZ1) + (20000 * STEUERSATZ2)
                    + ((ohneAbzug - 40000) * STEUERSATZ3));
        }
        else {
            ohneAbzug = einkommen;
            einkommen = ohneAbzug - ((20000 * STEUERSATZ1)
                    + (20000 * STEUERSATZ2) + (20000 * STEUERSATZ3)
                    + ((ohneAbzug - 60000) * 0.4));
            return ((20000 * STEUERSATZ1) + (20000 * STEUERSATZ2)
                    + (20000 * STEUERSATZ3) + ((ohneAbzug - 60000) * 0.4));
        }
    }

    public double getEinkommen() {
        return this.einkommen;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double steuer() {
        // TODO Auto-generated method stub
        return einkommensteuer();
    }
}
