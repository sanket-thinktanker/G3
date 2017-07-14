package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 14-Jul-17.
 */
public class DealsofVendorModel {

    private int id, vendor_image;

    public DealsofVendorModel() {

    }

    public DealsofVendorModel(int id, int vendor_image) {
        this.id = id;
        this.vendor_image = vendor_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVendor_image() {
        return vendor_image;
    }

    public void setVendor_image(int vendor_image) {
        this.vendor_image = vendor_image;
    }
}
