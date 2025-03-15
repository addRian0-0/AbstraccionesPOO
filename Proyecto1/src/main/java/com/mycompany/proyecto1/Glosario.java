package com.mycompany.proyecto1;

/**
 *
 * @author selec El glosario servira tanto para las tecnicas de cocina, asi como
 * para terminos u utencilios
 */
public class Glosario {

    //hace referencia a Nombre de la tecnica, del utensilio o la palabra y si es descrpcion o significado
    public enum GlosarioItem {

        TECNICA("Tecnica", "Descripcion de la tecnica"),
        UTENSILIO("Utensilio", "Descripcion del utensilio"),
        PALABRA("Palabra", "Significado");

        private String refer;
        private String sigTecDes;

        GlosarioItem(String refer, String sigTecDes) {
            this.refer = refer;
            this.sigTecDes = sigTecDes;
        }

        public String getRefer() {
            return refer;
        }

        public String getSigTecDes() {
            return sigTecDes;
        }

    }

    //hace referencia a Nombre de la tecnica, del utensilio o la palabra y si es descrpcion o significado
    private GlosarioItem glosarioItem;
    private String nomTecUte;
    private String desTecSig;
    private boolean universal;

    public Glosario(GlosarioItem glosarioItem, String nomTecUte, String desTecSig, boolean universal) {
        this.glosarioItem = glosarioItem;
        this.nomTecUte = nomTecUte;
        this.desTecSig = desTecSig;
        this.universal = universal;
    }

    public GlosarioItem getGlosarioItem() {
        return glosarioItem;
    }

    public void setGlosarioItem(GlosarioItem glosarioItem) {
        this.glosarioItem = glosarioItem;
    }

    public String getNomTecUte() {
        return nomTecUte;
    }

    public void setNomTecUte(String nomTecUte) {
        this.nomTecUte = nomTecUte;
    }

    public String getDesTecSig() {
        return desTecSig;
    }

    public void setDesTecSig(String desTecSig) {
        this.desTecSig = desTecSig;
    }

    public boolean isUniversal() {
        return universal;
    }

    public void setUniversal(boolean universal) {
        this.universal = universal;
    }
    
}
