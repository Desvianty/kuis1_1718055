package com.example.kuis_1718055;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter <KeluargaAdapter.KeluargaViewHolder> {
    private ArrayList<Keluarga> dataList;

    public KeluargaAdapter(ArrayList<Keluarga> keluargaArrayList){
        this.dataList = keluargaArrayList;
    }

    @NonNull
    @Override
    public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga,parent, false);
        return new KeluargaViewHolder(view);
    }

    public void onBindViewHolder(KeluargaViewHolder holder, int position){
        holder.img.setImageResource(dataList.get(position).getFoto());
        holder.tV_Nama.setText(dataList.get(position).getNama());
        holder.tV_Umur.setText(dataList.get(position).getUmur());
        holder.tV_Status.setText(dataList.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return (dataList !=null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView tV_Nama, tV_Umur, tV_Status;
        private ImageView img;

        public KeluargaViewHolder(@NonNull View itemView){
            super(itemView);
            img = itemView.findViewById(R.id.image_foto);
            tV_Nama = itemView.findViewById(R.id.tv_nama);
            tV_Umur = itemView.findViewById(R.id.tv_umur);
            tV_Status = itemView.findViewById(R.id.tv_status);
        }
    }
}
