package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.ViewNewOffersModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 15-Jul-17.
 */
public class ViewNewOffersAdapter extends RecyclerView.Adapter<ViewNewOffersAdapter.ViewHolder> {

    ArrayList<ViewNewOffersModel> offerslist;
    Context context;

    public ViewNewOffersAdapter(ArrayList<ViewNewOffersModel> offerslist, Context context) {
        this.offerslist = offerslist;
        this.context = context;
    }

    @Override
    public ViewNewOffersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_view_new_offers, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewNewOffersAdapter.ViewHolder holder, int position) {
        ViewNewOffersModel model = offerslist.get(position);
        holder.iv_brand_img.setImageResource(model.getOffer_image());
    }

    @Override
    public int getItemCount() {
        return offerslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_brand_img;

        public ViewHolder(View itemView) {
            super(itemView);

            iv_brand_img = (ImageView) itemView.findViewById(R.id.iv_brand_img);
        }
    }
}
