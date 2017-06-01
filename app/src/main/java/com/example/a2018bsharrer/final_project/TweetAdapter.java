package com.example.a2018bsharrer.final_project;

/**
 * Created by 2018jblinden on 6/1/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by 2018jblinden on 4/27/2017.
 */

public class TweetAdapter extends
        RecyclerView.Adapter<TweetAdapter.ViewHolder> {

    // ... constructor and member variables

    // Usually involves inflating a layout from XML and returning the holder
    private List<Tweet> mContacts;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public TweetAdapter(Context context, List<Tweet> contacts) {
        mContacts = contacts;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public TextView messageTextView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.tweet_name);
            messageTextView = (TextView) itemView.findViewById(R.id.tweet_message);
        }
    }
    @Override
    public TweetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.tweet_layout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(TweetAdapter.ViewHolder viewHolder, final int position) {
        // Get the data model based on position
        Tweet contact = mContacts.get(position);

        // Set item views based on your views and data model
        TextView textView = viewHolder.nameTextView;
        textView.setText(contact.getName());
        TextView message = viewHolder.messageTextView;
        message.setText(contact.getMessage());
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mContacts.size();
    }
    public void addItem(String s){
        mContacts.add(new Tweet(s,s));
        notifyDataSetChanged();
        notifyItemInserted(mContacts.size()-1);
    }
}