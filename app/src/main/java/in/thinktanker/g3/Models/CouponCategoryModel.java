package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 13-Jul-17.
 */
public class CouponCategoryModel {
    int id, image;

    public CouponCategoryModel(int id, int image) {
        this.id = id;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
