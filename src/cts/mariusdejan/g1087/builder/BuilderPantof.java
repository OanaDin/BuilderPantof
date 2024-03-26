package cts.mariusdejan.g1087.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderPantof implements IBuilder{
    protected ETipPantof tipPantof;
    protected int nrPantof;
    protected float dimensiuneToc;
    protected ETipMaterial material;
    protected List<ETipMaterial> materialeSuplimentare;
    protected List<String> listaMesajeText;

    public BuilderPantof(ETipPantof eTipPantof, float dimensiuneToc,int nrPantof, ETipMaterial material){
        this.tipPantof = eTipPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.nrPantof = nrPantof;
        this.material = material;
        this.listaMesajeText = new ArrayList<>();
        this.materialeSuplimentare = new ArrayList<>();
    }

    public BuilderPantof setListaMesajeText(List<String> listaMesajeText){
        this.listaMesajeText = listaMesajeText;
        return this;
    }

    public BuilderPantof setMaterialeSuplimentare(List<ETipMaterial> materialeSuplimentare){
        this.materialeSuplimentare = materialeSuplimentare;
        return this;
    }
    @Override
    public Pantof build() throws Exception {
        if(this.nrPantof < 35 || this.nrPantof > 45) {
            throw new Exception("Marimea pantofului trebuie sa fie intre 35 si 45");
        }
        if(this.dimensiuneToc < 0.5 || this.dimensiuneToc > 12.5 || this.dimensiuneToc % 1 != 0){
            throw new Exception("Dimensiune tocului trebuie sa fie un nr intreg intre 0.5 si 12.5");
        }
        if(this.tipPantof == ETipPantof.TENISI && this.materialeSuplimentare.size() > 2) {
            throw new Exception("Numarul de materiale suplimentare pentru tenisi nu poate depasi 2");
        }

        int lungimeTotalaMesaje = 0;
        for (String mesajText : this.listaMesajeText) {
            lungimeTotalaMesaje += mesajText.length();
        }

        if (lungimeTotalaMesaje >= this.nrPantof) {
            throw new IllegalArgumentException("Dimensiunea totală a mesajelor trebuie să fie mai mică decât numărul pantofului.");
        }

        Pantof pantof =  new Pantof(this.tipPantof,this.nrPantof,this.dimensiuneToc,this.material);
        for(String mesajText: this.listaMesajeText){
            pantof.addMesaj(mesajText);
        }
        for(ETipMaterial tipMaterial: this.materialeSuplimentare){
            pantof.addMaterial(tipMaterial);
        }
        return pantof;
    }
}
