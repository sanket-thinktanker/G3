package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.StoreOfferModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 07-Jul-17.
 */
public class StoreOfferAdapter extends RecyclerView.Adapter<StoreOfferAdapter.ViewHolder> {

    public ArrayList<StoreOfferModel> list;
    Context context;

    public StoreOfferAdapter(ArrayList<StoreOfferModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public StoreOfferAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_store_offer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StoreOfferAdapter.ViewHolder holder, int position) {
        StoreOfferModel storeOfferModel = list.get(position);
        holder.tv_men.setText(storeOfferModel.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_men;
      //  LinearLayout ll_store_offer;

        public ViewHolder(View itemView) {
            super(itemView);
            //ll_store_offer = (LinearLayout) itemView.findViewById(R.id.ll_store_offer);
            tv_men = (TextView) itemView.findViewById(R.id.tv_men);
        }
    }
}
