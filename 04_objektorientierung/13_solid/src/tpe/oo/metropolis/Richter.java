package tpe.oo.metropolis;

public class Richter extends Mensch {
    protected boolean korrupt;
    protected Richter(String name, double einkommen,boolean korrupt) {
        super(name, einkommen);
        this.korrupt=korrupt;
    }
    
    
    public void isKorrupt(boolean korrupt){
        this.korrupt=korrupt;
    }

}
