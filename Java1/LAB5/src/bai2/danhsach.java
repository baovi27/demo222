
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsach {

    private ArrayList<hoten> danhsach;

    public danhsach(ArrayList<hoten> danhsach) {
        this.danhsach = danhsach;
    }

    public danhsach() {
        this.danhsach = new ArrayList<hoten>();
    }

    public void them(hoten ht) {
        danhsach.add(ht);
    }

    public void xuatdanhsach() {
        for (hoten hoten : danhsach) {
            System.out.println(hoten);
        }
    }

    public void xuatdanhsachngaunhien() {
        Collections.shuffle(danhsach);
        for (hoten hoten : danhsach) {
            System.out.println(hoten);
        }
        Collections.reverse(danhsach);
    }

    public void sapxep() {
        Collections.sort(this.danhsach, new Comparator<hoten>() {
            public int compare(hoten o1, hoten o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
            
        });
    Collections.reverse(danhsach);
    }
    public boolean xoahovaten(hoten ht){ 
        return this.danhsach.remove(ht);
    }

}
