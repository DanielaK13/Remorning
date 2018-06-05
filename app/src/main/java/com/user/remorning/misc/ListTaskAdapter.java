package com.user.remorning.misc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import com.user.remorning.R;

import com.user.remorning.R;
import com.user.remorning.entity.Task;

public class ListTaskAdapter extends ArrayAdapter<Task> {

    public ListTaskAdapter(Context context, int textViewResourceId){
        super(context, textViewResourceId);
    }

    public ListTaskAdapter(Context context, int resource, ArrayList<Task> list){
        super(context, resource, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.tasks_list_item, null);
           // v = vi.inflate(R.layout.tasks_list_item,null);
        }

        Task t = getItem(position);

        if(t != null){
            TextView txtDescription = (TextView) v.findViewById(R.id.txtDescription);

            if(txtDescription != null){
                txtDescription.setText(t.getDescription());
            }
        }

        return v;
    }
}
