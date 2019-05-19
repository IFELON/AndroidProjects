package in.suriya.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void makeToast(String string){
        Toast.makeText(this,string, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view){

        EditText guessEdittext = (EditText)findViewById(R.id.guessEdttxt);
        int guessint = Integer.parseInt(guessEdittext.getText().toString());
        
        if (guessint>randomNumber){
            makeToast("Lower");
        }else if (guessint<randomNumber){
            makeToast("Higher");
        }else{
            makeToast("That's right! Try Again!");

            Random rand = new Random();
            randomNumber = rand.nextInt(20)+1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;

    }
}
