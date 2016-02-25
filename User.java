/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Kullanicilarin bulundurmasi gereken ozellikleri bir arada tutan abstract class.
 * 
 * @author Adnan EROL
 */
public abstract class User {
   /**
    * Kullanicilarin isimlerini tutan data field
    */
    private String name;
    
    /**
     * Kullanicilarin soyisimlerini tutan data field
     */
    private String surname;
   
    /**
     * Kullanicilarin isimlerini return eden metot
     * @return String tipinde kullanici ismini return eder
     */
    public String getName(){
        return name;
    }
   
    /**
     * Kullanicinin ismini set eden metot
     * @param newName Kullanicinin ismine set edilecek parametre
     */
    public void setName(String newName){
        name = newName;
    }
    
    /**
     * Kullanicilarin soyisimlerini return eden metot
     * @return String tipinde kullanici soyismini return eder
     */
    public String getSurname(){
        return surname;
    }
   
    /**
     * Kullnicinin soyismini set eden metot
     * @param newSurname Kullanicinin soyismine set edilecek parametre
     */
    public void setSurname(String newSurname){
        surname = newSurname;
    }
    
}
