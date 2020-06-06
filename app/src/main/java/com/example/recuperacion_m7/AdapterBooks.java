package com.example.recuperacion_m7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterBooks extends RecyclerView.Adapter<AdapterBooks.ViewHolderBooks>{
    ArrayList<ArrayVi> listbooks;

    public AdapterBooks(ArrayList<ArrayVi> listbooks) {
        this.listbooks = listbooks;
    }

    @Override
    public ViewHolderBooks onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_books, parent, false);
        ViewHolderBooks vh = new ViewHolderBooks(view);
        return vh;
    }

    @Override
    public void onBindViewHolder( ViewHolderBooks holder, int position) {
        holder.Namebook.setText(listbooks.get(position).getName());
        holder.Valoration.setText(listbooks.get(position).getValoration());
    }

    @Override
    public int getItemCount() {
        return listbooks.size();
    }

    public class ViewHolderBooks extends RecyclerView.ViewHolder {
        TextView Namebook;
        TextView Valoration;

        public ViewHolderBooks(View itemView) {
            super(itemView);
            Namebook = itemView.findViewById(R.id.Namebook);
            Valoration = itemView.findViewById(R.id.Valoration);
        }
    }
}
