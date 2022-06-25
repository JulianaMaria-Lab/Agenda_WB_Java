package com.wb.negocio;

import java.util.List;

import com.wb.modelo.Produto;

public class ListarTodosProdutos extends Listagem{
	private List<Produto> produtos;
	
	public ListarTodosProdutos(List<Produto>  produtos) {
		this.produtos = produtos;
	}
	
	@Override
	public void listar() {
		System.out.println("Lista de todos os Produtos: ");
		for (Produto produto : produtos) {
			System.out.println("Codigo: " + produtos.indexOf(produto));
			System.out.println("Nome: "+ produto.nome);
			System.out.println("Valor: " + produto.valor);
		}
	}
}
