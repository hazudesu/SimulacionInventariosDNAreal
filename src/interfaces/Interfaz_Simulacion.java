package interfaces;

import classes.fileCreator;
import classes.inValues;
import classes.outValues;
import classes.simulation;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Interfaz_Simulacion extends javax.swing.JFrame {

    DefaultListModel data = new DefaultListModel();
    DefaultListModel data2 = new DefaultListModel();
    DefaultListModel data3 = new DefaultListModel();
    
    DefaultListModel dataa = new DefaultListModel();
    DefaultListModel dataa2 = new DefaultListModel();
    DefaultListModel dataa3 = new DefaultListModel();
    
    int acumpDemanda, acumpTiempoEntrega, acumpTiempoEspera = 0;
    
    
    public Interfaz_Simulacion() {
        initComponents();
        listaVDemanda.setModel(data);
        listaVTiempoEntrega.setModel(data2);
        listaVTiempoEspera.setModel(data3);
        
        listaPDemanda.setModel(dataa);
        listaPTiempoEntrega.setModel(dataa2);
        listaPTiempoEspera.setModel(dataa3);

        botonSimular.setEnabled(false);
        
        probabilidadDemanda.setText(acumpDemanda+"%");
        probabilidadTiempoEntrega.setText(acumpTiempoEntrega+"%");
        probabilidadTiempoEspera.setText(acumpTiempoEspera+"%");
        
        //Demanda Diaria Validacion
        vDemanda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        pDemanda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            } 
        });
        
        //Tiempo de Entrega Validacion
        vTiempoEntrega.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        pTiempoEntrega.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        
        //Tiempo Espera Validacion
        vTiempoEspera.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        pTiempoEspera.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        
        //Costos Validacion
        CostoInventario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        CostoOrdenar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        CostoCompra.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        TiempoSimulacion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        CostoFaltanteConEspera.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        CostoFaltanteSinEspera.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        InventarioInicial.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9') 
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar();
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pDemanda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPDemanda = new javax.swing.JList<>();
        vDemanda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVDemanda = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        agregarDemanda = new javax.swing.JButton();
        borrarDemanda = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        probabilidadDemanda = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        vTiempoEntrega = new javax.swing.JTextField();
        pTiempoEntrega = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaVTiempoEntrega = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaPTiempoEntrega = new javax.swing.JList<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        agregarTiempoEntrega = new javax.swing.JButton();
        borrarTiempoEntrega = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        probabilidadTiempoEntrega = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pTiempoEspera = new javax.swing.JTextField();
        vTiempoEspera = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaVTiempoEspera = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaPTiempoEspera = new javax.swing.JList<>();
        agregarEsperaCliente = new javax.swing.JButton();
        borrarTiempoEspera = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        probabilidadTiempoEspera = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CostoInventario = new javax.swing.JTextField();
        CostoOrdenar = new javax.swing.JTextField();
        CostoCompra = new javax.swing.JTextField();
        CostoFaltanteConEspera = new javax.swing.JTextField();
        CostoFaltanteSinEspera = new javax.swing.JTextField();
        InventarioInicial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        botonSimular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TiempoSimulacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(2, 62, 138));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proyecto de Investigacion de Operaciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jButton2.setText("Guardar Archivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel2.setText("Demanda Diaria");

        pDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDemandaActionPerformed(evt);
            }
        });

        jLabel6.setText("Probabilidad");

        listaPDemanda.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaPDemanda);

        vDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vDemandaActionPerformed(evt);
            }
        });
        vDemanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vDemandaKeyReleased(evt);
            }
        });

        listaVDemanda.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaVDemanda);

        jLabel5.setText("Valor");

        agregarDemanda.setText("Agregar");
        agregarDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDemandaActionPerformed(evt);
            }
        });

        borrarDemanda.setText("Borrar");
        borrarDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarDemandaActionPerformed(evt);
            }
        });

        jLabel25.setText("Probabilidad:");

        probabilidadDemanda.setText("0%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(pDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(borrarDemanda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarDemanda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(probabilidadDemanda))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarDemanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrarDemanda)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(probabilidadDemanda))
                .addGap(37, 37, 37))
        );

        jLabel3.setText("Tiempo de Entrega");

        pTiempoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTiempoEntregaActionPerformed(evt);
            }
        });

        listaVTiempoEntrega.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaVTiempoEntrega);

        listaPTiempoEntrega.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(listaPTiempoEntrega);

        jLabel21.setText("Valor");

        jLabel22.setText("Probabilidad");

        agregarTiempoEntrega.setText("Agregar");
        agregarTiempoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTiempoEntregaActionPerformed(evt);
            }
        });

        borrarTiempoEntrega.setText("Borrar");
        borrarTiempoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarTiempoEntregaActionPerformed(evt);
            }
        });

        jLabel27.setText("Probabilidad:");

        probabilidadTiempoEntrega.setText("0%");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(probabilidadTiempoEntrega))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vTiempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pTiempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(borrarTiempoEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(agregarTiempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vTiempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTiempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarTiempoEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrarTiempoEntrega)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(probabilidadTiempoEntrega))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Tiempo de Espera Cliente");

        jLabel23.setText("Valor");

        jLabel24.setText("Probabilidad");

        pTiempoEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTiempoEsperaActionPerformed(evt);
            }
        });

        listaVTiempoEspera.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaVTiempoEspera);

        listaPTiempoEspera.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(listaPTiempoEspera);

        agregarEsperaCliente.setText("Agregar");
        agregarEsperaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEsperaClienteActionPerformed(evt);
            }
        });

        borrarTiempoEspera.setText("Borrar");
        borrarTiempoEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarTiempoEsperaActionPerformed(evt);
            }
        });

        jLabel28.setText("Probabilidad:");

        probabilidadTiempoEspera.setText("0%");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel23))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vTiempoEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(pTiempoEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(probabilidadTiempoEspera))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(borrarTiempoEspera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agregarEsperaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vTiempoEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTiempoEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarEsperaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrarTiempoEspera)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(probabilidadTiempoEspera))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );

        jLabel9.setText("Costo de Inventario");

        jLabel10.setText("Costo de Ordenar");

        jLabel11.setText("Costo de Compra");

        jLabel12.setText("Costo de faltante con espera del cliente");

        jLabel13.setText("Costo de faltante sin espera del cliente");

        jLabel14.setText("Inventario Inicial");

        jLabel15.setText("$/unidad/año");

        jLabel16.setText("$/orden");

        jLabel17.setText("$/unidad");

        jLabel18.setText("$/unidad");

        jLabel19.setText("$/unidad");

        jLabel20.setText("unidades");

        botonSimular.setText("Simular");
        botonSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSimularActionPerformed(evt);
            }
        });

        jLabel7.setText("Tiempo de Simulacion");

        jLabel8.setText("dias");

        jLabel31.setText("Costos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CostoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CostoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CostoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TiempoSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(CostoFaltanteConEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(74, 74, 74)
                                        .addComponent(botonSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel14))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(146, 146, 146)
                                                .addComponent(jLabel13)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CostoFaltanteSinEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(InventarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18))
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel31)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(CostoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CostoFaltanteConEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(CostoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CostoFaltanteSinEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(CostoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InventarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TiempoSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(botonSimular)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void borrarTiempoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarTiempoEntregaActionPerformed
        // TODO add your handling code here:   
        acumpTiempoEntrega = acumpTiempoEntrega-Integer.parseInt(dataa2.lastElement().toString());
        probabilidadTiempoEntrega.setText(acumpTiempoEntrega+"%");
        
        data2.removeElement(data2.lastElement());
        dataa2.removeElement(dataa2.lastElement());

        validar();
    }//GEN-LAST:event_borrarTiempoEntregaActionPerformed

    private void agregarTiempoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTiempoEntregaActionPerformed
        // TODO add your handling code here:
        if(vTiempoEntrega.getText().isEmpty() || pTiempoEntrega.getText().isEmpty() || (acumpTiempoEntrega+Integer.parseInt(pTiempoEntrega.getText())>100)){
            }else{
            data2.addElement(vTiempoEntrega.getText());
            dataa2.addElement(pTiempoEntrega.getText());
            
            acumpTiempoEntrega = acumpTiempoEntrega+Integer.parseInt(pTiempoEntrega.getText());
            //System.out.println(acumpTiempoEntrega);
            probabilidadTiempoEntrega.setText(acumpTiempoEntrega+"%");
        }
        validar();
    }//GEN-LAST:event_agregarTiempoEntregaActionPerformed

    private void borrarDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarDemandaActionPerformed
        // TODO add your handling code here:
        acumpDemanda = acumpDemanda-Integer.parseInt(dataa.lastElement().toString());
        probabilidadDemanda.setText(acumpDemanda+"%");
        
        data.removeElement(data.lastElement());
        dataa.removeElement(dataa.lastElement());
   
        validar();
    }//GEN-LAST:event_borrarDemandaActionPerformed

    private void agregarDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDemandaActionPerformed
        // TODO add your handling code here:
        if(vDemanda.getText().isEmpty() || pDemanda.getText().isEmpty() || (acumpDemanda+Integer.parseInt(pDemanda.getText())>100)){
            }else{
            data.addElement(vDemanda.getText());
            dataa.addElement(pDemanda.getText());
            
            acumpDemanda = acumpDemanda+Integer.parseInt(pDemanda.getText());
            //System.out.println(acumpDemanda);
            probabilidadDemanda.setText(acumpDemanda+"%");
        }
        validar();
    }//GEN-LAST:event_agregarDemandaActionPerformed
        
    private void agregarEsperaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEsperaClienteActionPerformed
        // TODO add your handling code here:
        if(vTiempoEspera.getText().isEmpty() || pTiempoEspera.getText().isEmpty() || (acumpTiempoEspera+Integer.parseInt(pTiempoEspera.getText())>100)){
            }else{
            data3.addElement(vTiempoEspera.getText());
            dataa3.addElement(pTiempoEspera.getText());
            
            acumpTiempoEspera = acumpTiempoEspera+Integer.parseInt(pTiempoEspera.getText());
            //System.out.println(acumpTiempoEspera);
            probabilidadTiempoEspera.setText(acumpTiempoEspera+"%");
        }
        validar();
    }//GEN-LAST:event_agregarEsperaClienteActionPerformed

    private void borrarTiempoEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarTiempoEsperaActionPerformed
        // TODO add your handling code here:        
        acumpTiempoEspera = acumpTiempoEspera-Integer.parseInt(dataa3.lastElement().toString());
        probabilidadTiempoEspera.setText(acumpTiempoEspera+"%");
        
        data3.removeElement(data3.lastElement());
        dataa3.removeElement(dataa3.lastElement());

        validar();
    }//GEN-LAST:event_borrarTiempoEsperaActionPerformed

    private void vDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vDemandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vDemandaActionPerformed

    private void pDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDemandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pDemandaActionPerformed

    private void botonSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSimularActionPerformed
        // TODO add your handling code here:
        //int entero = Integer.parseInt(vDemanda.getText());
        
         
        char timeUnit;
        boolean eventTable;
        
        int timeAmount = Integer.parseInt(TiempoSimulacion.getText());
        int demandValues = data.getSize();
        //int[][] demandsArray;
        int deliverTimeAmount = data2.getSize();
        //int[][] deliverTimeArray;
        int w8TimeAmntClient = data3.getSize();
        //int[][] clientw8TimeArray;
        float invCost = Float.parseFloat(CostoInventario.getText());
        float purchaseCost = Float.parseFloat(CostoCompra.getText());
        float orderCost = Float.parseFloat(CostoOrdenar.getText());
        float acumDemandCost = Float.parseFloat(CostoFaltanteConEspera.getText());
        float saleLossCost = Float.parseFloat(CostoFaltanteSinEspera.getText());
        int initialInv = Integer.parseInt(InventarioInicial.getText());
      
        
        inValues enter = new inValues('d', false, 10, data.size(), data2.size(), data3.size(), invCost, purchaseCost, orderCost, acumDemandCost, saleLossCost, initialInv);
        
        int demandsArray[][] = new int[data.size()][2];
        int deliveryTimeArray[][] = new int[data2.size()][2];
        int clientw8TimeArray[][] = new int[data3.size()][2];
        int i=0;
        
        //Demanda Diaria
        while(i<data.size()){
           demandsArray[i][0] = Integer.parseInt(data.getElementAt(i).toString());
           System.out.println("Entro Valor Demanda Diaria "+i+" "+Integer.parseInt(data.getElementAt(i).toString()));
           i++;
        }
        
        i=0;
        while(i<dataa.size()){
           System.out.println("Entro Probabilidad Demanda Diaria");
           demandsArray[i][1] = Integer.parseInt(dataa.getElementAt(i).toString());
           i++;
        }
        i=0;
        //Tiempo de Entrega
        while(i<data2.size()){
           deliveryTimeArray[i][0] = Integer.parseInt(data2.getElementAt(i).toString());
           System.out.println("Entro Valor Tiempo Entrega "+i+" "+Integer.parseInt(data2.getElementAt(i).toString()));
           i++;
        }
        
        i=0;
        while(i<dataa2.size()){
           System.out.println("Entro Probabilidad Tiempo de Entrega");
           deliveryTimeArray[i][1] = Integer.parseInt(dataa2.getElementAt(i).toString());
           i++;
        }
        
        i=0;
        //Tiempo de Espera Cliente
        while(i<data3.size()){
           clientw8TimeArray[i][0] = Integer.parseInt(data3.getElementAt(i).toString());
           System.out.println("Entro Valor Tiempo Espera "+i+" "+Integer.parseInt(data3.getElementAt(i).toString()));
           i++;
        }
        
        i=0;
        while(i<dataa3.size()){
           System.out.println("Entro Probabilidad Tiempo de Entrega");
           clientw8TimeArray[i][1] = Integer.parseInt(dataa3.getElementAt(i).toString());
           i++;
        }
        
        
        enter.setDemandsArray(demandsArray);
        enter.setDeliverTimeArray(deliveryTimeArray);
        enter.setClientw8TimeArray(clientw8TimeArray);  
        
        //enter.bubbleSort();
        
        tabla tablas = new tabla();

                tablas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tablas.setSize(1500,500);
                tablas.setVisible(true);
                tablas.setLocationRelativeTo(null);
                //tablas.setTitle("My first java table");

    }//GEN-LAST:event_botonSimularActionPerformed

    private void pTiempoEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTiempoEsperaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTiempoEsperaActionPerformed

    private void pTiempoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTiempoEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTiempoEntregaActionPerformed

    private void vDemandaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vDemandaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_vDemandaKeyReleased

        public void validar(){
        if(!(acumpDemanda!=100 || acumpTiempoEspera!=100 || acumpTiempoEntrega!=100 ||
                CostoInventario.getText().isEmpty() || CostoOrdenar.getText().isEmpty() || CostoCompra.getText().isEmpty() || TiempoSimulacion.getText().isEmpty() || 
                CostoFaltanteConEspera.getText().isEmpty() || CostoFaltanteSinEspera.getText().isEmpty() || InventarioInicial.getText().isEmpty())){
                botonSimular.setEnabled(true);
        }else
            botonSimular.setEnabled(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Simulacion Interfaz = new Interfaz_Simulacion();
                Interfaz.setVisible(true);
                Interfaz.setLocationRelativeTo(null);
                //new Interfaz_Simulacion().setVisible(true);
                

                fileCreator creator = new fileCreator();
                creator.createDir();
        /*try {
            inValues test = creator.readFile("Caso.txt");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CostoCompra;
    private javax.swing.JTextField CostoFaltanteConEspera;
    private javax.swing.JTextField CostoFaltanteSinEspera;
    private javax.swing.JTextField CostoInventario;
    private javax.swing.JTextField CostoOrdenar;
    private javax.swing.JTextField InventarioInicial;
    private javax.swing.JTextField TiempoSimulacion;
    private javax.swing.JButton agregarDemanda;
    private javax.swing.JButton agregarEsperaCliente;
    private javax.swing.JButton agregarTiempoEntrega;
    private javax.swing.JButton borrarDemanda;
    private javax.swing.JButton borrarTiempoEntrega;
    private javax.swing.JButton borrarTiempoEspera;
    private javax.swing.JButton botonSimular;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> listaPDemanda;
    private javax.swing.JList<String> listaPTiempoEntrega;
    private javax.swing.JList<String> listaPTiempoEspera;
    private javax.swing.JList<String> listaVDemanda;
    private javax.swing.JList<String> listaVTiempoEntrega;
    private javax.swing.JList<String> listaVTiempoEspera;
    private javax.swing.JTextField pDemanda;
    private javax.swing.JTextField pTiempoEntrega;
    private javax.swing.JTextField pTiempoEspera;
    private javax.swing.JLabel probabilidadDemanda;
    private javax.swing.JLabel probabilidadTiempoEntrega;
    private javax.swing.JLabel probabilidadTiempoEspera;
    private javax.swing.JTextField vDemanda;
    private javax.swing.JTextField vTiempoEntrega;
    private javax.swing.JTextField vTiempoEspera;
    // End of variables declaration//GEN-END:variables
}
