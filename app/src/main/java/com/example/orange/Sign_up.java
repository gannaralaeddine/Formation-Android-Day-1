package com.example.orange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.orange.Retro.ApiUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sign_up extends AppCompatActivity
{
    EditText firstName, lastName, mail, phoneNumber, agee, countryy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        mail = findViewById(R.id.mail);
        phoneNumber = findViewById(R.id.phone);
        agee = findViewById(R.id.age);
        countryy = findViewById(R.id.country);





        findViewById(R.id.sign_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nom = firstName.getText().toString();
                String prenom = lastName.getText().toString();
                String email = mail.getText().toString();
                String phone = phoneNumber.getText().toString();
                String age = agee.getText().toString();
                String country = countryy.getText().toString();

                User user = new User();
                user.setFName(nom);
                user.setLName(prenom);
                user.setEmail(email);
                user.setPhoneNumber(phone);
                user.setAge(age);
                user.setCountry(country);

                ApiUtil.getServiceClass().addUser(user).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response)
                    {
                        User userResponse = response.body();
                        Toast.makeText(Sign_up.this, "User id: " + userResponse.getId() +
                                                                "\nUser name: " + userResponse.getLName() + " " + userResponse.getFName() +
                                                                "\nUser mail: " + userResponse.getEmail(),
                                                                Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t)
                    {
                        Toast.makeText(Sign_up.this, "Error" , Toast.LENGTH_LONG).show();
                    }
                });



            }
        });

        findViewById(R.id.btn_Update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });

        findViewById(R.id.btn_Users).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Sign_up.this, DisplayUsers.class));
            }
        });
    }
}
