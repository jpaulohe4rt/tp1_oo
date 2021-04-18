package controller;

import model.*;

public class AlimentoController {
    private Alimento[] a;
    private Lipidios[] l;
    private Macros[] m;
    private int qtdAlimentos;

    public AlimentoController(DadosController d) {
        a = d.getAlimento();
		l = d.getLipidios();
		m = d.getMacros();
        qtdAlimentos = d.getQtdAlimento();
    }

    public String getColesterol(int i) {
		String numCOL = String.valueOf(l[i].getColesterol());
		return numCOL;
	}

    public String getAcidoSat(int i) {
		String numSAT = String.valueOf(l[i].getAcidoSat());
		return numSAT;
	}

    public String getAcidoGraxoMon(int i) {
		String numMON= String.valueOf(l[i].getAcidoGraxoMon());
		return numMON;
	}

    public String getAcidoGraxoPol(int i) {
		String numPOL = String.valueOf(l[i].getAcidoGraxoPol());
		return numPOL;
	}

    public String getAcidoGraxoTran(int i) {
		String numTRAN = String.valueOf(l[i].getAcidoGraxoTran());
		return numTRAN;
	}

    public String getCalorias(int i) {
		String numCAL = String.valueOf(m[i].getCalorias());
		return numCAL;
	}

    public String getCarboidratos(int i) {
		String numCAR = String.valueOf(m[i].getCarboidratos());
		return numCAR;
	}

    public String getProteinas(int i) {
		String numPRO = String.valueOf(m[i].getProteinas());
		return numPRO;
	}

    public String getLipidios(int i) {
		String numLIP = String.valueOf(m[i].getLipidios());
		return numLIP;
	}

   public String[] getNomeAlimento() {
       String[] s = new String[qtdAlimentos];
       for(int i = 0; i < qtdAlimentos; i++) {
           s[i] = a[i].getAlimento();
       }
       return s;
   }
}
