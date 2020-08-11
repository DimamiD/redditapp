package com.example.redditclient.repository;

import com.example.redditclient.model.RedditPost;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RedditApi {

    @GET("/top.json")
    Observable<RedditPost> getTopPosts(@Query("limit") int limit, @Query("after") String after);

}
