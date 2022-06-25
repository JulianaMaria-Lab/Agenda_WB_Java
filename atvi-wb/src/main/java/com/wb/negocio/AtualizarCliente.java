package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;

public class AtualizarCliente extends Atualizar{
	private List<Cliente> clientes;
	private Entrada entrada;
	
	public AtualizarCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	
	@Override
	public void atualizar() {
		System.out.println("Digite o codigo do cliente que deseja atualizar: ");
		int cod = entrada.receberNumeroInteiro();
		Cliente cliente = clientes.get(cod);
		System.out.println("Cliente escolhido: " + cliente.nome);
		System.out.println("Selecione a opção que deseja alterar:");
		System.out.println("1 - Alterar nome social");
		System.out.println("2 - Alterar genero");
		System.out.println("3 - Incluir novo telefone");
		int opcao = entrada.receberNumeroInteiro();
		switch(opcao) {
		case 1:
			cliente.alterarNomeSocial();
			break;
		case 2:
			cliente.alterarGenero();
			break;
		case 3:
			cliente.incluirNovoTel();
			break;
		}
	}

}
