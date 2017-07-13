package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.ShopOnlineModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 07-Jul-17.
 */
public class ShopOnlineAdapter extends RecyclerView.Adapter<ShopOnlineAdapter.ViewHolder> {
    ArrayList<ShopOnlineModel> shoplist;
    Context context;

    public ShopOnlineAdapter(ArrayList<ShopOnlineModel> shoplist, Context context) {
        this.shoplist = shoplist;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_shop_online, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ShopOnlineModel shopOnlineModel = shoplist.get(position);
        holder.tv_shop_online.setText(shopOnlineModel.getText());
    }

    @Override
    public int getItemCount() {
        return shoplist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_shop_online;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_shop_online = (TextView) itemView.findViewById(R.id.tv_shop_online);
        }
    }
}
