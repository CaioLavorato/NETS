/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author NETS
 */
public class TelaPetShop extends javax.swing.JFrame {

    /**
     * Creates new form TelaMercadinho
     */
    public TelaPetShop() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tbl_produtos.getModel();
        tbl_produtos.setRowSorter(new TableRowSorter(modelo));

        btn_atualizar.setVisible(false);

        readJTable();
    }

    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) tbl_produtos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        for (Produto p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getDescricao(),
                p.getPrecoCompra(),
                p.getPrecoVenda(),
                p.getQuantidade(),
                p.isFlagProduto(),
                p.getData()});

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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        pnl_backgroundBlack = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_icone = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_cadastroProduto = new javax.swing.JPanel();
        lbl_cadastroProduto = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txf_nome = new javax.swing.JTextField();
        lbl_descricao = new javax.swing.JLabel();
        txf_descricao = new javax.swing.JTextField();
        lbl_precoCompra = new javax.swing.JLabel();
        txf_precoCompra = new javax.swing.JTextField();
        lbl_flagProduto = new javax.swing.JLabel();
        txf_precoVenda = new javax.swing.JTextField();
        lbl_quantidade = new javax.swing.JLabel();
        txf_quantidade = new javax.swing.JTextField();
        lbl_precoVenda = new javax.swing.JLabel();
        btn_cadastro = new javax.swing.JToggleButton();
        btn_atualizar = new javax.swing.JToggleButton();
        btn_excluir = new javax.swing.JToggleButton();
        chk_flagProduto = new javax.swing.JCheckBox();
        lbl_categoria = new javax.swing.JComboBox<>();
        lbl_nome1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_produtos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercadinho NETS");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        pnl_backgroundBlack.setBackground(new java.awt.Color(0, 0, 0));
        pnl_backgroundBlack.setMaximumSize(new java.awt.Dimension(1000, 800));
        pnl_backgroundBlack.setMinimumSize(new java.awt.Dimension(1000, 800));
        pnl_backgroundBlack.setOpaque(false);
        pnl_backgroundBlack.setPreferredSize(new java.awt.Dimension(1000, 800));

        pnl_titulo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));

        lbl_icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/NETSF.png"))); // NOI18N

        lbl_titulo.setFont(new java.awt.Font("Swis721 Blk BT", 1, 36)); // NOI18N
        lbl_titulo.setText("PetShop NETS");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_tituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(lbl_icone, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_icone)
                .addContainerGap())
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_cadastroProduto.setBackground(new java.awt.Color(255, 255, 255));
        pnl_cadastroProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));

        lbl_cadastroProduto.setFont(new java.awt.Font("Swis721 Blk BT", 1, 24)); // NOI18N
        lbl_cadastroProduto.setText("Cadastre seu produto");

        lbl_nome.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        lbl_nome.setText("Nome:");

        txf_nome.setBackground(new java.awt.Color(204, 204, 204));
        txf_nome.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txf_nome.setToolTipText("");
        txf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nomeActionPerformed(evt);
            }
        });

        lbl_descricao.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        lbl_descricao.setText("Descrição:");

        txf_descricao.setBackground(new java.awt.Color(204, 204, 204));
        txf_descricao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txf_descricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txf_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_descricaoActionPerformed(evt);
            }
        });

        lbl_precoCompra.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        lbl_precoCompra.setText("Preço de compra:");

        txf_precoCompra.setBackground(new java.awt.Color(204, 204, 204));
        txf_precoCompra.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txf_precoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_precoCompraActionPerformed(evt);
            }
        });

        lbl_flagProduto.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        lbl_flagProduto.setText("Flag do Produto:");

        txf_precoVenda.setBackground(new java.awt.Color(204, 204, 204));
        txf_precoVenda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbl_quantidade.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        lbl_quantidade.setText("Quantidade:");

        txf_quantidade.setBackground(new java.awt.Color(204, 204, 204));
        txf_quantidade.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txf_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_quantidadeActionPerformed(evt);
            }
        });

        lbl_precoVenda.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        lbl_precoVenda.setText("Preço de venda:");

        btn_cadastro.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastro.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 15)); // NOI18N
        btn_cadastro.setText("Salvar");
        btn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroActionPerformed(evt);
            }
        });

        btn_atualizar.setBackground(new java.awt.Color(255, 255, 255));
        btn_atualizar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 15)); // NOI18N
        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(255, 255, 255));
        btn_excluir.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 15)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        chk_flagProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_flagProdutoActionPerformed(evt);
            }
        });

        lbl_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma Categoria>", "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbl_produtos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement}"), lbl_categoria, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        lbl_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_categoriaActionPerformed(evt);
            }
        });

        lbl_nome1.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        lbl_nome1.setText("Categoria:");

        javax.swing.GroupLayout pnl_cadastroProdutoLayout = new javax.swing.GroupLayout(pnl_cadastroProduto);
        pnl_cadastroProduto.setLayout(pnl_cadastroProdutoLayout);
        pnl_cadastroProdutoLayout.setHorizontalGroup(
            pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_descricao)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_nome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                        .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                                .addComponent(btn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txf_descricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                                .addComponent(txf_nome, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_flagProduto)
                                    .addComponent(lbl_precoCompra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_flagProduto)
                                    .addComponent(txf_precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_precoVenda)
                                    .addComponent(lbl_quantidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_precoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                        .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lbl_cadastroProduto))
                            .addComponent(lbl_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_cadastroProdutoLayout.setVerticalGroup(
            pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                .addComponent(lbl_cadastroProduto)
                .addGap(18, 18, 18)
                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                        .addComponent(lbl_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cadastroProdutoLayout.createSequentialGroup()
                        .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_nome)
                            .addComponent(lbl_precoCompra)
                            .addComponent(txf_precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_descricao)
                    .addComponent(txf_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                        .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_flagProduto)
                            .addGroup(pnl_cadastroProdutoLayout.createSequentialGroup()
                                .addComponent(chk_flagProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txf_precoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_precoVenda))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_quantidade))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        txf_precoVenda.getAccessibleContext().setAccessibleName("");

        tbl_produtos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Preço de Compra", "Preço de Venda", "Quantidade", "Flag do Produto", "Data da inclusão", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_produtosMouseClicked(evt);
            }
        });
        tbl_produtos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_produtosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_produtos);
        if (tbl_produtos.getColumnModel().getColumnCount() > 0) {
            tbl_produtos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_produtos.getColumnModel().getColumn(3).setPreferredWidth(90);
            tbl_produtos.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbl_produtos.getColumnModel().getColumn(5).setPreferredWidth(50);
            tbl_produtos.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout pnl_backgroundBlackLayout = new javax.swing.GroupLayout(pnl_backgroundBlack);
        pnl_backgroundBlack.setLayout(pnl_backgroundBlackLayout);
        pnl_backgroundBlackLayout.setHorizontalGroup(
            pnl_backgroundBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundBlackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_backgroundBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_cadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_backgroundBlackLayout.setVerticalGroup(
            pnl_backgroundBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundBlackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnl_cadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(pnl_backgroundBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_backgroundBlack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_produtosMouseClicked

        if (tbl_produtos.getSelectedRow() != -1) {

            txf_nome.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 1).toString());
            txf_descricao.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 2).toString());
            txf_precoCompra.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 3).toString());
            txf_precoVenda.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 4).toString());
            txf_quantidade.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 5).toString());
            chk_flagProduto.setSelected((boolean) tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 6));
            btn_atualizar.setVisible(true);
            btn_cadastro.setVisible(false);

        }

    }//GEN-LAST:event_tbl_produtosMouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed

        if (tbl_produtos.getSelectedRow() != -1) {

            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();

            p.setId((int) tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 0));
            dao.delete(p);

            txf_nome.setText("");
            txf_descricao.setText("");
            txf_precoCompra.setText("");
            txf_precoVenda.setText("");
            txf_quantidade.setText("");
            chk_flagProduto.setSelected(false);
            btn_cadastro.setVisible(true);
            btn_atualizar.setVisible(false);

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!");
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed

        if (tbl_produtos.getSelectedRow() != -1) {

            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();

            p.setNome(txf_nome.getText());
            p.setDescricao(txf_descricao.getText());
            p.setPrecoCompra(Double.parseDouble(txf_precoCompra.getText()));
            p.setPrecoVenda(Double.parseDouble(txf_precoVenda.getText()));
            p.setQuantidade(Integer.parseInt(txf_quantidade.getText()));
            p.setFlagProduto(chk_flagProduto.isSelected());
            p.setId((int) tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 0));
            dao.update(p);

            txf_nome.setText("");
            txf_descricao.setText("");
            txf_precoCompra.setText("");
            txf_precoVenda.setText("");
            txf_quantidade.setText("");
            chk_flagProduto.setSelected(false);
            btn_cadastro.setVisible(true);
            btn_atualizar.setVisible(false);

            readJTable();

        }
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void btn_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroActionPerformed

        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();

        p.setNome(txf_nome.getText());
        p.setDescricao(txf_descricao.getText());
        p.setPrecoCompra(Double.parseDouble(txf_precoCompra.getText()));
        p.setPrecoVenda(Double.parseDouble(txf_precoVenda.getText()));
        p.setQuantidade(Integer.parseInt(txf_quantidade.getText()));
        p.setFlagProduto((chk_flagProduto.isSelected()));
        dao.create(p);

        txf_nome.setText("");
        txf_descricao.setText("");
        txf_precoCompra.setText("");
        txf_precoVenda.setText("");
        txf_quantidade.setText("");
        chk_flagProduto.setSelected(false);

        readJTable();
    }//GEN-LAST:event_btn_cadastroActionPerformed

    private void txf_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_quantidadeActionPerformed

    private void txf_precoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_precoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_precoCompraActionPerformed

    private void txf_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_descricaoActionPerformed

    private void txf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nomeActionPerformed

    private void tbl_produtosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_produtosKeyReleased

        if (tbl_produtos.getSelectedRow() != -1) {
            txf_nome.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 1).toString());
            txf_descricao.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 2).toString());
            txf_precoCompra.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 3).toString());
            txf_precoVenda.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 4).toString());
            txf_quantidade.setText(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 5).toString());
            chk_flagProduto.setSelected((boolean) tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 6));

        }
    }//GEN-LAST:event_tbl_produtosKeyReleased

    private void chk_flagProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_flagProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_flagProdutoActionPerformed

    private void lbl_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_categoriaActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPetShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_atualizar;
    private javax.swing.JToggleButton btn_cadastro;
    private javax.swing.JToggleButton btn_excluir;
    private javax.swing.JCheckBox chk_flagProduto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_cadastroProduto;
    private javax.swing.JComboBox<String> lbl_categoria;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_flagProduto;
    private javax.swing.JLabel lbl_icone;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nome1;
    private javax.swing.JLabel lbl_precoCompra;
    private javax.swing.JLabel lbl_precoVenda;
    private javax.swing.JLabel lbl_quantidade;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_backgroundBlack;
    private javax.swing.JPanel pnl_cadastroProduto;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JTable tbl_produtos;
    private javax.swing.JTextField txf_descricao;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JTextField txf_precoCompra;
    private javax.swing.JTextField txf_precoVenda;
    private javax.swing.JTextField txf_quantidade;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
