package Dia_16.jbdc.persistenza;

import Dia_16.jbdc.modello.Persona;

public interface PersonaDAO {

	public void save(Persona persona) throws DAOException;

//	void update(Persona persona) throws DAOExection;
//
//	void delete(int persona) throws DAOExection;
//
//	Persona findById(int id) throws DAOExection;
//
//	List<Persona> findAll() throws DAOExection;
//
//	Persona findByCF(String CF) throws DAOExection;
//
//	List<Persona> findByNome(String nome) throws DAOExection;
//
//	List<Persona> findByCognome(String cognome) throws DAOExection;
//
//	long count() throws DAOExection;
//
//	List<Persona> findByAnno(String annoNascita) throws DAOExection;
}