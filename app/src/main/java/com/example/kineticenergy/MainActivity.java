package com.example.kineticenergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtMass, edtVelocity;
    private Button btnKineticEnergy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMass = findViewById(R.id.mass);
        edtVelocity = findViewById(R.id.velocity);
        btnKineticEnergy = findViewById(R.id.kinetic_energy);
        btnKineticEnergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Mass = edtMass.getText().toString();
                String Velocity = edtVelocity.getText().toString();
                Double answer = 0.5 * Double.valueOf(Mass) * Double.valueOf(Velocity) * Double.valueOf(Velocity);
                Toast.makeText(getApplicationContext(),String.valueOf(answer),Toast.LENGTH_SHORT).show();
            }
        });
    }
}