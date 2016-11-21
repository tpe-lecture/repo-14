package tpe.enumeration.own;

public enum Wuerfeltyp {

    D4(4), D6(6), D8(8), D10(10),D12(12);

    private final int seitenAnzahl;
    private Wuerfeltyp(int seitenAnzahl){
        this.seitenAnzahl=seitenAnzahl;
    }

    public int getAnzahl(){
        return seitenAnzahl;
    }

    public double average(){
        return (seitenAnzahl+1)/2.0;
    }






}
