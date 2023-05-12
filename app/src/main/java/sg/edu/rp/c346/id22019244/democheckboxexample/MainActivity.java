package sg.edu.rp.c346.id22019244.democheckboxexample;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnCheck;
    CheckBox cbEnabled;
    TextView tvShow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MyActivity", "Inside onClick()");



        btnCheck = findViewById(R.id.button);
        cbEnabled = findViewById(R.id.checkBoxDiscount);
        tvShow = findViewById(R.id.textView);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbEnabled.isChecked()){
                    tvShow.setText(R.string.discount_text);
                }

                Toast.makeText(MainActivity.this , "The button has been clicked", Toast.LENGTH_LONG).show();
            }
        });




    }
}


