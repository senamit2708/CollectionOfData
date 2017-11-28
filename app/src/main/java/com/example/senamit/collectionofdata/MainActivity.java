package com.example.senamit.collectionofdata;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSnackbar = (Button)findViewById(R.id.btn_snackbar);
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)findViewById(R.id.coordinator_main);
        btnSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(coordinatorLayout, "simple snackbar", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });


    }
}
