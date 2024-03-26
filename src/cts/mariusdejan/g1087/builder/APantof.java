package cts.mariusdejan.g1087.builder;

import java.util.List;

public abstract class APantof {
    protected ETipPantof tipPantof;
    protected int nrPantof;
    protected float dimensiuneToc;
    protected ETipMaterial material;
    protected List<ETipMaterial> materialeSuplimentare;
    protected List<String> listaMesajeText;

    public abstract float calculPret();
    public abstract void addMesaj(String mesaj);
    public abstract void addMaterial(ETipMaterial tipMaterial);

}
