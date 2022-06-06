package mainCar;

import Car.ArrayCar;
import Car.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayCar Array = new ArrayCar();
        int luaChon =0;

        do

        {
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách  ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng trong danh sách.\n"
                            + "5.	Làm rỗng danh sách .\n"
                            + "6.	Xóa một  ra khỏi danh sách dựa trên .\n"
                            + "0.   Thoát khỏi chương trình");

            luaChon = sc.nextInt();


            if (luaChon == 1) {
//				1.	Thêm sinh viên vào danh sách.
                System.out.println("nhap danh sach :  ");
                System.out.println("Nhập id: ");
                String id = sc.next();
                System.out.println("name: ");
                String name = sc.next();
                System.out.println("price: ");
                float price = sc.nextFloat();
                System.out.println("Nhập hang xe : ");
                String rank = sc.next();

                String datemanufacture;
                while (true) {
                    System.out.println("Nhập ngay san xuat : ");
                    datemanufacture = sc.next();
                    Pattern pattern = Pattern.compile("^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$");

                    Matcher matcher = pattern.matcher(datemanufacture);
                    boolean bool = matcher.matches();
                    if (bool) {

                        break;
                    }
                    System.out.println("nhap sai vui long nhap lai  : ");

                }

                CarrankA CarrankA = new CarrankA(id, name, price, rank, datemanufacture);
                Array.them(CarrankA);

            } else if (luaChon == 2) {
//				2.	In danh sách  ra màn hình.
                Array.inDanhSach();

            } else if (luaChon == 3) {
//				3.	Kiểm tra danh sách có rỗng hay không.
				Array.kiemTraDanhSachRong() ;
                if(Array.kiemTraDanhSachRong() )
                    System.out.println("Danh sách rỗng" );
                else
                System.out.println("co xe trong danh sach "  );
            } else if (luaChon == 4) {
//				.	Lấy ra số lượng  trong danh sách.
                System.out.println("Số lượng hiện tại: " + Array.laySoLuong());
            } else if (luaChon == 5) {
//					Làm rỗng danh sách .
                Array.lamRongDanhSach();
            } else if (luaChon == 6) {
//					Xóa một  ra khỏi danh sách dựa trên id.
                System.out.println("Nhập id: ");
                String id = sc.nextLine();

                System.out.println("Xóa  trong danh sách: " + Array.xoa(id));
            }
            else if (luaChon == 7) {
//					Xóa một  ra khỏi danh sách dựa trên id.
                System.out.println("cao nhat : "+Array.tallest());


            }
        }while(luaChon!=0);
    }

}

