package com.example.testlist.adapters;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.testlist.R;

import java.util.List;

public class TodoAdapter extends ArrayAdapter<Todo> {
    public TodoAdapter(Context context, List<Todo> listTodo){
        super(context, 0, listTodo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Todo item = getItem(position);
        if (null ==convertView){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.customlayout, parent, false);
        }
        TextView textDescription = convertView.findViewById(R.id.textDescription);
        TextView textDate = convertView.findViewById(R.id.textDate);

        textDescription.setText(item.getDescription());
        textDate.setText(item.getDate());

        return convertView;
    }
}
