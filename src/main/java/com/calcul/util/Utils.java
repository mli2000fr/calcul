package com.calcul.util;

import com.calcul.model.CalculInput;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        if(calculInput.isTableMultiplication()){
            listeOperators.add(OperatorCalcul.TABLEAU_MULTIPLICATION);
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

    public static String getTitre(String date){
        if(!isNotNull(date)){
            SimpleDateFormat  formater = new SimpleDateFormat("dd/MM/yyyy");
            date = formater.format(new Date());
        }

        return "Execises du " + date;
    }

    public static boolean isNotNull(Object obj){
        if(obj == null){
            return false;
        }

        if(obj instanceof String){
            if(((String) obj).isEmpty()){
                return false;
            }
        }

        return true;
    }

}
