package quanpnph29471.example.quanpnph29471_quanlydonhang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import quanpnph29471.example.quanpnph29471_quanlydonhang.Adapter.DetailAdapter;
import quanpnph29471.example.quanpnph29471_quanlydonhang.DAO.DetailDAO;
import quanpnph29471.example.quanpnph29471_quanlydonhang.Model.Detail;
import quanpnph29471.example.quanpnph29471_quanlydonhang.Model.VoidProduct;

public class VoidDetailActivity extends AppCompatActivity {
    TextView tv_id_void,tv_id_customer,tv_date;
    RecyclerView recyclerView;
    DetailDAO detailDAO;
    DetailAdapter detailAdapter;
    ArrayList<Detail> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_void_detail);

        tv_id_void = findViewById(R.id.tv_id_void);
        tv_id_customer =findViewById(R.id.tv_id_customer);
        tv_date =findViewById(R.id.tv_ngay_mua);

        recyclerView = findViewById(R.id.rc_detail);

        Bundle bundle = getIntent().getExtras();
        if(bundle==null){
            return;
        }
        VoidProduct objVoidProduct = (VoidProduct) bundle.get("void");
        tv_id_void.setText("ID hóa đơn: "+objVoidProduct.getId_void());
        tv_id_customer.setText("ID khách hàng: "+objVoidProduct.getId_customer());
        tv_date.setText("Ngày mua: "+objVoidProduct.getDate_buy());

        detailDAO = new DetailDAO(this);
        list = detailDAO.getList();
        detailAdapter = new DetailAdapter(list,this);

        recyclerView.setAdapter(detailAdapter);
    }
}