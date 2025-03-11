package com.spirng.rub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spirng.rub.entity.entityRubrica;

@Repository
public class DAORubricaMappaImpl implements DAORubricaMappa {

	public void Connessione() {
		try

		{

// PUNTO 1 : Carico i driver in memoria
			String driver = "org.postgresql.Driver";
			Class.forName(driver);

// PUNTO 2 : Creo url di connessione
			String url = "jdbc:postgresql://localhost:5432/rubrica?user=postgres&password=postgres&ssl=false";

// PUNTO 3 : Connetto al database
			Connection conn = DriverManager.getConnection(url);
		
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Errore della connessione");
		}
		
	}

	public boolean insert(entityRubrica rubrica) {
		if (mappa.containsKey(rubrica.getId()))
			return false;

		mappa.put(rubrica.getId(), rubrica);
		return true;
	}	
	

	public List<entityRubrica> selectAll() {
		return new ArrayList<>(mappa.values());
	}

	public entityRubrica selectById(Integer idRubrica) {
		return mappa.get(idRubrica);
	}

	public boolean delete(Integer idRubrica) {
		entityRubrica rubrica = mappa.remove(idRubrica);
		return rubrica != null;
	}
	{
		
//
//// PUNTO 4 : conn 
//// STATEMENT ....query SENZA parametri 10%
//// PREPAREDSTATEMENT.... query SET parametri90%
//
//// STATEMENT
//			Statement stm = conn.createStatement();
//
////// PUNTO 5 : eseguire la QUERY
////String miaquery = "select * from public.anagrafica";
////ResultSet risultato = stm.executeQuery(miaquery);
////
////// PUNTO 6 : elaboro i dati
////while(risultato.next()) {
////System.out.println("Risultato : " + risultato.getString("nome") + risultato.getString("cognome"));
////}
////
////// PUNTO 7 : chiudo la connessione 
////risultato.close();
////stm.close();
////conn.close();

		

	}

}