package com.example.mycustomview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product> {
    private Context mComtext;
    private int mResource;

    public ProductAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Product> objects) {
        super(context, resource, objects);
        this.mComtext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mComtext);
        convertView = layoutInflater.inflate(mResource, parent, false);
        ImageView imageView = convertView.findViewById(R.id.image);
        TextView descr = convertView.findViewById(R.id.description);
        TextView cost = convertView.findViewById(R.id.cost);
        imageView.setImageResource(getItem(position).getImage());
        descr.setText(getItem(position).getDescription());
        cost.setText(getItem(position).getCost());
        return convertView;
    }
}
