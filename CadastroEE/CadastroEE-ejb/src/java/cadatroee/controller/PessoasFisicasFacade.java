/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadatroee.controller;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import cadastroee.model.PessoasFisicas;

/**
 *
 * @author sendi
 */
@Stateless
public class PessoasFisicasFacade extends AbstractFacade<PessoasFisicas> implements PessoasFisicasFacadeLocal {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PessoasFisicasFacade() {
        super(PessoasFisicas.class);
    }
    
}
