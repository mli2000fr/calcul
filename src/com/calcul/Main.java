package com.calcul;

import com.calcul.model.*;

public class Main {

    public static void main (String[] args){

        Calcul calcul = new Calcul();
        CalculInput inputs = new CalculInput();
        inputs.setOperateurAddition(true);
        inputs.setOperateurSoustraction(true);

        CalculOutput calculOutput = calcul.genererCalcul(inputs);

        System.out.println(calculOutput.toString(true));
    }
}
