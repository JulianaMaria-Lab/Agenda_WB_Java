package com.wb.negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;

public class ListagemVendas extends Listagem{
	private List<Cliente> clientes;
	private List<Produto> produtos;
	
	public ListagemVendas(List<Cliente> clientes, List<Produto> produtos) {
		this.clientes = clientes;
		this.produtos = produtos;
	}

	public void listar(){
		System.out.println("Listagem geral de produtos mais consumidos:");
		List<Produto> vendas = new ArrayList<Produto>();
		for (Produto produto : produtos) {
			produto.contarVendas(clientes);
			vendas.add(produto);
		}
		Comparator<Produto> cp = new ComparadorProduto();
		Collections.sort(vendas, cp.reversed());
		for (Produto produto : vendas) {
			System.out.println(produto.nome + " - " + produto.quant + " vendidos.");
		}
		System.out.println("=================================");
	}
}
