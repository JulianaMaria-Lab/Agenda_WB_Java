package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class CadastroProduto extends Cadastro{
	private List<Produto> produtos;
	private Entrada entrada;
	
	public CadastroProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Cadastro de Produtos");
		System.out.println("Por favor informe o nome/descrição do Produto:");
		String nome = entrada.receberTexto();
		System.out.println("Por favor informe o valor unitario do Produto:");
		double valor = entrada.receberNumeroDouble();
		Produto produto = new Produto(nome, valor);
		this.produtos.add(produto);
	}

}
