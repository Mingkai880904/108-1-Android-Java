package com.example.ksuie.a1217;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = this.getIntent().getExtras();
        String show_acc = bundle.getString("ACCSTR");
        ((TextView) findViewById(R.id.SHOW_ACC)).setText(show_acc);
    }

    public void scrn_close(View v) {

        RadioButton rb1 = (RadioButton) findViewById(R.id.CHK_OK);
        RadioButton rb2 = (RadioButton) findViewById(R.id.CHK_ERR);
        String isOK = "";
        if (rb1.isChecked()) isOK = "OK";
        if (rb2.isChecked()) isOK = "ERR";

        Bundle bundle = new Bundle();
        bundle.putString("CHK", isOK);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(11, intent);
        finish();
    }
}