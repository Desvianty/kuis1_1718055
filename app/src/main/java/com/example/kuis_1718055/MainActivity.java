package com.example.kuis_1718055;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga(R.drawable.bapak, "Iswahyudi Salim", "44 Tahun", "Ayah"));
        keluargaArrayList.add(new Keluarga(R.drawable.mama, "Yuyun Bintari", "44 Tahun", "Ibu"));
        keluargaArrayList.add(new Keluarga(R.drawable.ddes, "Desvianty Ayu Wahyudi", "20 Tahun", "Anak"));
        keluargaArrayList.add(new Keluarga(R.drawable.adek, "Bilal Arif Wahyudi", "17 Tahun", "Anak"));
    }
}
