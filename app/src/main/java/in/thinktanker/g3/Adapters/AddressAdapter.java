package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.AddressModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 10-Jul-17.
 */
public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ViewHolder> {
    ArrayList<AddressModel> addresslist;
    Context context;

    public AddressAdapter(ArrayList<AddressModel> addresslist, Context context) {
        this.addresslist = addresslist;
        this.context = context;
    }

    @Override
    public AddressAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_address, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AddressAdapter.ViewHolder holder, int position) {
    AddressModel model=addresslist.get(position);
        holder.tv_name.setText(model.getName());
        holder.tv_address.setText(model.getAddress());
        holder.tv_number.setText(model.getNumber());
    }

    @Override
    public int getItemCount() {
        return addresslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name, tv_address, tv_number;
        ImageView iv_edit_address;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_address = (TextView) itemView.findViewById(R.id.tv_address);
            tv_number = (TextView) itemView.findViewById(R.id.tv_number);

        }
    }
}
