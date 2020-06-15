package com.google.firebase.quickstart.database.java.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class QnAFragment extends PostListFragment {

    public QnAFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START recent_posts_query]
        // Last 100 posts, these are automatically the 100 most recent
        // due to sorting by push() keys
        Query Qna = databaseReference.child("posts3")
                .orderByChild("starCount");
        // [END recent_posts_query]

        return Qna;
    }
}