package se.jhnesk.quizbutton.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import se.jhnesk.quizbutton.R;
import se.jhnesk.quizbutton.UserState;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newGame(View view) {
        Intent intent = new Intent(this, NewGameActivity.class);
        registerName();
        startActivity(intent);
    }

    public void joinGame(View view) {
        Intent intent = new Intent(this, JoinGameActivity.class);
        registerName();
        startActivity(intent);
    }

    private void registerName() {
        EditText nameField = (EditText) findViewById(R.id.text_name);
        UserState.INSTANCE.setName(nameField.getText().toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_settings:
                return true;
            default:
               return super.onOptionsItemSelected(item);
        }
    }
}
