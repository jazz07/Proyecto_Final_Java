/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproyecto1;

import static com.mycompany.mavenproyecto1.Prueba02.TablaContenido;
import static com.mycompany.mavenproyecto1.Prueba02.txtTotal;
import java.awt.Component;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1
 */
public class Pb03 extends javax.swing.JPanel {
JButton boton1= new JButton("Agregar");
    
    /**
     * Creates new form Pb01
     */
    public Pb03() {
        initComponents();
        propiedadesTabla();
    }
//definimos el men� en si
   private void propiedadesTabla(){
          Tabla1.setDefaultRenderer(Object.class, new imgTabla());
          String titulos[] = {"Nombre","Precio","","Agregar"};
          DefaultTableModel prop = new DefaultTableModel(null,titulos);
           prop.addRow(new Object[]{"Tortas al gusto","25",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/egg-benedict.png")) )});
           prop.addRow(new Object[]{"Barra de Tacos","15",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/tacos.png")) )});
           prop.addRow(new Object[]{"Sandwich de Jam�n y queso","30",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/Sandwich.png")) )});
           prop.addRow(new Object[]{"Ensalada Italiana","40",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/ensaladas.png")) )});
           prop.addRow(new Object[]{"Panes con Jalea y frutas","20",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/toasted-breads.png")) )});
           prop.addRow(new Object[]{"Hamburguesas","30",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/burger.png")) )});
           prop.addRow(new Object[]{"Copas de Helado","40",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/icecream4_122441.png")) )});
               
              
          Tabla1.setRowHeight(120);
          Tabla1.setModel(prop);
   }
   
   public class imgTabla extends DefaultTableCellRenderer{

         @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) 
        {
            if(o instanceof JLabel){
                JLabel lbl = (JLabel)o;
                return lbl;
            }
            
            return super.getTableCellRendererComponent( jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
        }

       
       
   }
   
     private void calcular(){
     double suma = 0;
  
     for(int i = 0; i<TablaContenido.getRowCount(); i++){
         double renglon;
         
         renglon = Double.parseDouble(TablaContenido.getValueAt(i, 1).toString());
         suma = suma +renglon;
         
         txtTotal.setText(String.valueOf(suma));
         
     }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cenas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 1, 24), new java.awt.Color(255, 204, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        Tabla1.setBackground(new java.awt.Color(102, 102, 102));
        Tabla1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Tabla1.setForeground(new java.awt.Color(255, 255, 255));
        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        jPanel1.add(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("Seleccione lo que desee:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         int FilaSeleccionada = Tabla1.getSelectedRow();
           
           if(FilaSeleccionada >= 0){
               String Datos []= new String [2];
               Datos[0]=Tabla1.getValueAt(FilaSeleccionada, 0).toString();
               Datos[1]=Tabla1.getValueAt(FilaSeleccionada, 1).toString();
               
               Prueba02.model2.addRow(Datos);
//               modelo.removeRow(FilaSeleccionada);

                calcular();
           }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
