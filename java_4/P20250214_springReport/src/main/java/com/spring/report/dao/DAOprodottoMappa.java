package com.spring.report.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.report.entity.prodotto;

public class DAOprodottoMappa {
	
	private Map<Integer, prodotto> mappa = new HashMap<>();

	public boolean insert(prodotto prodotto) {
		if(mappa.containsKey(prodotto.getId()))
			return false;
		
		mappa.put(prodotto.getId(), prodotto);
		return true;
	}
	
	public List<prodotto> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public prodotto selectById(Integer idprodotto) {
		return mappa.get(idprodotto);
	}
	
	public boolean delete(Integer idprodotto) {
		prodotto prod = mappa.remove(idprodotto);
		return prod!=null;
	}
}
