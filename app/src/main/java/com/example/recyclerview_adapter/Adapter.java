package com.example.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * The Adapter acts like a bridge between the ArrayList and the RecyclerView.
 * It gets data from an Array and converts it to views which can be later placed in the RecyclerView.
 *
 * Layout File for one view: list_item.xml
 */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Item> itemList;

    /**
     * This inner class manages the view.
     * It gets the information about the fields that need to be filled with data.
     */
    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView item;
        private TextView quantity;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            item = itemView.findViewById(R.id.text_item);
            quantity = itemView.findViewById(R.id.text_quantity);
        }
    }

    /**
     * Constructor that gets the data for the RecyclerView.
     * This data is used for filling the views with the correct information.
     * @param itemList is the ArrayList from the MainActivity.
     */
    public Adapter(ArrayList<Item> itemList) {

        this.itemList = itemList;
    }

    /**
     * Method for creating the view of a single item.
     * Those views get displayed right below each other in a RecyclerView.
     * @param parent is a special view that can contain other views like a RecyclerView from the MainActivity.
     * @param viewType is not used but could allow the RecyclerView to have different types of views.
     * @return new ViewHolder(itemView) which has the anticipated view that gets used for the list.
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(itemView);
    }

    /**
     * Passing information from a specific item to the view.
     * @param holder is the ViewHolder for the item view.
     * @param position is the position of the item in the ArrayList.
     */
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        Item currentItem = itemList.get(position);
        holder.item.setText(currentItem.getItem());
        holder.quantity.setText("Quantity: " +currentItem.getQuantity());
    }

    @Override
    public int getItemCount() {

        return itemList.size();
    }
}
