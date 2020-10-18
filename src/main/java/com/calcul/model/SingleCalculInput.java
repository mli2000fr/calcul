package com.calcul.model;

import com.calcul.util.OperatorCalcul;
import com.calcul.util.Utils;

import java.util.ArrayList;
import java.util.List;

public class SingleCalculInput extends CalculBaseInput{

    private List<OperatorCalcul> listeOperators;

    public SingleCalculInput(CalculInput calculInput) {
        super(calculInput);
    }

    public List<OperatorCalcul> getListeOperators() {
        return listeOperators;
    }

    public void setListeOperators(List<OperatorCalcul> listeOperators) {
        this.listeOperators = listeOperators;
    }
}
