package se.jhnesk.quizbutton.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import se.jhnesk.quizbutton.R;
import se.jhnesk.quizbutton.UserState;

public class NewGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        TextView nameField = (TextView) findViewById(R.id.text_name);
        nameField.setText(UserState.INSTANCE.getName());
    }

    public void startGame(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
