package com.as.androidbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.reminders_list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,R.layout.reminders_row,R.id.row_text,new String[]{"frist record","second record","thrid recond"}
        );
        mListView.setAdapter(arrayAdapter);
    }
}
