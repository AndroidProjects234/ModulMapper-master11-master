package com.example.modulmapper;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class modules extends AppCompatActivity {

    String pathway;
    String admin;
    Module module = new Module();
    DatabaseHelper db;
    ArrayList<Module> modules = new ArrayList<>();
    int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Bundle data = getIntent().getExtras();
        if(data==null){
            return;
        }

        admin = data.getString("admin");
        pathway = data.getString("pathway");
        year = data.getInt("year");

        TextView pathwayTitle = findViewById(R.id.pathwayTitle);
        pathwayTitle.setText(pathway);

        addModules();

        TextView moduleTitle1 = findViewById(R.id.moduleTitle1);
        moduleTitle1.setText(module.get_moduleTitle());

        /*TextView moduleTitle2 = findViewById(R.id.moduleTitle2);
        moduleTitle2.setText(moduleTitles.get(1));
        TextView moduleTitle3 = findViewById(R.id.moduleTitle3);
        moduleTitle3.setText(moduleTitles.get(2));
        TextView moduleTitle4 = findViewById(R.id.moduleTitle4);
        moduleTitle4.setText(moduleTitles.get(3));
        TextView moduleTitle5 = findViewById(R.id.moduleTitle5);
        moduleTitle5.setText(moduleTitles.get(4));
        TextView moduleTitle6 = findViewById(R.id.moduleTitle6);
        moduleTitle6.setText(moduleTitles.get(5));
        TextView moduleTitle7 = findViewById(R.id.moduleTitle7);
        moduleTitle7.setText(moduleTitles.get(6));
        TextView moduleTitle8 = findViewById(R.id.moduleTitle8);
        moduleTitle8.setText(moduleTitles.get(7));*/

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }

    public void addModules() {
        if (pathway == "software" && year == 1) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("SOFTWARE_ENGINEERING_SEM_1", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("SOFTWARE_ENGINEERING_SEM_2", x);
                modules.add(module);
            }

        } else if (pathway == "network" && year == 1) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("NETWORK_ENGINEERING_SEM_1", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("NETWORK_ENGINEERING_SEM_2", x);
                modules.add(module);
            }

        } else if (pathway == "web" && year == 1) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("WEB_DEVELOPMENT_SEM_1", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("WEB_DEVELOPMENT_SEM_2", x);
                modules.add(module);
            }

        } else if (pathway == "database" && year == 1) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("DATABASE_ARCHITECTURE_SEM_1", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("DATABASE_ARCHITECTURE_SEM_2", x);
                modules.add(module);
            }

        }

        if (pathway == "software" && year == 2) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("SOFTWARE_ENGINEERING_SEM_3", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("SOFTWARE_ENGINEERING_SEM_4", x);
                modules.add(module);
            }

        } else if (pathway == "network" && year == 2) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("NETWORK_ENGINEERING_SEM_3", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("NETWORK_ENGINEERING_SEM_4", x);
                modules.add(module);
            }

        } else if (pathway == "web" && year == 2) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("WEB_DEVELOPMENT_SEM_3", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("WEB_DEVELOPMENT_SEM_4", x);
                modules.add(module);
            }

        } else if (pathway == "database" && year == 2) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("DATABASE_ARCHITECTURE_SEM_3", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("DATABASE_ARCHITECTURE_SEM_4", x);
                modules.add(module);
            }

        }

        if (pathway == "software" && year == 3) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("SOFTWARE_ENGINEERING_SEM_5", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("SOFTWARE_ENGINEERING_SEM_6", x);
                modules.add(module);
            }

        } else if (pathway == "network" && year == 3) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("NETWORK_ENGINEERING_SEM_5", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("NETWORK_ENGINEERING_SEM_6", x);
                modules.add(module);
            }

        } else if (pathway == "web" && year == 3) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("WEB_DEVELOPMENT_SEM_5", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("WEB_DEVELOPMENT_SEM_6", x);
                modules.add(module);
            }

        } else if (pathway == "database" && year == 3) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("DATABASE_ARCHITECTURE_SEM_5", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("DATABASE_ARCHITECTURE_SEM_6", x);
                modules.add(module);
            }

        }

        if (pathway == "software" && year == 4) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("SOFTWARE_ENGINEERING_SEM_7", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("SOFTWARE_ENGINEERING_SEM_8", x);
                modules.add(module);
            }

        } else if (pathway == "network" && year == 4) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("NETWORK_ENGINEERING_SEM_7", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("NETWORK_ENGINEERING_SEM_8", x);
                modules.add(module);
            }

        } else if (pathway == "web" && year == 4) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("WEB_DEVELOPMENT_SEM_7", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("WEB_DEVELOPMENT_SEM_8", x);
                modules.add(module);
            }

        } else if (pathway == "database" && year == 4) {

            for (int x = 1; x <= 4; x++) {
                module = db.getModule("DATABASE_ARCHITECTURE_SEM_7", x);
                modules.add(module);
            }
            for (int x = 1; x <= 4; x++) {
                module = db.getModule("DATABASE_ARCHITECTURE_SEM_8", x);
                modules.add(module);
            }

        }

    }

}
