package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.ShoppingLedgerModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 12-Jul-17.
 */
public class ShoppingLedgerAdapter extends RecyclerView.Adapter<ShoppingLedgerAdapter.ViewHolder> {
    Context context;
    ArrayList<ShoppingLedgerModel> shoppinglist;

    public ShoppingLedgerAdapter(Context context, ArrayList<ShoppingLedgerModel> shoppinglist) {
        this.context = context;
        this.shoppinglist = shoppinglist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_shopping_ledger, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ShoppingLedgerModel model = shoppinglist.get(position);
        holder.tv_points.setText(model.getPoints());

    }

    @Override
    public int getItemCount() {
        return shoppinglist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_points;
        TextView tv_product_name, tv_price, tv_quantity, tv_date;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_points = (TextView) itemView.findViewById(R.id.tv_points);

        }
    }
}
