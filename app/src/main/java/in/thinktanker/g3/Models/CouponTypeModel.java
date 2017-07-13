package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 07-Jul-17.
 */
public class CouponTypeModel {
    String id,coupon_type;

    public CouponTypeModel(String id, String coupon_type) {
        this.id = id;
        this.coupon_type = coupon_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoupon_type() {
        return coupon_type;
    }

    public void setCoupon_type(String coupon_type) {
        this.coupon_type = coupon_type;
    }
}
