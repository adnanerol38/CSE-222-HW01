/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Tasarlanilan ders otomasyon sistemindeki dokumanlari ve onlarin tiplerini
 * belirleyen sinif.
 * 
 * @author Adnan EROL
 */
public class Document {
    /**
     * Dokumanin tipini tutan data field
     */
    private String type;

    /**
     * Dokumanin tipini return eden metot
     * @return String tipinde dokumanin tipini return eder
     */
    public String getType() {
        return type;
    }

    /**
     * No parameter constructor
     */
    public Document(){
        setType("void");
    }
    
    /**
     * One parameter constructor
     * @param newType String olarak tip parametresi
     */
    public Document(String newType){
        setType(newType);
    }
    
    /**
     * Dokumanin tipini set eden metot
     * @param type String tipinde parametre alir ve bunu set eder
     */
    public void setType(String type) {
        this.type = type;
    }
    
}

