/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadatroee.controller;

import java.util.List;
import jakarta.ejb.Local;
import cadastroee.model.Produtos;

/**
 *
 * @author sendi
 */
@Local
public interface ProdutosFacadeLocal {

    void create(Produtos Produtos);

    void edit(Produtos Produtos);

    void remove(Produtos Produtos);

    Produtos find(Object id);

    List<Produtos> findAll();

    List<Produtos> findRange(int[] range);

    int count();
    
}
