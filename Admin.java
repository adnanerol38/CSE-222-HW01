/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Bu sinif, tasarlanilan ders otomasyon sisteminin yoneticilerinin kullanacaklari
 * metotlari yani yetkilerini belirler.
 * @author Adnan EROL
 */
public class Admin extends User implements CourseAutomationSystem{
    /**
     * No parameter constructor
     */
    public Admin(){
        super.setName("void");
        super.setSurname("void");
    }
    
    /**
     * Two parameter constructor
     * @param newName String olarak isim parametresi
     * @param newSurname String olarak soyisim parametresi
     */
    public Admin(String newName, String newSurname){
        super.setName(newName);
        super.setSurname(newSurname);
    }
    
    /**
     * Sadece admin tarafindan sistem manage edilmektedir.
     * @return Sadece admin tarafindan cagrildiginda true return eder 
     * diger durumlarda false return eder.
     */
    @Override
    public boolean manageSystem(){
        return true;
    }
    
    /**
     * Sisteme kullanici ekleyecek metot.
     * @param obj Sisteme eklenecek user objesi.
     * @return Ekleme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    @Override
    public boolean addUser(User obj){
        return true;
    }
    
    /**
     * Sistemden kullanici silecek metot.
     * @param obj Sistemden silecek user objesi.
     * @return Silme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    @Override
    public boolean removeUser(User obj){
        return true;
    }
    
    /**
     * Sisteme ders ekleyecek metot.
     * @param obj Sisteme ekenecek ders objesi.
     * @return Ekleme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    @Override
    public boolean addCourse(Course obj){
        return true;
    }
    
    /**
     * Sistemden ders silecek metot.
     * @param obj Sistemden silinecek ders objesi.
     * @return Silme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    @Override
    public boolean removeCourse(Course obj){
        return true;
    }
    
    /**
     * Sistemdeki dersleri manage edebilip edemedigini bildiren metot.
     * @param obj Manage edilecek ders objesi.
     * @return Manage islemi yapilabiliyorsa true return eder.
     * Yapilamiyorsa false return eder.
     */
    @Override
    public boolean manageCourse(Course obj){
        return false;
    }

    /**
     * Sisteme tutor ekleyecek metot.
     * @param obj Sisteme eklenecek tutor objesi.
     * @return Ekleme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    @Override
    public boolean addTutor(Tutor obj){
        return false;
    }
    
    /**
     * Sistemden tutor silecek metot.
     * @param obj Sistemden silinecek tutor objesi.
     * @return Silme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    @Override
    public boolean removeTutor(Tutor obj){
        return false;
    }

    /**
     * Sisteme document ekleyecek metot.
     * @param obj Sisteme eklenecek document objesi.
     * @return Ekleme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    @Override
    public boolean addDocument(Document obj){
        return false;
    }
    
    /**
     * Sistemden document silecek metot.
     * @param obj Sistemden silinecek document objesi.
     * @return Silme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    @Override
    public boolean removeDocument(Document obj){
        return false;
    }
}
