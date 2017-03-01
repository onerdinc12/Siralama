package com.example.onder.isimsiralama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.isim);
        e2 = (EditText) findViewById(R.id.soyad);
        tv   = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);

    }

    public void gir(View view) {
        tv.setText("");
        tv2.setText("");
        String isimler = e1.getText().toString();
        String soyad = e2.getText().toString();
        String parcala[] = isimler.split(" ");

        Arrays.sort(parcala);

        int i;

        for(i = 0;i < parcala.length;i++){
            tv.append(" " + parcala[i]);

        }


        String maskeleme  = tv.getText().toString();
        tv.append(" " + soyad);

        String parcala2[] =  maskeleme.split(" ");
        String sonYazdir = parcala2[2].substring(0,1) +"....";
        Arrays.sort(parcala2);
        for(int j =0;j<=i;j++){
            if(j==2 || j==1){
                tv2.setText(" "+sonYazdir);
                tv2.setText(" "+ parcala2[1] +" " + sonYazdir);

            }else{
                tv2.append(" "+ parcala2[j]);
            }

        }
        tv2.append(" " + soyad);



    }
}
