package org.celebrate.celebrationtouch.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by mafim on 5/8/2015.
 */
public class GothamTextViewMedium extends TextView {

    public GothamTextViewMedium(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public GothamTextViewMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public GothamTextViewMedium(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Gotham-Medium.ttf");
            setTypeface(tf);
        }
    }

}