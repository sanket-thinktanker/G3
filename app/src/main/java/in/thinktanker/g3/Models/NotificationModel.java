package in.thinktanker.g3.Models;

/**
 * Created by MY PC on 11-Jul-17.
 */
public class NotificationModel {
    String notification, read_more,date;

    public NotificationModel(String notification, String read_more, String date) {
        this.notification = notification;
        this.read_more = read_more;
        this.date = date;
    }

    public String getRead_more() {
        return read_more;
    }

    public void setRead_more(String read_more) {
        this.read_more = read_more;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
