package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.thinktanker.g3.R;

/**
 * Created by MY PC on 12-Jul-17.
 */
public class FragmentStoreLocator extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_store_locator, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
    }
}
