/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depoyonetim.arayuz;

import com.depoyonetim.islemler.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DepoYonetim extends javax.swing.JFrame {

    VeriTabaniBaglantisi veriTabaniBaglantisi = new VeriTabaniBaglantisi(); // Veri tabanı bağlantısı referansı oluşturuldu
    VeriIslemleri veriIslemleri = new VeriIslemleri(); // Veri işlemleri referansı oluşturudu
    String userName = new KullaniciGirisi().userNameTxt; //Kullanıcı girişinde userNameTxt static olduğundan burada kullanabiliyoruz.
    static String authorization; //Yetki değişkeni

    /**
     * Creates new form DepoYonetim
     */
    public DepoYonetim() {
        initComponents();
        welcomeToPanel();//Hoş geldin methodu
        authorizationControl();//Yetki kontrol methodu
        this.setLocation(veriIslemleri.StartScreenLocation(this.getBounds().getSize()));//Veri işlemleri içerisinde yazılmış olan ekran ortalama methodu framein pozisyonuna set eder. 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addCustomer = new javax.swing.JButton();
        showCustomer = new javax.swing.JButton();
        showProduct = new javax.swing.JButton();
        addProduct = new javax.swing.JButton();
        showSale = new javax.swing.JButton();
        sale = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        employeeInformation = new javax.swing.JButton();
        welcomeToPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Depo Yonetim Otomasyonu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        jLabel1.setText("DEPO YÖNETİM SİSTEMİ");
        jLabel1.setToolTipText("");

        addCustomer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addCustomer.setText("Müşteri Ekle");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });

        showCustomer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        showCustomer.setText("Müşteri Listele");
        showCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCustomerActionPerformed(evt);
            }
        });

        showProduct.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        showProduct.setText("Ürün Listele");
        showProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductActionPerformed(evt);
            }
        });

        addProduct.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addProduct.setText("Ürün Ekle");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });

        showSale.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        showSale.setText("Satışları Listele");
        showSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSaleActionPerformed(evt);
            }
        });

        sale.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sale.setText("Satış Yap");
        sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleActionPerformed(evt);
            }
        });

        addUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addUser.setText("Kullanıcı Kaydı");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        employeeInformation.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        employeeInformation.setText("Personel Bilgisi");
        employeeInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeInformationActionPerformed(evt);
            }
        });

        welcomeToPanel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        welcomeToPanel.setText("Hoşgeldin, ziyaretçi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employeeInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(showCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(showProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(showSale, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(welcomeToPanel)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeToPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showSale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCustomerActionPerformed
        new MusteriListele().setVisible(true); // Bu kod belirtilen ekranı açar
    }//GEN-LAST:event_showCustomerActionPerformed

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        new MusteriKayit().setVisible(true); // Bu kod musteri kayıt ekranını açar. True açar False kapatır.
    }//GEN-LAST:event_addCustomerActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        new UrunEkle().setVisible(true);//Ürün ekleme sayfasını açar
    }//GEN-LAST:event_addProductActionPerformed

    private void showProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductActionPerformed
        new UrunListele().setVisible(true);//Ürün listeleme sayfasını açar
    }//GEN-LAST:event_showProductActionPerformed

    private void saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleActionPerformed
        new SatisSayfasi().setVisible(true);//Satış sayfasını açar
    }//GEN-LAST:event_saleActionPerformed

    private void showSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSaleActionPerformed
        new SatisListele().setVisible(true);//Satış listeleme sayfasını açar
    }//GEN-LAST:event_showSaleActionPerformed

    private void employeeInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeInformationActionPerformed
        new PersonelBilgisi().setVisible(true);//Personel bilgisi sayfasını açar
    }//GEN-LAST:event_employeeInformationActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        new KullaniciKayit().setVisible(true);//Kullanıcı kayıt sayfasını açar
    }//GEN-LAST:event_addUserActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //-------------Bu alanda çıkış yapmak istediğinize emin misiniz ekranı oluşturuldu ---------------
        Object[] optinos = {"Evet", "Hayır"};
        int secim = JOptionPane.showOptionDialog(
                null, "Çıkmak İstediğinizden EminMisiniz?",
                "Kapat", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, optinos, optinos[0]);
        String a = String.valueOf(JOptionPane.YES_OPTION);

        if (secim == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    /* Biraz kodlara dokunmanı istiyorum o yüzden bazı yerlerde hatalar yaptım mesela methodların çoğunu VeriIslemleri sayfasından 
    çalıştırabilecekken yapmadım mesela welcomeToPanel methodu parametre olarak userName gönderilirse veri islemleri doyasından çağırılabilir.
    autgorizationControl methodu da aynı şekilde username parametresi ile veri islemlerinden çağrılabilir.
    Bunlar temiz kod yazmak için basit ama önemli.
    */
    public void welcomeToPanel() {//Hoş geldiniz methodu
        welcomeToPanel.setText("Hoşgeldin, " + userName);
    }
    public void authorizationControl(){//Yetki kontrol methodu
        String sorgu ="SELECT authorization FROM users WHERE userName='" + userName + "'"; // MySql sorgusu
        ResultSet controlRs = veriTabaniBaglantisi.baglanti(sorgu); //Kullanıcı girindeki ile aynı
        try {
            while (controlRs.next()){
                authorization = controlRs.getString("authorization");// yukarıda oluşturduğumuz değişkene eşitlenir. 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        if(authorization.equals("Personel")){ // değikenden çekilen değer Personel ise kod bloğu çalışır
            employeeInformation.setEnabled(false); //personel bilgisi devre dışı kalır
            addUser.setEnabled(false);//Kullanıcı ekleme devredışı kalır
            showSale.setEnabled(false);//Satışları gösterme devredışı kalır
        }
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepoYonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepoYonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepoYonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepoYonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepoYonetim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomer;
    private javax.swing.JButton addProduct;
    private javax.swing.JButton addUser;
    private javax.swing.JButton employeeInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sale;
    private javax.swing.JButton showCustomer;
    private javax.swing.JButton showProduct;
    private javax.swing.JButton showSale;
    private javax.swing.JLabel welcomeToPanel;
    // End of variables declaration//GEN-END:variables

}