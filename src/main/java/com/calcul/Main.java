package com.calcul;

import com.calcul.model.*;

public class Main {

    public static void main (String[] args){

        ExeciseGenerator execiseGenerator = new ExeciseGenerator();
        ExeciseInput inputs = new ExeciseInput();

        inputs.setOperateurAddition(true);
        inputs.setResultMax(10);
        inputs.setNombreExecises(2);
/*
        inputs.setOperateurSoustraction(true);
        inputs.setResultMax(30);
        inputs.setMaxSigneChiffre(50);

        //inputs.setOperateurMultiplication(true);
        //inputs.setTableMultiplication(true);

        inputs.setOperateurDivision(true);
  */
        ExeciseOutput execiseOutput = execiseGenerator.genererExicises(inputs);

        System.out.println(execiseOutput.toString());
    }
}
