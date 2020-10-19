package com.calcul.ihm;

import com.calcul.ExeciseGenerator;
import com.calcul.model.ExeciseInput;
import com.calcul.model.ExeciseOutput;
import com.calcul.util.Constantes;
import com.calcul.util.OperatorCalcul;
import com.calcul.util.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ExecisesGeneratorIHM {
	private JFrame frame;
	
	private JComboBox cbNbCopies;
	private JTextField tfNbCal;
	private JComboBox cbNbsDecimals;
	private JCheckBox checkboxNegatif;

	public ExecisesGeneratorIHM(){

	}


	public void initFrameWithOperators(){
		this.frame = new JFrame(Constantes.TITRE_GENERATOR);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Constantes.FRAME_GENERATOR_SIZE_WIDTH, Constantes.FRAME_GENERATOR_SIZE_HEIGHT);

		//titre
		int positionY = 10;
		JPanel panelTitle = new JPanel();
		panelTitle.setLayout(new FlowLayout());
		panelTitle.setSize(Constantes.FRAME_GENERATOR_SIZE_WIDTH, 20);
		JLabel titreLabel = new JLabel(Constantes.TITRE_GENERATOR);
		panelTitle.add(titreLabel);
		panelTitle.setLocation((Constantes.FRAME_GENERATOR_SIZE_WIDTH - panelTitle.getWidth()) / 2, positionY);
		frame.add(panelTitle);
		positionY += panelTitle.getHeight() + Constantes.MARGE_COMPOSANT + 10;


		//data common
		JPanel panelDataCommon = this.initPanel(null, positionY, 70);
		panelDataCommon.setLayout(new GridLayout (3,3));
		//nombre de copies
		JPanel panelNbCopies = this.initPanel(null, positionY, 20);
		JLabel labelNbCopies = new JLabel("   Nombre de fiches: ");
		Object[] NbCopies = new Object[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		this.cbNbCopies = new JComboBox(NbCopies);
		this.cbNbCopies.setSize(100, 10);
		panelNbCopies.add(labelNbCopies);
		panelNbCopies.add(this.cbNbCopies);
		panelDataCommon.add(panelNbCopies);
		panelDataCommon.add(new JPanel());
		//nombres calculs
		JPanel panelNbCal = this.initPanel(null, positionY, 20);
		JLabel labelNbCal = new JLabel("   Nombre de calcul par fiche: ");
		this.tfNbCal = new JTextField("48");
		this.tfNbCal.setSize(100, 10);
		this.tfNbCal.setEnabled(false);
		panelNbCal.add(labelNbCal);
		panelNbCal.add(this.tfNbCal);
		panelDataCommon.add(panelNbCal);


		panelDataCommon.add(new JPanel());
		panelDataCommon.add(new JPanel());
		panelDataCommon.add(new JPanel());

		//decimal
		JPanel panelNbDecimal = this.initPanel(null, positionY, 20);
		JLabel labelNbDecimal = new JLabel("   Nombre de décimals: ");
		Object[] nbDec = new Object[]{"0", "1", "2", "3", "4"};
		this.cbNbsDecimals = new JComboBox(nbDec);
		this.cbNbsDecimals.setSize(100, 10);
		this.cbNbsDecimals.setEnabled(false);
		panelNbDecimal.add(labelNbDecimal);
		panelNbDecimal.add(this.cbNbsDecimals);
		panelDataCommon.add(panelNbDecimal);
		panelDataCommon.add(new JPanel());
		//negatif
		this.checkboxNegatif = new JCheckBox("Avec du négatif");
		this.checkboxNegatif.setSelected(false);
		this.checkboxNegatif.setEnabled(false);
		panelDataCommon.add(this.checkboxNegatif);

		frame.add(panelDataCommon);
		positionY += panelDataCommon.getHeight() + Constantes.MARGE_COMPOSANT;

		//panel
		for(OperatorCalcul operatorCalcul: Constantes.LIST_OPERATORS){
			JPanel jPanel = this.getPanelOperator(operatorCalcul, positionY);
			frame.add(jPanel);
			positionY += jPanel.getHeight() + Constantes.MARGE_COMPOSANT;
		}

		frame.add(new Box(0));
		frame.setVisible(true);
	}

	public JPanel getPanelOperator(OperatorCalcul operatorCalcul, int positionY){
		JPanel jPanel = this.initPanel(operatorCalcul.getNom(), positionY, 50);

		jPanel.setLayout(new GridLayout (0,5));

		JTextField tfResultMax = new JTextField();
		JTextField tfMaxChiffre = new JTextField();
		JTextField jfMaxChiffreA = new JTextField();
		JTextField jfMaxChiffreB = new JTextField();

		if(operatorCalcul.equals(OperatorCalcul.TABLEAU_MULTIPLICATION)){
			JPanel panelTab = this.initPanel(null, positionY, 20);
			JLabel labelTab = new JLabel("   calcule de : ");
			panelTab.add(labelTab);
			panelTab.add(tfMaxChiffre);
			jPanel.add(panelTab);
			jPanel.add(new JPanel());
			jPanel.add(new JPanel());
			jPanel.add(new JPanel());
		}else{

			if(operatorCalcul.equals(OperatorCalcul.ADDITION) || operatorCalcul.equals(OperatorCalcul.SOUSTRACTION)){
				JPanel panelResultatMax = this.initPanel(null, positionY, 20);
				JLabel labelResultMax = new JLabel("   calcule de ");
				panelResultatMax.add(labelResultMax);
				panelResultatMax.add(tfResultMax);
				jPanel.add(panelResultatMax);
				if(operatorCalcul.equals(OperatorCalcul.SOUSTRACTION)){
					jPanel.add(new JPanel());
					JPanel panelMaxChiffre = this.initPanel(null, positionY, 20);
					JLabel labelMaxChiffre = new JLabel("   max a et b ");
					panelMaxChiffre.add(labelMaxChiffre);
					panelMaxChiffre.add(tfMaxChiffre);
					jPanel.add(panelMaxChiffre);
				}else{
					jPanel.add(new JPanel());
					jPanel.add(new JPanel());
				}
				jPanel.add(new JPanel());
			}else if(operatorCalcul.equals(OperatorCalcul.MULTIPLICATION) || operatorCalcul.equals(OperatorCalcul.DIVISION)){
				JPanel panelMaxChiffreA = this.initPanel(null, positionY, 20);
				JLabel labelMaxChiffreA = new JLabel("   max a ");
				panelMaxChiffreA.add(labelMaxChiffreA);
				panelMaxChiffreA.add(jfMaxChiffreA);
				JPanel panelMaxChiffreB = this.initPanel(null, positionY, 20);
				JLabel labelMaxChiffreB = new JLabel("   max b ");
				panelMaxChiffreB.add(labelMaxChiffreB);
				panelMaxChiffreB.add(jfMaxChiffreB);
				jPanel.add(panelMaxChiffreA);
				jPanel.add(new JPanel());
				jPanel.add(panelMaxChiffreB);
				jPanel.add(new JPanel());
			}
		}

		JComboBox this_cbNbCopies = this.cbNbCopies;
		JTextField this_tfNbCal = this.tfNbCal;
		JComboBox this_cbNbsDecimals = this.cbNbsDecimals;
		JCheckBox this_checkboxNegatif = this.checkboxNegatif;

		JButton generationPdf = new JButton("Générer PDF");
		generationPdf.addActionListener(new AbstractAction("Générer pdf...") {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ExeciseGenerator execiseGenerator = new ExeciseGenerator();
					ExeciseInput inputs = new ExeciseInput();
					inputs.setDecimal(Integer.valueOf(this_cbNbsDecimals.getSelectedItem().toString()) != 0);
					inputs.setNombreMaxDecimals(Integer.valueOf(this_cbNbsDecimals.getSelectedItem().toString()));
					inputs.setNegatif(this_checkboxNegatif.isSelected());
					inputs.setNombreCalculsParExecise(Integer.valueOf(this_tfNbCal.getText()));
					inputs.setNombreExecises(Integer.valueOf(this_cbNbCopies.getSelectedItem().toString()));

					if (operatorCalcul.equals(OperatorCalcul.TABLEAU_MULTIPLICATION)) {
						inputs.setTableMultiplication(true);
						inputs.setMaxSigneChiffre(Integer.valueOf(tfMaxChiffre.getText()));
					} else {

						if (operatorCalcul.equals(OperatorCalcul.ADDITION) || operatorCalcul.equals(OperatorCalcul.SOUSTRACTION)) {
							inputs.setResultMax(Integer.valueOf(tfResultMax.getText()));

							if (operatorCalcul.equals(OperatorCalcul.SOUSTRACTION)) {
								inputs.setOperateurSoustraction(true);
								inputs.setMaxSigneChiffre(Integer.valueOf(tfMaxChiffre.getText()));
							} else {
								inputs.setOperateurAddition(true);
							}
						} else if (operatorCalcul.equals(OperatorCalcul.MULTIPLICATION) || operatorCalcul.equals(OperatorCalcul.DIVISION)) {
							inputs.setMultiple1Max(Integer.valueOf(jfMaxChiffreA.getText()));
							inputs.setMultiple2Max(Integer.valueOf(jfMaxChiffreB.getText()));

							if (operatorCalcul.equals(OperatorCalcul.MULTIPLICATION)) {
								inputs.setOperateurMultiplication(true);
							} else {
								inputs.setOperateurDivision(true);
							}
						}
					}
					//System.out.println(operatorCalcul.getCode() + "---" + inputs.toString());

					ExeciseOutput execiseOutput = execiseGenerator.genererExicises(inputs);

					System.out.println(execiseOutput.toString());
				}catch(Exception exception){
					JOptionPane.showMessageDialog(jPanel, "Erreur de saisie.");
					System.out.println(exception.getMessage());
				}
			}
		});
		jPanel.add(generationPdf);

		return jPanel;
	}


	public JPanel initPanel(String titre, int positionY, int height){
		return this.initPanel(titre, positionY, Constantes.PANEL_SIZE_WIDTH, height);
	}
	public JPanel initPanel(String titre, int positionY, int width, int height){
		JPanel panel = new JPanel();
		int positionX = (Constantes.FRAME_GENERATOR_SIZE_WIDTH - Constantes.PANEL_SIZE_WIDTH) / 2;
		panel.setLocation(positionX, positionY);
		panel.setSize(width, height);
		BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(layout);
		if(Utils.isNotNull(titre)){
			panel.setBorder(BorderFactory.createTitledBorder(titre));
		}
		return panel;
	}



	public static void main(String[] args){
		ExecisesGeneratorIHM ihm = new ExecisesGeneratorIHM();
		ihm.initFrameWithOperators();
	}


	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
