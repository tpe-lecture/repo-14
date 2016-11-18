package tpe.oo.metropolis;

public class Verwender {

    public static void main(String[] args) {

        Schurke azog = new Schurke("_Azog der Schänder_", 27990, "_Orkismus_",
                null);
        Schurke hannibal = new Schurke("_Hannibal Lecter_", 19910,
                "_Kannibalismus_", null);
        Schurke onox = new Schurke("_Onox_", 270201, "_Legendismus_", null);
        Syndikat syndikat = new Syndikat("Syndikat der Superschurken");
        Finanzamt f = new Finanzamt();
        syndikat.setSchurken(azog);
        syndikat.setSchurken(hannibal);

        f.setSteuerpflichtig(syndikat);
        f.setSteuerpflichtig(onox);

        System.out.println( f.steuer());

    }

}
