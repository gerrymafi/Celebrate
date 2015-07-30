package org.celebrate.celebrationtouch.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by mafim on 5/8/2015.
 */
public class VolutionTextViewLight extends TextView {

    public VolutionTextViewLight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public VolutionTextViewLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VolutionTextViewLight(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Volution-Light.otf");
            setTypeface(tf);
        }
    }

}