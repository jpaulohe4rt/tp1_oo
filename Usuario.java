public class Usuario {
    protected String nome;
    protected int idade;
    // construtor
     public Usuario(String n, int i) {
        nome = n;
        idade = i;
    }
    // retorna o nome
    public String getNome() {
        return nome;
    }
    // configura o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    // retorna a idade 
    public int getIdade() {
        return idade;
    }
    // configura a idade
    public void setIdade(int i){
        idade = i;
    }
    // retorna a representação String
    public String toString() {
        return "Usuario: " + nome + " Idade: " + idade;
    }

}