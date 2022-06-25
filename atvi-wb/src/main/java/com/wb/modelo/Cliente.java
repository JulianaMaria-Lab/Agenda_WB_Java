package com.wb.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;

public class Cliente{
	private Entrada entrada;
	public String nome;
	public String nomeSocial;
	private CPF cpf;
	private List<RG> rgs;
	private LocalDate dataCadastro;
	private List<Telefone> telefones;
	public String genero; 
	private List<Produto> produtosConsumidos;
	public Cliente(String nome, String nomeSocial, CPF cpf, String genero) {
		this.entrada = new Entrada();
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.rgs = new ArrayList<>();
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<>();
		this.genero = genero;
		this.produtosConsumidos = new ArrayList<>();
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public CPF getCpf() {
		return cpf;
	}
	public List<RG> getRgs() {
		return rgs;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public List<Produto> getProdutosConsumidos() {
		return produtosConsumidos;
	}
	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}
	public void setRgs(List<RG> rgs) {
		this.rgs = rgs;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public void setProdservConsumidos(List<Produto> produtosConsumidos) {
		this.produtosConsumidos = produtosConsumidos;
	}
	public void cadastrarRGs(){
		System.out.println("Cadastrar novo RG? (s/n)");
		String resposta = entrada.receberTexto();
		switch(resposta) {
		case "s":
			System.out.println("Informe o numero do RG: ");
			String numero = entrada.receberTexto();
			System.out.println("Informe a data de emissao, no padrao dd/mm/aaaa: ");
			String data = entrada.receberTexto();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataEmissao = LocalDate.parse(data, formato);
			RG rg = new RG(dataEmissao, numero);
			getRgs().add(rg);
			cadastrarRGs();
		case "n":
			break;
		default:
			System.out.println("Resposta invalida! Digite s ou n. ");
			cadastrarRGs();
		}
	}
	public void cadastrarTel(){
		System.out.println("Cadastrar novo Telefone? (s/n)");
		String resposta = entrada.receberTexto();
		switch(resposta) {
		case "s":
			System.out.println("Informe o numero do DDD: ");
			String ddd = entrada.receberTexto();
			System.out.println("Informe o numero do telefone: ");
			String numero = entrada.receberTexto();
			Telefone tel = new Telefone(ddd, numero);
			getTelefones().add(tel);
			cadastrarTel();
		case "n":
			break;
		default:
			System.out.println("Resposta invalida! Digite s ou n. ");
			cadastrarTel();
		}
	}
	public void alterarNomeSocial() {
		System.out.println("Digite o novo nome social:");
		String novonome = entrada.receberTexto();
		setNomeSocial(novonome);
		System.out.println("Nome social alterado");
	}
	public void alterarGenero() {
		if(getGenero() == "homem") {
			setGenero("mulher");
		}else if(getGenero() == "mulher") {
			setGenero("homem");
		}
		System.out.println("Genero alterado!");
		System.out.println("=================================");
	}
	public void incluirNovoTel() {
		System.out.println("Digite o DDD do novo telefone: ");
		String novoddd = entrada.receberTexto();
		System.out.println("Digite o numero do novo telefone: ");
		String novonum = entrada.receberTexto();
		Telefone novotel = new Telefone(novoddd, novonum);
		getTelefones().add(novotel);
		System.out.println("Novo telefone cadastrado!");
		System.out.println("=================================");
	}
	public void venda(Produto produto) {
		getProdutosConsumidos().add(produto);
	}
	public double valorConsumo() {
		double total = 0;
		for (Produto produto : produtosConsumidos) {
			total = total + produto.valor;
		}
		return total;
	}
}