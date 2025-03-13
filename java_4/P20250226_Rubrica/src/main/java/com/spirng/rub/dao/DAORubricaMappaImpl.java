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
 
	@Override
	public boolean insert(entityRubrica rubrica) {
	    String sql = "INSERT INTO rubrica (id, proprietario, anno) VALUES (?, ?, ?)";
	    try (Connection conn = Connessione();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, rubrica.getId());
	        pstmt.setString(2, rubrica.getNomeProprietario());
	        pstmt.setInt(3, rubrica.getAnnoCreazione());
	        int rows = pstmt.executeUpdate();
	        return rows > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	
	

	@Override
	public List<entityRubrica> selectAll() {
	    String sql = "SELECT * FROM rubrica";
	    List<entityRubrica> rubriche = new ArrayList<>();
	    try (Connection conn = Connessione();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {
	        while (rs.next()) {
	            entityRubrica rubrica = new entityRubrica();
	            rubrica.setId(rs.getInt("id"));
	            rubrica.setNomeProprietario(rs.getString("proprietario"));
	            rubrica.setAnnoCreazione(rs.getInt("anno"));
	            rubriche.add(rubrica);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return rubriche;
	}
	


	@Override
	public entityRubrica selectById(Integer idRubrica) {
	    String sql = "SELECT * FROM rubrica WHERE id = ?";
	    try (Connection conn = Connessione();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, idRubrica);
	        try (ResultSet rs = pstmt.executeQuery()) {
	            if (rs.next()) {
	                entityRubrica rubrica = new entityRubrica();
	                rubrica.setId(rs.getInt("id"));
	                rubrica.setNomeProprietario(rs.getString("proprietario"));
	                rubrica.setAnnoCreazione(rs.getInt("anno"));
	                return rubrica;
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public boolean delete(Integer idRubrica) {
	    String sql = "DELETE FROM rubrica WHERE id = ?";
	    try (Connection conn = Connessione();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, idRubrica);
	        int rows = pstmt.executeUpdate();
	        return rows > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
}
	

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


	

