package com.example.arora.cehroindia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mac on 22/07/16.
 */

public class LivelihoodProgActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.program_detail);

        ImageView programImage = (ImageView) findViewById(R.id.program_spec_image);
        programImage.setImageResource(R.drawable.live_final);

        TextView programTitle = (TextView) findViewById(R.id.program_spec_title);
        programTitle.setText(R.string.Title_Livelihood);

        TextView programDescription = (TextView) findViewById(R.id.program_spec_description);
        programDescription.setText(R.string.Description_Livelihood);


    }
}
