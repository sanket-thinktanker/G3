package in.thinktanker.g3.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import in.thinktanker.g3.Common.Utils;
import in.thinktanker.g3.Fragments.FragmentMain;
import in.thinktanker.g3.R;

public class MainActivity extends AppCompatActivity {

    public FrameLayout fl_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fl_main = (FrameLayout) findViewById(R.id.fl_main);
        addFragmentMain();
    }

    private void addFragmentMain() {
        FragmentMain fragmentMain = new FragmentMain();
        Utils.addFragment(fl_main.getId(), fragmentMain, MainActivity.this);
    }


}
