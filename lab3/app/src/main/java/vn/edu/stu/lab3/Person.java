package vn.edu.stu.lab3;
import java.util.ArrayList;

public class Person {
    private String hoten;
    private String cmnd;
    private String gioitinh;
    private ArrayList<String> sothich;
    private String thonginkhac;

    public Person(String hoten, String cmnd, String gioitinh, ArrayList<String> sothich, String thonginkhac) {
        this.hoten = hoten;
        this.cmnd = cmnd;
        this.gioitinh = gioitinh;
        this.sothich = sothich;
        this.thonginkhac = thonginkhac;
    }
    public Person(){

    }

    public String getThonginkhac() {
        return thonginkhac;
    }

    public void setThonginkhac(String thonginkhac) {
        this.thonginkhac = thonginkhac;
    }

    public ArrayList<String> getSothich() {
        return sothich;
    }

    public void setSothich(ArrayList<String> sothich) {
        this.sothich = sothich;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoten='" + hoten + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", gioitinh=" + gioitinh +
                ", sothich=" + sothich +
                ", thonginkhac='" + thonginkhac + '\'' +
                '}';
    }
}
