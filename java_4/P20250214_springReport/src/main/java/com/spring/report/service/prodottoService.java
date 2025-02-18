package com.spring.report.service;

import java.util.List;

import com.spring.report.dao.DAOprodottoMappa;
import com.spring.report.dto.ProdottoNoIdDTO;
import com.spring.report.dto.ReportDTO;
import com.spring.report.dto.prodottoDTO;
import com.spring.report.entity.prodotto;
import com.spring.report.utility.calcoliReport;
import com.spring.report.utility.conversioni;

public class prodottoService {
	
	private DAOprodottoMappa dao = new DAOprodottoMappa();
	
	public boolean caricaProdotto(prodottoDTO dto) {
		
		prodotto entity = conversioni.daProdottoDTOProdotto(dto);
		
		return dao.insert(entity);
	}
	
	public List<ProdottoNoIdDTO> listaProdotti(){
		List<prodotto> lista_prodotti = dao.selectAll();
		return conversioni.lista(lista_prodotti);
	}
	
	public prodottoDTO cercaPerId(int id) {
		prodotto prod = dao.selectById(id);
		
		if (prod != null) {
			prodottoDTO prod_dto = conversioni.daProdottoAProdottoDTO(prod);
			return prod_dto;
		}
		return null;
	}
	
	
	
	
		public ReportDTO getReport() {
			
			List<prodotto> list_prod = dao.selectAll();		
			ReportDTO reportDTO = new ReportDTO();
			
			//inserimento descrizioni
			reportDTO.setDescrizioni(calcoliReport.getDescrizioni(list_prod));
			
			//inserimento della somma dei pezzi prodotti
			reportDTO.setN_pezzi_disp(calcoliReport.sumQuantita(list_prod));
			
			//numeri totali dei prod non disponibili
			reportDTO.setN_pezzi_NonDisp(calcoliReport.numProdNonDisp(list_prod));
			
			//media delli prezzi consigliati
			reportDTO.setMedia_prez(calcoliReport.mediaPrezzi(list_prod));
			
			//inserimento lista di nomi dei prodotti non disponibili
			reportDTO.setProdottiNonDisponibili(calcoliReport.listaProdNonDisp(list_prod));
				
			return reportDTO;
		}

}
