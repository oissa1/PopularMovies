package com.example.oi156f.popularmovies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.oi156f.popularmovies.Movie.*;

/**
 * Created by oiatt on 9/24/2017.
 */

public class TrailerAdapter extends RecyclerView.Adapter<TrailerAdapter.TrailerViewHolder> {

    private final Context mContext;

    private Trailer[] mTrailers;

    public TrailerAdapter(Context context, Trailer[] trailers) {
        mContext = context;
        mTrailers = trailers;
    }

    @Override
    public TrailerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.trailer_item, parent, false);
        return new TrailerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TrailerViewHolder holder, int position) {
        Trailer trailer = mTrailers[position];

        holder.name.setText(trailer.getName());
        if (position == getItemCount() - 1)
            holder.divider.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return mTrailers.length;
    }

    public class TrailerViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public View divider;

        public TrailerViewHolder(View view) {
            super(view);

            name = (TextView) view.findViewById(R.id.trailer_name);
            divider = view.findViewById(R.id.trailer_divider);
        }
    }
}