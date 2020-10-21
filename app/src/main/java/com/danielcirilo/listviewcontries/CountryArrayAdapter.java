package com.danielcirilo.listviewcontries;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;




public class CountryArrayAdapter extends ArrayAdapter<Country> {
    private Country []datos;
    public CountryArrayAdapter(@NonNull Context context, Country [] datos) {
        super(context,R.layout.listitem_country,datos);
        this.datos = datos;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item = convertView;
        ViewHolder holder;
        if (item == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(R.layout.listitem_country, null);
            // nombre del pais
            holder = new ViewHolder();
            holder.tvPais = item.findViewById(R.id.tvNomPais);
            // nombre de la capital
            holder.tvCapital = item.findViewById(R.id.tvCapital);
            //Poblacion
            holder.tvPoblacio = item.findViewById(R.id.tvPoblacion);
            holder.ivBandera = item.findViewById(R.id.ivBanderas);
            item.setTag(holder);
        }
        else{
            holder = (ViewHolder) item.getTag();
        }
        int id = this.getContext().getResources().getIdentifier("_"+datos[position].getCountryCode().toLowerCase()
                , "drawable", this.getContext().getPackageName());
        holder.tvCapital.setText(datos[position].getCapital());
        holder.tvPais.setText(datos[position].getCountryName());
        holder.tvPoblacio.setText(String.valueOf(datos[position].getPopulation()));
        holder.ivBandera.setImageResource(id);
        return item;
    }
    static class ViewHolder{
        TextView tvPais;
        TextView tvCapital;
        TextView tvPoblacio;
        ImageView ivBandera;
    }
}