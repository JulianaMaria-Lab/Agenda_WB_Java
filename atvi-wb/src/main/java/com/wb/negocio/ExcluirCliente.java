package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;

public class ExcluirCliente extends Excluir{
	private List<Cliente> clientes;
	private Entrada entrada;
	
	public ExcluirCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	
	@Override
	public void excluir() {
		System.out.println("Digite o c�digo do cliente a ser exclu�do: ");
		int cod = entrada.receberNumeroInteiro();
		clientes.remove(cod);
		System.out.println("Registro exclu�do com sucesso! ");
		System.out.println("=================================");
	}

}
