package com.pizzadelivery.cl1_dami.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pizzadelivery.cl1_dami.R;
import com.pizzadelivery.cl1_dami.model.Picture;

import java.util.ArrayList;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.ViewHolder> {

    ArrayList<Picture> pictures;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_picture,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.pizzaName.setText(pictures.get(position).getPizzaName());
        holder.pizzaPrice.setText(pictures.get(position).getPizzaPrice());
        holder.pizzaStock.setText(pictures.get(position).getPizzaStock());
        holder.picture.setImageResource(pictures.get(position).getPicture());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView picture;
        TextView pizzaName, pizzaPrice, pizzaStock;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            picture = (ImageView) itemView.findViewById(R.id.pictureCard);
            pizzaName = (TextView) itemView.findViewById(R.id.pizzaNameCard);
            pizzaPrice = (TextView) itemView.findViewById(R.id.pricePizzaCard);
            pizzaStock = (TextView) itemView.findViewById(R.id.stockPizzaCard);

        }
    }
}
