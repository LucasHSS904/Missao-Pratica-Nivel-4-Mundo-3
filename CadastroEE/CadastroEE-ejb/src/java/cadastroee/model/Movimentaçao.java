/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "Movimenta\u00e7ao")
@NamedQueries({
    @NamedQuery(name = "Movimenta\u00e7ao.findAll", query = "SELECT m FROM Movimenta\u00e7ao m"),
    @NamedQuery(name = "Movimenta\u00e7ao.findByIdMovimento", query = "SELECT m FROM Movimenta\u00e7ao m WHERE m.idMovimento = :idMovimento"),
    @NamedQuery(name = "Movimenta\u00e7ao.findByIdUsuario", query = "SELECT m FROM Movimenta\u00e7ao m WHERE m.idUsuario = :idUsuario"),
    @NamedQuery(name = "Movimenta\u00e7ao.findByIdPessoa", query = "SELECT m FROM Movimenta\u00e7ao m WHERE m.idPessoa = :idPessoa"),
    @NamedQuery(name = "Movimenta\u00e7ao.findByIdProduto", query = "SELECT m FROM Movimenta\u00e7ao m WHERE m.idProduto = :idProduto"),
    @NamedQuery(name = "Movimenta\u00e7ao.findByQuantidade", query = "SELECT m FROM Movimenta\u00e7ao m WHERE m.quantidade = :quantidade"),
    @NamedQuery(name = "Movimenta\u00e7ao.findByTipo", query = "SELECT m FROM Movimenta\u00e7ao m WHERE m.tipo = :tipo"),
    @NamedQuery(name = "Movimenta\u00e7ao.findByValorUnitario", query = "SELECT m FROM Movimenta\u00e7ao m WHERE m.valorUnitario = :valorUnitario")})
public class Movimentaçao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idMovimento")
    private Integer idMovimento;
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Column(name = "idPessoa")
    private Integer idPessoa;
    @Column(name = "idProduto")
    private Integer idProduto;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "tipo")
    private Character tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorUnitario")
    private BigDecimal valorUnitario;

    public Movimentaçao() {
    }

    public Movimentaçao(Integer idMovimento) {
        this.idMovimento = idMovimento;
    }

    public Integer getIdMovimento() {
        return idMovimento;
    }

    public void setIdMovimento(Integer idMovimento) {
        this.idMovimento = idMovimento;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimento != null ? idMovimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentaçao)) {
            return false;
        }
        Movimentaçao other = (Movimentaçao) object;
        if ((this.idMovimento == null && other.idMovimento != null) || (this.idMovimento != null && !this.idMovimento.equals(other.idMovimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cadastroee.model.Movimenta\u00e7ao[ idMovimento=" + idMovimento + " ]";
    }
    
}
