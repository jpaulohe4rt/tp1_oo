package model;

public class Usuario {
    private String nome;
    private String senha;

    // construtor
     public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    // retorna o nome
    public String getNome() {
        return nome;
    }
    // configura o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}