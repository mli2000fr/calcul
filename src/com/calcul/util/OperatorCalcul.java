package com.calcul.util;

public enum OperatorCalcul {

    ADDITION("ADDITION", "+"),
    SOUSTRACTION("SOUSTRACTION", "-"),
    MULTIPLICATION("MULTIPLICATION", "*"),
    DIVISION("DIVISION", "/"),
    RESTE_DIVISION("RESTE_DIVISION", "%"),
    DOUBLE("DOUBLE", "*2"),
    MOITIE("MOITIE", "/2"),
    TRIPLE("TRIPLE", "*3"),
    QUART("QUART", "*4"),
    TABLEAU_MULTIPLICATION("TABLEAU_MULTIPLICATION", "9*9");



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
