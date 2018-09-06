package co.edu.udea.compumovil.gr01_20182.dincom;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDates extends RecyclerView.Adapter<AdapterDates.ViewHolderDatos> {

    ArrayList<String> listDates;

    public AdapterDates(ArrayList<String> listDates) {
        this.listDates = listDates;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {

        holder.asignDate(listDates.get(position));

    }

    @Override
    public int getItemCount() {
        return listDates.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView date;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            date=itemView.findViewById(R.id.id_definition);
        }

        public void asignDate(String dates) {
            date.setText(dates);
        }
    }
}
