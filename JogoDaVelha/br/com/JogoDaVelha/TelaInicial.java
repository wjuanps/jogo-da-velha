package br.com.JogoDaVelha;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TelaInicial extends JDialog implements ActionListener, ItemListener {

	private Jogador jogador1 = new Jogador();
	private Jogador jogador2 = new Jogador();
	private Maquina maquina = new Maquina();
	
	private JLabel fundo = new JLabel(new ImageIcon("fundo\\nome.png"));
	private JLabel jogador[];
	private JTextField campo[];
	private JButton botao[];
	
	private JRadioButton jogadores[];
	private ButtonGroup grupo = new ButtonGroup();
	
	private int y = 55;
	private int y2 = 40;
	private int x = 117;
	
	private String[] strJogador = {"Jogador1", "Jogador2"};
	private String[] strBotao = {"Confirmar", "Cancelar"};
	private String[] strJogadores = {"1 Jogador", "2 Jogadores"};
	
	public TelaInicial() {
		
		jogador = new JLabel[2];
		campo = new JTextField[2];
		botao = new JButton[2];
		jogadores = new JRadioButton[2];
		
		for(int i = 0; i < strJogador.length; i++) {
			
			if (jogador[i] == null) {
				fundo.add(jogador[i] = new JLabel(strJogador[i]));
				jogador[i].setForeground(Color.WHITE);
				jogador[i].setBounds(40,y,200,35);
			}
			
			if (campo[i] == null) {
				fundo.add(campo[i] = new JTextField());
				campo[i].setBounds(40,y+30,300,35);
				campo[i].setEditable(false);
				campo[i].addActionListener(this);
			}
			
			if (botao[i] == null) {
				fundo.add(botao[i] = new JButton(strBotao[i]));
				botao[i].setBounds(x,220,100,30);
				botao[i].addActionListener(this);
			}
			
			if (jogadores[i] == null) {
				fundo.add(jogadores[i] = new JRadioButton(strJogadores[i]));
				jogadores[i].setBounds(y2,15,150,30);
				jogadores[i].setForeground(Color.WHITE);
				jogadores[i].addItemListener(this);
				grupo.add(jogadores[i]);
			}
			
			y += 70;
			y2 += 150;
			x += 120;
			
		}
		
		this.add(fundo);
		this.setTitle("Nome dos jogadores");
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setSize(400,300);
		this.setResizable(false);
		this.setVisible(true);
		this.setModal(true);
		this.setLocationRelativeTo(null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao[0] || e.getSource() == campo[1]) {
			if (jogadores[1].isSelected()) {
				jogador1.setNome(campo[0].getText());
				jogador2.setNome(campo[1].getText());
				this.dispose();
				new JogoDaVelhaGUI(jogador1, jogador2, null).addNome(jogador1, jogador2, null);
			} else if (jogadores[0].isSelected()) {
				jogador1.setNome(campo[0].getText());
				maquina.setNome(campo[1].getText());
				this.dispose();
				new JogoDaVelhaGUI(jogador1, null, maquina).addNome(jogador1, null, maquina);
			} 
		} else if (e.getSource() == botao[1] ) {
			System.exit(0);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (jogadores[1].isSelected()) {
			if (!(campo[0].getText().equals("") && campo[1].getText().equals(""))) {
				campo[0].setText("");
				campo[1].setText("");
			} else if (!campo[0].getText().equals("")) {
				campo[0].setText("");
			} else if (!campo[1].getText().equals("")) {
				campo[1].setText("");
			}

			campo[0].setEditable(true);
			campo[1].setEditable(true);
			campo[0].requestFocus();
			
		} else if (jogadores[0].isSelected()) {
			if (!(campo[0].getText().equals("") && campo[1].getText().equals("Máquina"))) {
				campo[0].setText("");
				campo[1].setText("Máquina");
			} 

			campo[0].setEditable(true);
			campo[1].setEditable(false);
			campo[0].requestFocus();
			
		} else {
			campo[0].setEditable(false);
			campo[1].setEditable(false);
		}
		
	}
	
	public static void main(String[] args) {
		try {
			
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
	                
            }
	            
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
		
		new TelaInicial();
		
	}
	
}
