package model;
/**
 * Classe respons�vel por organizar e armazenar os Macros do alimento
 * @author João Paulo Lima da Silva
 * @version 1.0 (28/04/2021)
 */
public class Macros extends Nutrientes {
    private int calorias;
    private int carboidratos;
    private int proteinas;
    private int lipidios;

    public Macros(){
        super();
    }

    //construtor
    public Macros (int cal, int car, int pro, int lip) {
        this.calorias = cal;
        this.carboidratos = car;
        this.proteinas = pro;
        this.lipidios = lip;
    }
    //retorna as calorias
    public int getCalorias () {
        return calorias;
    }
    // configura as calorias
    public void setCalorias (int calorias) {
        this.calorias = calorias;
    }
    //retorna as carboidratos
    public int getCarboidratos() {
        return carboidratos;
    }
    // configura o colesterol
    public void setCarboidratos (int carboidratos) {
        this.carboidratos = carboidratos;
    }
    //retorna as proteinas
    public int getProteinas() {
        return proteinas;
    }
    // configura o colesterol
    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
    //retorna os lipidios
    public int getLipidios() {
        return lipidios;
    }
    // configura o colesterol
    public void setLipidios(int lipidios) {
        this.lipidios = lipidios;
    }
    //imprime a quantidades de macro nutrientes
    public void qntNutrientes() {
        System.out.println("Quantidade de Macros: "+this.getNutrientes());
    }
    // imprime a representação  dos objetos calorias, carboidratos, proteinas, lipidios
    public void imprimeNutrientes() {
        System.out.println("Calorias: " + this.getCalorias() + " Carboidratos: " + this.getCarboidratos() + 
        " Proteinas: " + this.getProteinas() +  " Lipidios: " + this.getLipidios());
    }
}
