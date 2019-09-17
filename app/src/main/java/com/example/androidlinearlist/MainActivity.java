package com.example.androidlinearlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] equipments = new String[]{"Fridge", "Heater", "Fan", "Lamp", "Dryer", "AC"};
        LinearLayout main = findViewById(R.id.main_linear);

        for (int i = 0; i < equipments.length; i++) {
            Button newButton = new Button(MainActivity.this);
            newButton.setText("+");

            TextView newEquipment = new TextView(MainActivity.this);
            newEquipment.setText(equipments[i]);

            LinearLayout main_child = new LinearLayout(MainActivity.this);
            main_child.addView(newEquipment);
            main_child.addView(newButton);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1.0f
            );
            newEquipment.setLayoutParams(params);
            main.addView(main_child);
        }
    }
}
