package com.eventbus.adapters.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.eventbus.R;

public class FeedViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;

    public FeedViewHolder(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.tv_name);
    }
}