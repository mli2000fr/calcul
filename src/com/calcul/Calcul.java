package com.calcul;

import com.calcul.model.*;
import com.calcul.util.OperatorCalcul;
import com.calcul.util.Utils;

import java.util.ArrayList;
import java.util.List;

public class Calcul {

    public Calcul(){}


    public CalculOutput genererCalcul(CalculInput calculInput){
        CalculOutput calculOutput = new CalculOutput();
        List<SingleCalcul> listeCalculs = new ArrayList<SingleCalcul>();

        SingleCalculInput singleCalculInput = new SingleCalculInput(calculInput);
        List<OperatorCalcul> listeOperators = Utils.getlisteOperators(calculInput);

        for(int i = 0; i < calculInput.getNombreCalculs(); i++){
            singleCalculInput.setListeOperators(Utils.getRandomOperator(new ArrayList<OperatorCalcul>(listeOperators), calculInput.getNombreOperateurs()));
            listeCalculs.add(this.genererSingleCalcul(singleCalculInput));
        }

        calculOutput.setListeCalculs(listeCalculs);
        return calculOutput;
    }


    public SingleCalcul genererSingleCalcul(SingleCalculInput singleCalculInput){
        SingleCalcul singleCalcul = new SingleCalcul();

        if(singleCalculInput.isDecimal()){
            //TODO
        }else{
            int result = (int) (Math.random() * singleCalculInput.getResultMax());

            int chiffre1 = 0;
            int chiffre2 = 0;
            if(singleCalculInput.getNombreOperateurs() == 1){

              if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.ADDITION)){
                  chiffre1 = (int) (Math.random() * (result - 2) + 1);
                  chiffre2 = result - chiffre1;
              }else if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.SOUSTRACTION)){
                  chiffre1 = (int) (Math.random() * (singleCalculInput.getMaxSigneChiffre() - result) + result);
                  chiffre2 = chiffre1 - result;
              }else if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.MULTIPLICATION)){
                  //TODO
              }else if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.DIVISION)){
                  //TODO
              }

              singleCalcul.setCalcul(chiffre1 + " "
                      + singleCalculInput.getListeOperators().get(0).getOperateur() + " "
                      + chiffre2);
              singleCalcul.setResult(String.valueOf(result));
            } else{
                //TODO
            }
        }

        return singleCalcul;
    }



}
