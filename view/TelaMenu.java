package view;
/**
 * Inicializa e apresenta a tela de Menu do programa
 * @author João Paulo Lima da Silva
 * @version 1.0 (22/12/2021)
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import controller.*;

public class TelaMenu implements ActionListener {
	
	private static final JFrame janela = new JFrame("");
	private static final JLabel titulo = new JLabel("Mapa de Alimentos");
	private static final JButton botao = new JButton("Alimentos");
	public static DadosController dados = new DadosController();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 250, 30);
		botao.setBounds(140, 100, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(botao);
		janela.setSize(400, 250);


		janela.getContentPane().setBackground(Color.lightGray);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		botao.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao)
			new TelaAlimento().mostrarDados(dados, 1);
	}
}