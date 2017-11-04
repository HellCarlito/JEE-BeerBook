/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biere;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author carlito
 */
@Entity
@Table(name = "biere")
@NamedQueries({
    @NamedQuery(name = "Biere.findAll", query = "SELECT b FROM Biere b")
    , @NamedQuery(name = "Biere.findByIdB", query = "SELECT b FROM Biere b WHERE b.idB = :idB")
    , @NamedQuery(name = "Biere.findByPhotoB", query = "SELECT b FROM Biere b WHERE b.photoB = :photoB")
    , @NamedQuery(name = "Biere.findByNomB", query = "SELECT b FROM Biere b WHERE b.nomB = :nomB")
    , @NamedQuery(name = "Biere.findByPourcentB", query = "SELECT b FROM Biere b WHERE b.pourcentB = :pourcentB")
    , @NamedQuery(name = "Biere.findByLieuBrassageB", query = "SELECT b FROM Biere b WHERE b.lieuBrassageB = :lieuBrassageB")
    , @NamedQuery(name = "Biere.findByPaysB", query = "SELECT b FROM Biere b WHERE b.paysB = :paysB")
    , @NamedQuery(name = "Biere.findByNoteB", query = "SELECT b FROM Biere b WHERE b.noteB = :noteB")
    , @NamedQuery(name = "Biere.findByTesteLe", query = "SELECT b FROM Biere b WHERE b.testeLe = :testeLe")})
public class Biere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idB")
    private Integer idB;
    @Size(max = 25)
    @Column(name = "photoB")
    private String photoB;
    @Size(max = 25)
    @Column(name = "nomB")
    private String nomB;
    @Size(max = 25)
    @Column(name = "pourcentB")
    private String pourcentB;
    @Size(max = 25)
    @Column(name = "lieuBrassageB")
    private String lieuBrassageB;
    @Size(max = 25)
    @Column(name = "paysB")
    private String paysB;
    @Column(name = "noteB")
    private Integer noteB;
    @Lob
    @Size(max = 65535)
    @Column(name = "descriptionB")
    private String descriptionB;
    @Column(name = "testeLe")
    @Temporal(TemporalType.DATE)
    private Date testeLe;
    @JoinColumn(name = "idLieu", referencedColumnName = "idLieu")
    @ManyToOne
    private Lieu idLieu;
    @JoinColumn(name = "idU", referencedColumnName = "idU")
    @ManyToOne
    private Utilisateur idU;
    @JoinColumn(name = "typeBiere", referencedColumnName = "typeBiere")
    @ManyToOne
    private Informations typeBiere;

    public Biere() {
    }

    public Biere(Integer idB) {
        this.idB = idB;
    }

    public Integer getIdB() {
        return idB;
    }

    public void setIdB(Integer idB) {
        this.idB = idB;
    }

    public String getPhotoB() {
        return photoB;
    }

    public void setPhotoB(String photoB) {
        this.photoB = photoB;
    }

    public String getNomB() {
        return nomB;
    }

    public void setNomB(String nomB) {
        this.nomB = nomB;
    }

    public String getPourcentB() {
        return pourcentB;
    }

    public void setPourcentB(String pourcentB) {
        this.pourcentB = pourcentB;
    }

    public String getLieuBrassageB() {
        return lieuBrassageB;
    }

    public void setLieuBrassageB(String lieuBrassageB) {
        this.lieuBrassageB = lieuBrassageB;
    }

    public String getPaysB() {
        return paysB;
    }

    public void setPaysB(String paysB) {
        this.paysB = paysB;
    }

    public Integer getNoteB() {
        return noteB;
    }

    public void setNoteB(Integer noteB) {
        this.noteB = noteB;
    }

    public String getDescriptionB() {
        return descriptionB;
    }

    public void setDescriptionB(String descriptionB) {
        this.descriptionB = descriptionB;
    }

    public Date getTesteLe() {
        return testeLe;
    }

    public void setTesteLe(Date testeLe) {
        this.testeLe = testeLe;
    }

    public Lieu getIdLieu() {
        return idLieu;
    }

    public void setIdLieu(Lieu idLieu) {
        this.idLieu = idLieu;
    }

    public Utilisateur getIdU() {
        return idU;
    }

    public void setIdU(Utilisateur idU) {
        this.idU = idU;
    }

    public Informations getTypeBiere() {
        return typeBiere;
    }

    public void setTypeBiere(Informations typeBiere) {
        this.typeBiere = typeBiere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idB != null ? idB.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biere)) {
            return false;
        }
        Biere other = (Biere) object;
        if ((this.idB == null && other.idB != null) || (this.idB != null && !this.idB.equals(other.idB))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Biere.Biere[ idB=" + idB + " ]";
    }
    
}
