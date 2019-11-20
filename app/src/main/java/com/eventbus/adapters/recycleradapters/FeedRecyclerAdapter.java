package com.eventbus.adapters.recycleradapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.eventbus.R;
import com.eventbus.adapters.viewholders.FeedViewHolder;
import java.util.ArrayList;


public class FeedRecyclerAdapter extends RecyclerView.Adapter<FeedViewHolder> {

    private Context currContext;
    private ArrayList<String> itemList;

    public FeedRecyclerAdapter(Context curr_context, ArrayList<String> itemList) {
        this.itemList = itemList;
        this.currContext = curr_context;
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feed_list_item, null);
        return new FeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int position) {
        handleItemEvents(holder, position);
    }

    private void handleItemEvents(final FeedViewHolder feedViewHolder, final int position) {
        final String model = itemList.get(position);
        if (model != null) {
            try {
                feedViewHolder.tvName.setText("Added " + model + " at " + position + " position");
                feedViewHolder.tvName.setTag(feedViewHolder);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

