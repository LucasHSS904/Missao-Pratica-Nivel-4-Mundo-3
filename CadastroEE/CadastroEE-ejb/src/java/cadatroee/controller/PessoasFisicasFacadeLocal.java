/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadatroee.controller;

import java.util.List;
import jakarta.ejb.Local;
import cadastroee.model.PessoasFisicas;

/**
 *
 * @author sendi
 */
@Local
public interface PessoasFisicasFacadeLocal {

    void create(PessoasFisicas PessoasFisicas);

    void edit(PessoasFisicas PessoasFisicas);

    void remove(PessoasFisicas PessoasFisicas);

    PessoasFisicas find(Object id);

    List<PessoasFisicas> findAll();

    List<PessoasFisicas> findRange(int[] range);

    int count();
    
}
