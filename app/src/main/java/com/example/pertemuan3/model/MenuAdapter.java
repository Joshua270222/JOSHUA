package com.example.pertemuan3.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.pertemuan3.R;

import java.util.List;
import java.util.Locale;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private List<MenuItem> menuItems;

    public MenuAdapter(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nameView;
        private TextView priceView;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.image_menu);
            nameView = view.findViewById(R.id.text_menu_name);
            priceView = view.findViewById(R.id.text_menu_price);
        }

        public void bind(MenuItem menuItem) {
            imageView.setImageResource(menuItem.getImage());
            nameView.setText(menuItem.getName());
            priceView.setText(String.format(Locale.getDefault(), "Rp.%d", menuItem.getPrice()));
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(menuItems.get(position));
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }
}