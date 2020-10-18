package com.calcul.model;

public class ExeciseInput extends ExeciseBaseInput {

    private boolean isOperateurAddition;
    private boolean isOperateurSoustraction;
    private boolean isOperateurMultiplication;
    private boolean isOperateurDivision;

    private boolean isTableMultiplication;

    public ExeciseInput(){
        super();
    }
    public ExeciseInput(ExeciseInput execiseInput){
        super(execiseInput);
    }

    public boolean isTableMultiplication() {
        return isTableMultiplication;
    }

    public void setTableMultiplication(boolean tableMultiplication) {
        isTableMultiplication = tableMultiplication;
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
