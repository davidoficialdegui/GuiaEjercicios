package gui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import domain.Athlete;
import domain.Athlete.Genre;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	
	
	public MainWindow () {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		setTitle("JJ.OO. París 2024");
		setSize(640, 480);
		
		setLocationRelativeTo(null);	
		
		
		
		//JList
		
		ArrayList<String> atletas = new ArrayList<String>();
		
		int i;
		
		for( i = 1 ;i < 41; i++ ) {
			atletas.add("atleta " + i);
		}
		
		
		DefaultListModel<String> modeloJlist = new DefaultListModel<String>();  
		modeloJlist.addAll(atletas);
		
		JList<String> jList = new JList<String>(modeloJlist); 
		jList.setFixedCellWidth(200); 
		
		JScrollPane jScrollPane = new JScrollPane(jList); 
		
		add(jScrollPane, BorderLayout.WEST);  
		
		
		
		// JTabbed
		
		JTabbedPane panelTabbed = new JTabbedPane();
		
		JPanel Tab1 = new JPanel();
		JPanel Tab2 = new JPanel();
		
		panelTabbed.addTab("Datos", Tab1);
		panelTabbed.addTab("Medallas", Tab2);
		
		add(panelTabbed, BorderLayout.CENTER);
		
		
		
		
		setVisible(true); 
		
		
		
	}
	
	

}
