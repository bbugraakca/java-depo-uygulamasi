package com.depoyonetim.islemler;

import com.depoyonetim.islemler.VeriTabaniBaglantisi;
import com.depoyonetim.arayuz.KullaniciGirisi;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VeriIslemleri {

    VeriTabaniBaglantisi veriTabaniBaglantisi = new VeriTabaniBaglantisi();
    KullaniciGirisi kullaniciGirisi = new KullaniciGirisi();
    String userName = new KullaniciGirisi().getUserNameTxt();
    String userName2;
    int hak = 1;
    double totalSales = 0;

    public VeriIslemleri() {

    }

    public String writeWelcomeToPanelUserName() {
        System.out.println("Gelen: " + this.userName);
        return this.userName;

    }

    public Integer dateInteger() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date tarih = new Date();
        String nowDate = format.format(tarih).toString();
        int nowDateInt = Integer.valueOf(nowDate);
        return nowDateInt;
    }

    public String dateString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date tarih = new Date();
        String nowDate = format.format(tarih).toString();
        return nowDate;
    }

    public double totalSales(String user) {
        totalSales = 0;
        String sorgu = "SELECT TotalPrice FROM `sales` WHERE SellerName='" + user + "' ";
        ResultSet totalRs = veriTabaniBaglantisi.baglanti(sorgu);
        try {
            while (totalRs.next()) {
                totalSales += totalRs.getDouble("TotalPrice");

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(user + " Toplam Satışı :" + totalSales);
        return totalSales;
    }

    public String dateSearchTotalSales(String user, int firstDate, int secondDate) {
        totalSales = 0;
        String sorgu = "SELECT TotalPrice FROM `sales` WHERE SellerName='" + user + "' AND DateCode BETWEEN " + firstDate + " AND " + secondDate;
        ResultSet totalRs = veriTabaniBaglantisi.baglanti(sorgu);
        try {
            while (totalRs.next()) {
                totalSales += totalRs.getDouble("TotalPrice");

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(user + " Toplam Satışı :" + totalSales);
        return priceFormat(totalSales);
    }

    public Object[] usersInformation(String username) {

        Object[] ss = {"sads", "6556"};
        return ss;
    }

    public static Point StartScreenLocation(Dimension formSize) {
        Point p = new Point();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        double screenHeight = screenSize.getHeight();
        double screenWidth = screenSize.getWidth();
        double formHeight = formSize.getHeight();
        double formWidht = formSize.getWidth();

        int x = (int) screenHeight / 2 - (int) formHeight / 2;
        int y = (int) screenWidth / 2 - (int) formWidht / 2;
        p.setLocation(y, x);
        return p;
    }

    public void textMaxLimit(int inputLenght, int characterAmount, JTextField inputName) {

        if (inputLenght >= (characterAmount + 1)) {
            String input = inputName.getText().substring(0, characterAmount);
            System.out.println("Fazla Giriş Temizlendi");
            inputName.setText(input);

        }
    }

    public void phoneFormatTextField(int inputLenght, JTextField inputName, JLabel errorMessageName) {
        if (inputLenght == 10) {
            inputName.setText("0(" + inputName.getText().substring(0, 3) + ") " + inputName.getText().substring(3, 6) + " " + inputName.getText().substring(6, 10));
        }
        if (inputLenght >= 12) {
            errorMessageName.setText("En Fazla 10 Karakter Yazılabilir");
        }
    }

    public String phoneFormat(String phoneNumber) {
        if (phoneNumber.equals("")) {
            return "Boş";
        } else if (phoneNumber.length() < 11) {
            return "Boş";
        } else {
            String newPhoneFormat = "0(" + phoneNumber.substring(1, 4) + ") " + phoneNumber.substring(4, 7) + " " + phoneNumber.substring(7, 11);
            return newPhoneFormat;
        }
    }

    public String phoneReturnFormat(String phoneNumber) {
        String firstReplace = phoneNumber.replace("(", "");
        String secondReplace = firstReplace.replace(")", "");
        String endReplace = secondReplace.replace(" ", "");
        return endReplace;
    }

    public boolean mailControl(String mail) {
        String mailString = mail;
        char[] s = mailString.toCharArray();
        boolean control1 = false;
        boolean control2 = false;
        boolean control3 = false;
        for (int i = 0; i < s.length; i++) {
            char input = s[i];
            if (input == '@' || control1) {
                control1 = true;
                if (input == '.' || control2) {
                    control3 = true;
                }
            }
        }
        if (control3) {
            System.out.println("Bu bir mail adresidir");
            return true;
        } else {
            System.out.println("Geçerli bir mail adresi değildir");
            return false;
        }
    }

    public String priceFormat(double price) {
        String priceDoubleFormat = new DecimalFormat("###,###.00").format(price);
        return priceDoubleFormat;
    }

    public double priceReturnFormat(String price) {
        String firstFormat = price.replace(".", "");
        String secondFormat = firstFormat.replace(",", ".");
        double endFormat = Double.valueOf(secondFormat);
        return endFormat;
    }

    public String commaControl(String price) {
        for (int i = 0; i < price.length(); i++) {
            char character = price.charAt(i);
            if (character == ',') {
                String newPrice = price.replace(",", ".");
                return newPrice;
            }
        }
        return price;
    }

    public boolean cartControl(int id) {
        int adet = 1;
        String sorgu = "SELECT COUNT(Id) as Id FROM saleproducts WHERE id=" + id;
        ResultSet controlRs = veriTabaniBaglantisi.baglanti(sorgu);
        try {
            adet = controlRs.getInt("Id");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (adet != 0) {
                return false;
                
            }
        return true;
    }
}
