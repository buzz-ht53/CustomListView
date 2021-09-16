package com.buzz_ht.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    int[] images;
    String fname[];
    String lname[];
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, int[] images, String[] fname, String[] lname) {
        this.context = context;
        this.images = images;
        this.fname = fname;
        this.lname = lname;
        layoutInflater=(LayoutInflater.from(context)) ;
    }

    @Override
    public int getCount() {
        return fname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.custom_layout,null);
        ImageView imageView= view.findViewById(R.id.image);
        TextView text1 = view.findViewById(R.id.text1);
        TextView text2= view.findViewById(R.id.text2);

        imageView.setImageResource(images[i]);
        text1.setText(fname[i]);
        text2.setText(lname[i]);

        return view;
    }
}
