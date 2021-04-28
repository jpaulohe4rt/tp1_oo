package controller;

import model.*;
/**
 * Classe respons�vel por organizar e armazenar os dados do alimento
 * @author João Paulo Lima da Silva
 * @version 1.0 (28/04/2021)
 */
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
	/**
	 * Permite inserir e editar o nome e os nutrientes do alimento
	 * @param Um objeto do tipo String dos dados do Alimento
	 * @return boolean
	 */
	public boolean inserirEditarAlimento(String[] dadosAlimentos) {
		if(!dadosAlimentos[6].matches("[0-9]+") || !dadosAlimentos[7].matches("[0-9]+") || 
				!dadosAlimentos[8].matches("[0-9]+") || !dadosAlimentos[9].matches("[0-9]+") ||
                 !dadosAlimentos[10].matches("[0-9]+") || !dadosAlimentos[2].matches("[0-9]+") ||
                 !dadosAlimentos[3].matches("[0-9]+") || !dadosAlimentos[4].matches("[0-9]+") || !dadosAlimentos[5].matches("[0-9]+")) {
			return false;
		} else {
				Alimento a = new Alimento(dadosAlimentos[1], Integer.parseInt(dadosAlimentos[2]), Integer.parseInt(dadosAlimentos[3]), 
				Integer.parseInt(dadosAlimentos[4]), Integer.parseInt(dadosAlimentos[5]), Integer.parseInt(dadosAlimentos[6]), 
				Integer.parseInt(dadosAlimentos[7]), Integer.parseInt(dadosAlimentos[8]), Integer.parseInt(dadosAlimentos[9]), Integer.parseInt(dadosAlimentos[10]));
				d.inserirEditarAlimento(a, Integer.parseInt(dadosAlimentos[0]));
				return true;
		}
	}
	/**
	 * Permite remover o alimento
	 * @param Um objeto do tipo inteiro
	 * @return boolean
	 */
    public boolean removerAlimento(int i) {
		String alimentoRemovido = d.getAlimento()[i].getAlimento();
		if(i == (d.getQtdAlimento() - 1)) { // O alimento a ser removido est� no final do array
			d.setQtdAlimentos(d.getQtdAlimento() - 1);
			d.getAlimento()[d.getQtdAlimento()] = null;
			return true;
		} else { // o alimento a ser removido est� no meio do array
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
