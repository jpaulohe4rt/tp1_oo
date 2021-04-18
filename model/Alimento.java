package model;


public class Alimento {

    protected String nomeAlimento;
    private int numAlimento= 0;
    private Alimento[] alimentosCadastrado= new Alimento[10];

    public Alimento(String dadosAlimentos, String dadosAlimentos2, int i, int j, int k, int l){
        super();
    }

    public Alimento(String nA,int numA, int i, int j, int k, int l, int m, int n, int o, int p) {
        nomeAlimento = nA;
        numAlimento = numA;
    }

    public Alimento(String string, int parseInt, String string2, String string3, String string4, String string5,
            String string6, String string7, String[] dadosAlimento) {
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
