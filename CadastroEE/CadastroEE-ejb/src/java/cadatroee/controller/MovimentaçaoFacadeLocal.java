/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadatroee.controller;

import java.util.List;
import jakarta.ejb.Local;
import cadastroee.model.Movimentaçao;

/**
 *
 * @author sendi
 */
@Local
public interface MovimentaçaoFacadeLocal {

    void create(Movimentaçao Movimentaçao);

    void edit(Movimentaçao Movimentaçao);

    void remove(Movimentaçao Movimentaçao);

    Movimentaçao find(Object id);

    List<Movimentaçao> findAll();

    List<Movimentaçao> findRange(int[] range);

    int count();
    
}
