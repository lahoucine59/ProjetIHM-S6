package gestionnaireNull;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GestionnaireNull extends JFrame implements ActionListener {
		private JButton bouton1, bouton2, bouton3;
		private JPanel panneau1,panneau2,panneau3,panneau4,panneau5;
		
		public GestionnaireNull(String titre) {
			setTitle(titre);
			setSize(300, 400);
			Container c = getContentPane();
			
			panneau1 = new JPanel();
			panneau2 = new JPanel();
			panneau3 = new JPanel();
			panneau4 = new JPanel();
			panneau5 = new JPanel();
			
			c.add(panneau1,"Center");
			c.add(panneau2,"North");
			c.add(panneau3,"South");
			c.add(panneau4,"East");
			c.add(panneau5,"West");
			
			panneau1.setBackground(Color.BLUE);
			panneau1.setLayout(null);
			
			
			JButton bouton61 = new JButton("BOUTON 61");
			JButton bouton62 = new JButton("BOUTON 62");
			JButton bouton63 = new JButton("BOUTON 63");
			
			panneau1.add(bouton61);
			panneau1.add(bouton62);
			panneau1.add(bouton63);
						
			bouton61.setSize(new Dimension(100,50)); //équivalent à monBouton.setSize(100,50);
			bouton61.setLocation(new Point(1, 1)); // équivalent à monBouton.setLocation(100, 50);
			//bouton61.setLocation(100, 50);
			//bouton61.setText("Mon Bouton");
			
			bouton62.setSize(new Dimension(100,50)); //équivalent à monBouton.setSize(100,50);
			bouton62.setLocation(new Point(200, 200)); // équivalent à monBouton.setLocation(100, 50);
			//bouton62.setLocation(200, 200); 
			
			//bouton63.setText("Mon Bouton");
			
			bouton63.setSize(new Dimension(100,50)); //équivalent à monBouton.setSize(100,50);
			bouton63.setLocation(new Point(300, 300)); // équivalent à monBouton.setLocation(100, 50);
			//bouton63.setLocation(300, 300);
			//bouton63.setText("Mon Bouton");
			
			setDefaultCloseOperation(3);
		}

		public void actionPerformed(ActionEvent a) {
			JButton source = (JButton) a.getSource();
		}
		
		public static void main(String[] args) {
			JFrame f = new GestionnaireNull("Mise en forme : SMI-S6-2015");
			f.setVisible(true);
		}
	}


	
	
	
	






