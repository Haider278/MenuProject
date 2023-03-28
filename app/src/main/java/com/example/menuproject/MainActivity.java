package com.example.menuproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_mune, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.setting_1) {
            Toast.makeText(this, "Setting Item", Toast.LENGTH_LONG).show();
            return true;
        }
            if (item.getItemId() == R.id.help_1) {
                Toast.makeText(this, "help Item", Toast.LENGTH_LONG).show();
                return true;
            }
                if (item.getItemId() == R.id.phone_1) {
                    Toast.makeText(this, "phone Item", Toast.LENGTH_LONG).show();
                    return true;
                }
                    if (item.getItemId() == R.id.connect_1) {
                        Toast.makeText(this, "connect Item", Toast.LENGTH_LONG).show();
                        return true;
                    }
                    return false;
                }
            }