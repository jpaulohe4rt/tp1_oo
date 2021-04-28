package model;

/**
 * Classe respons�vel por organizar e armazenar os lipidios do alimento
 * @author João Paulo Lima da Silva
 * @version 1.0 (28/04/2021)
 */
public class Lipidios extends Nutrientes {
    private int colesterol;
    private int acidoGraxoSat;
    private int acidoGraxoMon;
    private int acidoGraxoPol;
    private int acidoGraxoTran;

    public Lipidios(){
        super();
    }

    // construtor
    public Lipidios (int col, int ags, int agm, int agp, int agt) {
        this.colesterol = col;
        this.acidoGraxoSat = ags;
        this.acidoGraxoMon = agm;
        this.acidoGraxoPol = agp;
        this.acidoGraxoTran = agt;
    }
    // retorna o colesterol
    public int getColesterol () {
        return colesterol;
    }
    // configura o colesterol
    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }
    // retorna o acido graxo saturado
    public int getAcidoSat() {
        return acidoGraxoSat;
    }
    // configura o acido graxo saturado
    public void setAcidoSat(int acidoGraxoSat) {
        this.acidoGraxoSat = acidoGraxoSat;
    }
    //retorna o valor do Acido Graxo Mon
    public int getAcidoGraxoMon () {
        return acidoGraxoMon;
    }
    // configura o colesterol
    public void setAcidoGraxoMon (int acidoGraxoMon) {
        this.acidoGraxoMon = acidoGraxoMon;
    }
    //retorna o valor do Acido Graxo Pol
    public int getAcidoGraxoPol () {
        return acidoGraxoPol;
    }
    // configura o colesterol
    public void setAcidoGraxoPol (int acidoGraxoPol) {
        this.acidoGraxoPol = acidoGraxoPol;
    }
    //retorna o valor do Acido Graxo Tran
    public int getAcidoGraxoTran () {
        return acidoGraxoTran;
    }
    // configura o colesterol
    public void setAcidoGraxoTran (int acidoGraxoTran){
        this.acidoGraxoTran = acidoGraxoTran;
    }
    //retorna a quantidade de lipidos
    public void qntNutrientes() {
        System.out.println("Quantidades de Lipidios: "+this.getNutrientes());
    }
    //Imprime os Nutrientes obtidos
    public void imprimeNutrientes() {
        System.out.println("Colesterol: " + this.getColesterol() + " Acido Graxo Saturado: " + this.getAcidoSat() + 
        " Acido Graxo Monoinsaturado: " + this.getAcidoGraxoMon() + " Acido Graxo Poliinsaturado: " + this.getAcidoGraxoPol() + 
        " Acido Graxo Trans: " + this.getAcidoGraxoTran());
    }

}
