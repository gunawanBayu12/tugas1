package components;



// import java.util.function.Function;

public class GlobalComponent {
    private String nama;
    private int totalHarga,stok, harga, grandTotal;
    public void ViewHeader(String header) {
        System.out.println("========== "+header+" =======");
    }
    public void line() {
        System.out.println("=======================================");
    }
    public void setter(String nama, String stok, String harga) {
        this.nama = nama;
        this.stok =  Integer.parseInt(stok);
        this.harga = Integer.parseInt(harga);
        this.totalHarga = Integer.parseInt(stok) * Integer.parseInt(harga);
        this.grandTotal +=this.totalHarga;
    }
    public String getterName() {
        return this.nama;
    }
    public int getterStok() {
        return this.stok;
    }
    public int getterHarga() {
        return this.harga;
    }
    public int getterTotalHarga() {
        return this.totalHarga;
    }
    public int getterGrandHarga() {
        return this.grandTotal;
    }

}
