package com.example.a2018bsharrer.final_project;

/**
 * Created by 2018jblinden on 6/1/2017.
 */

import java.util.ArrayList;

/**
 * Created by 2018jblinden on 4/27/2017.
 */

public class Tweet {
    private String mName;
    private String mMessage;

    public Tweet(String name, String message) {
        mName = name;
        mMessage = message;
    }

    public String getName() {
        return mName;
    }

    public String getMessage() {
        return mMessage;
    }

    private static int lastContactId = 0;

    public static ArrayList<Tweet> createContactsList(int numContacts) {
        ArrayList<Tweet> contacts = new ArrayList<Tweet>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Tweet("To Do Activity " + ++lastContactId, "Truth"));
        }

        return contacts;
    }
    public static ArrayList<Tweet> createImprovedList(){
        ArrayList<Tweet> contacts = new ArrayList<Tweet>();
        contacts.add(new Tweet("TJHHST - Madison (Basketball)","50-46"));
        contacts.add(new Tweet("TJHHST - Marshal (Baseball)","20-14"));
        contacts.add(new Tweet("TJHHST - Freedom (Soccer)","1-4"));
        contacts.add(new Tweet("TJHHST - Jon Champe (Swimming)","245-146"));
        contacts.add(new Tweet("TJHHST - Langley (Basketball)","48-86"));
        contacts.add(new Tweet("TJHHST - Dominion (Baseball)","5-4"));

        return contacts;
    }
    public static ArrayList<Tweet> createTweetList(){
        ArrayList<Tweet> contacts = new ArrayList<Tweet>();
        return contacts;
    }
}
