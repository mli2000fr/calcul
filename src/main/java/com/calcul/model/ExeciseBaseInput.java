package com.calcul.model;

import com.calcul.util.Constantes;

public class ExeciseBaseInput {

    private boolean isNegatif = Constantes.IS_NEGATIF;

    private boolean isDecimal = Constantes.IS_DECIMAL;
    private int nombreMaxDecimals = Constantes.NOMBRE_MAX_DECIMALS;

    private int nombreOperateurs = Constantes.NOMBRE_OPERATORS;

    private int resultMax = Constantes.RESULTAT_MAX;
    private int maxSigneChiffre = Constantes.MAX_SIGNLE_CHIFFRE;

    private int multiple1Max = Constantes.MULTIPLE_MAX_1;
    private int multiple2Max = Constantes.MULTIPLE_MAX_2;

    private int nombreCalculsParExecise = Constantes.NOMBRES_CALCULS_EXECISE;
    private int nombreExecises = Constantes.NOMBRES_EXECISES;

    public ExeciseBaseInput(){}

    public ExeciseBaseInput(ExeciseBaseInput execiseBaseInput){
        this.isNegatif = execiseBaseInput.isNegatif();
        this.isDecimal = execiseBaseInput.isDecimal();
        this.nombreMaxDecimals = execiseBaseInput.getNombreMaxDecimals();
        this.nombreOperateurs = execiseBaseInput.getNombreOperateurs();
        this.resultMax = execiseBaseInput.getResultMax();
        this.maxSigneChiffre = execiseBaseInput.getMaxSigneChiffre();
        this.multiple1Max = execiseBaseInput.getMultiple1Max();
        this.multiple2Max = execiseBaseInput.getMultiple2Max();
        this.nombreExecises = execiseBaseInput.getNombreExecises();
        this.nombreCalculsParExecise = execiseBaseInput.getNombreCalculsParExecise();
    }

    public int getNombreCalculsParExecise() {
        return nombreCalculsParExecise;
    }

    public void setNombreCalculsParExecise(int nombreCalculsParExecise) {
        this.nombreCalculsParExecise = nombreCalculsParExecise;
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
