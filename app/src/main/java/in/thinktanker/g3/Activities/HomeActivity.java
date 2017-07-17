package in.thinktanker.g3.Activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import in.thinktanker.g3.Common.Utils;
import in.thinktanker.g3.Fragments.FragmentAccountDetail;
import in.thinktanker.g3.Fragments.FragmentCouponCategory;
import in.thinktanker.g3.Fragments.FragmentDrawer;
import in.thinktanker.g3.Fragments.FragmentMain;
import in.thinktanker.g3.Fragments.FragmentNotification;
import in.thinktanker.g3.Fragments.FragmentShoppingLedger;
import in.thinktanker.g3.R;

public class HomeActivity extends AppCompatActivity {
    public DrawerLayout drawer;
    ImageView ic_menu_icon, iv_notification;
    public FrameLayout fl_home, fl_drawer;
    FragmentDrawer fragmentDrawer;
    LinearLayout ll_home, ll_categories, ll_wallet, ll_my_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setSideMenu();
        addFragmentDrawer();
    }

    private void setSideMenu() {
        try {
            Toolbar toolbar = ((Toolbar) findViewById(R.id.toolbar));
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
                @Override
                public void onDrawerOpened(View drawerView) {
                    super.onDrawerOpened(drawerView);
                    // if (fragmentDrawer != null)
                    //  fragmentHomeDrawer.setUserData();
                }
            };
            drawer.setDrawerListener(toggle);
            toggle.syncState();
            if (Build.VERSION.SDK_INT >= 14)
                drawer.setFitsSystemWindows(true);
            init();
        } catch (Exception ex) {
        }
    }

    private void init() {
        fl_home = (FrameLayout) findViewById(R.id.fl_home);
        fl_drawer = (FrameLayout) findViewById(R.id.fl_drawer);
        ic_menu_icon = (ImageView) findViewById(R.id.ic_menu_icon);

        iv_notification = (ImageView) findViewById(R.id.iv_notification);

        ll_home = (LinearLayout) findViewById(R.id.ll_home);
        ll_categories = (LinearLayout) findViewById(R.id.ll_categories);
        ll_wallet = (LinearLayout) findViewById(R.id.ll_wallet);
        ll_my_account = (LinearLayout) findViewById(R.id.ll_my_account);

        ll_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentMain fragmentMain = new FragmentMain();
                Utils.AddFragmentBack(R.id.fl_home, fragmentMain, HomeActivity.this);
            }
        });

        ll_categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentCouponCategory couponCategory = new FragmentCouponCategory();
                Utils.AddFragmentBack(R.id.fl_home, couponCategory, HomeActivity.this);
            }
        });

        ll_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentShoppingLedger shoppingLedger = new FragmentShoppingLedger();
                Utils.AddFragmentBack(R.id.fl_home, shoppingLedger, HomeActivity.this);
            }
        });

        ll_my_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAccountDetail accountDetail = new FragmentAccountDetail();
                Utils.AddFragmentBack(R.id.fl_home, accountDetail, HomeActivity.this);
            }
        });

        iv_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentNotification customerReview = new FragmentNotification();
                Utils.AddFragmentBack(R.id.fl_home, customerReview, HomeActivity.this);
            }
        });
        ic_menu_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(Gravity.RIGHT);
            }
        });
    }

    private void addFragmentDrawer() {
        fragmentDrawer = new FragmentDrawer();
        Utils.addFragment(fl_drawer.getId(), fragmentDrawer, HomeActivity.this);
    }
}
