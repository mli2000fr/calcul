package com.calcul.model;

public class CalculInput extends CalculBaseInput{

    private boolean isOperateurAddition;
    private boolean isOperateurSoustraction;
    private boolean isOperateurMultiplication;
    private boolean isOperateurDivision;

    public CalculInput(){
        super();
    }
    public CalculInput(CalculInput calculInput){
        super(calculInput);
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
}
