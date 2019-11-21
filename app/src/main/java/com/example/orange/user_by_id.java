package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orange.Retro.ApiUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class user_by_id extends AppCompatActivity
{

    EditText user_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_by_id);

        user_id = findViewById(R.id.user_id);

        findViewById(R.id.search_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idUser = user_id.getText().toString();

                ApiUtil.getServiceClass().getUserById(Integer.parseInt(idUser)).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response)
                    {
                        TextView user = findViewById(R.id.userText);
                        User userResponse = response.body();
                        user.setText(userResponse.toString());
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t)
                    {
                        Toast.makeText(user_by_id.this, "Error" , Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        findViewById(R.id.delete_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String idUser = user_id.getText().toString();

                ApiUtil.getServiceClass().deleteUserById(Integer.parseInt(idUser)).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response)
                    {
                        TextView user = findViewById(R.id.userText);
                        User userResponse = response.body();
                        user.setText(userResponse.toString());
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t)
                    {
                        Toast.makeText(user_by_id.this, "Error" , Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        findViewById(R.id.get_All_Users).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });
    }
}
