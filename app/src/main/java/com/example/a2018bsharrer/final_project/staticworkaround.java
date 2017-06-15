package com.example.a2018bsharrer.final_project;

import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;

/**
 * Created by 2018jblinden on 6/15/2017.
 */

public class staticworkaround {
    private TweetTimelineListAdapter a=null;
    public staticworkaround(TweetTimelineListAdapter c)
    {
       a=c;
    }
    public TweetTimelineListAdapter get()
    {
        return a;
    }
}
