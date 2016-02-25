/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Bu interface kurs otomasyon sistemi icin tasarlanmis bir interfacedir.
 * Sistemdeki bulunmasi gerekli metotlari belirtir.
 * 
 * @author Adnan EROL
 */
public interface CourseAutomationSystem {
    
    /**
     * Sadece admin tarafindan sistem manage edilmektedir.
     * @return Sadece admin tarafindan cagrildiginda true return eder 
     * diger durumlarda false return eder.
     */
    public boolean manageSystem();
    
    /**
     * Sisteme kullanici ekleyecek metot.
     * @param obj Sisteme eklenecek user objesi.
     * @return Ekleme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    public boolean addUser(User obj);
    
    /**
     * Sistemden kullanici silecek metot.
     * @param obj Sistemden silecek user objesi.
     * @return Silme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    public boolean removeUser(User obj);
    
    /**
     * Sisteme ders ekleyecek metot.
     * @param obj Sisteme ekenecek ders objesi.
     * @return Ekleme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    public boolean addCourse(Course obj);
    
    /**
     * Sistemden ders silecek metot.
     * @param obj Sistemden silinecek ders objesi.
     * @return Silme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    public boolean removeCourse(Course obj);
    
    
    /**
     * Sistemdeki dersleri manage edebilip edemedigini bildiren metot.
     * @param obj Manage edilecek ders objesi.
     * @return Manage islemi yapilabiliyorsa true return eder.
     * Yapilamiyorsa false return eder.
     */
    public boolean manageCourse(Course obj);


    /**
     * Sisteme tutor ekleyecek metot.
     * @param obj Sisteme eklenecek tutor objesi.
     * @return Ekleme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    public boolean addTutor(Tutor obj);
    
    /**
     * Sistemden tutor silecek metot.
     * @param obj Sistemden silinecek tutor objesi.
     * @return Silme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    public boolean removeTutor(Tutor obj);

    /**
     * Sisteme document ekleyecek metot.
     * @param obj Sisteme eklenecek document objesi.
     * @return Ekleme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    public boolean addDocument(Document obj);
    
    /**
     * Sistemden document silecek metot.
     * @param obj Sistemden silinecek document objesi.
     * @return Silme islemini yapabiliyorsa true return eder.
     * Yapamiyorsa false return eder.
     */
    public boolean removeDocument(Document obj);
}
