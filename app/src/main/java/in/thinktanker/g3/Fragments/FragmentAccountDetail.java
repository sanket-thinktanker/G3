package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.thinktanker.g3.Activities.HomeActivity;
import in.thinktanker.g3.Common.Utils;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 07-Jul-17.
 */
public class FragmentAccountDetail extends Fragment {
    TextView tv_edit_detail;
    TextView tv_my_info, tv_address, tv_news_letter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account_detail, container, false);
        init(view);
        return view;
    }

    private void init(View view) {

        tv_edit_detail = (TextView) view.findViewById(R.id.tv_edit_detail);
        tv_my_info = (TextView) view.findViewById(R.id.tv_my_info);
        tv_address = (TextView) view.findViewById(R.id.tv_address);
        tv_news_letter = (TextView) view.findViewById(R.id.tv_news_letter);

        tv_edit_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tv_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAddress fragmentAddress = new FragmentAddress();
                Utils.AddFragmentBack(((HomeActivity) getActivity()).fl_home.getId(), fragmentAddress, getActivity());
            }
        });

    }
}
