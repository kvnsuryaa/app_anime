package com.example.anime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_input;
    private TextView gjudul, gsinop, grating;
    private EditText ijudul, isinop, irating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ijudul = findViewById(R.id.judul);
        irating = findViewById(R.id.rating);
        isinop = findViewById(R.id.sinopsis);

        gjudul = findViewById(R.id.Rjudul);
        gsinop = findViewById(R.id.Rsinopsis);
        grating = findViewById(R.id.Rrating);

        btn_input = findViewById(R.id.Tinput);

        btn_input.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.Tinput){

            String Tjudul = ijudul.getText().toString().trim();
            String Tsinop = isinop.getText().toString().trim();
            String Trating = irating.getText().toString().trim();

            boolean isInvalidFields = false;

            if (Tjudul == null){

                isInvalidFields = true;
                ijudul.setError("Kolom ini harus di isi");

            }
            if (Tsinop == null){

                isInvalidFields = true;
                ijudul.setError("Kolom ini harus di isi");

            }
            if (Trating == null){

                isInvalidFields = true;
                ijudul.setError("Kolom ini harus di isi");

            }

            if (!isInvalidFields)
            {

                gjudul.setText("Judul: "+Tjudul);
                gsinop.setText("Sinopsis: "+Tsinop);
                grating.setText("Rating: "+Trating);

            }


        }


    }
}
