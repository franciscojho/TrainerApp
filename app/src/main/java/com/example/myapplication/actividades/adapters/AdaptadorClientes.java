package com.example.myapplication.actividades.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.actividades.views.PerfilClienteActivity;
import com.example.myapplication.entidades.persona.Cliente;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdaptadorClientes extends RecyclerView.Adapter<AdaptadorClientes.ViewHolder>{
    private static final String TAG = "AdaptadorClientes";

    private ArrayList<Cliente> misClientes;
    private Context context;

    public Context getContext() {
        return context;
    }

    public AdaptadorClientes(Context context, ArrayList<Cliente> misClientes) {
        this.context = context;
        this.misClientes = misClientes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.clientImage.setImageResource(misClientes.get(position).getcImage());
        viewHolder.clientName.setText(misClientes.get(position).getNombre());
        viewHolder.setOnClickListeners();
        
    }

    @Override
    public int getItemCount() {
        return misClientes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CircleImageView clientImage;
        TextView clientName;
        RelativeLayout parentLayout;
        Button btnClientProfile;
        Context vContext;

        ViewHolder(View itemView) {
            super(itemView);

            vContext = itemView.getContext();
            clientImage = itemView.findViewById(R.id.client_image);
            clientName = itemView.findViewById(R.id.client_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            btnClientProfile = itemView.findViewById(R.id.btnPerfilCli);

        }

        void setOnClickListeners() {
            btnClientProfile.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnPerfilCli) {
                Intent intent = new Intent(vContext, PerfilClienteActivity.class);
                intent.putExtra("clientImage", R.drawable.defaultimage);
                intent.putExtra("clientName", clientName.getText());
                vContext.startActivity(intent);

            }
        }


    }
}
