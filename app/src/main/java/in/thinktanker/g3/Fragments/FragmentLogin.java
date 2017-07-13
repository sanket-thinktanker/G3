package in.thinktanker.g3.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.thinktanker.g3.Activities.HomeActivity;
import in.thinktanker.g3.Activities.MainActivity;
import in.thinktanker.g3.Common.Utils;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 04-Jul-17.
 */
public class FragmentLogin extends Fragment {

    ImageView iv_back;
    EditText et_mobile_no, et_otp_no;
    TextView tv_generate_otp, tv_login, tv_register, tv_error_mobile, tv_error_otp;
    LinearLayout ll_login, ll_otp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frament_login, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        iv_back = (ImageView) view.findViewById(R.id.iv_back);

        tv_login = (TextView) view.findViewById(R.id.tv_login);
        tv_register = (TextView) view.findViewById(R.id.tv_register);
        tv_generate_otp = (TextView) view.findViewById(R.id.tv_generate_otp);
        tv_error_mobile = (TextView) view.findViewById(R.id.tv_error_mobile);

        et_mobile_no = (EditText) view.findViewById(R.id.et_mobile_no);
        et_otp_no = (EditText) view.findViewById(R.id.et_otp_no);

        ll_login = (LinearLayout) view.findViewById(R.id.ll_login);
        ll_otp = (LinearLayout) view.findViewById(R.id.ll_otp);
        tv_login = (TextView) view.findViewById(R.id.tv_login);
        tv_error_otp = (TextView) view.findViewById(R.id.tv_error_otp);

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onClickLoginButton();

            }
        });


        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        tv_generate_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GenerateOtp();

            }
        });

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentRegister fragmentRegister = new FragmentRegister();
                Utils.AddFragmentBack(((MainActivity) getActivity()).fl_main.getId(), fragmentRegister, getActivity());
            }
        });

    }

    private void onClickLoginButton() {
        boolean isValid = true;
        if (et_otp_no.getText().toString().equals("")) {
            isValid = false;
            tv_error_otp.setVisibility(View.VISIBLE);
        } else if (et_otp_no.getText().toString().length() != 6) {
            isValid = false;
            tv_error_otp.setText("Enter Valid OTP Number");
            tv_error_otp.setVisibility(View.VISIBLE);
        } else {
            tv_error_otp.setVisibility(View.GONE);
        }
        if (isValid) {
            Intent intent = new Intent(getActivity(), HomeActivity.class);
            startActivity(intent);
        }
    }

    private void GenerateOtp() {
        boolean isValid = true;

        if (et_mobile_no.getText().toString().equals("")) {
            isValid = false;
            tv_error_mobile.setText("Enter Mobile Number");
            tv_error_mobile.setVisibility(View.VISIBLE);

        } else if (et_mobile_no.getText().toString().length() != 10) {
            isValid = false;
            tv_error_mobile.setText("Enter Valid Mobile Number");
            tv_error_mobile.setVisibility(View.VISIBLE);
        } else {
            tv_error_mobile.setVisibility(View.GONE);
        }
        if (isValid) {
            ll_otp.setVisibility(View.GONE);
            ll_login.setVisibility(View.VISIBLE);
            et_otp_no.requestFocus();
        }
    }

}
