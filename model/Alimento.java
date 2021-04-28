package model;


public class Alimento {
    /**
     * Classe respons�vel por organizar e armazenar os nutrientes do alimento
     * @author João Paulo Lima da Silva
     * @version 1.0 (28/04/2021)
     */
    protected String nomeAlimento;
    private int numAlimento= 0;
    private Alimento[] alimentosCadastrado= new Alimento[10];
    private int calorias;
    private int carboidratos;
    private int proteinas;
    private int lipidios;
    private int colesterol;
    private int acidoGraxoSat;
    private int acidoGraxoMon;
    private int acidoGraxoPol;
    private int acidoGraxoTran;

    public Alimento(String n, int cal, int carboidratos, int proteinas, int lipidios, int col, int ags, int agm, int agp, int agt) {
        nomeAlimento = n;
        this.calorias = cal;
        this.carboidratos = carboidratos;
        this.proteinas = proteinas;
        this.lipidios = lipidios;
        this.colesterol = col;
        this.acidoGraxoSat = ags;
        this.acidoGraxoMon = agm;
        this.acidoGraxoPol = agp;
        this.acidoGraxoTran = agt;
    }
    public int getAcidoGraxoTran(){
        return acidoGraxoTran;
    }

    public void setAcidoGraxoTran(int agt){
        this.acidoGraxoTran = agt;
    }

    public int getAcidoGraxoPol(){
        return acidoGraxoPol;
    }

    public void setAcidoGraxoPol(int agp){
        this.acidoGraxoTran = agp;
    }

    public int getAcidoGraxoMon(){
        return acidoGraxoMon;
    }
    public int getAcidoSat(){
        return acidoGraxoSat;
    }
    public void setAcidoGraxoSat(int acidoGraxoSat){
        this.acidoGraxoSat= acidoGraxoSat;
    }
    public int getColesterol(){
        return colesterol;
    }
    public void setColesterol(int acidoGraxoTran){
        this.acidoGraxoTran = acidoGraxoTran;
    }

    public int getLipidios(){
        return lipidios;
    }

    public void setLipidios(int lip){
        this.lipidios = lip;
    }

    public int getProteinas(){
        return proteinas;
    }

    public void setProteinas(int pro){
        this.proteinas = pro;
    }

    public int getCarboidratos(){
        return carboidratos;
    }

    public void setCarboidratos(int car){
        this.proteinas = car;
    }

    public int getCalorias(){
        return calorias;
    }

    public void setCalorias(int cal){
        this.calorias = cal;
    }

    public void setArrayAlimentosCadastrados(Alimento[] a) {
        this.alimentosCadastrado = a;
    }

    public int getNumAlimento(){
        return numAlimento;
    }

    public void setNumAlimento(int numAlimento) {
        this.numAlimento = numAlimento;
    }

    //retorna a representação String dos objetos alimentos e calorias
    public String toString() {
        return "Nome do alimento: " + nomeAlimento;
    }
    //retorna o nome do alimento
    public String getAlimento() {
        return nomeAlimento;
    }
    //configura o nome do alimento
    public void setAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public String alimentoCadastrado() {
        String saida = "***** Lista de Alimentos ***** \n" ;
        for(int i = 0; i < numAlimento; i++) {
            System.out.println(i);
           saida = saida + "\n" + alimentosCadastrado[i].getAlimento().toString();
        }
        return saida;
    }
}
