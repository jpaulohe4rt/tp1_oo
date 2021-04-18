package model;

public class Dados {
    private Alimento[] alimento = new Alimento[10];
    private int qtdAlimento = 0;
    private Macros[]  macros = new Macros[10];

    private Lipidios[] lipidios = new Lipidios[10];
   
    public void fillWithSomeData() {
        for(int i= 0; i < 5; i++) {
            alimento[i] = new Alimento("Alimento",i, i, i, i, i, i, i, i, i);
            lipidios[i] = new Lipidios();
			macros[i] = new Macros(i, i, i, i);
        }
        
        qtdAlimento = 5;
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