package quanpnph29471.example.quanpnph29471_quanlydonhang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import quanpnph29471.example.quanpnph29471_quanlydonhang.Adapter.VoidAdapter;
import quanpnph29471.example.quanpnph29471_quanlydonhang.DAO.VoidDAO;
import quanpnph29471.example.quanpnph29471_quanlydonhang.Model.VoidProduct;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc ;

    VoidDAO voidDAO;
    ArrayList<VoidProduct> listVoidProduct;
    VoidAdapter voidAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rc =findViewById(R.id.rc_void);
        voidDAO = new VoidDAO(this);
        listVoidProduct =voidDAO.getList();
        voidAdapter = new VoidAdapter(listVoidProduct,this);
        rc.setAdapter(voidAdapter);
    }
}