package com.wb.modelo;

import java.util.List;

import com.wb.io.Entrada;

public class Produto {
	private Entrada entrada;
	public int codigo;
	public String nome;
	public double valor;
	public int quant;
	public Produto(String nome, double valor) {
		this.entrada = new Entrada();
		this.nome = nome;
		this.valor = valor;
	}
	
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double unidade) {
		this.valor = unidade;
	}
	public void alterarNomeProd() {
		System.out.println("Digite o novo nome do produto:");
		String novonome = entrada.receberTexto();
		setNome(novonome);
		System.out.println("Nome do produto atualizado!");
		System.out.println("=================================");
	}
	public void alterarValor() {
		System.out.println("Digite a nova quantidade do produto:");
		double novovalor = entrada.receberNumeroDouble();
		setValor(novovalor);
		System.out.println("Quantidade do produto atualizado!");
		System.out.println("=================================");
	}
	public int contarVendas(List<Cliente> c) {
		int cont = 0;
		for (Cliente cliente : c) {
			for (Produto p : cliente.getProdutosConsumidos()) {
				if(p.nome == getNome()) {
					cont = cont + 1;
				}
			}
		}
		setQuant(cont);
		return cont;
	}
	
}