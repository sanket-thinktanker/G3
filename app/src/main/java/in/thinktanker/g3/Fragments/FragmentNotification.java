package in.thinktanker.g3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import in.thinktanker.g3.Adapters.NotificationAdapter;
import in.thinktanker.g3.Models.NotificationModel;
import in.thinktanker.g3.R;

/**
 * Created by MY PC on 11-Jul-17.
 */
public class FragmentNotification extends Fragment {

    RecyclerView rv_notification;

    ArrayList<NotificationModel> notificationlist;
    NotificationAdapter notificationAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        rv_notification = (RecyclerView) view.findViewById(R.id.rv_notification);
        setNotification();
    }

    private void setNotification() {
        notificationlist = new ArrayList<NotificationModel>();
        notificationlist.add(new NotificationModel("Lorem Lipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididant ut labore et dolore magna aliqua. Ut enim and minim veniam, quis nostrud ", "Read More","30-05-2017"));
        notificationlist.add(new NotificationModel("Lorem Lipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididant ut labore et dolore magna aliqua. Ut enim and minim veniam, quis nostrud ", "Read More","30-05-2017"));
        notificationlist.add(new NotificationModel("Lorem Lipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididant ut labore et dolore magna aliqua. Ut enim and minim veniam, quis nostrud ", "Read More","30-05-2017"));
        notificationlist.add(new NotificationModel("Lorem Lipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididant ut labore et dolore magna aliqua. Ut enim and minim veniam, quis nostrud ", "Read More","30-05-2017"));

        NotificationAdapter notificationAdapter = new NotificationAdapter(getActivity(),notificationlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_notification.setLayoutManager(layoutManager);
        rv_notification.setAdapter(notificationAdapter);

    }
}
