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

import in.thinktanker.g3.Adapters.ShoppingLedgerAdapter;
import in.thinktanker.g3.Models.ShoppingLedgerModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 12-Jul-17.
 */
public class FragmentShoppingLedger extends Fragment {

    RecyclerView rv_shopping_ledger;
    TextView tv_redeem_now;

    ArrayList<ShoppingLedgerModel> shopping_list;
    ShoppingLedgerAdapter shoppingAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shopping_ledger, container, false);
        init(view);
        return view;
    }

    private void init(View view) {

        rv_shopping_ledger = (RecyclerView) view.findViewById(R.id.rv_shopping_ledger);

        tv_redeem_now = (TextView) view.findViewById(R.id.tv_redeem_now);

        tv_redeem_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        setShoppingLedger();
    }

    private void setShoppingLedger() {

        shopping_list = new ArrayList<ShoppingLedgerModel>();
        shopping_list.add(new ShoppingLedgerModel("1", "100"));
        shopping_list.add(new ShoppingLedgerModel("2", "500"));
        shopping_list.add(new ShoppingLedgerModel("3", "400"));
        shopping_list.add(new ShoppingLedgerModel("4", "200"));

        ShoppingLedgerAdapter shoppingLedgerAdapter = new ShoppingLedgerAdapter(getActivity(), shopping_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_shopping_ledger.setLayoutManager(layoutManager);
        rv_shopping_ledger.setAdapter(shoppingLedgerAdapter);
    }
}
