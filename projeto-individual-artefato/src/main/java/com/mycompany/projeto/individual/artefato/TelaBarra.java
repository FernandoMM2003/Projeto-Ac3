
package com.mycompany.projeto.individual.artefato;

import java.awt.Color;
import java.sql.Connection;
import java.util.concurrent.ThreadLocalRandom;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class TelaBarra extends javax.swing.JFrame {
    
    public BasicDataSource dados = new BasicDataSource();
    public JdbcTemplate jdbcTemplate = new JdbcTemplate(dados);

    public TelaBarra() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMediaMemoria = new javax.swing.JLabel();
        txtResultadoCPU = new javax.swing.JTextField();
        lblMaxMemoria = new javax.swing.JLabel();
        txtResultadoMaxCPU = new javax.swing.JTextField();
        lblMinMemoria = new javax.swing.JLabel();
        txtResultadoMinMemoria = new javax.swing.JTextField();
        txtResultadoMaxMemoria = new javax.swing.JTextField();
        txtResultadoDisco = new javax.swing.JTextField();
        txtResultadoMinDisco = new javax.swing.JTextField();
        txtResultadoMemoria = new javax.swing.JTextField();
        txtResultadoMaxDisco = new javax.swing.JTextField();
        txtResultadoMinCPU = new javax.swing.JTextField();
        lblMediaCPU = new javax.swing.JLabel();
        lblMaxCPU = new javax.swing.JLabel();
        lblMinCPU = new javax.swing.JLabel();
        lblMediaDisco = new javax.swing.JLabel();
        prgCPU = new javax.swing.JProgressBar();
        prgMemoria = new javax.swing.JProgressBar();
        prgDisco = new javax.swing.JProgressBar();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        btnLeitura = new javax.swing.JButton();
        lblMaxDisco = new javax.swing.JLabel();
        lblMinDisco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        lblMediaMemoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMediaMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblMediaMemoria.setText("Média:");

        txtResultadoCPU.setEditable(false);
        txtResultadoCPU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResultadoCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoCPUActionPerformed(evt);
            }
        });

        lblMaxMemoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMaxMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxMemoria.setText("Valor Máximo:");

        txtResultadoMaxCPU.setEditable(false);
        txtResultadoMaxCPU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResultadoMaxCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoMaxCPUActionPerformed(evt);
            }
        });

        lblMinMemoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMinMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblMinMemoria.setText("Valor Mínimo:");

        txtResultadoMinMemoria.setEditable(false);
        txtResultadoMinMemoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtResultadoMaxMemoria.setEditable(false);
        txtResultadoMaxMemoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResultadoMaxMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoMaxMemoriaActionPerformed(evt);
            }
        });

        txtResultadoDisco.setEditable(false);
        txtResultadoDisco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResultadoDisco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultadoDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoDiscoActionPerformed(evt);
            }
        });

        txtResultadoMinDisco.setEditable(false);
        txtResultadoMinDisco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResultadoMinDisco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtResultadoMemoria.setEditable(false);
        txtResultadoMemoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResultadoMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoMemoriaActionPerformed(evt);
            }
        });

        txtResultadoMaxDisco.setEditable(false);
        txtResultadoMaxDisco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResultadoMaxDisco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultadoMaxDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoMaxDiscoActionPerformed(evt);
            }
        });

        txtResultadoMinCPU.setEditable(false);
        txtResultadoMinCPU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblMediaCPU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMediaCPU.setForeground(new java.awt.Color(255, 255, 255));
        lblMediaCPU.setText("Média:");

        lblMaxCPU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMaxCPU.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxCPU.setText("Valor Máximo:");

        lblMinCPU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMinCPU.setForeground(new java.awt.Color(255, 255, 255));
        lblMinCPU.setText("Valor Mínimo:");

        lblMediaDisco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMediaDisco.setForeground(new java.awt.Color(255, 255, 255));
        lblMediaDisco.setText("Média:");

        prgCPU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        prgCPU.setForeground(new java.awt.Color(0, 0, 0));
        prgCPU.setMaximum(381);
        prgCPU.setMinimum(200);
        prgCPU.setBorderPainted(false);
        prgCPU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prgCPU.setStringPainted(true);

        prgMemoria.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        prgMemoria.setStringPainted(true);

        prgDisco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        prgDisco.setMaximum(220);
        prgDisco.setStringPainted(true);

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Monitoramento de Componentes");

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("CPU");

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("Disco");

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Memória");

        btnLeitura.setBackground(new java.awt.Color(255, 255, 255));
        btnLeitura.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLeitura.setForeground(new java.awt.Color(255, 153, 0));
        btnLeitura.setText("Fazer leitura de Dados");
        btnLeitura.setBorder(new javax.swing.border.MatteBorder(null));
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });

        lblMaxDisco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMaxDisco.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxDisco.setText("Valor Máximo:");

        lblMinDisco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMinDisco.setForeground(new java.awt.Color(255, 255, 255));
        lblMinDisco.setText("Valor Mínimo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblMediaCPU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(287, 287, 287)
                                .addComponent(lblMaxCPU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoMaxCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(322, 322, 322)
                                .addComponent(lblMinCPU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoMinCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLeitura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prgMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblMediaDisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMaxDisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoMaxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320)
                                .addComponent(lblMinDisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoMinDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(prgDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prgCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblMediaMemoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(282, 282, 282)
                                .addComponent(lblMaxMemoria)
                                .addGap(4, 4, 4)
                                .addComponent(txtResultadoMaxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMinMemoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultadoMinMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(btnLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prgCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResultadoMaxCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaxCPU))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResultadoCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMediaCPU)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtResultadoMinCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMinCPU)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prgDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMediaDisco)
                    .addComponent(lblMaxDisco)
                    .addComponent(lblMinDisco)
                    .addComponent(txtResultadoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoMaxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoMinDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prgMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultadoMaxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoMinMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxMemoria)
                    .addComponent(lblMediaMemoria)
                    .addComponent(lblMinMemoria))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Variaveis Disco
    
    Integer contadorDisco =0;
    
    Double mediaDisco=0.0;
    
    Integer valorMaximoDisco=0;
    
    Integer valorMinimoDisco=221;
    
    //Variaveis CPU
    
    Integer contadorCPU =0;
    
    Double mediaCPU=0.0;
    
    Double valorMaximoCPU=0.0;
    
    Double valorMinimoCPU=3.81;
    
    
    //Variaveis Memoria
    
    Integer contadorMemoria =0;
    
    Double mediaMemoria=0.0;
    
    Double valorMaximoMemoria=0.00;
    
    Double valorMinimoMemoria=10.01;
    
    String sql;
    
    
    
    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        
        // CPU
        
        // Gerador
       
        Integer valorCPU; 
        valorCPU = ThreadLocalRandom.current().nextInt(200, 381);
        prgCPU.setValue(valorCPU);
        
        Double convertidoCPU = new Double(valorCPU);
        
        Double divisaoCPU = convertidoCPU/100;

        // Cálculo da Média
        contadorCPU++;     
        mediaCPU += divisaoCPU;
        Double divisaoMediaCPU = mediaCPU/contadorCPU;   

        txtResultadoCPU.setText(String.format("%.2f", divisaoMediaCPU));
        
        // Condicionais Minimo e Maximo
        if(valorMaximoCPU<divisaoCPU){
            valorMaximoCPU = divisaoCPU;
        }
 
        txtResultadoMaxCPU.setText(String.format("%.2f", valorMaximoCPU));
        
        if(valorMinimoCPU>divisaoCPU){
            valorMinimoCPU = divisaoCPU;
        }
        
        txtResultadoMinCPU.setText(String.format("%.2f", valorMinimoCPU));
        
        
        
        
        // Disco
        
        // Gerador
        Integer valorDisco;        
        valorDisco = ThreadLocalRandom.current().nextInt(0, 221);       
        prgDisco.setValue(valorDisco);

        // Cálculo da Média
        contadorDisco++;
        Double convertidoDisco = new Double(valorDisco);       
        mediaDisco += convertidoDisco;
        Double divisaoMediaDisco = mediaDisco/contadorDisco;   

        txtResultadoDisco.setText(String.format("%.2f", divisaoMediaDisco));

        // Condicionais Minimo e Maximo
        if(valorMaximoDisco<valorDisco){
            valorMaximoDisco = valorDisco;
        }
 
        txtResultadoMaxDisco.setText(valorMaximoDisco.toString());
        
        if(valorMinimoDisco>valorDisco){
            valorMinimoDisco = valorDisco;
        }
        
        txtResultadoMinDisco.setText(valorMinimoDisco.toString());
        
        
  
        
        // Memoria  
        
        // Gerador 
        Integer valorMemoria; 
        valorMemoria = ThreadLocalRandom.current().nextInt(0, 101);
        prgMemoria.setValue(valorMemoria);
        
        
        Double convertidoMemoria = new Double(valorMemoria);
        
        Double divisaoMemoria = convertidoMemoria/10;
        

        // Cálculo da Média
        contadorMemoria++;
        mediaMemoria += divisaoMemoria;
        Double divisaoMediaMemoria = mediaMemoria/contadorMemoria;   

        txtResultadoMemoria.setText(String.format("%.2f", divisaoMediaMemoria));
 
        
        // Condicionais Minimo e Maximo
        if(valorMaximoMemoria<divisaoMemoria){
            valorMaximoMemoria = divisaoMemoria;
        } 
 
        txtResultadoMaxMemoria.setText(String.format("%.2f", valorMaximoMemoria));
        
        if(valorMinimoMemoria>divisaoMemoria){
            valorMinimoMemoria = divisaoMemoria;
        }
        
        txtResultadoMinMemoria.setText(String.format("%.2f", valorMinimoMemoria));
        
                // Configuração dos parâmetros de conexão

        String url = "jdbc:mysql://localhost:3306/dados";
        String user = "root";
        String passwd = "25072003";
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Abre-se a conexão com o Banco de Dados
            
            Connection con = DriverManager.getConnection(url, user, passwd);

            // Cria-se Statement com base na conexão con
            Statement stmt = con.createStatement();


            sql = "INSERT INTO monitoramento (cpu, disco, memoria)"
                    + "VALUES ("+divisaoCPU+","+valorDisco+","+divisaoMemoria+");";

            stmt.executeUpdate(sql);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_btnLeituraActionPerformed

    private void txtResultadoMaxMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoMaxMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoMaxMemoriaActionPerformed

    private void txtResultadoDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoDiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoDiscoActionPerformed

    private void txtResultadoMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoMemoriaActionPerformed

    private void txtResultadoMaxDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoMaxDiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoMaxDiscoActionPerformed

    private void txtResultadoCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoCPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoCPUActionPerformed

    private void txtResultadoMaxCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoMaxCPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoMaxCPUActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaBarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBarra().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeitura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblMaxCPU;
    private javax.swing.JLabel lblMaxDisco;
    private javax.swing.JLabel lblMaxMemoria;
    private javax.swing.JLabel lblMediaCPU;
    private javax.swing.JLabel lblMediaDisco;
    private javax.swing.JLabel lblMediaMemoria;
    private javax.swing.JLabel lblMinCPU;
    private javax.swing.JLabel lblMinDisco;
    private javax.swing.JLabel lblMinMemoria;
    private javax.swing.JProgressBar prgCPU;
    private javax.swing.JProgressBar prgDisco;
    private javax.swing.JProgressBar prgMemoria;
    private javax.swing.JTextField txtResultadoCPU;
    private javax.swing.JTextField txtResultadoDisco;
    private javax.swing.JTextField txtResultadoMaxCPU;
    private javax.swing.JTextField txtResultadoMaxDisco;
    private javax.swing.JTextField txtResultadoMaxMemoria;
    private javax.swing.JTextField txtResultadoMemoria;
    private javax.swing.JTextField txtResultadoMinCPU;
    private javax.swing.JTextField txtResultadoMinDisco;
    private javax.swing.JTextField txtResultadoMinMemoria;
    // End of variables declaration//GEN-END:variables
}
