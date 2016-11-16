package tpe.oo.metropolis;

public class Finanzamt {

    private Steuerpflichtig[] steuerpflichtig = new Steuerpflichtig[20];

    // public double steuer(Steuerpflichtig f){
    // double steuerEinnahmen=0;
    // if (f instanceof Einkommensteuerpflichtig) {
    // steuerEinnahmen = steuerEinnahmen+ ((Einkommensteuerpflichtig)
    // f).einkommensteuer();
    // }
    // if (f instanceof Koerperschaftsteuerpflichtig) {
    // steuerEinnahmen = steuerEinnahmen + ((Koerperschaftsteuerpflichtig)
    // f).koerperschaftsteuer();
    // }
    // if (f instanceof Gewerbesteuerpflichtig) {
    // steuerEinnahmen = steuerEinnahmen+ ((Gewerbesteuerpflichtig)
    // f).gewerbesteuer();
    // }
    // return steuerEinnahmen;
    // }

    public double steuer() {
        double steuerEinnahmen = 0;
        for (Steuerpflichtig s : steuerpflichtig) {
            if (s != null) {
                steuerEinnahmen = steuerEinnahmen + s.steuer();
            }
        }
        return steuerEinnahmen;
    }

    public void setSteuerpflichtig(Steuerpflichtig s) {
        int position = 0;
        while (true) {
            if (steuerpflichtig[steuerpflichtig.length - 1] != null) {

                System.out.println("voll");
                return;
            }

            if (steuerpflichtig[position] == null) {
                steuerpflichtig[position] = s;
                return;
            }

            position++;

        }
    }

}
