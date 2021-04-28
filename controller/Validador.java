package controller;
import model.*;
import view.*;
/**
 * Classe respons�vel por validar os macros, lipidios e o nome dos alimentos
 * @author João Paulo Lima da Silva
 * @version 1.0 (29/11/2020)
 */
public class Validador {
    private boolean status;
    public Validador() {
        status = false;
    }
    /**
	 * Valida o cadastro dos macros
	 * @param Um objeto dos dados dos Macros
	 * @return um boolean que retornar verdadeiro quando o macro é inteiro
	 */
    public boolean validaMacros(String dadosMacros) {
        return dadosMacros != null && dadosMacros.matches("[0-9]+");
    }
    /**
	 * Valida o cadastro dos Lipidios
	 * @param Um objeto dos dados dos Lipidios
	 * @return um boolean que retornar verdadeiro quando o Lipidios é inteiro
	 */
    public boolean validaLipidios(String dadosLipidios) {
        return dadosLipidios != null && dadosLipidios.matches("[0-9]+");
    }
    /**
	 * Valida o cadastro do nome dos alimentos
	 * @param nomeAlimento objeto dos nomes dos alimentos
	 * @return um boolean que retornar verdadeiro quando o alimentos é valido
	 */
    public boolean validaNomeAlimento(String nomeAlimento) {
        return nomeAlimento != null && nomeAlimento.matches("^[a-zA-Z]+$");
    }

}
