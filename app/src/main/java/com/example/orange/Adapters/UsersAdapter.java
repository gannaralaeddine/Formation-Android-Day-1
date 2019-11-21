package com.example.orange.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orange.R;
import com.example.orange.User;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UserViewHolder>
{
    private List<User> mUsers;

    public UsersAdapter(List <User> users)
    {
        this.mUsers = users;
    }


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user , parent );

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position)
    {
       User user = mUsers.get(position);
        holder.firstName.setText(user.getFName());
        holder.lastName.setText(user.getLName());
        holder.mail.setText(user.getEmail());
    }

    @Override
    public int getItemCount()
    {
        return mUsers.size();
    }



}
