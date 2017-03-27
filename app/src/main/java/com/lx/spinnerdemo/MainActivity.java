package com.lx.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerOne,spinnerTwo,spinnerThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initOne();
        initThree();
    }

    private void initOne() {
        spinnerOne = (Spinner) findViewById(R.id.spinnerOne);
        spinnerTwo = (Spinner) findViewById(R.id.spinnerTwo);
        final String one[] = new String[]{"上海","北京","成都","杭州","湖南","山西"};
        ArrayAdapter<String> adapterOne = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,one);
        adapterOne.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOne.setAdapter(adapterOne);
        spinnerOne.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ArrayAdapter<String> adapterTwo = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,one);
                adapterTwo.setDropDownViewResource(android.R.layout.select_dialog_item);
                spinnerTwo.setAdapter(adapterTwo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    private void initThree() {
        spinnerThree = (Spinner) findViewById(R.id.spinnerThree);
        String one[] = new String[]{"上海","北京","成都","杭州","湖南","山西"};
        ArrayAdapter<String> adapterThree = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,one);
        adapterThree.setDropDownViewResource(android.R.layout.select_dialog_item);
        spinnerThree.setAdapter(adapterThree);

    }
}
