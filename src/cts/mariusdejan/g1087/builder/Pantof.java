package cts.mariusdejan.g1087.builder;

import java.util.ArrayList;

public class Pantof extends APantof{

    Pantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = material;
    }
    @Override
    public float calculPret() {
        float pret = 0;
        if (this.tipPantof == ETipPantof.BALERINI) {
            pret = 100;
        } else {
            if (this.tipPantof == ETipPantof.TENISI) {
                pret = 150;
            } else {
                if (this.tipPantof == ETipPantof.GHETE) {
                    pret = 200;
                } else {
                    if (this.tipPantof == ETipPantof.STILETTO) {
                        pret = 250;
                    }
                }
            }
        }

    return pret;
    }

    @Override
    public void addMesaj(String mesaj) {
        if(this.listaMesajeText == null){
            this.listaMesajeText = new ArrayList<>();
        }

        this.listaMesajeText.add(mesaj);
    }

    @Override
    public void addMaterial(ETipMaterial tipMaterial) {
        if(this.materialeSuplimentare == null){
            this.materialeSuplimentare = new ArrayList<>();
        }
        this.materialeSuplimentare.add(tipMaterial);

    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", nrPantof=" + nrPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", material=" + material +
                ", materialeSuplimentare=" + materialeSuplimentare +
                ", listaMesajeText=" + listaMesajeText +
                '}';
    }
}
