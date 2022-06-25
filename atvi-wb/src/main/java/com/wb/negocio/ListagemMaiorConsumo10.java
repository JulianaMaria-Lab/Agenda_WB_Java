package com.wb.negocio;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;

public class ListagemMaiorConsumo10 extends Listagem {
	private List<Cliente> clientes;
	
	public ListagemMaiorConsumo10(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("Listagem dos 10 clientes que mais consumiram (quantidade de produtos)");
		Comparator<Cliente> comp = new ComparadorQuantProduto();
		Collections.sort(clientes, comp.reversed());
		for(int i = 0; i <10; i++) {
			System.out.println((i + 1) + " - " + clientes.get(i).nomeSocial);
		}		
	}

}
