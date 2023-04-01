package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.example.pertemuan3.model.MenuAdapter;
import com.example.pertemuan3.model.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private List<MenuItem> menuItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Buat daftar menu
        menuItems.add(new MenuItem("Mie Goreng", 7000, R.drawable.indomie_goreng));
        menuItems.add(new MenuItem("Mie Ayam", 10000, R.drawable.mie_ayam));
        menuItems.add(new MenuItem("Mie Aceh", 15000, R.drawable.mie_aceh));
        menuItems.add(new MenuItem("Pasta", 10000, R.drawable.pasta));

        // Tampilkan daftar menu dalam RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_menu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MenuAdapter menuAdapter = new MenuAdapter(menuItems);
        recyclerView.setAdapter(menuAdapter);
    }
}