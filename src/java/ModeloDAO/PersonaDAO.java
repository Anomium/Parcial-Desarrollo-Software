package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Models.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona> list = new ArrayList<>();
        String sql = "select * from persona";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Persona per = new Persona();
                per.setId(rs.getInt("Id"));
                per.setNom(rs.getString("nombre"));
                per.setLname(rs.getString("lname"));
                per.setEmail(rs.getString("email"));
                per.setLP(rs.getString("lp"));
                per.setHob(rs.getString("hob"));
                list.add(per);
            }
            
        } catch (Exception e) {
            System.out.println("Listar DAO" + e);
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String sql="select * from persona where id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("Id"));
                p.setNom(rs.getString("nombre"));
                p.setLname(rs.getString("lname"));
                p.setEmail(rs.getString("email"));
                p.setLP(rs.getString("lp"));
                p.setHob(rs.getString("hob"));
                
            }
        } catch (Exception e) {
            System.out.println("Listar DAO" + e);
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
        
        try {
            con = cn.getConnection();
            String sql = "insert into basedatos.persona(nombre, lname, email, lp, hob) values ('"+per.getNom()+"','"+per.getLname()+"','"+per.getEmail()+"','"+per.getLP()+"','"+per.getHob()+"')";
            //"+per.getId()+",'"+per.getNom()+"','"+per.getApe()+"','"+per.getBirthDay()+"'
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql = "update persona set nombre='"+per.getNom()+"', lname='"+per.getLname()+"', email='"+per.getEmail()+"', lp='"+per.getLP()+"', hob='"+per.getHob()+"' where id="+per.getId();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from persona where id="+id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
