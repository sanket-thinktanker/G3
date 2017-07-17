package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.OffersModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 14-Jul-17.
 */
public class OffersAdapter extends RecyclerView.Adapter<OffersAdapter.ViewHolder> {
    ArrayList<OffersModel> offerslist;
    Context context;

    public OffersAdapter(ArrayList<OffersModel> offerslist, Context context) {
        this.offerslist = offerslist;
        this.context = context;
    }

    @Override
    public OffersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_offers, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OffersAdapter.ViewHolder holder, int position) {
        OffersModel model = offerslist.get(position);
        holder.tv_offers.setText(model.getOffers());

        if (position % 2 == 0) {
            holder.rl_even.setVisibility(View.VISIBLE);
            holder.rl_odd.setVisibility(View.GONE);
        } else {
            holder.rl_odd.setVisibility(View.VISIBLE);
            holder.rl_even.setVisibility(View.GONE);

        }
    }

    @Override
    public int getItemCount() {
        return offerslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_offers;
        RelativeLayout rl_odd, rl_even;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_offers = (TextView) itemView.findViewById(R.id.tv_offers);
            rl_odd = (RelativeLayout) itemView.findViewById(R.id.rl_odd);
            rl_even = (RelativeLayout) itemView.findViewById(R.id.rl_even);
        }
    }
}
