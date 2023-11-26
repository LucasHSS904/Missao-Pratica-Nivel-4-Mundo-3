/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadatroee.controller;

import java.util.List;
import jakarta.ejb.Local;
import cadastroee.model.PessoasJuridicas;

/**
 *
 * @author sendi
 */
@Local
public interface PessoasJuridicasFacadeLocal {

    void create(PessoasJuridicas PessoasJuridicas);

    void edit(PessoasJuridicas PessoasJuridicas);

    void remove(PessoasJuridicas PessoasJuridicas);

    PessoasJuridicas find(Object id);

    List<PessoasJuridicas> findAll();

    List<PessoasJuridicas> findRange(int[] range);

    int count();
    
}
