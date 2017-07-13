package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.CouponTypeModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 07-Jul-17.
 */
public class CouponTypeAdapter extends RecyclerView.Adapter<CouponTypeAdapter.ViewHolder> {

    ArrayList<CouponTypeModel> couponlist;
    Context context;

    public CouponTypeAdapter(ArrayList<CouponTypeModel> couponlist, Context context) {
        this.couponlist = couponlist;
        this.context = context;
    }

    @Override
    public CouponTypeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_coupon_type, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CouponTypeAdapter.ViewHolder holder, int position) {
        CouponTypeModel couponTypeModel = couponlist.get(position);
        holder.tv_coupon_type.setText(couponTypeModel.getCoupon_type());
    }

    @Override
    public int getItemCount() {
        return couponlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_coupon_type;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_coupon_type = (TextView) itemView.findViewById(R.id.tv_coupon_type);
        }
    }
}
