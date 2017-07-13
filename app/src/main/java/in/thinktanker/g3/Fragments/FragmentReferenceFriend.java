package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.thinktanker.g3.R;

/**
 * Created by MY PC on 11-Jul-17.
 */
public class FragmentReferenceFriend extends Fragment {

    TextView tv_refer_now;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reference_friend, container, false);
        init(view);

        return view;
    }

    private void init(View view) {

        tv_refer_now = (TextView) view.findViewById(R.id.tv_refer_now);

        tv_refer_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
