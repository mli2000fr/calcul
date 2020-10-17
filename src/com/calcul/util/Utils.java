package com.calcul.util;

import com.calcul.model.CalculInput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static List<OperatorCalcul> getlisteOperators(CalculInput calculInput){
        List<OperatorCalcul> listeOperators = new ArrayList<OperatorCalcul>();
        if(calculInput.isOperateurAddition()){
            listeOperators.add(OperatorCalcul.ADDITION);
        }
        if(calculInput.isOperateurSoustraction()){
            listeOperators.add(OperatorCalcul.SOUSTRACTION);
        }
        if(calculInput.isOperateurMultiplication()){
            listeOperators.add(OperatorCalcul.MULTIPLICATION);
        }
        if(calculInput.isOperateurDivision()){
            listeOperators.add(OperatorCalcul.DIVISION);
        }
        return listeOperators;
    }

    public static List<OperatorCalcul> getRandomOperator(List<OperatorCalcul> listeOperators, int sizeOperator){
        List<OperatorCalcul> listeOpe = new ArrayList<OperatorCalcul>();
        if(listeOperators.size() <= sizeOperator){
            return listeOperators;
        }else{
            for(int i = 0; i < sizeOperator; i++){
                int index = ((int)(Math.random() * 100)) % listeOperators.size();
                listeOpe.add(listeOperators.get(index));
                listeOperators.remove(listeOperators.get(index));
            }
            return listeOpe;
        }
    }

}
