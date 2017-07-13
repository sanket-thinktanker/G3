package in.thinktanker.g3.Fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import in.thinktanker.g3.R;

/**
 * Created by MY PC on 04-Jul-17.
 */
public class FragmentRegister extends Fragment implements View.OnTouchListener {

    ImageView iv_back;
    EditText et_first_name, et_last_name, et_email, et_mobile, et_date_of_birth, et_gender, et_state, et_city, et_pincode, et_referral_code;
    TextView tv_error_fname, tv_error_lname, tv_error_email, tv_error_mobile, tv_error_dob, tv_error_gender, tv_error_state, tv_error_city, tv_error_pincode, tv_error_ref_code;
    TextView tv_register;

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+";
    //  private static final int DATE_PICKER_ID = 1111;
    Calendar c;
    int year, month, day;
    Spinner sp_gender;

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        init(view);
        return view;
    }

    private void init(View view) {

        iv_back = (ImageView) view.findViewById(R.id.iv_back);

        et_first_name = (EditText) view.findViewById(R.id.et_first_name);
        et_last_name = (EditText) view.findViewById(R.id.et_last_name);
        et_email = (EditText) view.findViewById(R.id.et_email);
        et_mobile = (EditText) view.findViewById(R.id.et_mobile);
        et_date_of_birth = (EditText) view.findViewById(R.id.et_date_of_birth);
        //  et_gender = (EditText) view.findViewById(R.id.et_gender);
        et_state = (EditText) view.findViewById(R.id.et_state);
        et_city = (EditText) view.findViewById(R.id.et_city);
        et_pincode = (EditText) view.findViewById(R.id.et_pincode);
        et_referral_code = (EditText) view.findViewById(R.id.et_referral_code);

        tv_error_fname = (TextView) view.findViewById(R.id.tv_error_fname);
        tv_error_lname = (TextView) view.findViewById(R.id.tv_error_lname);
        tv_error_email = (TextView) view.findViewById(R.id.tv_error_email);
        tv_error_mobile = (TextView) view.findViewById(R.id.tv_error_mobile);
        tv_error_dob = (TextView) view.findViewById(R.id.tv_error_dob);
        //tv_error_gender = (TextView) view.findViewById(R.id.tv_error_gender);
        tv_error_state = (TextView) view.findViewById(R.id.tv_error_state);
        tv_error_city = (TextView) view.findViewById(R.id.tv_error_city);
        tv_error_pincode = (TextView) view.findViewById(R.id.tv_error_pincode);
        tv_error_ref_code = (TextView) view.findViewById(R.id.tv_error_ref_code);

        tv_register = (TextView) view.findViewById(R.id.tv_register);

        sp_gender = (Spinner) view.findViewById(R.id.spn_gender);

     /*   String[] gender = {"Gender", "Male", "Female"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, gender);
        // adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_gender.setAdapter(adapter);*/

        c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        //year = year - 20;
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        et_date_of_birth.setOnKeyListener(null);
        et_first_name.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    et_last_name.requestFocus();
                }
                return false;
            }
        });

        et_last_name.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    et_email.requestFocus();
                }
                return false;
            }
        });
        et_email.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    et_mobile.requestFocus();
                }
                return false;
            }
        });
        et_mobile.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    // et_last_name.requestFocus();
                    datePickerDialog.show();
                }
                return false;
            }
        });

        /*et_date_of_birth.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // getActivity().showDialog(DATE_PICKER_ID);
                return true;
            }
        });*/

        et_mobile.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_ENTER) {
                        // getActivity().showDialog(DATE_PICKER_ID);
                        datePickerDialog.show();
                        return true;
                    }
                }
                return false;
            }
        });

        et_state.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    et_city.requestFocus();
                }
                return false;
            }
        });

        et_city.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    et_pincode.requestFocus();
                }
                return false;
            }
        });

        et_pincode.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    et_referral_code.requestFocus();
                }
                return false;
            }
        });

        setDateTimeField();
        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickRegister();
            }
        });
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
    }

    private void setDateTimeField() {
        et_date_of_birth.setOnTouchListener(this);
        final Calendar newCalendar = Calendar.getInstance();
        newCalendar.set(Calendar.YEAR, 1990);
        newCalendar.set(Calendar.MONTH, 0);
        newCalendar.set(Calendar.DAY_OF_MONTH, 1);
        datePickerDialog = new DatePickerDialog(getActivity(), R.style.datepicker, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                sp_gender.requestFocus();
                try {
                    //  year = selectedyear;
                    month = monthOfYear + 1;

                    String sday, smonth;
                    if (dayOfMonth < 10) {
                        sday = "0" + dayOfMonth;
                    } else {
                        sday = String.valueOf(dayOfMonth);
                    }
                    if (month < 10) {
                        smonth = "0" + month;
                    } else {
                        smonth = String.valueOf(month);
                    }
                    et_date_of_birth.setText(new StringBuilder().append(sday).append("-").append(smonth).append("-").append(year).append(" "));
                    sp_gender.performClick();
                    et_state.requestFocus();
                } catch (Exception ex) {
                }
                // et_date_of_birth.setText(dateFormatter.format(newDate.getTime()));
                //  et_date_of_birth.setText(new StringBuilder().append(dayOfMonth).append("-").append(monthOfYear).append("-").append(year).append(" "));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        final Calendar max = Calendar.getInstance();
        max.set(Calendar.YEAR, (max.get(Calendar.YEAR)) - 10);
        datePickerDialog.getDatePicker().setMaxDate(max.getTimeInMillis());

    }

    private void onClickRegister() {

        boolean isValid = true;
        if (et_first_name.getText().toString().equals("")) {
            isValid = false;
            tv_error_fname.setVisibility(View.VISIBLE);
        } else {
            tv_error_fname.setVisibility(View.GONE);
        }
        if (et_last_name.getText().toString().equals("")) {
            isValid = false;
            tv_error_lname.setVisibility(View.VISIBLE);
        } else {
            tv_error_lname.setVisibility(View.GONE);
        }

        if (et_email.getText().toString().equals("")) {
            isValid = false;
            tv_error_email.setText("Enter Email Address");
            tv_error_email.setVisibility(View.VISIBLE);
        } else if (!et_email.getText().toString().matches(emailPattern)) {
            isValid = false;
            tv_error_email.setText("Enter Valid Email Address");
            tv_error_email.setVisibility(View.VISIBLE);
        } else {
            tv_error_email.setVisibility(View.GONE);
        }

        if (et_mobile.getText().toString().equals("")) {
            isValid = false;
            tv_error_mobile.setText("Enter Mobile Number");
            tv_error_mobile.setVisibility(View.VISIBLE);
        } else if (et_mobile.getText().toString().length() != 10) {
            isValid = false;
            tv_error_mobile.setText("Enter Valid Mobile Number");
            tv_error_mobile.setVisibility(View.VISIBLE);
        } else {
            tv_error_mobile.setVisibility(View.GONE);
        }

        if (et_state.getText().toString().equals("")) {
            isValid = false;
            tv_error_state.setVisibility(View.VISIBLE);
        } else {
            tv_error_state.setVisibility(View.GONE);
        }
        if (et_city.getText().toString().equals("")) {
            isValid = false;
            tv_error_city.setVisibility(View.VISIBLE);
        } else {
            tv_error_city.setVisibility(View.GONE);
        }

        if (et_pincode.getText().toString().equals("")) {
            isValid = false;
            tv_error_pincode.setText("Enter pincode");
            tv_error_pincode.setVisibility(View.VISIBLE);
        } else if (et_pincode.getText().toString().length() != 6) {
            isValid = false;
            tv_error_pincode.setText("Enter Valid Pincode");
            tv_error_pincode.setVisibility(View.VISIBLE);
        } else {
            tv_error_pincode.setVisibility(View.GONE);
        }
        if (et_referral_code.getText().toString().equals("")) {
            isValid = false;
            tv_error_ref_code.setVisibility(View.VISIBLE);
        } else {
            tv_error_ref_code.setVisibility(View.GONE);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        datePickerDialog.show();
        return false;
    }
}
