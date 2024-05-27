package Interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Paciente;
import controlador.DatabaseConnection;

public class PacienteControlador implements UserRepository {
   private final Connection connection;

    public PacienteControlador() {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    @Override
    public List<Paciente> getAllUsers() {
        List<Paciente> users = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM paciente ");
            ResultSet resultSet = statement.executeQuery();
       
            while (resultSet.next()) {
            	Paciente user = new Paciente(resultSet.getInt("id"), resultSet.getString("nombre"), resultSet.getInt("dni"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public Paciente getUserById(int id) {
    	Paciente user = null;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM paciente WHERE id = ?");
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                user = new Paciente(resultSet.getInt("id"), resultSet.getString("nombre"), resultSet.getInt("dni"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

	@Override
    public void addUser(Paciente paciente) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO paciente (nombre, dni) VALUES (?, ?)");
            statement.setString(1, paciente.getNombre());
            statement.setInt(2, paciente.getDni());
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("paciente insertado exitosamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	@Override
    public void updateUser(Paciente paciente) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE paciente SET nombre = ?, dni = ? WHERE id = ?");
            statement.setString(1, paciente.getNombre());
            statement.setInt(2, paciente.getDni());
            statement.setInt(3, paciente.getId());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Usuario actualizado exitosamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM paciente WHERE id = ?");
            statement.setInt(1, id);
            
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Usuario eliminado exitosamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	

  
}
