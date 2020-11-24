package com.demoapps.journal.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.demoapps.journal.R;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private ImageButton newJournalEditButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        initToolBar();
        initViews();
    }

    private void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        toolbar.setTitle(getString(R.string.section));
    }

    private void initViews(){
        newJournalEditButton = findViewById(R.id.newJournalEditButton);
        newJournalEditButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        
    }
}
