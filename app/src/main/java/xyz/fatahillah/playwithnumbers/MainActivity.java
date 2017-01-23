package xyz.fatahillah.playwithnumbers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFizzBuzz(View view) {

        intent = new Intent(this, FizzBuzzActivity.class);
        startActivity(intent);

    }

    public void openFindNumber(View view) {

        intent = new Intent(this, FindTheNaturalNumberActivity.class);
        startActivity(intent);

    }

    public void openGameOfThree(View view) {

        intent = new Intent(this, GameOfThreeActivity.class);
        startActivity(intent);

    }
}
