package cts.mariusdejan.g1087.main;

import cts.mariusdejan.g1087.builder.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BuilderPantof builder = new BuilderPantof
                (ETipPantof.TENISI, 6,
                        42, ETipMaterial.PANZA);
        try {

            List<String> listaMesaje = new ArrayList<>();
            listaMesaje.add("mesaj1");
            listaMesaje.add("mesaj2");
            listaMesaje.add("mesaj3");

            Pantof p = builder.setListaMesajeText(listaMesaje).build();
            
            System.out.println(p.calculPret());
            p.addMaterial(ETipMaterial.PIELE);
            System.out.println(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
