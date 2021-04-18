package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;

public class TelaMenu implements ActionListener {
	
	private static final JFrame janela = new JFrame("Controle de macros");
	private static final JLabel titulo = new JLabel("Menu Principal");
	private static final JButton alimento = new JButton("Alimentos");
	public static DadosController dados = new DadosController();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		alimento.setBounds(140, 50, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(alimento);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		alimento.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == alimento)
			new TelaAlimento().mostrarDados(dados, 1);
	}
}