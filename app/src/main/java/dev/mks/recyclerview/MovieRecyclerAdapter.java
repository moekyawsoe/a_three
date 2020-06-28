package dev.mks.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MyViewHolder> {

    List<MovieListModel> movieListModels;
    Context context;

    public MovieRecyclerAdapter(List<MovieListModel> movieListModels, Context context) {
        this.movieListModels = movieListModels;
        this.context = context;
    }

    @NonNull
    @Override
    //Linking MyViewHolder and ViewGroup
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    //Data Linker
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        MovieListModel listModel = movieListModels.get(position);
        holder.tvTitle.setText(listModel.getTitle());
        holder.tvGenre.setText(listModel.getGenre());
        holder.tvYear.setText(listModel.getYear());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You clicked : "+ movieListModels.get(position),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return movieListModels.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle,tvGenre,tvYear;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.title);
            tvGenre = itemView.findViewById(R.id.genre);
            tvYear = itemView.findViewById(R.id.year);
            cardView = itemView.findViewById(R.id.recycler_item_view);
        }
    }



}
