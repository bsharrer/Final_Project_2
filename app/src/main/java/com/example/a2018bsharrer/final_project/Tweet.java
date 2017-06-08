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
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        contacts.add(new Tweet("Mom","I love Donald!"));
        return contacts;
    }
    public static ArrayList<Tweet> createTweetList(){
        ArrayList<Tweet> contacts = new ArrayList<Tweet>();
        return contacts;
    }
}
