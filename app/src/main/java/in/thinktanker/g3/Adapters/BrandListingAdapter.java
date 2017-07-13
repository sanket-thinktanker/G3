package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.BrandListingModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 13-Jul-17.
 */
public class BrandListingAdapter extends RecyclerView.Adapter<BrandListingAdapter.ViewHolder> {

    ArrayList<BrandListingModel> brandList;
    Context context;

    public BrandListingAdapter(ArrayList<BrandListingModel> brandList, Context context) {
        this.brandList = brandList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_brand_listing, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BrandListingModel model = brandList.get(position);
        holder.iv_brand_img.setImageResource(model.getBrand_image());
    }

    @Override
    public int getItemCount() {
        return brandList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_brand_img;

        public ViewHolder(View itemView) {
            super(itemView);

            iv_brand_img = (ImageView) itemView.findViewById(R.id.iv_brand_img);
        }
    }
}
