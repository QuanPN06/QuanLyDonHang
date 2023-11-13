package quanpnph29471.example.quanpnph29471_quanlydonhang.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import quanpnph29471.example.quanpnph29471_quanlydonhang.Model.Detail;
import quanpnph29471.example.quanpnph29471_quanlydonhang.Model.Product;
import quanpnph29471.example.quanpnph29471_quanlydonhang.R;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {
    List<Detail> list;
    Context context;

    public DetailAdapter(List<Detail> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_xem_chi_tiet,parent,false);
        return new DetailAdapter.DetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {
        Detail obj = list.get(position);

        holder.tv_tenSp.setText("Tên sản phẩm: "+obj.getName());
        holder.tv_soLuong.setText("Số lượng: "+obj.getQuantity());
        holder.tv_giaMua.setText("Giá mua: "+obj.getGia_mua());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class DetailViewHolder extends RecyclerView.ViewHolder{
        TextView tv_tenSp,tv_soLuong,tv_giaMua;

        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_tenSp = itemView.findViewById(R.id.tv_chi_tiet_tenSP);
             tv_soLuong = itemView.findViewById(R.id.tv_chi_tiet_soLuong);
             tv_giaMua = itemView.findViewById(R.id.tv_chi_tiet_giaMua);
        }
    }
}
