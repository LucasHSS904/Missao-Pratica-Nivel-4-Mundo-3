/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadatroee.controller;

import java.util.List;
import jakarta.ejb.Local;
import cadastroee.model.Pessoas;

/**
 *
 * @author sendi
 */
@Local
public interface PessoasFacadeLocal {

    void create(Pessoas Pessoas);

    void edit(Pessoas Pessoas);

    void remove(Pessoas Pessoas);

    Pessoas find(Object id);

    List<Pessoas> findAll();

    List<Pessoas> findRange(int[] range);

    int count();
    
}
