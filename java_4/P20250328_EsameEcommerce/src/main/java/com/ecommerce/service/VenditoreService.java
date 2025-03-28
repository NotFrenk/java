package com.ecommerce.service;

import com.ecommerce.dto.VenditoreDTO;
import com.ecommerce.dto.VenditoreSenzaProdDTO;

public interface VenditoreService {
	public boolean inserisciVenditore(VenditoreDTO dto);
	public VenditoreDTO visualizzaVenditoreId (Integer idVenditore);
	public VenditoreSenzaProdDTO visualizzaSenzaProdotti(Integer idVenditore);
	public VenditoreDTO modificaPassword(Integer idVenditore, String nuovaPassword);
	
	
}
