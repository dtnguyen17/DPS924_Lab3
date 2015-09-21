package dtnguyen17.androidguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;


public class Terminology extends AppCompatActivity {

    private AutoCompleteTextView auto_command;

    // https://developer.android.com/guide/topics/ui/controls/text.html#AutoComplete
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminology);
        auto_command = (AutoCompleteTextView)findViewById(R.id.commands);
        String[] cmd_arr = getResources().getStringArray(R.array.command_names);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cmd_arr);
        auto_command.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_terminology, menu);
        return true;
    }

    //https://developer.android.com/guide/topics/ui/notifiers/toasts.html
    public void getToast_definition(View display)
    {
        auto_command = (AutoCompleteTextView)findViewById(R.id.commands);
        Context context = getApplicationContext();
        CharSequence text = "";
        if (auto_command.getText().toString().contentEquals("gradle build")) {
            text = "Uses Gradle to build your android app";
        }
        else if (auto_command.getText().toString().contentEquals("emulator")) {
            text = "Starts your AVD based on your Android Studio setup";
        }
        else if (auto_command.getText().toString().contentEquals("adb install")) {
            text = "Installs your app on to the emulator";
        }
        else if (auto_command.getText().toString().contentEquals("pm uninstall")) {
            text = "Uninstalls your app from the emulator";
        }
        else if (auto_command.getText().toString().contentEquals("screenshot2")) {
            text = "Takes a screenshot of your AVD's screen ";
        }
        else if (auto_command.getText().toString().contentEquals("init")) {
            text = "Initializes a directory as a Git repository";
        }
        else if (auto_command.getText().toString().contentEquals("commit")) {
            text = "Records a snapshot of the staging area";
        }
        else if (auto_command.getText().toString().contentEquals("push")) {
            text = "Push your new branches and data to a remote repository";
        }
        else if (auto_command.getText().toString().contentEquals("add")) {
            text = "Adds file contents to the staging area";
        }
        else if (auto_command.getText().toString().contentEquals("pull")) {
            text = "Fetch from a remote repo and try to merge into the current branch";
        }
        else if (auto_command.getText().toString().contentEquals("clone")) {
            text = "Copy a git repository so you can add to it";
        }
        else if (auto_command.getText().toString().contentEquals("")) {
            text = "Please type in a command to look up";
        }
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
