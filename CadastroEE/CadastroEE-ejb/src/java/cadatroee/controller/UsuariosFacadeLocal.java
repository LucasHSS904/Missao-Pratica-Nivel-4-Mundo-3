/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadatroee.controller;

import java.util.List;
import jakarta.ejb.Local;
import cadastroee.model.Usuarios;

/**
 *
 * @author sendi
 */
@Local
public interface UsuariosFacadeLocal {

    void create(Usuarios Usuarios);

    void edit(Usuarios Usuarios);

    void remove(Usuarios Usuarios);

    Usuarios find(Object id);

    List<Usuarios> findAll();

    List<Usuarios> findRange(int[] range);

    int count();
    
}
