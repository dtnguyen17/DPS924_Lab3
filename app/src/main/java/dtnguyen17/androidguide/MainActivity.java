package dtnguyen17.androidguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button button_term;
    private static Button button_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButton1Listener();
        OnClickButton2Listener();
    }

    //https://www.youtube.com/watch?v=3f0NAn5xFy4
    public void OnClickButton1Listener() {
        button_term = (Button) findViewById(R.id.button);
        button_term.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("dtnguyen17.androidguide.Terminology");
                        startActivity(intent);
                    }
                }
        );

    }

    //https://www.youtube.com/watch?v=3f0NAn5xFy4
    public void OnClickButton2Listener() {
        button_web = (Button) findViewById(R.id.button2);
        button_web.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =  new Intent("dtnguyen17.androidguide.Websites");
                        startActivity(intent);
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //https://www.youtube.com/watch?v=JBSfpEsT4jk
        if (id == R.id.action_help) {

            Intent intent =  new Intent(this, HelpActivity.class);
            startActivity(intent);
            return true;
        }

        //https://www.youtube.com/watch?v=JBSfpEsT4jk
        if (id == R.id.action_about) {

            Intent intent =  new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
