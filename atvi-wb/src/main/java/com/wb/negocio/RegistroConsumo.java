package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;


public class RegistroConsumo {
	private List<Cliente> clientes;
	private List<Produto> produtos;
	private Entrada entrada;
	
	public RegistroConsumo(List<Cliente> clientes, List<Produto> produtos) {
		this.clientes = clientes;
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	public void registrarConsumo() {
		System.out.println("Digite o codigo do cliente: ");
		int codigo_cliente = entrada.receberNumeroInteiro();
		Cliente cliente = clientes.get(codigo_cliente);
		System.out.println("Digite o codigo do produto: ");
		int codigo_produto = entrada.receberNumeroInteiro();
		Produto produto = produtos.get(codigo_produto);
		cliente.venda(produto);
		System.out.println("Consumo registrado com sucesso!");
		}
}


