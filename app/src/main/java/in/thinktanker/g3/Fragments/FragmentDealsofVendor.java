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

import in.thinktanker.g3.Adapters.DealsofVendorAdapter;
import in.thinktanker.g3.Models.DealsofVendorModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 14-Jul-17.
 */
public class FragmentDealsofVendor extends Fragment {
    RecyclerView rv_deals_of_vendor;

    ArrayList<DealsofVendorModel> vendor_list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_deals_of_vendor, container, false);
        init(view);
        return view;
    }

    private void init(View view) {

        rv_deals_of_vendor = (RecyclerView) view.findViewById(R.id.rv_deals_of_vendor);

        setDealsOfVendor();
    }

    private void setDealsOfVendor() {
        vendor_list = new ArrayList<DealsofVendorModel>();
        vendor_list.add(new DealsofVendorModel(1, R.drawable.deals_of_vendors_1));
        vendor_list.add(new DealsofVendorModel(2, R.drawable.deals_of_vendors_2));
        vendor_list.add(new DealsofVendorModel(3, R.drawable.deals_of_vendors_3));
        vendor_list.add(new DealsofVendorModel(4, R.drawable.deals_of_vendors_4));

        DealsofVendorAdapter vendorAdapter = new DealsofVendorAdapter(vendor_list, getActivity());
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        rv_deals_of_vendor.setLayoutManager(layoutManager);
        rv_deals_of_vendor.setAdapter(vendorAdapter);

    }
}
