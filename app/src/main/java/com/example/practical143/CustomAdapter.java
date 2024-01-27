package com.example.practical143;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomAdapter extends BaseAdapter {
    private Context com;
    String btnCollection [] = {"btn1","btn2","btn3","btn4","btn5","btn6","btn7","btn8","btn9","btn10","btn11","btn12","btn13","btn14","btn15"};

    public CustomAdapter(Context com)
    {
       this.com = com;
    }
    @Override
    public int getCount() {
        return btnCollection.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }
}
