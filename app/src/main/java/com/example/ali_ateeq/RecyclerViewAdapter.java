package com.example.ali_ateeq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContent;
    List<Inbox> mData;

    public RecyclerViewAdapter(Context mContent, List<Inbox> mData) {
        this.mContent = mContent;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContent).inflate(R.layout.item_inbox,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhone());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,tv_phone;
       // private ImageView image;
       // private CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //cardView = (CardView) itemView.findViewById(R.id.cardView) ;
            //image = (ImageView)itemView.findViewById(R.id.imageView);
            tv_name=(TextView) itemView.findViewById(R.id.textView4);
            tv_phone=(TextView) itemView.findViewById(R.id.textView5);
        }
    }
}
