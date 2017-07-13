package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.NotificationModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 11-Jul-17.
 */
public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {
    Context context;
    ArrayList<NotificationModel> notificationlist;

    public NotificationAdapter(Context context, ArrayList<NotificationModel> notificationlist) {
        this.context = context;
        this.notificationlist = notificationlist;
    }

    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_notification, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotificationAdapter.ViewHolder holder, int position) {
        NotificationModel model = notificationlist.get(position);
        holder.tv_notification.setText(model.getNotification());

    }

    @Override
    public int getItemCount() {
        return notificationlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_notification, tv_read_more, tv_date;
        ImageView iv_calender;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_notification = (TextView) itemView.findViewById(R.id.tv_notification);
            tv_read_more = (TextView) itemView.findViewById(R.id.tv_read_more);
            tv_date = (TextView) itemView.findViewById(R.id.tv_date);
        }
    }
}
