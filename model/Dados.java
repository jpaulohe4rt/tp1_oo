package model;
/**
 * Classe respons�vel por organizar e armazenar os dados do alimento
 * @author João Paulo Lima da Silva
 * @version 1.0 (28/04/2021)
 */
public class Dados {
    private Alimento[] alimento = new Alimento[10];
    private int qtdAlimento = 0;
    private Macros[]  macros = new Macros[10];
    private int qtdMacros;
    private Lipidios[] lipidios = new Lipidios[10];
    private int qtdLipidios;

    public void fillWithSomeData() {
        for(int i= 0; i < 5; i++) {
            alimento[i] = new Alimento("Alimento"+i, i, i, i, i, i, i, i, i, i);
        }
        
        qtdAlimento = 5;
    }

    public int getQtdMacros() {
        return qtdMacros;
    }

    public void setQtdMacros(int qtdMacros) {
        this.qtdMacros = qtdMacros;
    }

    public int getQtdLipidios() {
        return qtdLipidios;
    }

    public void setQtdLipidios(int qtdLipidios) {
        this.qtdLipidios = qtdLipidios;
    }

    public Alimento[] getAlimento() {
        return alimento;
    }

    public Macros[] getMacros() {
        return macros;
    }

    public Lipidios[] getLipidios() {
        return lipidios;
    }

    public void setAlimento(Alimento[] alimento) {
        this.alimento = alimento;
    }

	public void inserirEditarAlimento(Alimento a, int pos) {
		this.alimento[pos] = a;
		if(pos == qtdAlimento) qtdAlimento++;
	}
	
	public void setQtdAlimentos(int qtdAlimentos) {
		this.qtdAlimento = qtdAlimentos;
	}

    public int getQtdAlimento() {
        return qtdAlimento;
    }
}