package quanpnph29471.example.quanpnph29471_quanlydonhang.Model;

public class Detail {
    int id_void,id_product,quantity,gia_mua;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_void() {
        return id_void;
    }

    public void setId_void(int id_void) {
        this.id_void = id_void;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getGia_mua() {
        return gia_mua;
    }

    public void setGia_mua(int gia_mua) {
        this.gia_mua = gia_mua;
    }

    public Detail(int id_void, int id_product, int quantity, int gia_mua) {
        this.id_void = id_void;
        this.id_product = id_product;
        this.quantity = quantity;
        this.gia_mua = gia_mua;
    }

    public Detail() {
    }
}
