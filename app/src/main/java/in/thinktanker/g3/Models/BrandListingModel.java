package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 13-Jul-17.
 */
public class BrandListingModel {

    private int id, brand_image;

    public BrandListingModel(int id, int brand_image) {
        this.id = id;
        this.brand_image = brand_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrand_image() {
        return brand_image;
    }

    public void setBrand_image(int brand_image) {
        this.brand_image = brand_image;
    }
}
