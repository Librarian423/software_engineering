package org.techtown.se_project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Student_schedule extends AppCompatActivity {

    private Spinner sch_year,sch_month,sch_day;
    private Button btn_add,btn_back,btn_look;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_schedule);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");

        sch_year = (Spinner)findViewById(R.id.sch_year_add);
        sch_month = (Spinner)findViewById(R.id.sch_month_add);
        sch_day = (Spinner)findViewById(R.id.sch_day_add);

        btn_add = findViewById(R.id.btn_schedule_add);
        btn_add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Student_schedule_add.class);
                intent.putExtra("userID", userID);
                startActivity(intent);
            }
        });

        btn_look = findViewById(R.id.btn_schedule_look);

        btn_back = findViewById(R.id.btn_schedule_back);
        btn_back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StudentInit.class);
                intent.putExtra("userID", userID);
                startActivity(intent);
            }
        });




    }
}