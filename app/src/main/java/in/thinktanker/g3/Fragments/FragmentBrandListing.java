package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import in.thinktanker.g3.Adapters.BrandListingAdapter;
import in.thinktanker.g3.Models.BrandListingModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 13-Jul-17.
 */
public class FragmentBrandListing extends Fragment {

    RecyclerView rv_brand_listing;

    ArrayList<BrandListingModel> brand_list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_brand_listing, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        rv_brand_listing = (RecyclerView) view.findViewById(R.id.rv_brand_listing);

        setBrandList();
    }

    private void setBrandList() {

        brand_list = new ArrayList<BrandListingModel>();
        brand_list.add(new BrandListingModel(1,R.drawable.brand_img));
        brand_list.add(new BrandListingModel(1,R.drawable.brand_img));
        brand_list.add(new BrandListingModel(1,R.drawable.brand_img));
        brand_list.add(new BrandListingModel(1,R.drawable.brand_img));
        brand_list.add(new BrandListingModel(1,R.drawable.brand_img));

        BrandListingAdapter brandAdapter = new BrandListingAdapter(brand_list, getActivity());
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
        rv_brand_listing.setLayoutManager(layoutManager);
        rv_brand_listing.setAdapter(brandAdapter);
    }
}
