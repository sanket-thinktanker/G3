package in.thinktanker.g3.Custom;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by HP on 09-Mar-17.
 */

public class TextViewSemiBold extends TextView {
    public TextViewSemiBold(Context context) {
        super(context);
        a();
    }

    public TextViewSemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        a();
    }

    public TextViewSemiBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a();
    }

    public void a() {
        if (Build.VERSION.SDK_INT < 21) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Montserrat-SemiBold.ttf"), 0);
            return;
        }
        int i = getTypeface().getStyle();
        if (i == 1) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Montserrat-SemiBold.ttf"), i);
            return;
        }
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Montserrat-SemiBold.ttf"), 0);
    }
}
