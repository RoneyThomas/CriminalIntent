package com.example.roneythomas.criminalintent;

import android.text.format.DateFormat;

import java.util.Date;
import java.util.UUID;

/**
 * Created by roneythomas on 2016-04-08.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;

    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
