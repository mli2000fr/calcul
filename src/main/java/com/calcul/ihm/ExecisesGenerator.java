package com.calcul.ihm;

import com.calcul.util.Constantes;
import com.calcul.util.OperatorCalcul;
import com.calcul.util.Utils;
import com.itextpdf.layout.border.SolidBorder;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ExecisesGenerator {
	private JFrame frame;

	public ExecisesGenerator(){

	}


	public void initFrameWithOperators(){
		this.frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Constantes.FRAME_GENERATOR_SIZE_WIDTH, Constantes.FRAME_GENERATOR_SIZE_HEIGHT);

		int positionY = 10;
		JPanel panelTitle = new JPanel();
		panelTitle.setLayout(new FlowLayout());
		panelTitle.setSize(Constantes.FRAME_GENERATOR_SIZE_WIDTH, 20);
		JLabel titreLabel = new JLabel(Constantes.TITRE_GENERATOR);
		panelTitle.add(titreLabel);
		panelTitle.setLocation((Constantes.FRAME_GENERATOR_SIZE_WIDTH - panelTitle.getWidth()) / 2, positionY);
		frame.add(panelTitle);
		positionY += panelTitle.getHeight() + 20;

		for(OperatorCalcul operatorCalcul: Constantes.LIST_OPERATORS){
			JPanel jPanel = this.getPanelOperator(operatorCalcul, positionY);
			frame.add(jPanel);
			positionY += jPanel.getHeight() + 10;
		}

		frame.add(new Box(0));
		frame.setVisible(true);
	}

	public JPanel getPanelOperator(OperatorCalcul operatorCalcul, int poistionY){
		JPanel jPanel = this.initPanel(operatorCalcul.nom);

		if(operatorCalcul.equals(OperatorCalcul.TABLEAU_MULTIPLICATION)){
			//TODO
		}else{
			if(operatorCalcul.equals(OperatorCalcul.ADDITION) || operatorCalcul.equals(OperatorCalcul.SOUSTRACTION)){
				//TODO
			}else if(operatorCalcul.equals(OperatorCalcul.MULTIPLICATION) || operatorCalcul.equals(OperatorCalcul.DIVISION)){
				//TODO
			}
		}
		int positionX = (Constantes.FRAME_GENERATOR_SIZE_WIDTH - Constantes.PANEL_SIZE_WIDTH) / 2;
		jPanel.setLocation(positionX, poistionY);
		return jPanel;
	}

	public JPanel initPanel(String titre){
		JPanel panel = new JPanel();
		panel.setSize(Constantes.PANEL_SIZE_WIDTH, Constantes.PANEL_SIZE_HEIGHT);
		panel.setBorder(BorderFactory.createTitledBorder(titre));
		BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(layout);
		return panel;
	}



	public static void main(String[] args){
		ExecisesGenerator ihm = new ExecisesGenerator();
		ihm.initFrameWithOperators();
	}


	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
