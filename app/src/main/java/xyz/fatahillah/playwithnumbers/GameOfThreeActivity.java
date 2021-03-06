package xyz.fatahillah.playwithnumbers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameOfThreeActivity extends AppCompatActivity {

    EditText currentNumber;
    Button checkThreeButton;
    TextView currentInteger, progressNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_of_three);

        currentNumber = (EditText) findViewById(R.id.input_number);
        checkThreeButton = (Button) findViewById(R.id.check_three);
        currentInteger = (TextView) findViewById(R.id.current_integer);
        progressNumber = (TextView) findViewById(R.id.progress_number);

        checkThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int input = Integer.parseInt(currentNumber.getText().toString());

                checkThree(input);
            }
        });

    }

    public void checkThree(int input) {

        currentInteger.setText("");
        progressNumber.setText("");
        currentInteger.setText(String.valueOf(input));

        for (int i = input; i >= 3;) {

            Log.d("current i", "" + i);

            if (i % 3 == 0) {

                i = i / 3;
                Log.d("prog a i", "" + i);

                progressNumber.setText(progressNumber.getText() + "0, ");


            } else if (i % 3 == 1) {

                i = (i - 1) / 3;
                Log.d("prog b i", "" + i);

                progressNumber.setText(progressNumber.getText() + "-1, ");


            } else if (i % 3 == 2) {

                i = (i + 1) / 3;
                Log.d("prog c i", "" + i);

                progressNumber.setText(progressNumber.getText() + "+1, ");

            }

            if (i >= 3) {

                currentInteger.setText(currentInteger.getText() + ", " + String.valueOf(i));

            }

        }

    }
}
