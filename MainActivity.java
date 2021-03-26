package com.example.ksuie.a1217;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scrn_acc(View v) {
        Intent intent = new Intent();
        intent.setClass(this, Main2Activity.class);

        String ACCSTR = ((EditText)findViewById(R.id.ACCSTR)).getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("ACCSTR", ACCSTR);
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      if (resultCode == 11){
          Bundle bundle = data.getExtras();
          String CHK = bundle.getString("CHK");
          if (CHK.equals("OK")){
              ((EditText)findViewById(R.id.ACCSTR)).setEnabled(false);
          }else{
              Toast.makeText(this,"請修正帳號",Toast.LENGTH_LONG).show();
          }
      }
    }
    public void SCRN_URL(View v) {
        Intent intent = new Intent();
        intent.setClass(this, Main3Activity.class);

        String URLSTR = ((EditText)findViewById(R.id.URLSTR)).getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("URLSTR", URLSTR);
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
    }


}
