/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.uamp.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.uamp.R;
import com.example.android.uamp.utils.ResourceHelper;

/**
 * Placeholder activity for features that are not implemented in this sample, but
 * are in the navigation drawer.
 */
public class PlaceholderActivity extends BaseActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lout);
        initializeToolbar();


        final   Button red = findViewById(R.id.button_red);

        final   Button blue= findViewById(R.id.butto_blue);
        final   Button black = findViewById(R.id.button4);

        TextView tv= (TextView) findViewById(R.id.textView_exec);

        blue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources()
                        .getColor(R.color.blue)));
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources()
                        .getColor(R.color.red)));
                // Code here executes on main thread after user presses button
            }
        });


        black.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources()
                        .getColor(R.color.black)));
                // Code here executes on main thread after user presses button
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent( PlaceholderActivity .this, Local_Playlist.class);

                PlaceholderActivity.this.startActivity(myIntent);

            }
        });











    }

}
