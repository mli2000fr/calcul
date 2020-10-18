package com.calcul;

import com.calcul.model.*;
import com.calcul.util.OperatorCalcul;
import com.calcul.util.Utils;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
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

        //pdf
        calculOutput.setTitre(Utils.getTitre(null));
        this.genererPdf(calculOutput, true);
        this.genererPdf(calculOutput, false);

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



    public void genererPdf(CalculOutput calculOutput, boolean avecResult){
        try{
            OutputStream outputStream = new FileOutputStream("./test" + (avecResult ? "_result": "") + ".pdf");
            PdfWriter writer = new PdfWriter(outputStream);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document doc = new Document(pdfDoc);

            doc.add(new Paragraph()
                    .add(new Text(calculOutput.getTitre()))
            );

            Table table = new Table(3);
            table.setBorder(Border.NO_BORDER);
            for(SingleCalcul singleCalcul : calculOutput.getListeCalculs()){
                Cell cell = new Cell();
                cell.add(new Paragraph(singleCalcul.toString(avecResult)));
                cell.setFontSize(20);
                cell.setMarginLeft(10);
                cell.setMarginTop(10);
                cell.setMarginBottom(10);
                cell.setBorder(Border.NO_BORDER);
                table.addCell(cell);
            }
            doc.add(table);

            /*
            for(SingleCalcul singleCalcul : calculOutput.getListeCalculs()){
                doc.add(new Paragraph(singleCalcul.toString(avecResult)));
            }*/

            doc.close();
            outputStream.close();
        }catch(Exception e){
            // TODO
        }

    }
}
