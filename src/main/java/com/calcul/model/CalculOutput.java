package com.calcul.model;

import java.util.List;

public class CalculOutput {

    private String titre;
    private List<SingleCalcul> listeCalculs;

    public List<SingleCalcul> getListeCalculs() {
        return listeCalculs;
    }

    public void setListeCalculs(List<SingleCalcul> listeCalculs) {
        this.listeCalculs = listeCalculs;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toString(boolean avecResult){
        String str = "";
        for(SingleCalcul singleCalcul : this.listeCalculs){
            str += singleCalcul.toString(true) + "\n";
        }
        return str;
    }
}
