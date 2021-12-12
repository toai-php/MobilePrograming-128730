package com.example.gmailui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EmailAdapter extends ArrayAdapter<Email> {
    public EmailAdapter(@NonNull Context context, int resource, @NonNull List<Email> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView  = LayoutInflater.from(parent.getContext()).inflate(R.layout.email_item, parent, false);
        TextView tv_category = convertView.findViewById(R.id.tv_category);
        Email category = this.getItem(position);
        if(category != null) {
            tv_category.setText(category.getName());
        }
        return convertView;
    }
}
