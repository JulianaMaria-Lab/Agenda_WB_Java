package com.wb.negocio;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;

public class Listagem5valor extends Listagem{
	private List<Cliente> clientes;
	
	public Listagem5valor(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@Override
	public void listar() {
		System.out.println("Listagem dos 5 clientes que mais consumiram (em valores)");
		Comparator<Cliente> cv = new ComparadorValor();
		Collections.sort(clientes, cv.reversed());
		for(int i = 0; i<5; i++) {
			System.out.println((i+1) + ": " + clientes.get(i).nome + " (R$" + clientes.get(i).valorConsumo() + ")");
		}
	}
}
