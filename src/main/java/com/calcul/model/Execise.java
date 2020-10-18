package com.calcul.model;

import java.util.List;

public class Execise {

    private List<Calcul> listeCalculs;
    private String titre;
    private String pied;

    public List<Calcul> getListeCalculs() {
        return listeCalculs;
    }

    public void setListeCalculs(List<Calcul> listeCalculs) {
        this.listeCalculs = listeCalculs;
    }

    public String getPied() {
        return pied;
    }

    public void setPied(String pied) {
        this.pied = pied;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    public String toString(boolean avecResult){
        String str = "";
        for(Calcul calcul : this.listeCalculs){
            str += calcul.toString(true) + "\n";
        }
        return str;
    }
}
