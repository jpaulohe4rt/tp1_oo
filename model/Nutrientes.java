package model;

/**
 * Classe respons�vel por organizar e armazenar os nutrientes dos alimentos
 * @author João Paulo Lima da Silva
 * @version 1.0 (28/04/2021)
 */

public abstract class Nutrientes {
    private int qntNutrientes;


    public Nutrientes(){
        super();
    }
    // cria metodo abstrato
    public abstract void imprimeNutrientes();
    // configura a qnt de nutrientes
    public void setNutrientes(int qntNutrientes) {
        this.qntNutrientes = qntNutrientes;
    }
    // retorna a quantidade de nutrientes
    public int getNutrientes() {
        return qntNutrientes;
    }

     // metodo abstrato
    public abstract void qntNutrientes();
}
