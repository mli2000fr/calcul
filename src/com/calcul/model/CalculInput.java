package com.calcul.model;

public class CalculInput {

    private boolean isOperateurAddition;
    private boolean isOperateurSoustraction;
    private boolean isOperateurMultiplication;
    private boolean isOperateurDivision;

    private boolean isNegatif;

    private boolean isDecimal;
    private int nombreMaxDecimals = 2;

    private int nombreOperateurs = 1;

    private int resultMax = 100;
    private int maxSigneChiffre = 100;

    private int multiple1Max = 9;
    private int multiple2Max = 9;

    private int nombreCalculs = 50;

    public int getMaxSigneChiffre() {
        return maxSigneChiffre;
    }

    public void setMaxSigneChiffre(int maxSigneChiffre) {
        this.maxSigneChiffre = maxSigneChiffre;
    }

    public boolean isOperateurAddition() {
        return isOperateurAddition;
    }

    public void setOperateurAddition(boolean operateurAddition) {
        isOperateurAddition = operateurAddition;
    }

    public boolean isOperateurSoustraction() {
        return isOperateurSoustraction;
    }

    public void setOperateurSoustraction(boolean operateurSoustraction) {
        isOperateurSoustraction = operateurSoustraction;
    }

    public boolean isOperateurMultiplication() {
        return isOperateurMultiplication;
    }

    public void setOperateurMultiplication(boolean operateurMultiplication) {
        isOperateurMultiplication = operateurMultiplication;
    }

    public boolean isOperateurDivision() {
        return isOperateurDivision;
    }

    public void setOperateurDivision(boolean operateurDivision) {
        isOperateurDivision = operateurDivision;
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
