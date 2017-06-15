package com.example.a2018bsharrer.final_project;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;


import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;
import com.twitter.sdk.android.tweetui.internal.ViewPagerFixed;

/**
 * Created by 2018jblinden on 6/13/2017.
 */

public class jacob_pg extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_jacob, container, false);
        Toast.makeText(getActivity(), "HERE", Toast.LENGTH_LONG).show();

        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName("twitterdev")
                .build();
        /*
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(getActivity())
                .setTimeline(userTimeline)
                .build();
               */

        ListView t = (ListView) rootView.findViewById(R.id.listid);
        //t.setAdapter(adapter);

        //rootView = inflater.inflate(R.layout.fragment_main, container, false);

        return rootView;
    }
}
