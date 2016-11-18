package tpe.oo.metropolis;

public class Richter extends Mensch {
    protected boolean korrupt;
    protected Richter(String name, int einkommen,boolean korrupt) {
        super(name, einkommen);
        this.korrupt=korrupt;
    }


    public void isKorrupt(boolean korrupt){
        this.korrupt=korrupt;
    }

}
