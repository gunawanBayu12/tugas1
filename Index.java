

import components.GlobalComponent;
class Index extends GlobalComponent{
    public static void main(String[] args){
        var a  =  new Index();
        String[][] cars = {{"bolpoint","10","2000"},{"pensil","10","1000"},{"penghapus","10","500"}};
        a.line();
        a.ViewHeader("Warung Sugeng");
        a.line();
        for (int i = 0; i < cars.length; i++) {
            a.setter(cars[i][0],cars[i][1],cars[i][2]);
            System.out.println("Nama Barang : "+a.getterName());
            System.out.println("Stock Barang : "+a.getterStok());
            System.out.println("Harga Satuan : "+a.getterHarga());
            System.out.println("Harga Barang : "+a.getterTotalHarga());
            a.line();
        }
        a.line();
        System.out.println("Grand Total : "+a.getterGrandHarga());
        a.line();
    }
}