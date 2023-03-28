package br.edu.up.persistencia;
import br.edu.up.entidades.Conta;
import java.util.List;
import java.util.ArrayList;

public class ContaPersistencia {
	private static List<Conta> contas = new ArrayList<Conta>();
	
	public static void incluirConta(Conta objConta) {
		contas.add(objConta);
	}
	// static - para não precisar instanciar objeto para acessá-lo em outra classe
	public static Conta buscarConta(Conta conta) {
		for(Conta objConta: contas) {
			if(objConta.getNumeroAgencia() == conta.getNumeroAgencia() && objConta.getNumeroConta() == conta.getNumeroConta()) {
				return objConta;
			}
		}
		return null;
	}
	
	public static void atualizarConta(Conta conta) { 
		int i = 0;
		for(Conta objConta: contas) {
			if(objConta.getNumeroAgencia() == conta.getNumeroAgencia() && objConta.getNumeroConta() == conta.getNumeroConta()) {
				contas.set(i, conta);
				return;
			}
			i++;
		}
	}

}
