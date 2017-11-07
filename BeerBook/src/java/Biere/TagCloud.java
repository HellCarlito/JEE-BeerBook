/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biere;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudItem;
import org.primefaces.model.tagcloud.TagCloudModel;

/**
 *
 * @author carlito
 */
@ManagedBean
public class TagCloud {

    private TagCloudModel model;

    @PostConstruct
    public void init() {
        model = new DefaultTagCloudModel();
        model.addTag(new DefaultTagCloudItem("Mes bières", "MyBeers.xhtml", 1));
        model.addTag(new DefaultTagCloudItem("Ajouter bière", "AddBeer.xhtml", 3));
        model.addTag(new DefaultTagCloudItem("Modifier mon profil", 2));
    }

    public TagCloudModel getModel() {
        return model;
    }

    public void selectListener(SelectEvent e) {
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(((TagCloudItem) e.getObject()).getLabel()
                        + " sélectionné"));
    }

    public void setTagCloud(TagCloudModel tagCloud) {
        this.model = tagCloud;
    }
}
