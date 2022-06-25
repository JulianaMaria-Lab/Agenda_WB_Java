package com.wb.modelo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes;
	private List<Produto> produtos;
	public Empresa() {
		this.clientes = new ArrayList<>();
		this.produtos = new ArrayList<>();
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}