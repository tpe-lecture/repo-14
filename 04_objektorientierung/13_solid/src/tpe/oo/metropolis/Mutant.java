package tpe.oo.metropolis;

public abstract class Mutant extends Einwohner {
protected String mutation;

protected Mutant(String name,double einkommen,String mutation){
    super(name,einkommen);
    this.mutation=mutation;
}


}
