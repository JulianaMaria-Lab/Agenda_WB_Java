package com.wb.negocio;

import java.util.Comparator;

import com.wb.modelo.Cliente;

public class ComparadorValor implements Comparator<Cliente>{
	
	@Override
	public int compare(Cliente o1, Cliente o2) {
		if(o1.valorConsumo() > o2.valorConsumo()) {
			return 1;
		}else {
			if(o1.valorConsumo() < o2.valorConsumo()) {
				return -1;
			}else {
				return 0;
			}
		}
	}

}
