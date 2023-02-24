package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {

    ArrayList<User> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        RecyclerView recyclerViewUser = findViewById(R.id.recyclerViewUser);

        userArrayList = new ArrayList<>();
        userArrayList.add(new User("121", "121", "121@gmail.com",R.drawable.avatar));
        userArrayList.add(new User("122", "122", "122@gmail.com",R.drawable.avatar));
        userArrayList.add(new User("123", "123", "123@gmail.com",R.drawable.avatar));
        userArrayList.add(new User("124", "124", "124@gmail.com",R.drawable.avatar));
//        userArrayList.add(new User("125", "125", "125@gmail.com"));
//        userArrayList.add(new User("126", "126", "126@gmail.com"));
//        userArrayList.add(new User("127", "127", "127@gmail.com"));
//        userArrayList.add(new User("128", "128", "128@gmail.com"));
//        userArrayList.add(new User("129", "129", "129@gmail.com"));
//        userArrayList.add(new User("130", "130", "130@gmail.com"));

        UserAdapter userAdapter = new UserAdapter(userArrayList);

        recyclerViewUser.setAdapter(userAdapter);

        recyclerViewUser.setLayoutManager(new LinearLayoutManager(this));

    }
}