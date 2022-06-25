package com.wb.negocio;

import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;
import com.wb.modelo.RG;
import com.wb.modelo.Telefone;

public class ListarTodosClientes extends Listagem {
	private List<Cliente> clientes;

	public ListarTodosClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("Lista de todos os clientes:");
		for (Cliente cliente : clientes) {
			System.out.println("Codigo do cliente: " + clientes.indexOf(cliente));
			System.out.println("Nome: " + cliente.nome);
			System.out.println("Nome social: " + cliente.nomeSocial);
			System.out.println("Genero: " + cliente.genero);
			System.out.println("CPF: " + cliente.getCpf().getValor());
			for (RG rg : cliente.getRgs()) {
				System.out.println("RG: " + rg.getValor());
			}
			for (Telefone tel : cliente.getTelefones()) {
				System.out.println("Tel: (" +tel.getDdd() + ")" + tel.getNumero());
			}
			System.out.println("Produtos consumidos: ");
			for (Produto produto : cliente.getProdutosConsumidos()) {
				System.out.println(produto.nome + " --------- valor: R$" + produto.valor);
			}
			System.out.println("Data de cadastro: " + cliente.getDataCadastro());
			System.out.println("=================================");
		}
	}
}
