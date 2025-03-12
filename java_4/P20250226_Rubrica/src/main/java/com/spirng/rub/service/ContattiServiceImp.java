package com.spirng.rub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spirng.rub.dao.DAORubricaMappaImpl;
import com.spirng.rub.dto.ContattoDTO;
import com.spirng.rub.entity.entityContattoTelefonico;
import com.spirng.rub.entity.entityRubrica;
import com.spirng.rub.utility.Conversioni;

public class ContattiServiceImp implements ContattiService{
	@Autowired
	public DAORubricaMappaImpl dao;
	
	
//	Inserisci nuovo contatto
	public boolean aggiungiContatto(int idRubrica, ContattoDTO dto) {
		entityRubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			entityContattoTelefonico contatto = Conversioni.daContattoDTOAContatto(dto);
			rubrica.getContatti().add(contatto);
			return true;
		}
		return false;
	}
	
//	Visualizza un contatto per id
	public ContattoDTO visualizzaContattoPerId (int idRubrica, int idContatto) {
		entityRubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			for (entityContattoTelefonico contatto : rubrica.getContatti()) {
				if (contatto.getIdContatto() == idContatto) {
					return Conversioni.daEntityContattoAContattoDTO(contatto);
				}
				throw new RuntimeException("Contatto non esistente");
			}
		}
		return null;
	}
	
//	Modifica un contatto esistente (tutti i campi tranne la chiave primaria)
	public ContattoDTO modificaContatto(int idRubrica, int idContatto, ContattoDTO dto) {
		entityRubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			for (entityContattoTelefonico contatto : rubrica.getContatti()) {
				if (contatto.getIdContatto() == idContatto) {
					contatto.setNome(dto.getNome());
					contatto.setCognome(dto.getCognome());
					contatto.setGruppoAppartenenza(dto.getGruppoAppartenenza());
					contatto.setDataNascita(dto.getDataNascita());
					contatto.setPreferito(dto.isPreferito());
					return Conversioni.daEntityContattoAContattoDTO(contatto);
				}
				throw new RuntimeException("Contatto non esistente");
			}
		}
		return null;
	}

	
	//	Cancella un contatto esistente
	public boolean cancellaContatto(int idRubrica, int idContatto) {
		entityRubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			List<entityContattoTelefonico> contatti = rubrica.getContatti();
			for (int i = 0; i<contatti.size(); i ++) {
				if (contatti.get(i).getIdContatto() == idContatto) {
					contatti.remove(i);
					return true;
				}
				throw new RuntimeException("conttatto non esistente");
			}
		}
		return false;
	}
	
//	Visualizza tutti i contatti registrati
	public List<ContattoDTO> visualizzaContatti(int idRubrica) {
	    entityRubrica rubrica = dao.selectById(idRubrica);
	    if (rubrica != null) {
	        List<ContattoDTO> contattiDTO = new ArrayList<>();
	        for (entityContattoTelefonico contatto : rubrica.getContatti()) {
	            contattiDTO.add(Conversioni.daEntityContattoAContattoDTO(contatto));
	        }
	        return contattiDTO;
	    }
	    return null;
	}
	
//	Visualizza il numero di contatti registrati
	public int visualizzaNumeroContatti(int idRubrica) {
	    entityRubrica rubrica = dao.selectById(idRubrica);
	    if (rubrica != null) {
	        return rubrica.getContatti().size();
	    }
	    return 0;
	}
	
//	Visualizza il contatto con un dato numero
	public ContattoDTO visualizzaContattoPerNumero(int idRubrica, int numero) {
	    entityRubrica rubrica = dao.selectById(idRubrica);
	    if (rubrica != null) {
	        for (entityContattoTelefonico contatto : rubrica.getContatti()) {
	            if (contatto.getTelefono() == numero) {
	                return Conversioni.daEntityContattoAContattoDTO(contatto);
	            }
	        }
	    }
	    return null;
	}
	
	
//	Ricerca il nome e il cognome dei contatti di un dato gruppo
	public List<String> ricercaContattiPerGruppo(int idRubrica, String gruppo) {
	    entityRubrica rubrica = dao.selectById(idRubrica);
	    if (rubrica != null) {
	        List<String> nomiCognomi = new ArrayList<>();
	        for (entityContattoTelefonico contatto : rubrica.getContatti()) {
	            if (contatto.getGruppoAppartenenza().equals(gruppo)) {
	                nomiCognomi.add(contatto.getNome() + " " + contatto.getCognome());
	            }
	        }
	        return nomiCognomi;
	    }
	    return null;
	}
	
//	Ricerca il numero di contatti di un dato gruppo
	public int ricercaNumeroContattiPerGruppo(int idRubrica, String gruppo) {
	    entityRubrica rubrica = dao.selectById(idRubrica);
	    if (rubrica != null) {
	        int count = 0;
	        for (entityContattoTelefonico contatto : rubrica.getContatti()) {
	            if (contatto.getGruppoAppartenenza().equals(gruppo)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    return 0;
	}
//	Cancella un gruppo di una rubrica (cioè tutti i contatti appartenenti ad un dato gruppo)
	public boolean cancellaGruppo(int idRubrica, String gruppo) {
	    entityRubrica rubrica = dao.selectById(idRubrica);
	    if (rubrica != null) {
	        List<entityContattoTelefonico> contatti = rubrica.getContatti();
	        boolean rimosso = false;
	        for (int i = 0; i < contatti.size(); i++) {
	            if (contatti.get(i).getGruppoAppartenenza().equals(gruppo)) {
	                contatti.remove(i);
	                i--; // Correggiamo l'indice dopo la rimozione
	                rimosso = true;
	            }
	        }
	        return rimosso;
	    }
	    return false;
	}
	
//	Modifica un contatto da NON preferito a preferito
	public ContattoDTO modificaPreferito(int idRubrica, int idContatto) {
	    entityRubrica rubrica = dao.selectById(idRubrica);
	    if (rubrica != null) {
	        for (entityContattoTelefonico contatto : rubrica.getContatti()) {
	            if (contatto.getIdContatto() == idContatto) {
	                contatto.setPreferito(true);
	                return Conversioni.daEntityContattoAContattoDTO(contatto);
	            }
	        }
	    }
	    return null;
	}
//	Ricerca tutti i preferiti
	public List<ContattoDTO> ricercaPreferiti(int idRubrica) {
	    entityRubrica rubrica = dao.selectById(idRubrica);
	    if (rubrica != null) {
	        List<ContattoDTO> preferiti = new ArrayList<>();
	        for (entityContattoTelefonico contatto : rubrica.getContatti()) {
	            if (contatto.isPreferito()) {
	                preferiti.add(Conversioni.daEntityContattoAContattoDTO(contatto));
	            }
	        }
	        return preferiti;
	    }
	    return null;
	}


}
