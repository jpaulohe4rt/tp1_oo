package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controller.*;

public class TelaDetalheAlimento implements ActionListener {
    private JFrame janela;
	private JLabel labelNome = new JLabel("Nome do Alimento: ");
	private JTextField valorNome;
	private JLabel labelCal = new JLabel("Calorias: ");
	private JTextField valorCal;
	private JLabel labelCarb = new JLabel("Carboidrato: ");
	private JTextField valorCarb;
	private JLabel labelPro = new JLabel("Proteina: ");
	private JTextField valorPro;
	private JLabel labelLip = new JLabel("Lipidios");
	private JTextField valorLip;
    private JLabel labelCol = new JLabel("Colesterol ");
	private JTextField valorCol;
    private JLabel labelSat = new JLabel("Ácido Graxo Saturado: ");
	private JTextField valorSat;
    private JLabel labelMon = new JLabel("Ácido Graxo MonoInsaturado: ");
	private JTextField valorMon;
    private JLabel labelPol = new JLabel("Ácido Graxo Polisaturado: ");
	private JTextField valorPol;
    private JLabel labelGra = new JLabel("Ácido Graxo : ");
	private JTextField valorGra;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[11];
	private static DadosController dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, DadosController d, 
			TelaAlimento p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Detalhe do Alimento";

		janela = new JFrame(s);

		//Preenche dados com dados do Alimento clicado
		if (op == 1) {
			valorNome = new JTextField(dados.getAlimento()[pos].getAlimento(), 200);
			valorCal = new JTextField(String.valueOf(dados.getMacros()[pos].getCalorias()), 3);
			valorCarb = new JTextField(String.valueOf(dados.getMacros()[pos].getCarboidratos()), 3);
			valorPro = new JTextField(String.valueOf(dados.getMacros()[pos].getProteinas()), 3);
			valorLip = new JTextField(String.valueOf(dados.getMacros()[pos].getLipidios()), 3);
			valorCol = new JTextField(String.valueOf(dados.getLipidios()[pos].getColesterol()), 3);
			valorSat = new JTextField(String.valueOf(dados.getLipidios()[pos].getAcidoSat()), 3);
            valorMon = new JTextField(String.valueOf(dados.getLipidios()[pos].getAcidoGraxoMon()), 3);
            valorPol = new JTextField(String.valueOf(dados.getLipidios()[pos].getAcidoGraxoPol()), 3);
            valorGra = new JTextField(String.valueOf(dados.getLipidios()[pos].getAcidoGraxoTran()), 3);
			botaoSalvar.setBounds(30, 300, 115, 30);
			botaoExcluir.setBounds(245, 300, 115, 30);
		} else { //N�o preenche com dados

			valorNome = new JTextField(200);
			valorCal = new JTextField(3);
			valorCarb = new JTextField(3);
			valorPro = new JTextField(3);
			valorLip = new JTextField(3);
			valorCol = new JTextField(3);
			valorSat = new JTextField(3);
			valorMon = new JTextField(3);
			valorPol = new JTextField(3);
			valorGra = new JTextField(3);

			botaoSalvar.setBounds(30, 300, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelCal.setBounds(30, 50, 150, 25);
		valorCal.setBounds(180, 50, 180, 25);
		labelPro.setBounds(30, 80, 150, 25);
		valorPro.setBounds(180, 80, 180, 25);		
		labelLip.setBounds(30, 110, 150, 25);
		valorLip.setBounds(180, 110, 180, 25);
		labelCol.setBounds(30, 140, 150, 25);
		valorCol.setBounds(180, 140, 180, 25);
		labelSat.setBounds(30, 170, 150, 25);
		valorSat.setBounds(180, 170, 180, 25);
		labelMon.setBounds(30, 200, 150, 25);
		valorMon.setBounds(180, 200, 180, 25);
		labelPol.setBounds(30, 230, 150, 25);
		valorPol.setBounds(180, 230, 180, 25);
		labelGra.setBounds(30, 260, 150, 25);
		valorGra.setBounds(180, 260, 180, 25);


		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCarb);
		this.janela.add(valorCarb);
		this.janela.add(labelCal);
		this.janela.add(valorCal);
		this.janela.add(labelCarb);
		this.janela.add(valorCarb);
		this.janela.add(labelPro);
		this.janela.add(valorPro);
		this.janela.add(labelLip);
		this.janela.add(valorLip);
		this.janela.add(labelCol);
		this.janela.add(valorCol);
		this.janela.add(labelSat);
		this.janela.add(valorSat);
		this.janela.add(labelMon);
		this.janela.add(valorMon);
		this.janela.add(labelPol);
		this.janela.add(valorPol);
		this.janela.add(labelGra);
		this.janela.add(valorGra);
		this.janela.add(botaoSalvar);
		this.janela.add(botaoExcluir);

		this.janela.setLayout(null);
		this.janela.setSize(400, 400);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //cadastro de novo aluno
					novoDado[0] = Integer.toString(dados.getQtdAlimento());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[3] =  valorCal.getText();
				novoDado[4] =  valorPro.getText();
				novoDado[5] =  valorLip.getText();
				novoDado[6] =  valorCol.getText();
				novoDado[7] =  valorSat.getText();
				novoDado[8] =  valorMon.getText();
				novoDado[9] =  valorPol.getText();
				novoDado[10] = valorGra.getText();

				if (opcao == 1 ) {
					novoDado[2] =  valorCal.getText();
					res = dados.inserirEditarAlimento(novoDado);
				} else {
					novoDado[2] =  valorNome.getText();
					res = dados.inserirEditarAlimento(novoDado);
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 1 || opcao == 2) {//exclui Alimento
				res = dados.removerAlimento(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}	
		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n ", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
