package com.example.gmailui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Email> listEmail;
    private EmailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview_gmail);

        listEmail = new ArrayList<>();

        listEmail.add(new Email("1"));
        listEmail.add(new Email("1"));
        listEmail.add(new Email("1"));
        listEmail.add(new Email("1"));
        listEmail.add(new Email("1"));
        listEmail.add(new Email("1"));

        adapter = new EmailAdapter(this, R.layout.email_item, listEmail);
        listView.setAdapter(adapter);
    }
}