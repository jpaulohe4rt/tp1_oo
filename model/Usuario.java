package model;

/**
 * Classe respons�vel por organizar e armazenar oo nome do Usuario
 * @author João Paulo Lima da Silva
 * @version 1.0 (28/04/2021)
 */
public class Usuario {
    private String nome;

    // construtor
     public Usuario(String nome) {
        this.nome = nome;
    }
    // retorna o nome
    public String getNome() {
        return nome;
    }
    // configura o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

}