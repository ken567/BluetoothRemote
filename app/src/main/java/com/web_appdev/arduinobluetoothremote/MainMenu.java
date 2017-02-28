package com.web_appdev.arduinobluetoothremote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ImageButton pickupBot = (ImageButton) findViewById(R.id.pickupBot);
        ImageButton battleBot = (ImageButton) findViewById(R.id.battleBot);

        pickupBot.setOnClickListener(this);
        battleBot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;
        switch (id) {
            case R.id.pickupBot:
                intent = new Intent(MainMenu.this,PickupBot.class);
                startActivity(intent);
                break;
            case R.id.battleBot:
                intent = new Intent(MainMenu.this,BattleBot.class);
                startActivity(intent);
        }

    }
}
