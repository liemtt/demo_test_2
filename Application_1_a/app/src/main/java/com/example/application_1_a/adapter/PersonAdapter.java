package com.example.application_1_a.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.application_1_a.databinding.ItemPersonBinding;
import com.example.application_1_a.model.Person;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<Person> data;
    private ItemPersonListener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return data == null ? 0:data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private ItemPersonBinding binding;

        public ViewHolder(@NonNull View itemView, ItemPersonBinding binding) {
            super(itemView);
            this.binding = binding;
        }

        public void bindData(Person person){
            binding.tvName.setText(person.getName());
            binding.tvPhoneNumber.setText(person.getPhoneNumber());
        }

    }

    public interface ItemPersonListener{
        void onClick();
    }

}
