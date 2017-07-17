package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 15-Jul-17.
 */
public class ViewNewOffersModel {

    String id;
    int offer_image;

    public ViewNewOffersModel(String id, int offer_image) {
        this.id = id;
        this.offer_image = offer_image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOffer_image() {
        return offer_image;
    }

    public void setOffer_image(int offer_image) {
        this.offer_image = offer_image;
    }
}
