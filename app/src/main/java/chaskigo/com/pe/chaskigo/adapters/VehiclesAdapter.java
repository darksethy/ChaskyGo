package chaskigo.com.pe.chaskigo.adapters;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidnetworking.widget.ANImageView;

import java.util.List;

import chaskigo.com.pe.chaskigo.R;
import chaskigo.com.pe.chaskigo.models.Vehicle;

/**
 * Created by dsullon on 02/12/2016.
 */

public class VehiclesAdapter extends RecyclerView.Adapter<VehiclesAdapter.ViewHolder> {

    List<Vehicle> vehicles;

    public void setSources(List<Vehicle> vehicles) { this.vehicles = vehicles; }

    @Override
    public VehiclesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.card_vehicle, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VehiclesAdapter.ViewHolder holder, int position) {
        holder.nameTextView.setText(vehicles.get(position).getLicencePlate());
        holder.vehicleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*NewsApp.getInstance().getService().setCurrentSource(vehicles.get(position));
                Intent intent = new Intent(view.getContext(), ArticlesActivity.class);
                view.getContext().startActivity(intent);
                Log.d("NewsApp", "Current Source is "+ sources.get(position).getName());*/
            }
        });
    }

    @Override
    public int getItemCount() {
        return vehicles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView vehicleCardView;
        TextView nameTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            vehicleCardView = (CardView) itemView.findViewById(R.id.sourceCardView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
        }
    }
}
