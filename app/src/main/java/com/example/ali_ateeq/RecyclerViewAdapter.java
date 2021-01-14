package com.example.ali_ateeq;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static android.widget.Toast.makeText;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Inbox> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContent, List<Inbox> mData) {
        this.mContext = mContent;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_inbox,parent,false);
        final MyViewHolder viewHolder = new MyViewHolder(view);
        // Dialog
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_image);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        viewHolder.item.setOnClickListener((View v) -> {
            makeText(mContext, "Item Click : " + viewHolder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
        });

        viewHolder.image.setOnClickListener((View v) -> {
           // makeText(mContext, "Image Click : " + viewHolder.getAdapterPosition(), Toast.LENGTH_SHORT).show();


            TextView dialog_name = (TextView) myDialog.findViewById(R.id.name_dialog);
            TextView dialog_phone = (TextView) myDialog.findViewById(R.id.phone_dialog);
            dialog_name.setText(mData.get(viewHolder.getAdapterPosition()).getName());
            dialog_phone.setText(mData.get(viewHolder.getAdapterPosition()).getPhone());
            myDialog.show();

        });
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

        private final TextView tv_name;
        private final TextView tv_phone;
        private final ImageView image;
        private final ConstraintLayout item;
       // private CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //cardView = (CardView) itemView.findViewById(R.id.cardView) ;
            image = itemView.findViewById(R.id.imageView);
            tv_name= itemView.findViewById(R.id.textView4);
            tv_phone= itemView.findViewById(R.id.textView5);
            item = itemView.findViewById(R.id.item_List);

        }
    }
}
