package com.wb.negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;

public class ListagemProdutoGenero extends Listagem{
	private List<Cliente> clientes;
	private List<Produto> produtos;
	
	public ListagemProdutoGenero(List<Cliente> clientes, List<Produto> produtos) {
		this.clientes = clientes;
		this.produtos = produtos;
	}
	
	public void listar() {
		System.out.println("Listagem de produtos mais consumidos(por genero): ");
		List<Cliente> listahomem = new ArrayList<Cliente>();
		List<Cliente> listamulher = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if(cliente.genero == "masculino") {
				listahomem.add(cliente);
			}else if(cliente.genero == "feminino") {
				listamulher.add(cliente);
			}
		}
		System.out.println("Homens:");
		List<Produto> vendash = new ArrayList<Produto>();
		for (Produto produto : produtos) {
			produto.contarVendas(listahomem);
			if(produto.quant != 0) {vendash.add(produto);}
		}
		Comparator<Produto> cp = new ComparadorProduto();
		Collections.sort(vendash, cp.reversed());
		for (Produto prodserv : vendash) {
			System.out.println(prodserv.nome + " - " + prodserv.quant + " vendidos.");
		}
		System.out.println("=================================");
		System.out.println("Mulheres:");
		List<Produto> vendasm = new ArrayList<Produto>();
		for (Produto produto : produtos) {
			produto.contarVendas(listamulher);
			if(produto.quant != 0) { vendasm.add(produto);}
		}
		Collections.sort(vendasm, cp.reversed());
		for (Produto prodserv : vendasm) {
			System.out.println(prodserv.nome + " - " + prodserv.quant + " vendidos.");
		}
		System.out.println("=================================");
	}

}
