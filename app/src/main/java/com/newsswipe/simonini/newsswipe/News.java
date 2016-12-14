package com.newsswipe.simonini.newsswipe;

/**
 * Created by simon on 14/12/2016.
 */

public class News {

    // Title of the article
    private String mTitle;

    // Date of the article
    private String mDate;

    /* Drawable resource ID
    private int mImageResourceId;*/

    /*
    * Create a new News object.
    *
    * @param vTitle is the title of the article
    * @param vDate is the date of the article
    * @param image is drawable reference ID (not now)
    * */

    public News(String vTitle, String vDate)
    {
        mTitle = vTitle;
        mDate = vDate;
        //mImageResourceId = imageResourceId;
    }

    /**
     * Get the title of the article
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the date of the article
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Get the image resource ID

    public int getImageResourceId() {
        return mImageResourceId;
    }*/

}
