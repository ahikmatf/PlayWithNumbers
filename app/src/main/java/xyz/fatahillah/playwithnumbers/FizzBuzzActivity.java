package xyz.fatahillah.playwithnumbers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FizzBuzzActivity extends AppCompatActivity {

    EditText startNumber, endNumber;
    Button checkFizzBuzzButton;
    TextView fizzLabel, buzzLabel, fizzBuzzLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizz_buzz);

        startNumber = (EditText) findViewById(R.id.start_number);
        endNumber = (EditText) findViewById(R.id.end_number);
        checkFizzBuzzButton = (Button) findViewById(R.id.check_fizz_buzz);
        fizzLabel = (TextView) findViewById(R.id.fizz_result);
        buzzLabel = (TextView) findViewById(R.id.buzz_result);
        fizzBuzzLabel = (TextView) findViewById(R.id.fizz_buzz_result);

        checkFizzBuzzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int start = Integer.parseInt(startNumber.getText().toString());
                int end = Integer.parseInt(endNumber.getText().toString());

                checkFizzBuzz(start, end);
            }
        });
    }

    public void checkFizzBuzz(int start, int end) {

        fizzBuzzLabel.setText("");
        fizzLabel.setText("");
        buzzLabel.setText("");



    }



}
