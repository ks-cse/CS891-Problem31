package com.ksinha.countrylist;

public class Country {
    private String[] country = {
            "Australia","Chile","Egypt","Germany","India",
            "Nepal","Portugal","Russia","Uruguay","United States"
    };

    private String[] capital = {
            "Canberra","Santiago","Cairo","Berlin","New Delhi",
            "Kathmandu","Lisbon","Moscow","Montevideo","Washington D.C."
    };
    private int[] flag = {
            R.drawable.au,
            R.drawable.ch,
            R.drawable.eg,
            R.drawable.ge,
            R.drawable.in,
            R.drawable.np,
            R.drawable.pg,
            R.drawable.ru,
            R.drawable.ur,
            R.drawable.us
    };


    public int getCount(){
        return country.length;
    }
    public String getCountry(int i){
        return country[i];
    }
    public String getCapital(int i){
        return capital[i];
    }
    public int getFlag(int i){
        return flag[i];
    }
}
