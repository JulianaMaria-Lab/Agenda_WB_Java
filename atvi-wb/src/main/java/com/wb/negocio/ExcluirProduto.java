package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class ExcluirProduto extends Excluir{
	private List<Produto> produtos;
	private Entrada entrada;
	
	public ExcluirProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	
	@Override
	public void excluir() {
		System.out.println("Digite o c�digo do produto a ser exclu�do: ");
		int cod = entrada.receberNumeroInteiro();
		produtos.remove(cod);
		System.out.println("Registro exclu�do com sucesso! ");
		System.out.println("=================================");
	}

}
