package tpe.oo.metropolis;

public class Verwender {

    public static void main(String[] args) {


        Schurke azog= new Schurke("_Azog der Schänder_",27990,"_Orkismus_",null);
        Schurke hannibal= new Schurke("_Hannibal Lecter_",19910,"_Kannibalismus_",null);
        Schurke onox= new Schurke("_Onox_",270201,"_Legendismus_",null);

        Syndikat syndikat = new Syndikat("Syndikat der Superschurken");
        syndikat.setSchurken(azog);
        syndikat.setSchurken(hannibal);

        Finanzamt f=new Finanzamt();
        f.setSteuerpflichtig(syndikat);
        f.setSteuerpflichtig(onox);


        System.out.printf("Gesamte Steuereinnahmen %.2f%n",f.steuer());

    }

}
