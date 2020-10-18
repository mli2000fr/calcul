package com.calcul.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Constantes {

    public static final boolean IS_NEGATIF = false;
    public static final boolean IS_DECIMAL = false;

    public static final int NOMBRE_MAX_DECIMALS = 2;
    public static final int NOMBRE_OPERATORS = 1;

    public static final int RESULTAT_MAX = 50;
    public static final int MAX_SIGNLE_CHIFFRE = 100;

    public static final int MULTIPLE_MAX_1 = 9;
    public static final int MULTIPLE_MAX_2 = 9;

    public static final int TABLE_MULTIPLICATION_MAX = 9;

    public static final int NOMBRES_EXECISES = 10;
    public static final int NOMBRES_CALCULS_EXECISE = 48;

    public static final String TITRE_EXECISE = "Execise ";
    public static final String PIED_EXECISE = "Date_______________     Temps____________     Notes_________";

    public static final float FONT_SIZE_TITRE_EXECISE = 20;
    public static final float FONT_SIZE_PIED_EXECISE = 15;
    public static final float FONT_SIZE_EXECISE = 17;

    //ihm
    public static final List<OperatorCalcul> LIST_OPERATORS = Collections.unmodifiableList(
            Arrays.asList(new OperatorCalcul[] {OperatorCalcul.ADDITION,
                    OperatorCalcul.SOUSTRACTION, OperatorCalcul.MULTIPLICATION,
                    OperatorCalcul.DIVISION, OperatorCalcul.TABLEAU_MULTIPLICATION}));
    public static final String TITRE_GENERATOR = "Execises générateur";
    public static final int FRAME_GENERATOR_SIZE_WIDTH = 700;
    public static final int FRAME_GENERATOR_SIZE_HEIGHT = 500;

    public static final int PANEL_SIZE_WIDTH = FRAME_GENERATOR_SIZE_WIDTH - 100;
    public static final int PANEL_SIZE_HEIGHT = 50;


}
