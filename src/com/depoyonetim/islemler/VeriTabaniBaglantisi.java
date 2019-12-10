package com.depoyonetim.islemler;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VeriTabaniBaglantisi {

    private final String host = "localhost";
    private final int port = 3306;
    private final String dbName = "depolama";
    private final String userName = "root";
    private final String password = "";
    Connection myCon;
    Statement myStat;
    
    public void close(){
        try {
            myCon.close();
            myStat.close();
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniBaglantisi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Veri tabanı bağlantısı kapatıldı");
        
    }
    public VeriTabaniBaglantisi() {
        connecting();

    }
    
    public void connecting(){
        try {
            this.myCon = (Connection) DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbName
                    + "?useUnicode=true&characterEncoding=utf8", userName, password);
            this.myStat = myCon.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ResultSet baglanti(String sorgu) {
        connecting();
        try {
            ResultSet myRs = myStat.executeQuery(sorgu);
            return myRs;
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return null;

    }

    public void ekle(String sorgu) {
        try {
            myStat.executeUpdate(sorgu);     
        }
        catch (SQLException ex) {
            System.out.println("Tam burada hata verdi");
            ex.printStackTrace();
        }

    }

    public void guncelle(String sorgu) {
        try {
            myStat.executeUpdate(sorgu);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void sil(String sorgu) {
        try {
            myStat.executeUpdate(sorgu);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    

}
