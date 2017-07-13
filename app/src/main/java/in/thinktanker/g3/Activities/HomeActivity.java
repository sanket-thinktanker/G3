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

import in.thinktanker.g3.Common.Utils;
import in.thinktanker.g3.Fragments.FragmentDrawer;
import in.thinktanker.g3.R;

public class HomeActivity extends AppCompatActivity {
    public DrawerLayout drawer;
    ImageView ic_menu_icon;
    public FrameLayout fl_home,fl_drawer;
    FragmentDrawer fragmentDrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
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
