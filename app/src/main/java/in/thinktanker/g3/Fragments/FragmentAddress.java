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

import in.thinktanker.g3.Adapters.AddressAdapter;
import in.thinktanker.g3.Models.AddressModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 10-Jul-17.
 */
public class FragmentAddress extends Fragment {
    TextView tv_remove, tv_myInfo, tv_address, tv_newsLetter;
    RecyclerView rv_address;

    ArrayList<AddressModel> listaddress;
    AddressAdapter addressAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_address, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        tv_remove = (TextView) view.findViewById(R.id.tv_remove);

        rv_address = (RecyclerView) view.findViewById(R.id.rv_address);
        tv_myInfo = (TextView) view.findViewById(R.id.tv_myInfo);

        tv_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tv_myInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        setAddress();
    }

    private void setAddress() {
        listaddress = new ArrayList<AddressModel>();
        listaddress.add(new AddressModel("1", "Miss Lorem lipsum", "C-801,  XYZ building, ABC Street, Mumbai,Maharashtra,400097", "9876543210"));

        AddressAdapter addressAdapter = new AddressAdapter(listaddress, getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_address.setLayoutManager(layoutManager);
        rv_address.setAdapter(addressAdapter);
    }
}
