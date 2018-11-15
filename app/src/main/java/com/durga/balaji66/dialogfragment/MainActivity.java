package com.durga.balaji66.dialogfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button fragmentButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentButton = findViewById(R.id.buttonFragment);
        fragmentButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == fragmentButton)
        {
            //FragmentManager fm = getFragmentManager();
            //we need a FragmentTransaction in order to display a dialog
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            dialog_fragment dialogFragment = new dialog_fragment();

            dialogFragment.show(transaction, "dialog_fragment");

        }

    }
}
