package grafico;

import simulador.Principal;
import simulador.entrenador.Entrenador;
import static simulador.Principal.crearPokemon;
import simulador.pokemon.*;

public class terceraVentana extends javax.swing.JFrame {

    private Entrenador entrenador;

    public terceraVentana() {
        this.entrenador = null; // Sin entrenador al principio
        initComponents();
    }

    public terceraVentana(Entrenador entrenador) {
        this.entrenador = entrenador; // Asignar el entrenador
        initComponents();
    }

//asignar un entrenador a futuro
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Zubat = new javax.swing.JButton();
        Bellsprout = new javax.swing.JButton();
        Hitmonlee = new javax.swing.JButton();
        Onix = new javax.swing.JButton();
        Psyduck = new javax.swing.JButton();
        Exeggcute = new javax.swing.JButton();
        Farfetch_d = new javax.swing.JButton();
        Tentacool = new javax.swing.JButton();
        Growlithe = new javax.swing.JButton();
        Voltorb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AgregarEntrenador = new javax.swing.JButton();
        VolverMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        Zubat.setBackground(new java.awt.Color(153, 0, 153));
        Zubat.setText("Zubat");
        Zubat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZubatActionPerformed(evt);
            }
        });

        Bellsprout.setBackground(new java.awt.Color(0, 153, 0));
        Bellsprout.setText("Bellsprout");
        Bellsprout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BellsproutActionPerformed(evt);
            }
        });

        Hitmonlee.setText("Hitmonlee");
        Hitmonlee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitmonleeActionPerformed(evt);
            }
        });

        Onix.setText("Onix");
        Onix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnixActionPerformed(evt);
            }
        });

        Psyduck.setText("Psyduck");
        Psyduck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsyduckActionPerformed(evt);
            }
        });

        Exeggcute.setBackground(new java.awt.Color(102, 102, 0));
        Exeggcute.setText("Exeggcute");
        Exeggcute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExeggcuteActionPerformed(evt);
            }
        });

        Farfetch_d.setText("Farfetch_d");
        Farfetch_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Farfetch_dActionPerformed(evt);
            }
        });

        Tentacool.setText("Tentacool");
        Tentacool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TentacoolActionPerformed(evt);
            }
        });

        Growlithe.setText("Growlithe");
        Growlithe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrowlitheActionPerformed(evt);
            }
        });

        Voltorb.setText("Voltorb");
        Voltorb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltorbActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡¡ELIGE TU POKEMON !!");

        AgregarEntrenador.setText("Agregar entrenador");
        AgregarEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEntrenadorActionPerformed(evt);
            }
        });

        VolverMenu.setBackground(new java.awt.Color(255, 0, 0));
        VolverMenu.setText("Menu");
        VolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hitmonlee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Zubat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bellsprout, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Onix, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Psyduck, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exeggcute, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Farfetch_d, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tentacool, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Voltorb, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(VolverMenu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Growlithe, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(AgregarEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Bellsprout, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Exeggcute, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Farfetch_d, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Growlithe, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Zubat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AgregarEntrenador)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hitmonlee, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Onix, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Psyduck, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tentacool, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Voltorb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VolverMenu)
                        .addGap(91, 91, 91))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverMenuActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal ();
            menuPrincipal.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_VolverMenuActionPerformed

    private void AgregarEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEntrenadorActionPerformed
        CreacionEntrenador creacionEntrenador = new CreacionEntrenador ();
            creacionEntrenador.setVisible(true);
            this.dispose();;
    }//GEN-LAST:event_AgregarEntrenadorActionPerformed

    private void VoltorbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltorbActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon voltorb = new Voltorb();
            entrenador.agregarPokemon(voltorb);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }

    }//GEN-LAST:event_VoltorbActionPerformed

    private void GrowlitheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrowlitheActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon growlithe = new Growlithe();
            entrenador.agregarPokemon(growlithe);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }
    }//GEN-LAST:event_GrowlitheActionPerformed

    private void TentacoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TentacoolActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon tentacool = new Tentacool();
            entrenador.agregarPokemon(tentacool);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }
    }//GEN-LAST:event_TentacoolActionPerformed

    private void Farfetch_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Farfetch_dActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon farfetch_d = new Farfetch_d();
            entrenador.agregarPokemon(farfetch_d);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }
    }//GEN-LAST:event_Farfetch_dActionPerformed

    private void ExeggcuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExeggcuteActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon exeggcute = new Exeggcute();
            entrenador.agregarPokemon(exeggcute);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }
    }//GEN-LAST:event_ExeggcuteActionPerformed

    private void PsyduckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsyduckActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon psyduck = new Psyduck();
            entrenador.agregarPokemon(psyduck);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }
    }//GEN-LAST:event_PsyduckActionPerformed

    private void OnixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnixActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon onix = new Onix();
            entrenador.agregarPokemon(onix);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }
    }//GEN-LAST:event_OnixActionPerformed

    private void HitmonleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitmonleeActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon hitmonlee = new Hitmonlee();
            entrenador.agregarPokemon(hitmonlee);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }
    }//GEN-LAST:event_HitmonleeActionPerformed

    private void BellsproutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BellsproutActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon bellsprout = new Bellsprout();
            entrenador.agregarPokemon(bellsprout);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }

    }//GEN-LAST:event_BellsproutActionPerformed

    private void ZubatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZubatActionPerformed

        if (entrenador == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debes asignar un entrenador antes de seleccionar un Pokémon.");
            return; // Salir si no hay entrenador asignado
        }

        if (puedeAgregarPokemon()) {
            Pokemon zubat = new Zubat();
            entrenador.agregarPokemon(zubat);
            pokemonesSeleccionados++;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Bellsprout agregado al equipo!");
            verificarSeleccion();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes agregar más Pokémon.");
        }
    }//GEN-LAST:event_ZubatActionPerformed

    private int pokemonesSeleccionados = 0;

    private boolean puedeAgregarPokemon() {
        return pokemonesSeleccionados < 2;
    }

    private void deshabilitarBotones() {
        Bellsprout.setEnabled(false);
        Exeggcute.setEnabled(false);
        Farfetch_d.setEnabled(false);
        Growlithe.setEnabled(false);
        Hitmonlee.setEnabled(false);
        Onix.setEnabled(false);
        Psyduck.setEnabled(false);
        Tentacool.setEnabled(false);
        Voltorb.setEnabled(false);
        Zubat.setEnabled(false);
    }

    private void verificarSeleccion() {
        if (pokemonesSeleccionados >= 2) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya has seleccionado 2 Pokémon.");
            deshabilitarBotones();
        }
    }

    
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(terceraVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(terceraVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(terceraVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(terceraVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new terceraVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarEntrenador;
    private javax.swing.JButton Bellsprout;
    private javax.swing.JButton Exeggcute;
    private javax.swing.JButton Farfetch_d;
    private javax.swing.JButton Growlithe;
    private javax.swing.JButton Hitmonlee;
    private javax.swing.JButton Onix;
    private javax.swing.JButton Psyduck;
    private javax.swing.JButton Tentacool;
    private javax.swing.JButton Voltorb;
    private javax.swing.JButton VolverMenu;
    private javax.swing.JButton Zubat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
