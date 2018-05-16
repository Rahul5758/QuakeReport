package com.example.android.quakereport;

/**
 * An Earthquake object contains information related to a single earthquake
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mPlace;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new Earthquake Object
     *
     * @param mMagnitude is the magnitude (size) of the earthquake
     * @param mPlace is the city location of the earthquake
     * @param mTimeInMilliSeconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(double mMagnitude, String mPlace, long mTimeInMilliSeconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mPlace = mPlace;
        this.mTimeInMilliseconds = mTimeInMilliSeconds;
        this.mUrl = url;
    }
    /**
     *Returns the magnitude of the earthquake
     */
    public double getmMagnitude() {
        return mMagnitude;
    }
    /**
     *Returns the place of the earthquake
     */
    public String getmPlace() {
        return mPlace;
    }
    /**
     *Returns the time of the earthquake
     */
    public long getmTimeInMilliSeconds() {
        return mTimeInMilliseconds;
    }

    /**
     *Returns the website URL to find more information about the earthquake.
     */

    public String getURL() { return mUrl; }
}
