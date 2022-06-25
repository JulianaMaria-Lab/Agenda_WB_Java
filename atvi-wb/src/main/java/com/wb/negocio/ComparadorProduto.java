package com.wb.negocio;

import java.util.Comparator;

import com.wb.modelo.Produto;

public class ComparadorProduto implements Comparator<Produto>{
	@Override
	public int compare(Produto p1, Produto p2) {
		if(p1.getQuant() > p2.getQuant()) {
			return 1;
		}else {
			if(p1.getQuant() < p2.getQuant()) {
				return -1;
			}else {
				return 0;
			}
		}
	}

}
