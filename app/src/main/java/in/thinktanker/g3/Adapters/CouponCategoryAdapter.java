package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.CouponCategoryModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 13-Jul-17.
 */
public class CouponCategoryAdapter extends RecyclerView.Adapter<CouponCategoryAdapter.ViewHolder> {

    ArrayList<CouponCategoryModel> categoryList;
    Context context;

    public CouponCategoryAdapter(ArrayList<CouponCategoryModel> categoryList, Context context) {
        this.categoryList = categoryList;
        this.context = context;
    }

    @Override
    public CouponCategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_coupon_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CouponCategoryAdapter.ViewHolder holder, int position) {
        CouponCategoryModel categoryModel = categoryList.get(position);
        holder.iv_image.setImageResource(categoryModel.getImage());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_image;

        public ViewHolder(View itemView) {
            super(itemView);

            iv_image = (ImageView) itemView.findViewById(R.id.iv_image);
        }
    }
}
