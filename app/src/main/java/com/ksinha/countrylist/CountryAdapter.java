package com.ksinha.countrylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    Country country;

    public CountryAdapter(Context context){
        this.context = context;
        inflater = LayoutInflater.from(context);
        country = new Country();
    }

    @Override
    public int getCount() {
        return country.getCount();
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
        ImageView flag;
        TextView tv_country, tv_capital;

        convertView = inflater.inflate(R.layout.list_item, parent, false);
        flag = convertView.findViewById(R.id.icon_flag);
        tv_country = convertView.findViewById(R.id.tv_country);
        tv_capital = convertView.findViewById(R.id.tv_capital);

        flag.setImageResource(country.getFlag(position));
        tv_country.setText(country.getCountry(position));
        tv_capital.setText(country.getCapital(position));

        return convertView;
    }
}
