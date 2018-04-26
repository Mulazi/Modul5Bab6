package modul5;

/**
 *
 * @author Pramudya Erviansyah
 */
public class Student {
    public String name;
    public String id;
    private String address;
    private float gpa;
    
    public Student() //Constructor yang akan langsung dijalankan saat kelas pertama kali diinisialisasi
    {
           
    }
    public Student(String name, String id) //Constructor dengan parameter
    {
        this.name= name;
        this.id = id;
    }
    
    public Student(String name, String id, String address) //Overloading Constructor
    {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String intro() //Method non parameter
    {
        return "Nama saya: "+name+ "\nNim saya:" + id;
    }
    
    public String tellGPA(float gpa) //Method berparameter
    {
       if (gpa <= 1) {
           return "Prodi Pilihan ke "+ gpa;
       }
       else {
           return "Jurusan Ini Bukan Pilihan Utama Saya";
       }
    }
    
    public String tellAddress(){ //Method non parameter
        return "Asal Sekolah : " + address;
    }

}
