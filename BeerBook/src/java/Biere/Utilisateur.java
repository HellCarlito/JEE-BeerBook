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
@Table(name = "utilisateur")
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u")
    , @NamedQuery(name = "Utilisateur.findByIdU", query = "SELECT u FROM Utilisateur u WHERE u.idU = :idU")
    , @NamedQuery(name = "Utilisateur.findByPseudoU", query = "SELECT u FROM Utilisateur u WHERE u.pseudoU = :pseudoU")
    , @NamedQuery(name = "Utilisateur.findByAgeU", query = "SELECT u FROM Utilisateur u WHERE u.ageU = :ageU")
    , @NamedQuery(name = "Utilisateur.findBySexeU", query = "SELECT u FROM Utilisateur u WHERE u.sexeU = :sexeU")
    , @NamedQuery(name = "Utilisateur.findByVilleU", query = "SELECT u FROM Utilisateur u WHERE u.villeU = :villeU")
    , @NamedQuery(name = "Utilisateur.findByPaysU", query = "SELECT u FROM Utilisateur u WHERE u.paysU = :paysU")
    , @NamedQuery(name = "Utilisateur.findByPhotoU", query = "SELECT u FROM Utilisateur u WHERE u.photoU = :photoU")
    , @NamedQuery(name = "Utilisateur.findByMdpU", query = "SELECT u FROM Utilisateur u WHERE u.mdpU = :mdpU")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idU")
    private Integer idU;
    @Size(max = 25)
    @Column(name = "pseudoU")
    private String pseudoU;
    @Column(name = "ageU")
    private Integer ageU;
    @Size(max = 25)
    @Column(name = "sexeU")
    private String sexeU;
    @Size(max = 25)
    @Column(name = "villeU")
    private String villeU;
    @Size(max = 25)
    @Column(name = "paysU")
    private String paysU;
    @Size(max = 255)
    @Column(name = "photoU")
    private String photoU;
    @Size(max = 25)
    @Column(name = "mdpU")
    private String mdpU;
    @OneToMany(mappedBy = "idU")
    private Collection<Biere> biereCollection;

    public Utilisateur() {
    }

    public Utilisateur(Integer idU) {
        this.idU = idU;
    }

    public Integer getIdU() {
        return idU;
    }

    public void setIdU(Integer idU) {
        this.idU = idU;
    }

    public String getPseudoU() {
        return pseudoU;
    }

    public void setPseudoU(String pseudoU) {
        this.pseudoU = pseudoU;
    }

    public Integer getAgeU() {
        return ageU;
    }

    public void setAgeU(Integer ageU) {
        this.ageU = ageU;
    }

    public String getSexeU() {
        return sexeU;
    }

    public void setSexeU(String sexeU) {
        this.sexeU = sexeU;
    }

    public String getVilleU() {
        return villeU;
    }

    public void setVilleU(String villeU) {
        this.villeU = villeU;
    }

    public String getPaysU() {
        return paysU;
    }

    public void setPaysU(String paysU) {
        this.paysU = paysU;
    }

    public String getPhotoU() {
        return photoU;
    }

    public void setPhotoU(String photoU) {
        this.photoU = photoU;
    }

    public String getMdpU() {
        return mdpU;
    }

    public void setMdpU(String mdpU) {
        this.mdpU = mdpU;
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
        hash += (idU != null ? idU.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idU == null && other.idU != null) || (this.idU != null && !this.idU.equals(other.idU))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Biere.Utilisateur[ idU=" + idU + " ]";
    }
    
}
