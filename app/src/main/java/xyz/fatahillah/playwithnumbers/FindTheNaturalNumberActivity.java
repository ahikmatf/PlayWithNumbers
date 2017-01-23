package xyz.fatahillah.playwithnumbers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FindTheNaturalNumberActivity extends AppCompatActivity {

    EditText startRange, endRange, targetIndex;
    Button checkNumber;
    TextView theNumber, ofNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_natural_number);

        startRange = (EditText) findViewById(R.id.start_range);
        endRange = (EditText) findViewById(R.id.end_range);
        targetIndex = (EditText) findViewById(R.id.target_index);
        checkNumber = (Button) findViewById(R.id.check_number);
        theNumber = (TextView) findViewById(R.id.the_number);
        ofNumber = (TextView) findViewById(R.id.of_number);

        startRange.setText("0");

        checkNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int start = Integer.parseInt(startRange.getText().toString());
                int end = Integer.parseInt(endRange.getText().toString());
                int target = Integer.parseInt(targetIndex.getText().toString());

                checkNumber(target, end);
            }
        });

    }

    public void checkNumber(int target, int end) {

        theNumber.setText("");

        int numberPosition = 0;

        for (int i = 1 ; i < end; i++) {
            String currentNumber = String.valueOf(i);

            for (int j = 0; j < currentNumber.length(); j++) {

                numberPosition += 1;

                if (numberPosition == target) {

                    theNumber.setText(String.valueOf(currentNumber.charAt(j)));
                    ofNumber.setText(currentNumber);
                    break;

                }
            }
        }
    }
}
