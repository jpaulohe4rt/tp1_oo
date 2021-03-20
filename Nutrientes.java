public abstract class Nutrientes {
    private int qntNutrientes;
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
