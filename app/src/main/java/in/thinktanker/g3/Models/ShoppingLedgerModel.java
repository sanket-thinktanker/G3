package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 12-Jul-17.
 */
public class ShoppingLedgerModel {

    private String id, points;

    public ShoppingLedgerModel() {

    }

    public ShoppingLedgerModel(String id, String points) {
        this.id = id;
        this.points = points;
    }


    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
