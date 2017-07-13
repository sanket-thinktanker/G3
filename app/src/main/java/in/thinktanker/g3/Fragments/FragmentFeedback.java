package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;

import in.thinktanker.g3.R;

/**
 * Created by MY PC on 10-Jul-17.
 */
public class FragmentFeedback extends Fragment {

    RatingBar rb_rating;
    String rating;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feedback, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        final ImageView iv_star1 = (ImageView) view.findViewById(R.id.iv_star1);
        final ImageView iv_star2 = (ImageView) view.findViewById(R.id.iv_star2);
        final ImageView iv_star3 = (ImageView) view.findViewById(R.id.iv_star3);
        final ImageView iv_star4 = (ImageView) view.findViewById(R.id.iv_star4);
        final ImageView iv_star5 = (ImageView) view.findViewById(R.id.iv_star5);

        iv_star1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = "1";
                iv_star1.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star2.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
                iv_star3.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
                iv_star4.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
                iv_star5.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
            }
        });
        iv_star2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = "2";
                iv_star1.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star2.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star3.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
                iv_star4.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
                iv_star5.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
            }
        });
        iv_star3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = "3";
                iv_star1.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star2.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star3.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star4.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
                iv_star5.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
            }
        });
        iv_star4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = "4";
                iv_star1.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star2.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star3.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star4.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star5.setImageDrawable(getResources().getDrawable(R.drawable.star_o));
            }
        });
        iv_star5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = "5";
                iv_star1.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star2.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star3.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star4.setImageDrawable(getResources().getDrawable(R.drawable.star));
                iv_star5.setImageDrawable(getResources().getDrawable(R.drawable.star));
            }
        });

    }
}
