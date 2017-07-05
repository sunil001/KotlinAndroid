package demo1.kotlin.kotlinhelloworld;

/**
 * Created by sunilhl on 05/07/17.
 */


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloJava extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click = (Button) findViewById(R.id.click);
        click.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Hello Java", Toast.LENGTH_SHORT).show();
    }
}

