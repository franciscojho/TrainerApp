package com.example.myapplication.actividades.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.entidades.persona.Cliente;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<Cliente> misClientes;
    private Context context;

    public RecyclerViewAdapter(Context context, ArrayList<Cliente> misClientes) {
        this.context = context;
        this.misClientes = misClientes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.clientImage.setImageResource(misClientes.get(position).getImage());
        viewHolder.clientName.setText(misClientes.get(position).getNombre());
        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Ingresando al perfil del cleinte "+misClientes.get(position).getNombre());
                Toast.makeText(context, misClientes.get(position).getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return misClientes.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView clientImage;
        TextView clientName;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            clientImage = itemView.findViewById(R.id.client_image);
            clientName = itemView.findViewById(R.id.client_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
