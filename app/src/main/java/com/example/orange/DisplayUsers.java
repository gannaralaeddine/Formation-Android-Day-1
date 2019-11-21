package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orange.Adapters.UsersAdapter;
import com.example.orange.Retro.ApiUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DisplayUsers extends AppCompatActivity {

    RecyclerView recyclerUsers;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_users);

        recyclerUsers = findViewById(R.id.recycle_users);


        ApiUtil.getServiceClass().getAllUsers().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response)
            {
                List <User> users = response.body();
                UsersAdapter adapter = new UsersAdapter(users);

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(DisplayUsers.this);
                linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

                recyclerUsers.setLayoutManager(linearLayoutManager);

                recyclerUsers.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t)
            {
                Toast.makeText(DisplayUsers.this, "Error" , Toast.LENGTH_LONG).show();
            }
        });
    }
}
