package quanpnph29471.example.quanpnph29471_quanlydonhang.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import quanpnph29471.example.quanpnph29471_quanlydonhang.AddActivity;
import quanpnph29471.example.quanpnph29471_quanlydonhang.Model.VoidProduct;
import quanpnph29471.example.quanpnph29471_quanlydonhang.R;
import quanpnph29471.example.quanpnph29471_quanlydonhang.VoidDetailActivity;

public class VoidAdapter extends RecyclerView.Adapter<VoidAdapter.VoidViewHolder> {
    ArrayList<VoidProduct> list;
    Context context;

    public VoidAdapter(ArrayList<VoidProduct> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public VoidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_rc_void,parent,false);
        return new VoidViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull VoidViewHolder holder, int position) {
        VoidProduct obj = list.get(position);

        holder.tv_id.setText("ID hóa đơn: "+obj.getId_void());
        holder.tv_id_customer.setText("ID khách hàng:"+obj.getId_customer());
        holder.tv_id_staff.setText("ID nhân viên "+obj.getId_staff());
        holder.tv_date.setText(obj.getDate_buy());
        holder.tv_status.setText(obj.getStatus());

        holder.imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AddActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("void",obj);
                intent.putExtras(bundle);
                view.getContext().startActivity(intent);

            }
        });
        holder.btnXem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), VoidDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("void",obj);
                intent.putExtras(bundle);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class VoidViewHolder extends RecyclerView.ViewHolder {
        TextView tv_id,tv_id_customer,tv_id_staff,tv_date,tv_status;
        Button btnXem;
        ImageView imgAdd;

        public VoidViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_id = itemView.findViewById(R.id.tv_id_item_rc_void);
            tv_id_customer = itemView.findViewById(R.id.tv_custom_item_rc_void);
            tv_id_staff = itemView.findViewById(R.id.tv_staff_item_rc_void);
            tv_date=itemView.findViewById(R.id.tv_date_item_rc_void);
            tv_status =itemView.findViewById(R.id.tv_status_item_rc_void);
            btnXem =itemView.findViewById(R.id.btn_detail_void);
            imgAdd =itemView.findViewById(R.id.icon_add);
        }
    }
}
