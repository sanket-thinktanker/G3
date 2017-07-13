package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.thinktanker.g3.Activities.MainActivity;
import in.thinktanker.g3.Common.Utils;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 03-Jul-17.
 */
public class FragmentMain extends Fragment {

    TextView tv_login, tv_register;
    LinearLayout ll_main;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        init(view);

        return view;
    }

    private void init(View view) {

        tv_login = (TextView) view.findViewById(R.id.tv_login);
        tv_register = (TextView) view.findViewById(R.id.tv_register);
        ll_main = (LinearLayout) view.findViewById(R.id.ll_main);


        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragmentLogin();

            }
        });

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragmentRegister();
            }
        });
    }



    private void addFragmentLogin() {
        FragmentLogin fragmentLogin = new FragmentLogin();
        Utils.AddFragmentBack(((MainActivity) getActivity()).fl_main.getId(), fragmentLogin, getActivity());
    }

    private void addFragmentRegister() {
        FragmentRegister fragmentRegister=new FragmentRegister();
        Utils.AddFragmentBack(((MainActivity) getActivity()).fl_main.getId(), fragmentRegister, getActivity());
    }
}
