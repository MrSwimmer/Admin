package com.admin.qr.expo;

import android.content.Intent;
import android.renderscript.Int2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseAction extends AppCompatActivity {
    Button ReadCode, ListGuest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_action);
        ReadCode = (Button) findViewById(R.id.readcode);
        ListGuest = (Button) findViewById(R.id.listguest);
        ReadCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseAction.this, QRead.class);
                startActivity(intent);
            }
        });
    }
}
