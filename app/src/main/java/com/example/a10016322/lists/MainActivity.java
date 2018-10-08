package com.example.a10016322.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView displaySelection;
    ArrayList<String> spinnerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)(findViewById(R.id.spinner_id));
        displaySelection = (TextView)(findViewById(R.id.textView_id));

        spinnerList = new ArrayList<>();
        spinnerList.add("Jim");
        spinnerList.add("Bob");
        spinnerList.add("Mary");
        spinnerList.add("Joe");
        spinnerList.add("Tim");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, spinnerList);
        spinner.setAdapter(spinnerAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                displaySelection.setText(spinnerList.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                displaySelection.setText("No Selection Made");
            }
        });

    }
}
