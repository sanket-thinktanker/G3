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

import in.thinktanker.g3.Adapters.CouponCategoryAdapter;
import in.thinktanker.g3.Models.CouponCategoryModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 13-Jul-17.
 */
public class FragmentCouponCategory extends Fragment {

    RecyclerView rv_coupon_category;

    ArrayList<CouponCategoryModel> category_list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coupon_category, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        rv_coupon_category = (RecyclerView) view.findViewById(R.id.rv_coupon_category);

        setCouponCategory();
    }

    private void setCouponCategory() {
        category_list = new ArrayList<CouponCategoryModel>();
        category_list.add(new CouponCategoryModel(1, R.drawable.img_coupon_category));
        category_list.add(new CouponCategoryModel(2, R.drawable.coupon_category4));
        category_list.add(new CouponCategoryModel(3, R.drawable.coupon_category2));
        category_list.add(new CouponCategoryModel(4, R.drawable.coupon_category3));

        CouponCategoryAdapter categoryAdapter = new CouponCategoryAdapter(category_list, getActivity());
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        rv_coupon_category.setLayoutManager(layoutManager);
        rv_coupon_category.setAdapter(categoryAdapter);
    }
}
