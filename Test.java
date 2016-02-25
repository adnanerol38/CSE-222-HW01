/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 * Bu sinif tasarlanilip kodlanan siniflarin testi icin olusturulmustur
 * @author Adnan Erol
 */
public class Test {
    public static void main(String[] args){
        Admin admin = new Admin("Adnan", "EROL");
        ArrayList<Admin> admins = new ArrayList<Admin>();
        try{
            admins.add(admin);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayList in boyutu genisletilememektedir");
        }
    }
}
