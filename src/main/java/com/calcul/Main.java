package com.calcul;

import com.calcul.model.*;

public class Main {

    public static void main (String[] args){

        Calcul calcul = new Calcul();
        CalculInput inputs = new CalculInput();

        inputs.setOperateurAddition(true);
        inputs.setResultMax(30);

        inputs.setOperateurSoustraction(true);
        inputs.setResultMax(30);
        inputs.setMaxSigneChiffre(50);

        //inputs.setOperateurMultiplication(true);


        //inputs.setTableMultiplication(true);

        CalculOutput calculOutput = calcul.genererCalcul(inputs);

        System.out.println(calculOutput.toString(true));
    }
}
