package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
    Button button;
    EditText editText,editText1;
    String w="shashank";
    String q="Shashank@123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextTextPersonName);
        editText1 = findViewById(R.id.editTextTextPassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();
                String pwd = editText1.getText().toString();
                if (w.equals(url)&&q.equals(pwd)) {
                    Toast.makeText(getApplicationContext(), "success" + url, Toast.LENGTH_LONG).show();
                    Intent i=new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "! Authentication Failed" + url,
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}