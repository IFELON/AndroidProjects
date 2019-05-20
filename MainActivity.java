package in.suriya.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{

        int number;

        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot)){

                return true;

            }else{
                return false;
            }

        }

        public boolean isTriangular(){

            int x = 1;

            int triangularNumber = 1;

            while(triangularNumber<number){

                x++;

                triangularNumber =triangularNumber+x;
            }
            if(triangularNumber == number){

                return true;

            }else{
                return false;
            }
        }
    }

    public void testNumber(View view) {
        EditText usersNumber = (EditText) findViewById(R.id.UsersNumber);

        String message = "";

        if (usersNumber.getText().toString().isEmpty()) {
            message = "Please enter a number";
        } else {

            Log.i("UsersNumber", usersNumber.getText().toString());

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(usersNumber.getText().toString());

            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {
                    message = myNumber.number + "IS both Triangular & Square";
                } else {
                    message = myNumber.number + "Is Square but not Triangular.";
                }
            } else {
                if (myNumber.isTriangular()) {
                    message = myNumber.number + "IS Triangular but not Square";
                } else {
                    message = myNumber.number + "Neither Square  nor Triangular.";
                }
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
