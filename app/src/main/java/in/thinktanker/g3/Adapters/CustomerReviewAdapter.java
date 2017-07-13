package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.CustomerReviewModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 10-Jul-17.
 */
public class CustomerReviewAdapter extends RecyclerView.Adapter<CustomerReviewAdapter.ViewHolder> {
    ArrayList<CustomerReviewModel> reviewlist;
    Context context;

    public CustomerReviewAdapter(ArrayList<CustomerReviewModel> reviewlist, Context context) {
        this.reviewlist = reviewlist;
        this.context = context;
    }

    @Override
    public CustomerReviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_customer_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomerReviewAdapter.ViewHolder holder, int position) {
        CustomerReviewModel model = reviewlist.get(position);
        holder.iv_image.setImageResource(model.getImage());
        holder.tv_title.setText(model.getTitle());
        holder.tv_description.setText(model.getDescription());
        holder.tv_name.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return reviewlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_image;
        TextView tv_title, tv_description, tv_name;

        public ViewHolder(View itemView) {
            super(itemView);

            iv_image = (ImageView) itemView.findViewById(R.id.iv_image);

            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            tv_description = (TextView) itemView.findViewById(R.id.tv_description);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
        }
    }
}
