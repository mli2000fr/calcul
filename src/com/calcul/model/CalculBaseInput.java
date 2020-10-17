package com.calcul.model;

import java.util.List;

public class CalculBaseInput {

    private boolean isNegatif;

    private boolean isDecimal;
    private int nombreMaxDecimals = 2;

    private int nombreOperateurs = 1;

    private int resultMax = 50;
    private int maxSigneChiffre = 100;

    private int multiple1Max = 9;
    private int multiple2Max = 9;

    private int nombreCalculs = 500;

    public CalculBaseInput(){}

    public CalculBaseInput(CalculBaseInput calculBaseInput){
        this.isNegatif = calculBaseInput.isNegatif();
        this.isDecimal = calculBaseInput.isDecimal();
        this.nombreMaxDecimals = calculBaseInput.getNombreMaxDecimals();
        this.nombreOperateurs = calculBaseInput.getNombreOperateurs();
        this.resultMax = calculBaseInput.getResultMax();
        this.maxSigneChiffre = calculBaseInput.getMaxSigneChiffre();
        this.multiple1Max = calculBaseInput.getMultiple1Max();
        this.multiple2Max = calculBaseInput.getMultiple2Max();
        this.nombreCalculs = calculBaseInput.getNombreCalculs();
    }

    public boolean isNegatif() {
        return isNegatif;
    }

    public void setNegatif(boolean negatif) {
        isNegatif = negatif;
    }

    public boolean isDecimal() {
        return isDecimal;
    }

    public void setDecimal(boolean decimal) {
        isDecimal = decimal;
    }

    public int getNombreMaxDecimals() {
        return nombreMaxDecimals;
    }

    public void setNombreMaxDecimals(int nombreMaxDecimals) {
        this.nombreMaxDecimals = nombreMaxDecimals;
    }

    public int getNombreOperateurs() {
        return nombreOperateurs;
    }

    public void setNombreOperateurs(int nombreOperateurs) {
        this.nombreOperateurs = nombreOperateurs;
    }

    public int getResultMax() {
        return resultMax;
    }

    public void setResultMax(int resultMax) {
        this.resultMax = resultMax;
    }

    public int getMaxSigneChiffre() {
        return maxSigneChiffre;
    }

    public void setMaxSigneChiffre(int maxSigneChiffre) {
        this.maxSigneChiffre = maxSigneChiffre;
    }

    public int getMultiple1Max() {
        return multiple1Max;
    }

    public void setMultiple1Max(int multiple1Max) {
        this.multiple1Max = multiple1Max;
    }

    public int getMultiple2Max() {
        return multiple2Max;
    }

    public void setMultiple2Max(int multiple2Max) {
        this.multiple2Max = multiple2Max;
    }

    public int getNombreCalculs() {
        return nombreCalculs;
    }

    public void setNombreCalculs(int nombreCalculs) {
        this.nombreCalculs = nombreCalculs;
    }
}
