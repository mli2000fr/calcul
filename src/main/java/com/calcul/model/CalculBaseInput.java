package com.calcul.model;

import com.calcul.util.Constantes;

import java.util.List;

public class CalculBaseInput {

    private boolean isNegatif = Constantes.IS_NEGATIF;

    private boolean isDecimal = Constantes.IS_DECIMAL;
    private int nombreMaxDecimals = Constantes.NOMBRE_MAX_DECIMALS;

    private int nombreOperateurs = Constantes.NOMBRE_OPERATORS;

    private int resultMax = Constantes.RESULTAT_MAX;
    private int maxSigneChiffre = Constantes.MAX_SIGNLE_CHIFFRE;

    private int multiple1Max = Constantes.MULTIPLE_MAX_1;
    private int multiple2Max = Constantes.MULTIPLE_MAX_2;

    private int nombreExecises = Constantes.NOMBRES_EXECISES;

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
        this.nombreExecises = calculBaseInput.getNombreExecises();
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

    public int getNombreExecises() {
        return nombreExecises;
    }

    public void setNombreExecises(int nombreExecises) {
        this.nombreExecises = nombreExecises;
    }
}
