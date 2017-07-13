package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.thinktanker.g3.Adapters.CustomerReviewAdapter;
import in.thinktanker.g3.Models.CustomerReviewModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 10-Jul-17.
 */
public class FragmentCustomerReview extends Fragment {

    RecyclerView rv_customer_review;
    TextView tv_write_review;

    ArrayList<CustomerReviewModel> listcustomerreview;
    CustomerReviewAdapter reviewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_customer_review, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        rv_customer_review = (RecyclerView) view.findViewById(R.id.rv_customer_review);
        tv_write_review = (TextView) view.findViewById(R.id.tv_write_review);

        tv_write_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        setCustomerReview();
    }

    private void setCustomerReview() {
        listcustomerreview = new ArrayList<CustomerReviewModel>();
        listcustomerreview.add(new CustomerReviewModel("1",R.drawable.customer_review_image_2, "Best Ethnic Collection Ever !", "I got the product exactly same as shown in image ! the quality of the product is amazing and pretty well and i revived the products before date, service is very fast and G3 team is very quick to answer all my questions and i would definately buy with G3fashion.com", "Kailash"));
        listcustomerreview.add(new CustomerReviewModel("1",R.drawable.customer_review_image_3, "Best Quality Product !!", "I got the product same as shown in online and it was such an premium quality product and customer service is very fast to resolve all the quay", "Khushi Chavla"));

        CustomerReviewAdapter customerReviewAdapter = new CustomerReviewAdapter(listcustomerreview, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_customer_review.setLayoutManager(layoutManager);
        rv_customer_review.setAdapter(customerReviewAdapter);
    }

}
