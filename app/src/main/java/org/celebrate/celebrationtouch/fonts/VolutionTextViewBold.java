package org.celebrate.celebrationtouch.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by mafim on 5/8/2015.
 */
public class VolutionTextViewBold extends TextView {

    public VolutionTextViewBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public VolutionTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VolutionTextViewBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Volution-Bold.otf");
            setTypeface(tf);
        }
    }

}