package com.toai.filemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;
import java.util.Objects;

public class FileListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_list);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        RecyclerView list = findViewById(R.id.recycler_view);
        TextView noFilesText = findViewById(R.id.nofile_textview);

        String path = getIntent().getStringExtra("path");
        File root = new File(path);
        File[] filesAndFolders = root.listFiles();
        if(filesAndFolders == null || filesAndFolders.length == 0) {
            noFilesText.setVisibility(View.VISIBLE);
            return;
        }

        noFilesText.setVisibility(View.INVISIBLE);

        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new ListAdapter(getApplicationContext(), filesAndFolders));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}