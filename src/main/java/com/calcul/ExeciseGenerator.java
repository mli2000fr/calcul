package com.calcul;

import com.calcul.model.*;
import com.calcul.util.Constantes;
import com.calcul.util.OperatorCalcul;
import com.calcul.util.Utils;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExeciseGenerator {

    public ExeciseGenerator(){}


    public ExeciseOutput genererExicises(ExeciseInput execiseInput){
        ExeciseOutput execiseOutput = new ExeciseOutput();
        List<Execise> listeExecises = new ArrayList<Execise>();

        SingleExeciseInput singleCalculInput = new SingleExeciseInput(execiseInput);
        List<OperatorCalcul> listeOperators = Utils.getlisteOperators(execiseInput);
        singleCalculInput.setListeOperators(Utils.getRandomOperator(new ArrayList<OperatorCalcul>(listeOperators), execiseInput.getNombreOperateurs()));

        for(int i = 0; i < execiseInput.getNombreExecises(); i++){
            Execise execise = new Execise();
            List<Calcul> listeCalculs = new ArrayList<Calcul>();
            for(int index = 0; index < execiseInput.getNombreCalculsParExecise(); index++){
                listeCalculs.add(this.genererSingleCalcul(singleCalculInput));
            }
            execise.setListeCalculs(listeCalculs);
            execise.setTitre(Utils.getTitreExecise(i + 1));
            execise.setPied(Utils.getPiedExecise());
            listeExecises.add(execise);
        }



        execiseOutput.setListeExecises(listeExecises);

        //pdf
        this.genererPdf(singleCalculInput.getNomOpeCal(), execiseOutput, true);
        this.genererPdf(singleCalculInput.getNomOpeCal(), execiseOutput, false);

        return execiseOutput;
    }


    public Calcul genererSingleCalcul(SingleExeciseInput singleCalculInput){
        Calcul calcul = new Calcul();
        int result = 0;
        int chiffre1 = 0;
        int chiffre2 = 0;

        if(singleCalculInput.isDecimal()){
            //TODO
        }else{
            if(singleCalculInput.getNombreOperateurs() == 1){

                if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.TABLEAU_MULTIPLICATION)){
                    chiffre1 = ((int) (Math.random() * Constantes.TABLE_MULTIPLICATION_MAX - 1)) + 1;
                    chiffre2 = ((int) (Math.random() * Constantes.TABLE_MULTIPLICATION_MAX - 1)) + 1;
                    result = chiffre1 * chiffre2;
                }else{
                    result = (int) (Math.random() * singleCalculInput.getResultMax());
                    if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.ADDITION)){
                        chiffre1 = (int) (Math.random() * (result - 2) + 1);
                        chiffre2 = result - chiffre1;
                    }else if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.SOUSTRACTION)){
                        chiffre1 = (int) (Math.random() * (singleCalculInput.getMaxSigneChiffre() - result) + result);
                        chiffre2 = chiffre1 - result;
                    }else if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.MULTIPLICATION)){
                        chiffre1 = ((int) (Math.random() * (Utils.isNotNull(singleCalculInput.getMultiple1Max())
                                ? singleCalculInput.getMultiple1Max() : Constantes.TABLE_MULTIPLICATION_MAX - 1)) + 1);
                        chiffre2 = ((int) (Math.random() * (Utils.isNotNull(singleCalculInput.getMultiple2Max())
                                ? singleCalculInput.getMultiple2Max() : Constantes.TABLE_MULTIPLICATION_MAX - 1)) + 1);
                        result = chiffre1 * chiffre2;
                    }else if(singleCalculInput.getListeOperators().get(0).equals(OperatorCalcul.DIVISION)){
                        result = ((int) (Math.random() * (Utils.isNotNull(singleCalculInput.getMultiple1Max())
                                ? singleCalculInput.getMultiple1Max() : Constantes.TABLE_MULTIPLICATION_MAX - 1)) + 1);
                        chiffre2 = ((int) (Math.random() * (Utils.isNotNull(singleCalculInput.getMultiple2Max())
                                ? singleCalculInput.getMultiple2Max() : Constantes.TABLE_MULTIPLICATION_MAX - 1)) + 1);
                        chiffre1 = result * chiffre2;
                    }
                }

              calcul.setCalcul(chiffre1 + " "
                      + singleCalculInput.getListeOperators().get(0).getOperateur() + " "
                      + chiffre2);
              calcul.setResult(String.valueOf(result));
            } else{
                //TODO
            }
        }
        if(chiffre1 == 0 || chiffre2 == 0 || chiffre1 == 1 || chiffre2 == 1 || result == 0){
            calcul = this.genererSingleCalcul(singleCalculInput);
        }

        return calcul;
    }



    public void genererPdf(String nomOpeCal, ExeciseOutput execiseOutput, boolean avecResult){
        try{
            OutputStream outputStream = new FileOutputStream("./"+ nomOpeCal + (avecResult ? "result": "") + ".pdf");
            PdfWriter writer = new PdfWriter(outputStream);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document doc = new Document(pdfDoc);

            for(Execise execise : execiseOutput.getListeExecises()){
                doc.add(new Paragraph()
                                .add(new Text(execise.getTitre())
                                .setFontSize(Constantes.FONT_SIZE_TITRE_EXECISE))
                                .setMarginBottom(20)
                );

                Table table = new Table(3);
                table.setBorder(Border.NO_BORDER);
                for(Calcul calcul : execise.getListeCalculs()){
                    Cell cell = new Cell();
                    cell.add(new Paragraph(calcul.toString(avecResult)));
                    cell.setFontSize(Constantes.FONT_SIZE_EXECISE);
                    cell.setMarginLeft(10);
                    cell.setMarginTop(5);
                    cell.setMarginBottom(5);
                    cell.setBorder(Border.NO_BORDER);
                    table.addCell(cell);
                }
                doc.add(table);
                doc.add(new Paragraph()
                        .add(new Text(execise.getPied())
                        .setFontSize(Constantes.FONT_SIZE_PIED_EXECISE))
                        .setMarginTop(20)
                );
            }

            doc.close();
            outputStream.close();
        }catch(Exception e){
            // TODO
        }

    }
}
