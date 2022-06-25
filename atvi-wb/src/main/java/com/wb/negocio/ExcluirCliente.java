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
		System.out.println("Digite o código do cliente a ser excluído: ");
		int cod = entrada.receberNumeroInteiro();
		clientes.remove(cod);
		System.out.println("Registro excluído com sucesso! ");
		System.out.println("=================================");
	}

}
