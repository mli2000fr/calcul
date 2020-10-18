package com.calcul.util;

public enum OperatorCalcul {

    ADDITION("ADDITION", "+", "Addition"),
    SOUSTRACTION("SOUSTRACTION", "-", "Soustraction"),
    MULTIPLICATION("MULTIPLICATION", "x", "Multiplication"),
    DIVISION("DIVISION", "/", "Division"),
    RESTE_DIVISION("RESTE_DIVISION", "%", "Reste division"),
    DOUBLE("DOUBLE", "x", "Double"),
    MOITIE("MOITIE", "/", "Moitié"),
    TRIPLE("TRIPLE", "x", "Triple"),
    QUART("QUART", "x", "Quart"),
    TABLEAU_MULTIPLICATION("TABLEAU_MULTIPLICATION", "x", "Tableau de multiplication");



    public String code;
    public String operateur;
    public String nom;

    OperatorCalcul(String code, String operateur, String nom){
        this.code = code;
        this.operateur = operateur;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
