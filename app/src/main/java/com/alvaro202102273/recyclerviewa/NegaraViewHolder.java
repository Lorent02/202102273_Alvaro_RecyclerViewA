package com.alvaro202102273.recyclerviewa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class NegaraViewHolder extends RecyclerView.ViewHolder {
    public NegaraViewHolder(@NonNull View itemView) {
        super(itemView);
        _imageView1 = (ImageView) itemView.findViewById(R.id.imageView1);
        _namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        _deskripsiTextView = (TextView) itemView.findViewById(R.id.deskripsiTextView);
    }
    public ImageView _imageView1;
    public TextView _deskripsiTextView;
    public TextView _namaTextView;
}
