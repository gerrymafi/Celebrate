package org.celebrate.celebrationtouch;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;


public class SignIn extends ActionBarActivity {
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void signIn(View view){
        Log.d("Animate", "Start transparency animation................................");

        LinearLayout danielLayout = (LinearLayout)findViewById(R.id.danielLayout);
        danielLayout.removeAllViews();
        View logIn = getLayoutInflater().inflate(R.layout.fragment_login, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        //left top right bottom
        layoutParams.setMargins(0, 5, 0, 0);
        logIn.setLayoutParams(layoutParams);
        danielLayout.addView(logIn);

        /*AnimatorSet as = new AnimatorSet();

        ValueAnimator logInAnim = ObjectAnimator.ofFloat(findViewById(R.id.logInFields), View.ALPHA, 1.0f);
        logInAnim.setDuration(3000);
        //logInAnim.start();

        ValueAnimator starsAnim = ObjectAnimator.ofFloat(findViewById(R.id.starsBackground), View.ALPHA, 0.75f);
        starsAnim.setDuration(3000);
        //starsAnim.start();

        as.play(starsAnim).before(logInAnim);

        scaleView(findViewById(R.id.touch), 1.0f, 0.5f);*/
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.zoom);
        ((LinearLayout)findViewById(R.id.touch)).startAnimation(animation);
    }

    public void scaleView(View v, float startScale, float endScale) {
        Animation anim = new ScaleAnimation(
                //1f, 1f, // Start and end values for the X axis scaling
                startScale, endScale,
                startScale, endScale, // Start and end values for the Y axis scaling
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                Animation.RELATIVE_TO_SELF, -2f); // Pivot point of Y scaling
        anim.setFillAfter(true); // Needed to keep the result of the animation
        anim.setDuration(1000);
        v.startAnimation(anim);

        Animation anim2 = new ScaleAnimation(
                1.0f, 1.0f,
                1.0f, 1.0f, // Start and end values for the Y axis scaling
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                Animation.RELATIVE_TO_SELF, -1f); // Pivot point of Y scaling
        anim2.setFillAfter(true); // Needed to keep the result of the animation
        anim2.setDuration(3000);
        (findViewById(R.id.logInFields)).startAnimation(anim2);
    }

    public void moveUp(View v, float startScale, float endScale) {
        Animation anim = new ScaleAnimation(
                //1f, 1f, // Start and end values for the X axis scaling
                startScale, endScale,
                startScale, endScale, // Start and end values for the Y axis scaling
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point of X scaling
                Animation.RELATIVE_TO_SELF, -2f); // Pivot point of Y scaling
        anim.setFillAfter(true); // Needed to keep the result of the animation
        anim.setDuration(1000);
        v.startAnimation(anim);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_in, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
