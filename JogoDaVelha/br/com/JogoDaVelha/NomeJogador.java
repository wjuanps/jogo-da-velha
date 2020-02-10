package br.com.JogoDaVelha;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class NomeJogador extends JDialog implements ActionListener {

	private Jogador jogador1 = new Jogador();
	private Jogador jogador2 = new Jogador();
	
	private JLabel fundo = new JLabel(new ImageIcon("fundo\\nome.png"));
	private JLabel jogador[];
	private JTextField campo[];
	private JButton botao[];
	
	private int y = 30;
	private int x = 117;
	
	private String[] strJogador = {"Jogador1", "Jogador2"};
	private String[] strBotao = {"Confirmar", "Cancelar"};
	
	public NomeJogador() {
		
		jogador = new JLabel[2];
		campo = new JTextField[2];
		botao = new JButton[2];
		
		for(int i = 0; i < strJogador.length; i++) {
			fundo.add(jogador[i] = new JLabel(strJogador[i]));
			jogador[i].setForeground(Color.WHITE);
			jogador[i].setBounds(40,y,200,35);
			
			fundo.add(campo[i] = new JTextField());
			campo[i].setBounds(40,y+30,300,35);
			campo[i].addActionListener(this);
			
			fundo.add(botao[i] = new JButton(strBotao[i]));
			botao[i].setBounds(x,200,100,30);
			botao[i].addActionListener(this);
			
			y += 80;
			x += 120;
			
		}
		
		add(fundo);
		setTitle("Nome dos jogadores");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setSize(400,300);
		setResizable(false);
		setVisible(true);
		setModal(true);
		setLocationRelativeTo(null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botao[0] || e.getSource() == campo[1]) {
			jogador1.setNome(campo[0].getText());
			jogador2.setNome(campo[1].getText());
			this.dispose();
			new InterfaceGrafica().addNome(jogador1, jogador2);
		} else if(e.getSource() == botao[1] ) {
			this.dispose();
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
	            java.util.logging.Logger.getLogger(NomeJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(NomeJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(NomeJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(NomeJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
		
		new NomeJogador();
		
	}
	
}
