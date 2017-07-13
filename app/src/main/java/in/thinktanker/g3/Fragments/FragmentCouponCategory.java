package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.thinktanker.g3.R;

/**
 * Created by MY PC on 13-Jul-17.
 */
public class FragmentCouponCategory extends Fragment {

    RecyclerView rv_coupon_category;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coupon_category, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        rv_coupon_category = (RecyclerView) view.findViewById(R.id.rv_coupon_category);
    }
}
