package Dia_16.jbdc.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

import Dia_16.jbdc.modello.Persona;
import Dia_16.jbdc.persistenza.DAOException;
import Dia_16.jbdc.persistenza.DBUtil;
import Dia_16.jbdc.persistenza.PersonaDAO;

public class PersonaDAOImpl implements PersonaDAO {
	private static final Statement DataSource = null;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss");

	@Override
	public void save(Persona persona) throws DAOException {

		String SQL = "INSERT INTO Persona (CF, nome, cognome, data_nascita) VALUES (?, ?, ?, ?)";

		System.out.println(SQL);
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = Dia_16.jbdc.persistenza.DataSource.getConnection();
			statement = connection.prepareStatement(SQL, new String[] { "id" });
			statement.setString(1, persona.getCF());
			statement.setString(2, persona.getNome());
			statement.setString(3, persona.getCognome());
			statement.setTimestamp(4, Timestamp.valueOf(persona.getData_nascita()));
			statement.executeUpdate();
			ResultSet generateKeys = statement.getGeneratedKeys();

			if (generateKeys.next()) {
				persona.setId(generateKeys.getInt(1));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		} finally {
			DBUtil.close(statement);
			DBUtil.close(connection);
		}
	}

}