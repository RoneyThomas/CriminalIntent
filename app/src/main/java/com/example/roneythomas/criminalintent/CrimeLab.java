package com.example.roneythomas.criminalintent;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by roneythomas on 2016-05-04.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;
    private static List<Integer> mChanged;

    public List<Integer> getChanged() {
        return mChanged;
    }

    public void removeChanged(){
        mChanged.removeAll(mChanged);
    }

    public void setChanged(int changed) {
        mChanged.add(changed);
    }

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        mChanged = new ArrayList<>();
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    public Crime getCrime(UUID uuid) {
        for (Crime crimes : mCrimes) {
            if (crimes.getId().equals(uuid)) {
                return crimes;
            }
        }
        return null;
    }

    public void deleteCrime(Crime crime){
        mCrimes.remove(crime);
    }

}
