package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.DealsofVendorModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 14-Jul-17.
 */
public class DealsofVendorAdapter extends RecyclerView.Adapter<DealsofVendorAdapter.ViewHolder> {

    ArrayList<DealsofVendorModel> vendorList;
    Context context;

    public DealsofVendorAdapter(ArrayList<DealsofVendorModel> vendorList, Context context) {
        this.vendorList = vendorList;
        this.context = context;
    }

    @Override
    public DealsofVendorAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_deals_of_vendor, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DealsofVendorAdapter.ViewHolder holder, int position) {
        DealsofVendorModel model = vendorList.get(position);
        holder.iv_vendor_image.setImageResource(model.getVendor_image());
    }

    @Override
    public int getItemCount() {
        return vendorList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_vendor_image;

        public ViewHolder(View itemView) {
            super(itemView);

            iv_vendor_image = (ImageView) itemView.findViewById(R.id.iv_vendor_image);
        }
    }
}
