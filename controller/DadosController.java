package controller;

import model.*;

public class DadosController {
   private Dados d = new Dados();

    public DadosController() {
        d.fillWithSomeData();
    }
    
	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}

    public Alimento[] getAlimento() {
        return this.d.getAlimento();
    }

    public Lipidios[] getLipidios() {
        return this.d.getLipidios();
    }

    public Macros[] getMacros() {
        return this.d.getMacros();
    }

    public int getQtdAlimento() {
        return this.d.getQtdAlimento();
    }

    public boolean inserirEditarAlimento(String[] dadosAlimento) {
        if(!dadosAlimento[3].matches("[0-9]+") || !dadosAlimento[4].matches("[0-9]+") ||
                !dadosAlimento[5].matches("[0-9]+") || !dadosAlimento[6].matches("[0-9]+") ||
                !dadosAlimento[7].matches("[0-9]+") || !dadosAlimento[8].matches("[0-9]+") ||  
                !dadosAlimento[9].matches("[0-9]+")) {
                    return false;
                } else {
                    Alimento a = new Alimento(dadosAlimento[1], dadosAlimento[2], Integer.parseInt(dadosAlimento[3]), 
                    Integer.parseInt(dadosAlimento[4]), Integer.parseInt(dadosAlimento[5]), Integer.parseInt(dadosAlimento[6]));
                    d.inserirEditarAlimento(a, Integer.parseInt(dadosAlimento[0]));
                    return true;
                }
    }

    public boolean removerAlimento(int i) {
		String alimentoRemovido = d.getAlimento()[i].getAlimento();
		if(i == (d.getQtdAlimento() - 1)) { // O aluno a ser removido est� no final do array
			d.setQtdAlimentos(d.getQtdAlimento() - 1);
			d.getAlimento()[d.getQtdAlimento()] = null;
			return true;
		} else { // o aluno a ser removido est� no meio do array
			int cont = 0;
			while(d.getAlimento()[cont].getAlimento().compareTo(alimentoRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdAlimento() - 1; j++) {
				d.getAlimento()[j] = null;
				d.getAlimento()[j] = d.getAlimento()[j+1];
			}
			d.getAlimento()[d.getQtdAlimento()] = null;
			d.setQtdAlimentos(d.getQtdAlimento() - 1);
			return true;
		}
	}
}
