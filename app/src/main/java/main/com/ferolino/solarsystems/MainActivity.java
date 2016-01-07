package main.com.ferolino.solarsystems;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgview = (ImageView)findViewById(R.id.imageView);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.planets_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new MyOnItemSelectedListener());
    }

    public class MyOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent,
                                   View view, int pos, long id) {
            Toast.makeText(parent.getContext(), "The planet is " +
                    parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();
            if(parent.getItemAtPosition(pos).toString().equals("Mercury")){
                imgview.setImageResource(R.drawable.mercury);
            }
            if(parent.getItemAtPosition(pos).toString().equals("Venus")){
                imgview.setImageResource(R.drawable.venus);
            }
            if(parent.getItemAtPosition(pos).toString().equals("Earth")){
                imgview.setImageResource(R.drawable.earth);
            }
            if(parent.getItemAtPosition(pos).toString().equals("Mars")){
                imgview.setImageResource(R.drawable.mars);
            }
            if(parent.getItemAtPosition(pos).toString().equals("Jupiter")){
                imgview.setImageResource(R.drawable.jupiter);
            }
            if(parent.getItemAtPosition(pos).toString().equals("Saturn")){
                imgview.setImageResource(R.drawable.saturn);
            }
            if(parent.getItemAtPosition(pos).toString().equals("Uranus")){
                imgview.setImageResource(R.drawable.uranus);
            }
            if(parent.getItemAtPosition(pos).toString().equals("Neptune")){
                imgview.setImageResource(R.drawable.neptune);
            }
            if(parent.getItemAtPosition(pos).toString().equals("Pluto")){
                imgview.setImageResource(R.drawable.pluto);
            }

        }

        public void onNothingSelected(AdapterView parent) {
            // Do nothing.
        }
    }

}
