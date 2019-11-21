package com.example.orange.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orange.R;

public class UserViewHolder extends RecyclerView.ViewHolder
{
    TextView firstName;
    TextView lastName;
    TextView mail;
    public UserViewHolder(@NonNull View itemView)
    {
        super(itemView);
        firstName = itemView.findViewById(R.id.item_first_name);
        lastName = itemView.findViewById(R.id.item_last_name);
        mail = itemView.findViewById(R.id.item_mail);
    }






}
