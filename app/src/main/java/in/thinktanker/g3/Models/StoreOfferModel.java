package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 07-Jul-17.
 */
public class StoreOfferModel {

    private String id,text;

    public StoreOfferModel(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
