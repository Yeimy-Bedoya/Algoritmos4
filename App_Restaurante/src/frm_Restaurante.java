import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;

public class frm_Restaurante extends javax.swing.JFrame {

    cls_Platos []platos = new cls_Platos[100]; 
    cls_Ventas[]Ventas = new cls_Ventas[500]; 
    int var_posicionInt=0; 
    int var_posicionventasInt=0; 
    int var_posInt ; 
    int swmessageconsulta = 0; 
    boolean var_Respuestabln; 
    
    
    public frm_Restaurante() {
        initComponents();
    
    getContentPane().setBackground(new Color(51,51,51));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        txt_Tipo = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Cantidad = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Lbl_Ganancias = new javax.swing.JLabel();
        Lbl_CantidadVendida = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_generarReportes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Reportes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo :");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro de platos");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo :");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre :");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio :");

        txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoActionPerformed(evt);
            }
        });
        txt_Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CodigoKeyTyped(evt);
            }
        });

        txt_Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PrecioKeyTyped(evt);
            }
        });

        btn_Guardar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Guardar.setMaximumSize(new java.awt.Dimension(150, 30));
        btn_Guardar.setMinimumSize(new java.awt.Dimension(150, 30));
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Actualizar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Actualizar.setMaximumSize(new java.awt.Dimension(150, 30));
        btn_Actualizar.setMinimumSize(new java.awt.Dimension(150, 30));
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Nuevo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Nuevo.setMaximumSize(new java.awt.Dimension(150, 30));
        btn_Nuevo.setMinimumSize(new java.awt.Dimension(150, 30));
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        btn_Consultar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btn_Consultar.setText("Consultar");
        btn_Consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Consultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Consultar.setMaximumSize(new java.awt.Dimension(150, 30));
        btn_Consultar.setMinimumSize(new java.awt.Dimension(150, 30));
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setRequestFocusEnabled(false);

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Copyright()-2024");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel14)
                .addContainerGap(915, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 449, 1260, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro de ventas");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad :");

        txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadKeyTyped(evt);
            }
        });

        btn_Cancelar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cancelar.setMaximumSize(new java.awt.Dimension(150, 30));
        btn_Cancelar.setMinimumSize(new java.awt.Dimension(150, 30));
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Registrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btn_Registrar.setText("Registrar");
        btn_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Registrar.setMaximumSize(new java.awt.Dimension(150, 30));
        btn_Registrar.setMinimumSize(new java.awt.Dimension(150, 30));
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(186, 186, 186))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 312, 548, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reporte de ganancias");

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("$");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("#");

        Lbl_Ganancias.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Lbl_Ganancias.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Ganancias.setText("--");

        Lbl_CantidadVendida.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Lbl_CantidadVendida.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_CantidadVendida.setText("--");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_Ganancias))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_CantidadVendida))
                    .addComponent(jLabel9))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Lbl_Ganancias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Lbl_CantidadVendida))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 49, -1, 231));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btn_generarReportes.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btn_generarReportes.setText("Generar Reportes");
        btn_generarReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_generarReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_generarReportes.setMaximumSize(new java.awt.Dimension(150, 30));
        btn_generarReportes.setMinimumSize(new java.awt.Dimension(150, 30));
        btn_generarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(btn_generarReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btn_generarReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 312, 224, -1));

        Tbl_Reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Precio", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(Tbl_Reportes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 52, 437, 381));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void fnt_Registrar(int codigo, int cantidad, float total, LocalDateTime fecha)
{
    Ventas [var_posicionventasInt] = new cls_Ventas(codigo,cantidad,total,fecha);   
    var_posicionventasInt+=1; 
    JOptionPane.showMessageDialog(null, "Venta registrada con éxito");
    fnt_MostrarEstadisticas();
}
private void fnt_MostrarEstadisticas()
{
      float var_cantidadtotalFlt=0;
      float var_gananciatotalFlt=0;
        for(int i=0;i<var_posicionventasInt;i++)
        {
              var_cantidadtotalFlt += Ventas[i].get_CantidadInt();
              var_gananciatotalFlt += Ventas[i].get_TotalFlt();           
        } 
        Lbl_Ganancias.setText(String.valueOf(var_gananciatotalFlt));
        Lbl_CantidadVendida.setText(String.valueOf(var_cantidadtotalFlt));
}
    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
       
        if(txt_Codigo.getText().length()!=0 &&txt_Nombre.getText().length()!=0&&txt_Tipo.getText().length()!=0&&txt_Cantidad.getText().length()!=0)
        {
            swmessageconsulta=1;
            fnt_Consultar(Integer.parseInt(txt_Codigo.getText()));
            
            if(var_Respuestabln==false)
            {
                JOptionPane.showMessageDialog(null, "Error, Este plato no existe.");         
            }
            else
            {  
       
                int cantidadlocal = Integer.parseInt(txt_Cantidad.getText());
                float precio = Float.parseFloat(txt_Precio.getText());
                float total = cantidadlocal * precio;
                fnt_Registrar(Integer.parseInt(txt_Codigo.getText()),Integer.parseInt(txt_Cantidad.getText()),total,LocalDateTime.now());
            }   
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error, todos los campos deben ser diligenciados.");
        }
    }//GEN-LAST:event_btn_RegistrarActionPerformed
    private void fnt_Guardar(int cod,String nom, float pre, String tipo)
    {
        swmessageconsulta=1;
        fnt_Consultar(Integer.parseInt(txt_Codigo.getText()));
        if(var_Respuestabln==false)
        {
            platos[var_posicionInt] = new cls_Platos(cod, nom, pre, tipo);         
            var_posicionInt+=1;
            JOptionPane.showMessageDialog(null, "Plato registrado con éxito");
        }else
        {
              JOptionPane.showMessageDialog(null, "Error, Este plato ya existe.");
        }
   
    }
    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        if(txt_Codigo.getText().length()!=0 &&txt_Nombre.getText().length()!=0&&txt_Tipo.getText().length()!=0)
        {
           fnt_Guardar(Integer.parseInt(txt_Codigo.getText()),txt_Nombre.getText(),Float.parseFloat(txt_Precio.getText()),txt_Tipo.getText());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error, todos los campos deben ser diligenciados.");
        }
        
        
    }//GEN-LAST:event_btn_GuardarActionPerformed
    private void fnt_Consultar(int cod){
         var_posInt = 0;
         var_Respuestabln = false;
        for(int i=0;i<var_posicionInt;i++)
        {
            if(cod==platos[i].get_CodigoInt())
            {
                var_posInt = i;
                var_Respuestabln=true;
                break;
            }
                
        } 
        if(var_Respuestabln == false)
        {
            if(swmessageconsulta!=1)
            {
             
                JOptionPane.showMessageDialog(null, "No se encontraron registros.");
            }
            
        }else
        {
             if(swmessageconsulta!=1)
            {
             JOptionPane.showMessageDialog(null, "Plato encontrado con éxito.");
             
            txt_Nombre.setText(""+platos[var_posInt].get_NombreStr());
            txt_Precio.setText(""+platos[var_posInt].get_PrecioFlt());
            txt_Tipo.setText(""+platos[var_posInt].get_TipoStr());
            }
        } 
           
           
     
    }
    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
           if(txt_Codigo.getText().length()!=0)
           {
                swmessageconsulta=0;
        fnt_Consultar(Integer.parseInt(txt_Codigo.getText()));
     
           }
           else{
           JOptionPane.showMessageDialog(null, "Error, digita un código.");
       }
       
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void fnt_Nuevo(){
        txt_Nombre.setText("");
        txt_Precio.setText("");
        txt_Tipo.setText("");
        txt_Codigo.setText("");
        txt_Cantidad.setText("");
    }
    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
       fnt_Nuevo();
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
    // System.exit(0);
    txt_Cantidad.setText("");
    }//GEN-LAST:event_btn_CancelarActionPerformed
    private void fnt_Actualizar(int cod,String nom, float pre, String tipo)
    {
    
            fnt_Consultar(cod);
        if(var_Respuestabln == true)
        {
            platos[var_posInt].setNombreStr(nom);
            platos[var_posInt].setPrecioFlt(pre);
            platos[var_posInt].setTipoStr(tipo);
            JOptionPane.showMessageDialog(null, "Plato actualizado.");
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay plato registrado con el codigo ["+cod+"]");
        }
    
        
    }
    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        
        if(txt_Codigo.getText().length()!=0 &&txt_Nombre.getText().length()!=0&&txt_Precio.getText().length()!=0&&txt_Tipo.getText().length() != 0)
        {
               swmessageconsulta=1;
            fnt_Actualizar(Integer.parseInt(txt_Codigo.getText()), txt_Nombre.getText(), Float.parseFloat(txt_Precio.getText()), txt_Tipo.getText());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error, todos los campos deben ser diligenciados.");
        }
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void txt_CodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CodigoKeyTyped
         char caracter = evt.getKeyChar();
        // Validar solo números
        if (!Character.isDigit(caracter)) {
                evt.consume();
        }
        // Validar la cantidad máxima de caracteres
         if (txt_Codigo.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CodigoKeyTyped

    private void txt_PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PrecioKeyTyped
        char caracter = evt.getKeyChar();
        // Validar solo números
        if (!Character.isDigit(caracter)) {
                evt.consume();
        }
        // Validar la cantidad máxima de caracteres
         if (txt_Precio.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_PrecioKeyTyped

    private void txt_CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadKeyTyped
         char caracter = evt.getKeyChar();
        // Validar solo números
        if (!Character.isDigit(caracter)) {
                evt.consume();
        }
        // Validar la cantidad máxima de caracteres
         if (txt_Cantidad.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_CantidadKeyTyped

    private void btn_generarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarReportesActionPerformed
        //frm_Reportes frmReportes = new frm_Reportes();

        //frmReportes.setVisible(true);
        fnt_CargarReporte();
    }//GEN-LAST:event_btn_generarReportesActionPerformed

    private void txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoActionPerformed
 String fnt_BuscarNombrePorCodigo(int Codigo)
 {
     String nombre="";
      for(int i=0;i<var_posicionInt;i++)
        {
            if(Codigo==platos[i].get_CodigoInt())
            {
                nombre = platos[i].get_NombreStr();
                break;
            }
                
        } 
     return nombre;
 }
    private void fnt_CargarReporte()
    {
        if(var_posicionventasInt==0)
        {
            JOptionPane.showMessageDialog(null, "Aún no tienes ventas para generar un reporte.");
        }
        else
        {
            
       
        DefaultTableModel model = (DefaultTableModel) Tbl_Reportes.getModel();
        model.setRowCount(0);
        String var_codigoStr;
        String var_nombreStr;
        int var_cantidadInt;
        float var_totalFlt;
        LocalDateTime var_fecha;
        for(int i=0;i<var_posicionventasInt;i++)
        {
            var_codigoStr = String.valueOf(Ventas[i].get_CodigoInt());
            var_nombreStr = fnt_BuscarNombrePorCodigo(Integer.parseInt(var_codigoStr));
            var_cantidadInt = Ventas[i].get_CantidadInt();
            var_totalFlt = Ventas[i].get_TotalFlt();
            var_fecha= Ventas[i].get_FechaStr();
            model.addRow(new Object[]{var_codigoStr, var_nombreStr,var_cantidadInt, var_totalFlt, var_fecha});
        } 
         }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Restaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_CantidadVendida;
    private javax.swing.JLabel Lbl_Ganancias;
    private javax.swing.JTable Tbl_Reportes;
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_generarReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Tipo;
    // End of variables declaration//GEN-END:variables
}
