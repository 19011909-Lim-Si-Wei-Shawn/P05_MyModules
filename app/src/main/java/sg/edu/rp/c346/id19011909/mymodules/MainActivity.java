package sg.edu.rp.c346.id19011909.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    TextView C300TV;
    TextView C322TV;
    TextView C382TV;
    TextView C346TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        C300TV = findViewById(R.id.TV300);
        C322TV = findViewById(R.id.TV322);
        C382TV = findViewById(R.id.TV382);
        C346TV = findViewById(R.id.TV346);

        //Setting Action,
        //C300 Activity,
        C300TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Data", "C300");
                startActivity(intent);
            }
        });

        //C322 Activity,
        C322TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Data", "C322");
                startActivity(intent);
            }
        });

        //C382 Activity,
        C382TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Data", "C382");
                startActivity(intent);
            }
        });

        //C346 Activity,
        C346TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Data", "C346");
                startActivity(intent);
            }
        });

    }
}