package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import in.thinktanker.g3.Models.OffersModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 14-Jul-17.
 */
public class FragmentOffers extends Fragment {

    RecyclerView rv_offers;

    ArrayList<OffersModel> offers_list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_offers, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        rv_offers = (RecyclerView) view.findViewById(R.id.rv_offers);

        setOffers();
    }

    private void setOffers() {

    }

}
