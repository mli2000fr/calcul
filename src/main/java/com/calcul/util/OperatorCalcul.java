package com.calcul.util;

public enum OperatorCalcul {

    ADDITION("ADDITION", "+"),
    SOUSTRACTION("SOUSTRACTION", "-"),
    MULTIPLICATION("MULTIPLICATION", "x"),
    DIVISION("DIVISION", "/"),
    RESTE_DIVISION("RESTE_DIVISION", "%"),
    DOUBLE("DOUBLE", "x"),
    MOITIE("MOITIE", "/"),
    TRIPLE("TRIPLE", "x"),
    QUART("QUART", "x"),
    TABLEAU_MULTIPLICATION("TABLEAU_MULTIPLICATION", "x");



    public String code;
    public String operateur;

    OperatorCalcul(String code, String operateur){
        this.code = code;
        this.operateur = operateur;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }
}
