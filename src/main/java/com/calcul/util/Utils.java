package com.calcul.util;

import com.calcul.model.ExeciseInput;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utils {

    public static List<OperatorCalcul> getlisteOperators(ExeciseInput execiseInput){
        List<OperatorCalcul> listeOperators = new ArrayList<OperatorCalcul>();

        if(execiseInput.isOperateurAddition()){
            listeOperators.add(OperatorCalcul.ADDITION);
        }
        if(execiseInput.isOperateurSoustraction()){
            listeOperators.add(OperatorCalcul.SOUSTRACTION);
        }
        if(execiseInput.isOperateurMultiplication()){
            listeOperators.add(OperatorCalcul.MULTIPLICATION);
        }
        if(execiseInput.isOperateurDivision()){
            listeOperators.add(OperatorCalcul.DIVISION);
        }
        if(execiseInput.isTableMultiplication()){
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

/*    public static String getTitre(String date){
        if(!isNotNull(date)){
            SimpleDateFormat  formater = new SimpleDateFormat("dd/MM/yyyy");
            date = formater.format(new Date());
        }
        return "Execises du " + date;
    }*/

    public static String getTitreExecise(int index){
        return Constantes.TITRE_EXECISE + String.valueOf(index);
    }

    public static String getPiedExecise(){
        return Constantes.PIED_EXECISE;
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
