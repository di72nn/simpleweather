package org.roko.smplweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.roko.smplweather.model.ListItemViewModel;

import java.util.Collections;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater mLayoutInflater;
    private List<ListItemViewModel> items = Collections.emptyList();

    public MyAdapter(Context ctx) {
        this.mLayoutInflater = LayoutInflater.from(ctx);
    }

    public void setItems(List<ListItemViewModel> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.item, parent, false);
        }

        ListItemViewModel item = items.get(position);

        TextView tvTitle = (TextView) convertView.findViewById(R.id.itmTitle);
        tvTitle.setText(item.getTitle());
        TextView tvDescription = (TextView) convertView.findViewById(R.id.itmDescription);
        tvDescription.setText(item.getDescription());

        return convertView;
    }
}
