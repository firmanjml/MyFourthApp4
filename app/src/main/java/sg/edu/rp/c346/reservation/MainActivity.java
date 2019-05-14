package sg.edu.rp.c346.reservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    Button btnClear;
    EditText txtName;
    EditText txtGroup;
    EditText txtMobile;
    DatePicker dp;
    TimePicker tp;
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtName = (EditText) findViewById(R.id.txtName);
        txtGroup = (EditText) findViewById(R.id.txtGroup);
        txtMobile = (EditText) findViewById(R.id.txtMobile);
        tp = (TimePicker) findViewById(R.id.timePicker);
        dp = (DatePicker) findViewById(R.id.datePicker);
        cb = (CheckBox) findViewById(R.id.checkBox);

        dp.updateDate(2019, 5,1);
        tp.setCurrentHour(17);
        tp.setCurrentMinute(30);
        cb.setChecked(false);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtName.getText().toString().isEmpty() || !txtMobile.getText().toString().isEmpty() || !txtGroup.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Successfully booked!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter something", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName.setText("");
                txtGroup.setText("");
                txtMobile.setText("");
                dp.updateDate(2019, 5,1);
                tp.setCurrentHour(17);
                tp.setCurrentMinute(30);
                cb.setChecked(false);
            }
        });
    }
}
