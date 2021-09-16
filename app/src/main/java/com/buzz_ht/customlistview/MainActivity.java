package com.buzz_ht.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] fname={"Amazon","Google","Facebook","Microsoft"};
    String[] lname= {"AWS","Youtube","Whatsapp","Outlook"};
    int[] images = {R.drawable._00_f_296914204_aws,R.drawable.yt,R.drawable.wht,R.drawable.outlook};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.listview);

        MyAdapter myAdapter= new MyAdapter(MainActivity.this,images,fname,lname);
        listView.setAdapter(myAdapter);




    }
}