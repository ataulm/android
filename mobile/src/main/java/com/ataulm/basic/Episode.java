package com.ataulm.basic;

import android.support.annotation.DrawableRes;

public class Episode {

    private final String name;

    @DrawableRes
    private final int titleCard;

    private final String number;

    private final String airDate;

    // typically the titleCard would be a URL and loaded - we cheat for demo!
    public Episode(String name, @DrawableRes int titleCard, String number, String airDate) {
        this.name = name;
        this.titleCard = titleCard;
        this.number = number;
        this.airDate = airDate;
    }

}
