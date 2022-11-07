
package Lab8;

/*
 @author ASUS
 */
final public class XPoly {

    // Bài 1
    public static final double sum(double... so) {
        double tongSo = 0;
        for (double tinhTong : so) {
            tongSo += tinhTong;
        }
        return tongSo;
    }

    // Bài 2
    public static final double XPolyMin(double... so) {
        double min = so[0];
        for (double soNho : so) {
            min = Math.min(min, soNho);
        }
        return min;
    }

    public static final double XPolyMax(double... so) {
        double max = so[0];
        for (double soLon : so) {
            max = Math.max(max, soLon);
        }
        return max;
    }
    
    // Bài 3
    public static String inHoaKiTuDau(String ten) {
        String[] chuoi = ten.split(" ");
        // tạo chuỗi động
        StringBuilder sB = new StringBuilder();
        for (int i = 0; i < chuoi.length; i++) {
            String bien = chuoi[i];
            if (!bien.equals("")) {
                String firstChar = bien.substring(0, 1).toUpperCase();
                bien = firstChar + bien.substring(1).toLowerCase();
                sB.append(bien).append(" ");
            }
        }
        // return chuyen sang dang chuoi va xoa ki tu trang 2 dau
        return sB.toString().trim();
    }

    public static void main(String[] args) {
        // Em cho luôn thay vì phải nhập từ bàn phím !
        double sum = sum(21, 4, 20, 0.3);
        System.out.println("| Tổng số là: " + sum);
        double min = XPolyMin(20, 36, 2, 11);
        System.out.println("| Số nhỏ nhất: " + min);
        double max = XPolyMax(20, 36, 2, 11);
        System.out.println("| Số lớn nhất: " + max);
        String ten = inHoaKiTuDau(" nguyen si trong phuc");
        System.out.println(ten);
    }
}
