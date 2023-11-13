package quanpnph29471.example.quanpnph29471_quanlydonhang.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import quanpnph29471.example.quanpnph29471_quanlydonhang.Model.Product;
import quanpnph29471.example.quanpnph29471_quanlydonhang.R;

public class SpinnerProductApdapter extends BaseAdapter {

    List<Product> list;
    Context context;

    public SpinnerProductApdapter(List<Product> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return list.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row;
        if(view==null){
            row =View.inflate(context, android.R.layout.simple_spinner_item,null);
        }else
            row =view;

        TextView tv_cat = row.findViewById(android.R.id.text1);

        tv_cat.setText(list.get(i).getName());
        return row;
    }
}
