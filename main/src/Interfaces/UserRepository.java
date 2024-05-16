package Interfaces;

import java.util.List;

import Modelos.Paciente;

public interface UserRepository {
	//prototipos de metodos 
    List<Paciente> getAllUsers(); // llama a todos los usuarios de la bdd
    
    Paciente getUserById(int id); //llama solo a uno, por su id
    
    void addUser(Paciente user); //añade usuarios a la bdd
    
    void updateUser(Paciente user); //actualiza los usuarios de la bdd
    
    void deleteUser(int id); //eliminar usuarios de la bdd
}
