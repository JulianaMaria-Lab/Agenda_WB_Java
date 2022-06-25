package com.wb;

import java.util.ArrayList;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Empresa;
import com.wb.modelo.Produto;
import com.wb.negocio.Atualizar;
import com.wb.negocio.AtualizarCliente;
import com.wb.negocio.AtualizarProduto;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.Excluir;
import com.wb.negocio.ExcluirCliente;
import com.wb.negocio.ExcluirProduto;
import com.wb.negocio.Listagem;
import com.wb.negocio.Listagem5valor;
import com.wb.negocio.ListagemGenero;
import com.wb.negocio.ListagemMaiorConsumo10;
import com.wb.negocio.ListagemMenorConsumo10;
import com.wb.negocio.ListagemProdutoGenero;
import com.wb.negocio.ListagemVendas;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosProdutos;
import com.wb.negocio.RegistroConsumo;

public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		
		List<Produto> lista_produtos = new ArrayList<Produto>();
		Produto p1 = new Produto("Shampoo X", 12.5);
		Produto p2 = new Produto("Condicionador X", 12);
		Produto p3 = new Produto("Esmalte Rosa", 3);
		Produto p4 = new Produto("Hidratante Capilar", 22);
		Produto p5 = new Produto("Óleo de Ricino", 20);
		Produto p6 = new Produto("Creme - Lavanda", 20);
		Produto p7 = new Produto("Creme - Amendoas", 20);
		Produto p8 = new Produto("Esmalte Preto", 3);
		Produto p9 = new Produto("Shampoo Para Caspa", 13);
		Produto p10 = new Produto("Condicionar S", 13);
		Produto p11 = new Produto("Spray fixador", 12);
		Produto p12 = new Produto("Gel para cabelo", 10);
		Produto p13 = new Produto("Shampoo para barba", 16);
		Produto p14 = new Produto("Hidratante Barba", 16);
		Produto p15 = new Produto("Talco para Barba", 18);
		Produto p16 = new Produto("Laque", 20);
		Produto p17 = new Produto("Lixa de Unha", 0.50);
		Produto p18 = new Produto("Alicate para Unha", 15);
		Produto p19 = new Produto("Cortador de Unha", 15);
		Produto p20 = new Produto("Esmalte Roxo", 3);
	 
		lista_produtos.add(p1);lista_produtos.add(p2);lista_produtos.add(p3);lista_produtos.add(p4);lista_produtos.add(p5);
		lista_produtos.add(p6);lista_produtos.add(p7);lista_produtos.add(p8);lista_produtos.add(p9);lista_produtos.add(p10);
		lista_produtos.add(p11);lista_produtos.add(p12);lista_produtos.add(p13);lista_produtos.add(p14);lista_produtos.add(p15);
		lista_produtos.add(p16);lista_produtos.add(p17);lista_produtos.add(p18);lista_produtos.add(p19);lista_produtos.add(p20);

		empresa.setProdutos(lista_produtos); 

		List<Cliente> lista_clientes = new ArrayList<Cliente>();
		Cliente c1 = new Cliente("Juliana Maria", "Juju", new CPF(null, "11111111111"), "feminino");
		c1.getProdutosConsumidos().add(p1);c1.getProdutosConsumidos().add(p2);
		
		Cliente c2 = new Cliente("Maria Juliana","Maju", new CPF(null, "22222222222"), "feminino");
		c2.getProdutosConsumidos().add(p9);c2.getProdutosConsumidos().add(p10);
		
		Cliente c3 = new Cliente("André Luiz", "Dedé", new CPF(null, "33333333333"), "masculino");
		c3.getProdutosConsumidos().add(p12);c3.getProdutosConsumidos().add(p14);
		
		Cliente c4 = new Cliente("Isabela Gabriela","Isa", new CPF(null, "44444444444"), "feminino");
		c4.getProdutosConsumidos().add(p11);c4.getProdutosConsumidos().add(p10);
		
		Cliente c5 = new Cliente("Mauricio Santos", "Mau", new CPF(null, "55555555555"), "masculino");
		c5.getProdutosConsumidos().add(p1);c5.getProdutosConsumidos().add(p10);
		
		Cliente c6 = new Cliente("Carlos Fonseca","Caca", new CPF(null, "66666666666"), "masculino");
		c6.getProdutosConsumidos().add(p1);c6.getProdutosConsumidos().add(p2);
		
		Cliente c7 = new Cliente("Olivia Paiva", "Lili", new CPF(null, "77777777777"), "feminino");
		c7.getProdutosConsumidos().add(p5);c7.getProdutosConsumidos().add(p6);
		
		Cliente c8 = new Cliente("Taina Fernanda","Ná", new CPF(null, "88888888888"), "feminino");
		c8.getProdutosConsumidos().add(p8);c8.getProdutosConsumidos().add(p20);
		
		Cliente c9 = new Cliente("Julia Maria", "Juju Ma", new CPF(null, "99999999999"), "feminino");
		c9.getProdutosConsumidos().add(p1);c9.getProdutosConsumidos().add(p18);
		
		Cliente c10 = new Cliente("Mariana Julia","Mari", new CPF(null, "10101010101"), "feminino");
		c10.getProdutosConsumidos().add(p17);c10.getProdutosConsumidos().add(p16);
		
		Cliente c11 = new Cliente("Cleonice Aparecida","Nice", new CPF(null, "01101101101"), "feminino");
		c11.getProdutosConsumidos().add(p1);c11.getProdutosConsumidos().add(p3);
		
		Cliente c12 = new Cliente("Rafaela Ester","Rafa", new CPF(null, "1212121212"), "feminino");
		c12.getProdutosConsumidos().add(p4);c12.getProdutosConsumidos().add(p7);
		
		Cliente c13 = new Cliente("Luiz Andre","De", new CPF(null, "13131313131"), "masculino");
		c13.getProdutosConsumidos().add(p13);c13.getProdutosConsumidos().add(p15);
		
		Cliente c14 = new Cliente("Bruno Rafael","Buba", new CPF(null, "14141414141"), "masculino");
		c14.getProdutosConsumidos().add(p14);c14.getProdutosConsumidos().add(p15);
		
		Cliente c15 = new Cliente("Bruna Rafaela","Rafinha", new CPF(null, "15151515151"), "feminino");
		c15.getProdutosConsumidos().add(p7);c15.getProdutosConsumidos().add(p19);
		
		Cliente c16 = new Cliente("Luis Henrique","Rick", new CPF(null, "16161616161"), "masculino");
		c16.getProdutosConsumidos().add(p2);c16.getProdutosConsumidos().add(p15);
		
		Cliente c17 = new Cliente("Vanderlei Luis","Nei", new CPF(null, "17171717171"), "masculino");
		c17.getProdutosConsumidos().add(p1);c17.getProdutosConsumidos().add(p14);
		
		Cliente c18 = new Cliente("Ingrid Natasha","Nat", new CPF(null, "18181818181"), "feminino");
		c18.getProdutosConsumidos().add(p4);c18.getProdutosConsumidos().add(p16);
		
		Cliente c19 = new Cliente("Felipe Ribeiro","Fefe", new CPF(null, "19191919191"), "masculino");
		c19.getProdutosConsumidos().add(p14);c19.getProdutosConsumidos().add(p10);
		
		Cliente c20 = new Cliente("Eduardo Henrique","Dudu", new CPF(null, "20202020202"), "masculino");
		c20.getProdutosConsumidos().add(p12);c20.getProdutosConsumidos().add(p13);
		
		Cliente c21 = new Cliente("Henrique Eduardo","Edu", new CPF(null, "21212121212"), "masculino");
		c21.getProdutosConsumidos().add(p12);c21.getProdutosConsumidos().add(p14);
		
		Cliente c22 = new Cliente("Ana Julia","Juju", new CPF(null, "22222222222"), "feminino");
		c22.getProdutosConsumidos().add(p9);c22.getProdutosConsumidos().add(p10);
		
		Cliente c23 = new Cliente("Daniela Cesar","Dani", new CPF(null, "23232323232"), "feminino");
		c23.getProdutosConsumidos().add(p9);c23.getProdutosConsumidos().add(p11);
		
		Cliente c24 = new Cliente("Ana Paula","Aninha", new CPF(null, "24242424242"), "feminino");
		c24.getProdutosConsumidos().add(p7);c24.getProdutosConsumidos().add(p8);
		
		Cliente c25 = new Cliente("Geraldo Antonio","Gege", new CPF(null, "25252525252"), "masculino");
		c25.getProdutosConsumidos().add(p13);c25.getProdutosConsumidos().add(p15);
		
		Cliente c26 = new Cliente("Lucas Santos","Lulu", new CPF(null, "26262626262"), "masculino");
		c26.getProdutosConsumidos().add(p12);c26.getProdutosConsumidos().add(p10);
		
		Cliente c27 = new Cliente("Michael Leite","Mike", new CPF(null, "27272727272"), "masculino");
		c27.getProdutosConsumidos().add(p13);c27.getProdutosConsumidos().add(p14);
		
		Cliente c28 = new Cliente("Jane Ribeiro","Onze", new CPF(null, "28282828282"), "feminino");
		c28.getProdutosConsumidos().add(p2);c28.getProdutosConsumidos().add(p5);
		
		Cliente c29 = new Cliente("Daniel Camargo","Dan", new CPF(null, "29292929292"), "masculino");
		c29.getProdutosConsumidos().add(p12);c29.getProdutosConsumidos().add(p13);
		
		Cliente c30 = new Cliente("Maxine Ramos","Max", new CPF(null, "30303030303"), "feminino");
		c30.getProdutosConsumidos().add(p3);c30.getProdutosConsumidos().add(p10);
		
		lista_clientes.add(c1);lista_clientes.add(c2);lista_clientes.add(c3);lista_clientes.add(c4);lista_clientes.add(c5);
		lista_clientes.add(c6);lista_clientes.add(c7);lista_clientes.add(c8);lista_clientes.add(c9);lista_clientes.add(c10);
		lista_clientes.add(c11);lista_clientes.add(c12);lista_clientes.add(c13);lista_clientes.add(c14);lista_clientes.add(c15);
		lista_clientes.add(c16);lista_clientes.add(c17);lista_clientes.add(c18);lista_clientes.add(c19);lista_clientes.add(c20);
		lista_clientes.add(c21);lista_clientes.add(c22);lista_clientes.add(c23);lista_clientes.add(c24);lista_clientes.add(c25);
		lista_clientes.add(c26);lista_clientes.add(c27);lista_clientes.add(c28);lista_clientes.add(c29);lista_clientes.add(c30);
		empresa.setClientes(lista_clientes);
		

		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Atualizar dados de Cliente");
			System.out.println("4 - Excluir Cliente");
			System.out.println("5 - Cadastrar Produto");
			System.out.println("6 - Listar todos os Produtos");
			System.out.println("7 - Atualizar dados de Produtos");
			System.out.println("8 - Deletar Produto");
			System.out.println("9 - Registrar Consumo");
			System.out.println("10 - Listagem de Clientes por Genero");
			System.out.println("11 - Lista dos 10 Maiores Consumidores (quantidade)");
			System.out.println("12 - Lista dos 10 Menores Consumidores (quantidade)");
			System.out.println("13 - Lista dos 5 Maiores Consumidores (valores)");
			System.out.println("14 - Listagem geral dos Produtos Mais Consumidos");
			System.out.println("15 - Lista dos Produtos Mais Consumidos por Genero");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				Cadastro cadastro = new CadastroCliente(empresa.getClientes());
				cadastro.cadastrar();
				break;
			case 2:
				Listagem listagem = new ListarTodosClientes(empresa.getClientes());
				listagem.listar();
				break;
			case 3:
				Atualizar atualizar_cliente = new AtualizarCliente(empresa.getClientes());
				atualizar_cliente.atualizar();
				break;
			case 4:
				Excluir excluir = new ExcluirCliente(empresa.getClientes());
				excluir.excluir();
				break;
			case 5:
				Cadastro cadastro_produto = new CadastroProduto(empresa.getProdutos());
				cadastro_produto.cadastrar();
				break;
			case 6:
				Listagem listagem_produto = new ListarTodosProdutos(empresa.getProdutos());
				listagem_produto.listar();
				break;
			case 7:
				Atualizar atualizar_produto = new AtualizarProduto(empresa.getProdutos());
				atualizar_produto.atualizar();
				break;
			case 8:
				Excluir excluir_produto = new ExcluirProduto(empresa.getProdutos());
				excluir_produto.excluir();
				break;
			case 9:
				RegistroConsumo registroconsumo = new RegistroConsumo(empresa.getClientes(), empresa.getProdutos());
				registroconsumo.registrarConsumo();
				break;
			case 10:
				Listagem listagenero = new ListagemGenero(empresa.getClientes());
				listagenero.listar();
			case 11:
				Listagem lista10maior_consumo = new ListagemMaiorConsumo10(empresa.getClientes());
				lista10maior_consumo.listar();
				break;
			case 12:
				Listagem lista10menor_consumo = new ListagemMenorConsumo10(empresa.getClientes());
				lista10menor_consumo.listar();
				break;
			case 13:
				Listagem lista5maior_valor = new Listagem5valor(empresa.getClientes());
				lista5maior_valor.listar();
				break;
			case 14:
				Listagem lista_vendaprod = new ListagemVendas(empresa.getClientes(), empresa.getProdutos());
				lista_vendaprod.listar();
				break;
			case 15:
				Listagem lista_prod_genero = new ListagemProdutoGenero(empresa.getClientes(), empresa.getProdutos());
				lista_prod_genero.listar();
				break;
			default:
				System.out.println("Operação não identificada");
			}
		}
	}
}