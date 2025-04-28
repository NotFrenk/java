package com.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.dao.DaoVenditore;
import com.ecommerce.dto.VenditoreDTO;
import com.ecommerce.dto.VenditoreSenzaProdDTO;
import com.ecommerce.entity.VenditoreEntity;
import com.ecommerce.utility.Conversioni;

@Service
@Transactional
public class VenditoreServiceImp implements VenditoreService {

	@Autowired
	private DaoVenditore dao;

	@Override
	public boolean inserisciVenditore(VenditoreDTO dto) {

		VenditoreEntity venditore = Conversioni.FromVenditoreDTOToVenditoreEntity(dto);
		dao.save(venditore);
		return true;
	}

	@Override
	public VenditoreDTO visualizzaVenditoreId(Integer idVenditore) {
		Optional<VenditoreEntity> opt = dao.findById(idVenditore);
		if (opt.isPresent()) {
			VenditoreEntity venditore = opt.get();
			return Conversioni.FromVenditoreEntiryToVenditoreDTO(venditore);
		}
		return null;
	}

	@Override
	public VenditoreSenzaProdDTO visualizzaSenzaProdotti(Integer idVenditore) {
		Optional<VenditoreEntity> opt = dao.findById(idVenditore);
		if (opt.isPresent()) {
			VenditoreEntity venditore = opt.get();
			return Conversioni.FromVenditoreEntiryToVenditoreSenzaProdDTO(venditore);
		}
		return null;
	}

	@Override
	public VenditoreDTO modificaPassword(Integer idVenditore, String nuovaPassword) {
		Optional<VenditoreEntity> opt = dao.findById(idVenditore);
		if (opt.isPresent()) {
			VenditoreEntity venditore = opt.get();
			venditore.setPassword(nuovaPassword);
			return Conversioni.FromVenditoreEntiryToVenditoreDTO(venditore);
		}
		return null;
	}

}
