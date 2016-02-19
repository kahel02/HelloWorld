package com.helloworld.kahel.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by kahel on 2/19/16.
 */
public class AdapterNames extends BaseAdapter {

    Context context;
    String[] names;

    public AdapterNames(Context context, String[] names){
        this.context = context;
        this.names = names;
    }

    @Override
    public int getCount() {
        return this.names.length;
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
            ViewHolderItem viewHolderItem;

            if(convertView==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.item_names, parent, false);

                viewHolderItem = new ViewHolderItem();
                viewHolderItem.textViewItem = (TextView) convertView.findViewById(R.id.txt_names);

                convertView.setTag(viewHolderItem);
            }else{
                viewHolderItem = (ViewHolderItem) convertView.getTag();
            }

        viewHolderItem.textViewItem.setText(names[position]);

         return convertView;
    }

    static class ViewHolderItem{
        TextView textViewItem;
    }
}
