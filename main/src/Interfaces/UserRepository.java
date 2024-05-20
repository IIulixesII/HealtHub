package Interfaces;

import java.util.List;

import Modelos.pacientes;

public interface UserRepository {
	//prototipos de metodos 
    List<pacientes> getAllUsers(); // llama a todos los usuarios de la bdd
    
    pacientes getUserById(int id); //llama solo a uno, por su id
    
    void addUser(pacientes user); //añade usuarios a la bdd
    
    void updateUser(pacientes user); //actualiza los usuarios de la bdd
    
    void deleteUser(int id); //eliminar usuarios de la bdd
}
