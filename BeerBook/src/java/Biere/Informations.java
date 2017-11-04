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
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author carlito
 */
@Entity
@Table(name = "informations")
@NamedQueries({
    @NamedQuery(name = "Informations.findAll", query = "SELECT i FROM Informations i")
    , @NamedQuery(name = "Informations.findByTypeBiere", query = "SELECT i FROM Informations i WHERE i.typeBiere = :typeBiere")})
public class Informations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "typeBiere")
    private String typeBiere;
    @Lob
    @Size(max = 65535)
    @Column(name = "typeFermentation")
    private String typeFermentation;
    @Lob
    @Size(max = 65535)
    @Column(name = "typeCereales")
    private String typeCereales;
    @Lob
    @Size(max = 65535)
    @Column(name = "accompagnement")
    private String accompagnement;
    @OneToMany(mappedBy = "typeBiere")
    private Collection<Biere> biereCollection;

    public Informations() {
    }

    public Informations(String typeBiere) {
        this.typeBiere = typeBiere;
    }

    public String getTypeBiere() {
        return typeBiere;
    }

    public void setTypeBiere(String typeBiere) {
        this.typeBiere = typeBiere;
    }

    public String getTypeFermentation() {
        return typeFermentation;
    }

    public void setTypeFermentation(String typeFermentation) {
        this.typeFermentation = typeFermentation;
    }

    public String getTypeCereales() {
        return typeCereales;
    }

    public void setTypeCereales(String typeCereales) {
        this.typeCereales = typeCereales;
    }

    public String getAccompagnement() {
        return accompagnement;
    }

    public void setAccompagnement(String accompagnement) {
        this.accompagnement = accompagnement;
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
        hash += (typeBiere != null ? typeBiere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informations)) {
            return false;
        }
        Informations other = (Informations) object;
        if ((this.typeBiere == null && other.typeBiere != null) || (this.typeBiere != null && !this.typeBiere.equals(other.typeBiere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Biere.Informations[ typeBiere=" + typeBiere + " ]";
    }
    
}
