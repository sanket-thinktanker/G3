package in.thinktanker.g3.Custom;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by HP on 09-Mar-17.
 */

public class TextViewLight extends TextView {
    public TextViewLight(Context context) {
        super(context);
        a();
    }

    public TextViewLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        a();
    }

    public TextViewLight(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a();
    }
    public void a() {
        if (Build.VERSION.SDK_INT < 21) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Light.ttf"), 0);
            return;
        }
        int i = getTypeface().getStyle();
        if (i == 1) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Light.ttf"), i);
            return;
        }
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Light.ttf"), 0);
    }
}
