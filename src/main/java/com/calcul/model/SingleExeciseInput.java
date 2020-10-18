package com.calcul.model;

import com.calcul.util.OperatorCalcul;

import java.util.List;

public class SingleExeciseInput extends ExeciseBaseInput {

    private List<OperatorCalcul> listeOperators;

    public SingleExeciseInput(ExeciseInput execiseInput) {
        super(execiseInput);
    }

    public List<OperatorCalcul> getListeOperators() {
        return listeOperators;
    }

    public void setListeOperators(List<OperatorCalcul> listeOperators) {
        this.listeOperators = listeOperators;
    }
}
