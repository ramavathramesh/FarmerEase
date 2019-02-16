package com.example.rameshnayak.farmerease;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import javax.xml.parsers.FactoryConfigurationError;

public class HomeActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);

    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {
                        Intent intent = new Intent(HomeActivity.this, CustomerActivity.class);
                        startActivity(intent);

                    } else if (finalI == 1) {
                        Intent intent = new Intent(HomeActivity.this, YoutubeActivity.class);
                        startActivity(intent);

                    } else if (finalI == 2) {

                        Intent intent = new Intent(HomeActivity.this, FarmerActivity.class);
                        startActivity(intent);

                    } else if (finalI == 4) {

                        Intent intent = new Intent(HomeActivity.this, NeswfeedActivity.class);
                        startActivity(intent);

                    } else {
                        Intent intent = new Intent(HomeActivity.this, NeswfeedActivity.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}
