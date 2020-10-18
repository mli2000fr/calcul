package com.calcul.model;

public class Calcul {

    private String calcul;
    private String result;

    public String getCalcul() {
        return calcul;
    }

    public void setCalcul(String calcul) {
        this.calcul = calcul;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String toString(boolean avecResult){
        return calcul + " = " + (avecResult ? result : "");
    }
}


