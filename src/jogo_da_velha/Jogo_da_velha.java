package jogo_da_velha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.itextpdf.text.Font;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;


/**
 *
 * @author User
 */
public class Jogo_da_velha extends JFrame {

    JButton[] bt = new JButton[9];
    boolean xo = false;
    boolean[] click = new boolean[9];
    JLabel placar = new JLabel("PLACAR");
    JLabel placarX = new JLabel("X 0");
    JLabel placarO = new JLabel("O 0");
    JButton novoJG = new JButton("NOVO JOGO");
    JButton zerarJG = new JButton("ZERAR JOGO");
   
    int PlacarX = 0;
    int PlacarO = 0;

    public Jogo_da_velha() {
        setVisible(true);
        setTitle("Jogo da velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        add(placar);
        add(placarX);
        add(placarO);
        add(novoJG);
        add(zerarJG);
        
        placar.setBounds(400, 50, 100, 30);
        placarX.setBounds(400, 75, 100, 30);
        placarO.setBounds(450, 75, 100, 30);
        novoJG.setBounds(410, 130, 140, 30);
        zerarJG.setBounds(410, 180, 140, 30);
       
        setBounds(250, 75, 800, 600);
        
        
        novoJG.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              limpar();
            }
        });
        zerarJG.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               PlacarX = 0;
               PlacarO = 0;
               atualizar();

            }
        });
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
                cont++;
            }

        }
        for (int c = 0; c < 9; c++) {
            click[c] = false;
        }
        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[0] == false) {
                    click[0] = true;
                    mudar(bt[0]);
                }

            }
        });
        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[1] == false) {
                    click[1] = true;
                    mudar(bt[1]);
                }

            }
        });
        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[2] == false) {
                    click[2] = true;
                    mudar(bt[2]);
                }

            }
        });
        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[3] == false) {
                    click[3] = true;
                    mudar(bt[3]);
                }

            }
        });
        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[4] == false) {
                    click[4] = true;
                    mudar(bt[4]);
                }

            }
        });
        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[5] == false) {
                    click[5] = true;
                    mudar(bt[5]);
                }

            }
        });
        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[6] == false) {
                    click[6] = true;
                    mudar(bt[6]);
                }

            }
        });
        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[7] == false) {
                    click[7] = true;
                    mudar(bt[7]);
                }

            }
        });
        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[8] == false) {
                    click[8] = true;
                    mudar(bt[8]);
                }

            }
        });
    }

    public void atualizar() {
        placarX.setText("X " + PlacarX);
        placarO.setText("O " + PlacarO);
    }

    public void mudar(JButton btn) {
        if (xo) {
            Random rr = new Random();
            rr.nextInt(9);
            btn.setText("O");
            xo = false;
        } else {
            btn.setText("X");
            xo = true;
        }
        vencer();
    }

    public void vencer() {
        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (click[i] == true) {

                cont++;
            }

        }
        if (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X"
                || bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X"
                || bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X"
                || bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X"
                || bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X"
                || bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X"
                || bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X"
                || bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X") {
            JOptionPane.showMessageDialog(null, "O jogador 'X' Ganhou");
            PlacarX++;
            atualizar();
            limpar();
        } else if (bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O"
                || bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O"
                || bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O"
                || bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O"
                || bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O"
                || bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O"
                || bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O"
                || bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O") {
            JOptionPane.showMessageDialog(null, "O jogador 'O' Ganhou");
            PlacarO++;
            atualizar();
            limpar();
        } else if (cont == 9) {
            JOptionPane.showMessageDialog(null, "EMPATE!");
            limpar();
        }
    }

    public void limpar() {
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            click[i] = false;

        }
    }
    public void JGvelha(){
        new Jogo_da_velha();
    }
    public static void main(String[] args) {
        Jogo_da_velha jg = new Jogo_da_velha();
    }
}
