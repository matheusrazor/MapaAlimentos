package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaMenu implements ActionListener {
	
	private JLabel labelUsuario, labelPeso, labelAltura, labelAlimento,
	labelQuantidade, labelCalorias, labelProteinas, labelCarbs, labelGorduras;
	private JTextField usuarioText, usuarioPesoText, usuarioAlturaText,
	alimentoText, alimentoQuantidadeText, alimentoCaloriasText, alimentoProteinasText,
	alimentoCarbsText, alimentoGordurasText;
	private JButton buttonUsuario, buttonAlimento;
	
	public TelaMenu() {	// Constructor
		
		JFrame frame = new JFrame("Menu | Mapa de Alimentos");	//instanciando o frame e passando alguns parametros padrao
		frame.setSize(600, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		GridLayout grid = new GridLayout(0, 2);
		
		// User screen
		
		JPanel panelUsuario = new JPanel();
		panelUsuario.setLayout(grid);
		
		labelUsuario = new JLabel("Nome do Usuario");
		labelUsuario.setBounds(10, 20, 80, 25);
		panelUsuario.add(labelUsuario);
		
		usuarioText = new JTextField(20);
		usuarioText.setBounds(100, 20, 165, 25);
		panelUsuario.add(usuarioText);
		
		labelPeso = new JLabel("Peso do Usuario em kg");
		labelPeso.setBounds(10, 50, 80, 25);
		panelUsuario.add(labelPeso);
		
		usuarioPesoText = new JTextField(4);
		usuarioText.setBounds(100, 50, 165, 25);
		panelUsuario.add(usuarioPesoText);
		
		labelAltura = new JLabel("Altura do Usuario em cm");
		labelAltura.setBounds(10, 80, 80, 25);
		panelUsuario.add(labelAltura);
		
		usuarioAlturaText = new JTextField(4);
		usuarioAlturaText.setBounds(100, 80, 165, 25);
		panelUsuario.add(usuarioAlturaText);
		
		buttonUsuario = new JButton("Confirma");
		buttonUsuario.setBounds(100, 110, 80, 25);
		buttonUsuario.addActionListener(new TelaMenu());
		panelUsuario.add(buttonUsuario);
		
		frame.add(panelUsuario);
		
		// Food screen
		
		JPanel panelAlimento = new JPanel();
		panelUsuario.setLayout(grid);
		
		labelAlimento = new JLabel("Nome do Alimento");
		labelAlimento.setBounds(10, 20, 80, 25);
		panelUsuario.add(labelAlimento);
		
		alimentoText = new JTextField(20);
		alimentoText.setBounds(100, 20, 165, 25);
		panelUsuario.add(alimentoText);
		
		labelQuantidade = new JLabel("Peso do Usuario em kg");
		labelQuantidade.setBounds(10, 50, 80, 25);
		panelUsuario.add(labelQuantidade);
		
		alimentoQuantidadeText = new JTextField(4);
		alimentoQuantidadeText.setBounds(100, 50, 165, 25);
		panelUsuario.add(alimentoQuantidadeText);
		
		labelCalorias = new JLabel("Altura do Usuario em cm");
		labelCalorias.setBounds(10, 80, 80, 25);
		panelUsuario.add(labelCalorias);
		
		alimentoCaloriasText = new JTextField(4);
		alimentoCaloriasText.setBounds(100, 80, 165, 25);
		panelUsuario.add(alimentoCaloriasText);
		
		labelProteinas = new JLabel("Altura do Usuario em cm");
		labelProteinas.setBounds(10, 110, 80, 25);
		panelUsuario.add(labelProteinas);
		
		alimentoProteinasText = new JTextField(4);
		alimentoProteinasText.setBounds(100, 110, 165, 25);
		panelUsuario.add(alimentoProteinasText);
		
		labelCarbs = new JLabel("Altura do Usuario em cm");
		labelCarbs.setBounds(10, 140, 80, 25);
		panelUsuario.add(labelCarbs);
		
		alimentoCarbsText = new JTextField(4);
		alimentoCarbsText.setBounds(100, 140, 165, 25);
		panelUsuario.add(alimentoCarbsText);
		
		labelGorduras = new JLabel("Altura do Usuario em cm");
		labelGorduras.setBounds(10, 170, 80, 25);
		panelUsuario.add(labelGorduras);
		
		alimentoGordurasText = new JTextField(4);
		alimentoGordurasText.setBounds(100, 170, 165, 25);
		panelUsuario.add(alimentoGordurasText);
		
		buttonAlimento = new JButton("Confirma");
		buttonAlimento.setBounds(100, 200, 80, 25);
		buttonAlimento.addActionListener(new TelaMenu());
		panelUsuario.add(buttonAlimento);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}