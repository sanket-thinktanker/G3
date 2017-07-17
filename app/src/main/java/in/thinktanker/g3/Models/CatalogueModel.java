package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 15-Jul-17.
 */
public class CatalogueModel {
    String id;
    int catalogue_image;

    public CatalogueModel(String id, int catalogue_image) {
        this.id = id;
        this.catalogue_image = catalogue_image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCatalogue_image() {
        return catalogue_image;
    }

    public void setCatalogue_image(int catalogue_image) {
        this.catalogue_image = catalogue_image;
    }
}
