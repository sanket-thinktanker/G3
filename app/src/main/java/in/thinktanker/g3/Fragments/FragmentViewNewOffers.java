package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import in.thinktanker.g3.Adapters.ViewNewOffersAdapter;
import in.thinktanker.g3.Models.ViewNewOffersModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 15-Jul-17.
 */
public class FragmentViewNewOffers extends Fragment {

    RecyclerView rv_view_new_offers;

    ArrayList<ViewNewOffersModel> offer_list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_new_offers, container, false);
        init(view);
        return view;
    }

    private void init(View view) {

        rv_view_new_offers = (RecyclerView) view.findViewById(R.id.rv_view_new_offers);

        setNewOffers();
    }

    private void setNewOffers() {
        offer_list = new ArrayList<ViewNewOffersModel>();
        offer_list.add(new ViewNewOffersModel("1", R.drawable.pizza_hut));
        offer_list.add(new ViewNewOffersModel("2", R.drawable.pizza_hut));
        offer_list.add(new ViewNewOffersModel("3", R.drawable.pizza_hut));
        offer_list.add(new ViewNewOffersModel("4", R.drawable.pizza_hut));

        ViewNewOffersAdapter newOffersAdapter = new ViewNewOffersAdapter(offer_list, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_view_new_offers.setLayoutManager(layoutManager);
        rv_view_new_offers.setAdapter(newOffersAdapter);
    }
}
