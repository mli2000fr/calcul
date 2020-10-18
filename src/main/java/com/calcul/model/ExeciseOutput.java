package com.calcul.model;

import java.util.List;

public class ExeciseOutput {

    private List<Execise> listeExecises;

    public List<Execise> getListeExecises() {
        return listeExecises;
    }

    public void setListeExecises(List<Execise> listeExecises) {
        this.listeExecises = listeExecises;
    }


    public String toString(){
        String str = "";
        for(Execise execise: this.listeExecises){
            str += execise.getTitre() + "\n";
            str += execise.toString(true) + "\n";
            str += execise.getPied() + "\n";
        }
        return str;
    }
}
