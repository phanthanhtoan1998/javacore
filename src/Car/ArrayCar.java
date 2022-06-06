package Car;

import java.util.ArrayList;

public class ArrayCar {
    private ArrayList<CarrankA> danhSach;

    public ArrayCar() {
        this.danhSach = new ArrayList<CarrankA>();
    }

    public ArrayCar(ArrayList<CarrankA> danhSach) {
        this.danhSach = danhSach;
    }

    // 1.	Thêm   vào danh sách.
    public void them(CarrankA CarrankA) {
        this.danhSach.add(CarrankA);
    }

    //		2.	In danh sách  ra màn hình.
    public void inDanhSach() {
        for (CarrankA CarrankA : danhSach) {
            System.out.println(CarrankA);
        }
    }

    //		3.	Kiểm tra danh sách có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    //		4.	Lấy ra số lượng trong danh sách.
    public int laySoLuong() {
        return this.danhSach.size();
    }

    //		5.	Làm rỗng danh sách .
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    //		6.	Kiểm tra  có tồn tại trong danh sách hay không, dựa trên id.
    public boolean kiemTraTonTai(CarrankA CarrankA) {
        return this.danhSach.contains(CarrankA);
    }

    //		7.	Xóa một  ra khỏi danh sách dựa trên id.
    public boolean xoa(String CarrankA) {
        return this.danhSach.remove(CarrankA);
    }
    public Object tallest()
    {
        Object a = null;
        float temp =0;
for (int i = 0; i < this.danhSach.size(); i++) {
   if(this.danhSach.get(i).getPrice() > temp)
   {
       temp=this.danhSach.get(i).getPrice();

a =this.danhSach.get(i) ;
   }
}
return a;

    }



}
