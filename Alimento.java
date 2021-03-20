public class Alimento {
    protected String nomeAlimento;

    //Construtor
    public Alimento(String nA) {
        nomeAlimento = nA;
    }
    //retorna a representação String dos objetos alimentos e calorias
    public String toString() {
        return "Nome do alimento: " + nomeAlimento;
    }
    //retorna o nome do alimento
    public String getNomeAlimento() {
        return nomeAlimento;
    }
    //configura o nome do alimento
    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

}
