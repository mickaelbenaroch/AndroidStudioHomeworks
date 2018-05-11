package com.example.nhftk.mickaelbenaroch;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ProgrammingAdapter2 extends RecyclerView.Adapter<ProgrammingAdapter2.ProgrammingViewHolder2>  {


    private String[] data;
    public ProgrammingAdapter2(String[] data)
    {
        this.data = data;
    }


    @NonNull
    @Override
    public ProgrammingAdapter2.ProgrammingViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.list_of_birthdays, parent, false);
            return new ProgrammingAdapter2.ProgrammingViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder2 holder, int position) {
        String title = data[position];
        holder.textTitle.setText(title);
    }


    @Override
    public int getItemCount() {
        return data.length;
    }


    public class  ProgrammingViewHolder2 extends RecyclerView.ViewHolder {

        ImageView imgIcon;
        TextView textTitle;

        public ProgrammingViewHolder2(View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            textTitle = (TextView) itemView.findViewById(R.id.textTitle);

        }

    }


}
