package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Activities.HomeActivity;
import in.thinktanker.g3.Adapters.CouponTypeAdapter;
import in.thinktanker.g3.Adapters.ShopOnlineAdapter;
import in.thinktanker.g3.Adapters.StoreOfferAdapter;
import in.thinktanker.g3.Common.Utils;
import in.thinktanker.g3.Models.CouponTypeModel;
import in.thinktanker.g3.Models.ShopOnlineModel;
import in.thinktanker.g3.Models.StoreOfferModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 06-Jul-17.
 */
public class FragmentDrawer extends Fragment {
    ImageView iv_g3_trnds_club, iv_store_zone, iv_coupon_type, iv_share_feedback, iv_help_support, iv_account_detail, iv_shop_online, iv_g3_video_link, iv_store_locator, iv_reference_friend, iv_customer_review;
    LinearLayout ll_g3_trends_cp, ll_store_offer, ll_g3_coupon_type;

    TextView tv_back, tv_feedback, tv_help_support;

    LinearLayout ll_item_share_feedback, ll_item_help_support;
    RelativeLayout rl_store_offer, rl_coupon_type, rl_g3_trends_club, rl_share_feedback, rl_help_support, rl_shop_online, rl_account_detail, rv_customer_review, rl_reference_friend,rl_store_locator;
    TextView tv_point_summary;
    RecyclerView rv_store_offer_zone, rv_coupon_type, rv_shop_online;

    ArrayList<StoreOfferModel> storelist;
    ArrayList<CouponTypeModel> couponlist;
    ArrayList<ShopOnlineModel> shoplist;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drawer, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
       /* iv_g3_trnds_club = (ImageView) view.findViewById(R.id.iv_g3_trnds_club);
        iv_store_zone = (ImageView) view.findViewById(R.id.iv_store_zone);
        iv_coupon_type = (ImageView) view.findViewById(R.id.iv_coupon_type);
        iv_share_feedback = (ImageView) view.findViewById(R.id.iv_share_feedback);
        iv_help_support = (ImageView) view.findViewById(R.id.iv_help_support);
        iv_shop_online = (ImageView) view.findViewById(R.id.iv_shop_online);*/

        tv_point_summary = (TextView) view.findViewById(R.id.tv_point_summary);
        ll_item_help_support = (LinearLayout) view.findViewById(R.id.ll_item_help_support);

        ll_g3_trends_cp = (LinearLayout) view.findViewById(R.id.ll_g3_trends_cp);
        ll_store_offer = (LinearLayout) view.findViewById(R.id.ll_store_offer);
        ll_g3_coupon_type = (LinearLayout) view.findViewById(R.id.ll_g3_coupon_type);
        ll_item_share_feedback = (LinearLayout) view.findViewById(R.id.ll_item_share_feedback);

        rl_store_offer = (RelativeLayout) view.findViewById(R.id.rl_store_offer);
        rl_coupon_type = (RelativeLayout) view.findViewById(R.id.rl_coupon_type);
        rl_g3_trends_club = (RelativeLayout) view.findViewById(R.id.rl_g3_trends_club);
        rl_share_feedback = (RelativeLayout) view.findViewById(R.id.rl_share_feedback);
        rl_help_support = (RelativeLayout) view.findViewById(R.id.rl_help_support);
        rl_shop_online = (RelativeLayout) view.findViewById(R.id.rl_shop_online);
        rl_account_detail = (RelativeLayout) view.findViewById(R.id.rl_account_detail);
        rv_customer_review = (RelativeLayout) view.findViewById(R.id.rl_customer_review);
        rl_reference_friend = (RelativeLayout) view.findViewById(R.id.rl_reference_friend);
        rl_store_locator=(RelativeLayout)view.findViewById(R.id.rl_store_locator);

        rv_store_offer_zone = (RecyclerView) view.findViewById(R.id.rv_store_offer_zone);
        rv_coupon_type = (RecyclerView) view.findViewById(R.id.rv_coupon_type);
        rv_shop_online = (RecyclerView) view.findViewById(R.id.rv_shop_online);

        tv_back = (TextView) view.findViewById(R.id.tv_back);
        tv_feedback = (TextView) view.findViewById(R.id.tv_feedback);
        tv_help_support = (TextView) view.findViewById(R.id.tv_help_support);

        setStoreOffer();
        setCouponType();
        setShopOnline();

        rl_g3_trends_club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        rl_store_offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rl_coupon_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentCouponCategory brandListing=new FragmentCouponCategory();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), brandListing, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);

            }
        });

        rl_share_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentBrandListing brandListing=new FragmentBrandListing();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), brandListing, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);
            }
        });

        rl_help_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rl_shop_online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rl_store_locator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentStoreLocator storeLocator=new FragmentStoreLocator();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), storeLocator, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);
            }
        });

        rv_customer_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentCustomerReview customerReview = new FragmentCustomerReview();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), customerReview, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);

                /*FragmentNotification customerReview = new FragmentNotification();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), customerReview, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);*/

            }
        });

        rl_reference_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentReferenceFriend referenceFriend = new FragmentReferenceFriend();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), referenceFriend, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);
            }
        });

        tv_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentFeedback fragmentFeedback = new FragmentFeedback();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), fragmentFeedback, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);
            }
        });

        tv_help_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHelpSupport fragmentHelpSupport = new FragmentHelpSupport();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), fragmentHelpSupport, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);
            }
        });

        tv_point_summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentShoppingLedger shoppingLedger=new FragmentShoppingLedger();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), shoppingLedger, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);
            }
        });

        rl_account_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAccountDetail accountDetail = new FragmentAccountDetail();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), accountDetail, getActivity());
                ((HomeActivity) getActivity()).drawer.closeDrawer(Gravity.LEFT);
            }
        });
    }

    private void setShopOnline() {
        shoplist = new ArrayList<ShopOnlineModel>();
        shoplist.add(new ShopOnlineModel("1", "Kids"));
        shoplist.add(new ShopOnlineModel("2", "Men"));
        shoplist.add(new ShopOnlineModel("3", "Women"));
        ShopOnlineAdapter shopAdapter = new ShopOnlineAdapter(shoplist, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_shop_online.setLayoutManager(layoutManager);
        rv_shop_online.setAdapter(shopAdapter);
    }

    private void setCouponType() {
        couponlist = new ArrayList<CouponTypeModel>();
        couponlist.add(new CouponTypeModel("1", "Entertainment"));
        couponlist.add(new CouponTypeModel("2", "Hotels"));
        couponlist.add(new CouponTypeModel("3", "Deals of Vendors"));
        CouponTypeAdapter couponAdapter = new CouponTypeAdapter(couponlist, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_coupon_type.setLayoutManager(layoutManager);
        rv_coupon_type.setAdapter(couponAdapter);
    }

    private void setStoreOffer() {
        storelist = new ArrayList<StoreOfferModel>();
        storelist.add(new StoreOfferModel("1", "Men"));
        storelist.add(new StoreOfferModel("2", "Women"));
        storelist.add(new StoreOfferModel("3", "Kids"));
        storelist.add(new StoreOfferModel("4", "Brands"));
        StoreOfferAdapter storeAdapter = new StoreOfferAdapter(storelist, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_store_offer_zone.setLayoutManager(layoutManager);
        rv_store_offer_zone.setAdapter(storeAdapter);
    }
}
