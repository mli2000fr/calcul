package com.calcul;

import com.calcul.model.CalculInput;
import com.calcul.model.CalculOutput;
import com.calcul.model.SingleCalcul;

import java.util.ArrayList;
import java.util.List;

public class Calcul {


    public CalculOutput genererCalcul(CalculInput inputs){
        CalculOutput calculOutput = new CalculOutput();
        List<SingleCalcul> listeCalculs = new ArrayList<SingleCalcul>();

        for(int i = 0; i < inputs.getNombreCalculs(); i++){
            int result = (int) (Math.random() * inputs.getResultMax());
            int chiffreA = (int) (Math.random() * result);
            SingleCalcul singleCalcul = new SingleCalcul();
            singleCalcul.setCalcul(String.valueOf(chiffreA) + " + " + String.valueOf(result - chiffreA));
            singleCalcul.setResult(String.valueOf(result));
            listeCalculs.add(singleCalcul);
        }

        calculOutput.setListeCalculs(listeCalculs);
        return calculOutput;
    }


    public SingleCalcul genererSingleCalcul(CalculInput inputs){
        SingleCalcul singleCalcul = new SingleCalcul();

        if(inputs.isDecimal()){

        }else{
            int result = (int) (Math.random() * inputs.getResultMax());

        }

        return singleCalcul;
    }

}
