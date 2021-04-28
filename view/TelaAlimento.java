package view;
/**
 * Classe respons�vel por cadastro e exibição dos detalhes do alimento
 * @author João Paulo Lima da Silva
 * @version 1.0 (28/04/2021)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controller.*;
import java.awt.Color;

public class TelaAlimento implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroAlimento;
	private JButton atualizarAlimento;
	private static DadosController dados;
	private JList<String> listaAlimentosCadastrados;
	private String[] listaNomesAlimentos = new String[10];

	public void mostrarDados(DadosController d, int op){
		dados = d;
		if (op== 1) {// Mostrar dados de Alimentos cadastrados (JList)
			listaNomesAlimentos = new AlimentoController(dados).getNomeAlimento();
			listaAlimentosCadastrados = new JList<String>(listaNomesAlimentos);
			janela = new JFrame("Lista de Alimentos");
			titulo = new JLabel("Lista de Alimentos");
			cadastroAlimento = new JButton("Cadastrar");
			atualizarAlimento = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaAlimentosCadastrados.setBounds(20, 50, 350, 120);
			listaAlimentosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaAlimentosCadastrados.setVisibleRowCount(10);

			cadastroAlimento.setBounds(70, 177, 100, 30);
			atualizarAlimento.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaAlimentosCadastrados);
			janela.add(cadastroAlimento);
			janela.add(atualizarAlimento);
			janela.getContentPane().setBackground(Color.lightGray);
			listaAlimentosCadastrados.setBackground(Color.lightGray);
			janela.pack();
			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroAlimento.addActionListener(this);
			atualizarAlimento.addActionListener(this);
			listaAlimentosCadastrados.addListSelectionListener(this);
		}
		else{
			JOptionPane.showMessageDialog(null,"Op��o n�o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaAlimentosCadastrados) {
			new TelaDetalheAlimento().inserirEditar(1, dados, this, 
					listaAlimentosCadastrados.getSelectedIndex());
		}
	}
	//Obter eventos relacionados ao JLISt
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if(src == cadastroAlimento)
		new TelaDetalheAlimento().inserirEditar(1, dados, this, 0);

	// Atualiza a lista de nomes de alimentos mostrada no JList
		if(src == atualizarAlimento) {
		listaAlimentosCadastrados.setListData(new AlimentoController(dados).getNomeAlimento());			
		listaAlimentosCadastrados.updateUI();
	}
	}
}