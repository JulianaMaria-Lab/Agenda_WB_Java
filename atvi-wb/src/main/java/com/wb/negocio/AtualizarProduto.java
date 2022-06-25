package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class AtualizarProduto extends Atualizar{
	private List<Produto> produtos;
	private Entrada entrada;
	
	public AtualizarProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	
	@Override
	public void atualizar() {
		System.out.println("Digite o código do produto que deseja alterar: ");
		int codigo = entrada.receberNumeroInteiro();
		Produto produto = produtos.get(codigo);
		System.out.println("Produto  escolhido: " + produto.nome);
		System.out.println("Selecione a opção:");
		System.out.println("1 - Corrigir nome do produto");
		System.out.println("2 - Alterar unidade");
		int opcao = entrada.receberNumeroInteiro();
		switch(opcao) {
		case 1:
			produto.alterarNomeProd();
			break;
		case 2:
			produto.alterarValor();
			break;
		}
	}
}