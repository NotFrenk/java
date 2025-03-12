package com.spirng.rub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

	public Connection Connessione() {
		try

		{

// PUNTO 1 : Carico i driver in memoria
			String driver = "org.postgresql.Driver";
			Class.forName(driver);

// PUNTO 2 : Creo url di connessione
			String url = "jdbc:postgresql://localhost:5432/rubrica?user=postgres&password=postgres&ssl=false";

// PUNTO 3 : Connetto al database
	
			return DriverManager.getConnection(url);

		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Errore della connessione");
			return null;
		}

	}

	public boolean insert(entityRubrica rubrica) {
		// PUNTO 4	
		Connection conn = Connessione();
		String myquery = "INSERT INTO rubrica (id,proprietario,anno) VALUES(?,?,?);";
		PreparedStatement prep;
		try {
			prep = conn.prepareStatement(myquery);
			prep.setInt(1, rubrica.getId());
			prep.setString(2, rubrica.getNomeProprietario());
			prep.setInt(3, rubrica.getAnnoCreazione());
			// PUNTO 5 : eseguire la QUERY
			prep.execute();
		}catch (SQLException e) {
			throw new RuntimeException("operazioine fallita");
		}
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
///
///		try {
			
		
		
		
		
		
		

//		
//		
//		// PUNTO 4
//		// PREPAREDSTATEMENT
//		String miaquery = " select * from public.anagrafica where nome = ? ";
//		PreparedStatement prep = conn.prepareStatement(miaquery);
//		prep.setString(0, nominativo);
//		
//		
//		// PUNTO 5 : eseguire la QUERY
//		ResultSet risultato = prep.executeQuery(); // select
//		// insert / update / delete ...
//		// prep.execute();
//		
//		// PUNTO 6 : elaboro i dati
//		while(risultato.next()) {
//			System.out.println("Risultato : " + risultato.getString("nome") + risultato.getString("cognome"));
//		}
//		
//		// PUNTO 7 : chiudo la connessione 
//		risultato.close();
//		prep.close();
//		conn.close();
//		
//		}catch(ClassNotFoundException | SQLException ex) {
//			System.out.println("Errore della connessione");
//		}


	}

}