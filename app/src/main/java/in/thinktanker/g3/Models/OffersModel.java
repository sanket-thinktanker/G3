package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 14-Jul-17.
 */
public class OffersModel {
    String id, offers;

    public OffersModel() {

    }

    public OffersModel(String id, String offers) {
        this.id = id;
        this.offers = offers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }
}
