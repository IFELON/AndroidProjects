package in.suriya.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fading(View view){

        ImageView bart = (ImageView) findViewById(R.id.bart);
        bart.animate()
                .translationXBy(1000)
                .translationYBy(1000)
                .rotation(3600)
                .setDuration(2000);
/*
        ImageView img2 = (ImageView)findViewById(R.id.img2);
        img2.animate().alphaBy(1).setDuration(2000);*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.bart);
        bart.setTranslationX(-1000);
        bart.setTranslationY(-1000);

    }
}
