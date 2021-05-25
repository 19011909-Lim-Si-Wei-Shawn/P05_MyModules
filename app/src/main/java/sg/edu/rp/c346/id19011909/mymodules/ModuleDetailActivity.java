package sg.edu.rp.c346.id19011909.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    //Creating Variable,
    TextView TVCode;
    TextView TVName;
    TextView TVYear;
    TextView TVSemester;
    TextView TVCredit;
    TextView TVVenue;
    Button RETURNBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        //Linking Variable,
        TVCode = findViewById(R.id.textViewCode);
        TVName = findViewById(R.id.textViewName);
        TVYear = findViewById(R.id.textViewYear);
        TVSemester = findViewById(R.id.textViewSemester);
        TVCredit = findViewById(R.id.textViewCredit);
        TVVenue = findViewById(R.id.textViewVenue);
        RETURNBT = findViewById(R.id.RETURN);

        //Setting Intent,
        Intent intentReceived = getIntent();
        String Selection = intentReceived.getStringExtra("Data");

        if(Selection.contentEquals("C300")) {
            TVCode.setText("Module Code: " + Selection);
            TVName.setText("Module Name: Project");
            TVYear.setText("Academic Year: 2021");
            TVSemester.setText("Semester: 1");
            TVCredit.setText("Module Credit: 4");
            TVVenue.setText("Venue: HBL");
        }

        else if(Selection.contentEquals("C322")) {
            TVCode.setText("Module Code: " + Selection);
            TVName.setText("Module Name: Data Centre and Cloud Mgmt");
            TVYear.setText("Academic Year: 2021");
            TVSemester.setText("Semester: 1");
            TVCredit.setText("Module Credit: 4");
            TVVenue.setText("Venue: E61G");
        }

        else if(Selection.contentEquals("C382")) {
            TVCode.setText("Module Code: " + Selection);
            TVName.setText("Module Name: IT Service Delivery");
            TVYear.setText("Academic Year: 2021");
            TVSemester.setText("Semester: 1");
            TVCredit.setText("Module Credit: 4");
            TVVenue.setText("Venue: E62G");
        }

        else {
            TVCode.setText("Module Code: " + Selection);
            TVName.setText("Module Name: Mobile App Development");
            TVYear.setText("Academic Year: 2021");
            TVSemester.setText("Semester: 1");
            TVCredit.setText("Module Credit: 4");
            TVVenue.setText("Venue: E62E");
        }

        RETURNBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}