package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 10-Jul-17.
 */
public class CustomerReviewModel {
    private  int image;
    //String url;
    private String id, title, description, name;

    public CustomerReviewModel(String id,int image, String title, String description, String name) {
       // this.url = url;
        this.image = image;
        this.id = id;
        this.title = title;
        this.description = description;
        this.name = name;
    }

 /*   public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }*/

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
