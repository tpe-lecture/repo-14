package tpe.oo.metropolis;

public class Schurke extends Mutant implements Einkommensteuerpflichtig {
    protected Superkraft schwaeche;

    public Schurke(String name, int einkommen, String mutation,
            Superkraft schwaeche) {
        super(name, einkommen, mutation);
        this.schwaeche = schwaeche;
    }

    @Override
    public int einkommensteuer() {
        int steuer = 0;
        int temp;
        int einkommen = this.einkommen;
        // int ohneAbzug = 0;
        // if (einkommen <= 20000) {
        // ohneAbzug = einkommen;
        // einkommen = (int)(ohneAbzug * 0.92);
        // return (int)(ohneAbzug * STEUERSATZ1);
        // }
        // else if (einkommen <= 60000) {
        // ohneAbzug = einkommen;
        // einkommen = (int) (ohneAbzug - ((20000 * STEUERSATZ1)
        // + ((ohneAbzug - 20000) * STEUERSATZ2)));
        // return (int) ((20000 * STEUERSATZ1) + ((ohneAbzug - 20000) *
        // STEUERSATZ2));
        //
        // }
        // else if (einkommen<=120000) {
        // ohneAbzug = einkommen;
        // einkommen = (int) (ohneAbzug
        // - ((20000 * STEUERSATZ1) + (20000 * STEUERSATZ2)
        // + ((ohneAbzug - 40000) * STEUERSATZ3)));
        // return (int) ((20000 * STEUERSATZ1) + (20000 * STEUERSATZ2)
        // + ((ohneAbzug - 40000) * STEUERSATZ3));
        // }
        // else {
        // ohneAbzug = einkommen;
        // einkommen = (int) (ohneAbzug - ((20000 * STEUERSATZ1)
        // + (20000 * STEUERSATZ2) + (20000 * STEUERSATZ3)
        // + ((ohneAbzug - 60000) * 0.4)));
        // return (int) ((20000 * STEUERSATZ1) + (20000 * STEUERSATZ2)
        // + (20000 * STEUERSATZ3) + ((ohneAbzug - 60000) * 0.4));
        // }

        if (einkommen > 120000) {
            temp = einkommen - 120000;
            steuer += temp * 0.4; // expliziter cast bei += nicht nötig
                                  // o.O?
            einkommen -= temp;
        }
        if (einkommen >= 60000) {
            temp = einkommen - 60000;
            steuer += temp * STEUERSATZ3;
            einkommen -= temp;
        }

        if (einkommen >= 40000) {
            temp = einkommen - 20000;
            steuer += temp * STEUERSATZ2;
            einkommen -= temp;
        }

        if (einkommen > 0) {
            temp = einkommen;
            steuer += temp * STEUERSATZ1;
            einkommen -= temp;
        }
        else {
            return 0;
        }

        this.einkommen = this.einkommen - steuer;

        return steuer;
    }

    public int getEinkommen() {
        return this.einkommen;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int steuer() {
        // TODO Auto-generated method stub
        return einkommensteuer();
    }
}
