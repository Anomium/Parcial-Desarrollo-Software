package Models;


public class Persona {
    int id;
    String nom;
    String email;
    String LP;
    String Hob;
    String lname;

    public Persona() {
    }

    public Persona(int id, String nom,String lname, String email, String LP, String Hob) {
        this.id = id;
        this.nom = nom;
        this.lname = lname;
        this.email = email;
        this.LP = LP;
        this.Hob = Hob;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLP() {
        return LP;
    }

    public void setLP(String LP) {
        this.LP = LP;
    }

    public String getHob() {
        return Hob;
    }

    public void setHob(String Hob) {
        this.Hob = Hob;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    
    
    
}
