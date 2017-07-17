package in.thinktanker.g3.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import in.thinktanker.g3.Models.CatalogueModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 15-Jul-17.
 */
public class CatalogueAdapter extends RecyclerView.Adapter<CatalogueAdapter.ViewHolder> {

    ArrayList<CatalogueModel> cataloguelist;
    Context context;

    public CatalogueAdapter(ArrayList<CatalogueModel> cataloguelist, Context context) {
        this.cataloguelist = cataloguelist;
        this.context = context;
    }

    @Override
    public CatalogueAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_catalogue, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CatalogueAdapter.ViewHolder holder, int position) {

        CatalogueModel model = cataloguelist.get(position);
        holder.iv_catalogue.setImageResource(model.getCatalogue_image());
    }

    @Override
    public int getItemCount() {
        return cataloguelist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_catalogue;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_catalogue = (ImageView) itemView.findViewById(R.id.iv_catalogue);
        }
    }
}
