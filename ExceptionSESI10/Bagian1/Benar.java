package Bagian_1;

public class Benar {
    public static void main(String[] args) {
        int a[]=new int[5];
        try
        {
            a[5]=100;
        }
        catch(Exception e)
        {
            System.out.println("Terjadi Pelanggaran Memory");
        }
    }
}