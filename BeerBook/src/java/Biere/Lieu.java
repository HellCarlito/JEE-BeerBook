/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biere;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author carlito
 */
@Entity
@Table(name = "lieu")
@NamedQueries({
    @NamedQuery(name = "Lieu.findAll", query = "SELECT l FROM Lieu l")
    , @NamedQuery(name = "Lieu.findByIdLieu", query = "SELECT l FROM Lieu l WHERE l.idLieu = :idLieu")
    , @NamedQuery(name = "Lieu.findByNomLieu", query = "SELECT l FROM Lieu l WHERE l.nomLieu = :nomLieu")
    , @NamedQuery(name = "Lieu.findByVilleLieu", query = "SELECT l FROM Lieu l WHERE l.villeLieu = :villeLieu")
    , @NamedQuery(name = "Lieu.findByTypeLieu", query = "SELECT l FROM Lieu l WHERE l.typeLieu = :typeLieu")})
public class Lieu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLieu")
    private Integer idLieu;
    @Size(max = 25)
    @Column(name = "nomLieu")
    private String nomLieu;
    @Size(max = 25)
    @Column(name = "villeLieu")
    private String villeLieu;
    @Size(max = 25)
    @Column(name = "typeLieu")
    private String typeLieu;
    @OneToMany(mappedBy = "idLieu")
    private Collection<Biere> biereCollection;

    public Lieu() {
    }

    public Lieu(Integer idLieu) {
        this.idLieu = idLieu;
    }

    public Integer getIdLieu() {
        return idLieu;
    }

    public void setIdLieu(Integer idLieu) {
        this.idLieu = idLieu;
    }

    public String getNomLieu() {
        return nomLieu;
    }

    public void setNomLieu(String nomLieu) {
        this.nomLieu = nomLieu;
    }

    public String getVilleLieu() {
        return villeLieu;
    }

    public void setVilleLieu(String villeLieu) {
        this.villeLieu = villeLieu;
    }

    public String getTypeLieu() {
        return typeLieu;
    }

    public void setTypeLieu(String typeLieu) {
        this.typeLieu = typeLieu;
    }

    public Collection<Biere> getBiereCollection() {
        return biereCollection;
    }

    public void setBiereCollection(Collection<Biere> biereCollection) {
        this.biereCollection = biereCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLieu != null ? idLieu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lieu)) {
            return false;
        }
        Lieu other = (Lieu) object;
        if ((this.idLieu == null && other.idLieu != null) || (this.idLieu != null && !this.idLieu.equals(other.idLieu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Biere.Lieu[ idLieu=" + idLieu + " ]";
    }
    
}
