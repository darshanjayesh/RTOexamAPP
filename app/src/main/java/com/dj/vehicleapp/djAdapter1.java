package com.dj.vehicleapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.dj.Vehicleapp.R;

public class djAdapter1 extends ArrayAdapter<String> {
    private String []arr;

    public djAdapter1(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr=arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.dj_adapter1,parent,false);
        TextView textView=convertView.findViewById(R.id.textView);
        textView.setText(getItem(position));

        return  convertView;
    }
}
