package dhugald.bit;

        import androidx.appcompat.app.AppCompatActivity;

        import android.graphics.drawable.Drawable;
        import android.os.Bundle;
        import android.content.Intent;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.Switch;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Question[] questions = new Question[10];
    private int score = 0;
    private int questionNum = 0;
    private RadioGroup rg;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg= findViewById(R.id.radioGroup);
        img = findViewById(R.id.imageChangable);
        img.setImageResource(R.drawable.mt);
        Button btnchk = (Button) findViewById(R.id.buttonchk);
        btnchk.setOnClickListener(this);
        score = 0;
        questionNum = 0;
        setUpQuestions();
        showQuestion();

    }

    public void setUpQuestions() {
        for (int i = 0; i < questions.length; i++) {
            questions[i] = new Question(i);
        }
    }
    public void showQuestion() {
        TextView quest = findViewById(R.id.questionText);
        quest.setText(questions[questionNum].questionString());
        populateButtons();
        switch (questionNum){
            case 0:
                img.setImageResource(R.drawable.mt);
                break;
            case 1:
                img.setImageResource(R.drawable.tasmanglacier);
                break;
            case 2:
                img.setImageResource(R.drawable.tasmanglacier);
                break;
            case 3:
                img.setImageResource(R.drawable.pukaki);
                break;
            case 4:
                img.setImageResource(R.drawable.mt);
                break;
            case 5:
                img.setImageResource(R.drawable.firstcookclimb);
                break;
            case 6:
                img.setImageResource(R.drawable.ed);
                break;
            case 7:
                img.setImageResource(R.drawable.mt);
                break;
            case 8:
                img.setImageResource(R.drawable.tasmanglacier);
                break;
            case 9:
                img.setImageResource(R.drawable.mt);
                break;
        }
    }

    public void populateButtons(){
        RadioButton r1 = findViewById(R.id.radioButton);
        RadioButton r2 = findViewById(R.id.radioButton2);
        RadioButton r3 = findViewById(R.id.radioButton3);
        RadioButton r4 = findViewById(R.id.radioButton4);
        Random rand = new Random();
        switch(rand.nextInt(4))
        {
            case 0:
                r1.setText(questions[questionNum].quesAnswer);
                r2.setText(questions[questionNum].quesAnswer4);
                r3.setText(questions[questionNum].quesAnswer3);
                r4.setText(questions[questionNum].quesAnswer2);
                break;
            case 1:
                r1.setText(questions[questionNum].quesAnswer2);
                r2.setText(questions[questionNum].quesAnswer3);
                r3.setText(questions[questionNum].quesAnswer);
                r4.setText(questions[questionNum].quesAnswer4);
                break;
            case 2:
                r1.setText(questions[questionNum].quesAnswer4);
                r2.setText(questions[questionNum].quesAnswer3);
                r3.setText(questions[questionNum].quesAnswer2);
                r4.setText(questions[questionNum].quesAnswer);
                break;
            case 3:
                r1.setText(questions[questionNum].quesAnswer2);
                r2.setText(questions[questionNum].quesAnswer);
                r3.setText(questions[questionNum].quesAnswer4);
                r4.setText(questions[questionNum].quesAnswer3);
                break;
        }
    }
    @Override
    public void onClick(View v) {
        if(rg.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Please select an answer", Toast.LENGTH_LONG).show();
        }
        else if (questionNum < questions.length) {
            RadioGroup rg = findViewById(R.id.radioGroup);
            int selected = rg.getCheckedRadioButtonId();
            RadioButton chosen = findViewById(selected);
            if (chosen.getText().equals(questions[questionNum].getAnswer())) {
                score++;
            } else {
                Toast.makeText(this, "Wrong, the correct answer was: " + questions[questionNum].getAnswer(), Toast.LENGTH_LONG).show();
            }
            questionNum++;
            rg.clearCheck();
            if (questionNum < questions.length) {
                showQuestion();
            } else {
                Intent changeActivity = new Intent(MainActivity.this, ResultsPage.class);
                changeActivity.putExtra("Results", score);
                startActivity(changeActivity);
            }
        }
   }
}
