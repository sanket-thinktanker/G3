package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Adapters.CatalogueAdapter;
import in.thinktanker.g3.Models.CatalogueModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 15-Jul-17.
 */
public class FragmentCatalogue extends Fragment {
    TextView tv_sort_by, tv_filter;
    RecyclerView rv_catalogue;

    ArrayList<CatalogueModel> catalogue_list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_catalogue, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        rv_catalogue = (RecyclerView) view.findViewById(R.id.rv_catalogue);

        tv_sort_by = (TextView) view.findViewById(R.id.tv_sort_by);
        tv_filter = (TextView) view.findViewById(R.id.tv_filter);

        tv_sort_by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tv_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        setCatalogue();
    }

    private void setCatalogue() {
        catalogue_list = new ArrayList<CatalogueModel>();
        catalogue_list.add(new CatalogueModel("1", R.drawable.catalogue_img_1));
        catalogue_list.add(new CatalogueModel("2", R.drawable.catalogue_img_2));
        catalogue_list.add(new CatalogueModel("3", R.drawable.catalogue_img_3));
        catalogue_list.add(new CatalogueModel("4", R.drawable.catalogue_img_4));

        CatalogueAdapter catalogueAdapter = new CatalogueAdapter(catalogue_list, getActivity());
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        rv_catalogue.setLayoutManager(layoutManager);
        rv_catalogue.setAdapter(catalogueAdapter);
    }
}
