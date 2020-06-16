package dhugald.bit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        Intent howIgotHere = getIntent();
        int score = howIgotHere.getIntExtra("Results", -1);
        TextView tv = findViewById(R.id.TVResult);
        tv.setText(score + " out of 10");
    }
}
