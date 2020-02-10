package br.com.JogoDaVelha;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class InterfaceGrafica extends JFrame {

	private TelaPersonalizacao personalizar;
	private Jogador jogador1 = new Jogador();
	private Jogador jogador2 = new Jogador();
	private JogoDaVelha jogoDaVelha = new JogoDaVelha();
	private Maquina m = new Maquina();
	
	private JLabel fundo = new JLabel();
	private JLabel grid = new JLabel();
	private JLabel informacoesJogo[];
	private JLabel informacoes;
	
	private JMenuItem novoJogo = new JMenuItem("Novo jogo");
	private JMenuItem trocarjogador = new JMenuItem("Trocar Jogador");
	private JMenuItem fechar = new JMenuItem("Sair do Jogo");
	private JMenuItem fonte = new JMenuItem("Alterar Fonte");
	private JMenuItem sair = new JMenuItem("Sair");
	
	private JPopupMenu menuFlutuante = new JPopupMenu();
	private JRadioButtonMenuItem itens[];
	private ButtonGroup umaImagem = new ButtonGroup();
	
	private String nomeDasImagens[] = {
			"Colorido", "NVidea Verde", "Utorrente",
			"NVidea Cinza", "Azul", "Caveira",
			"Vermelho", "Marreta", "Cartas",
			"Dados", "Apple", "Linux"
	};
	
	private ImageIcon[] imagens = new ImageIcon[nomeDasImagens.length];
	private JSeparator separador;
	private JButton botao[] = new JButton[11];
	private Color cor = new Color(255,255,255);
	
	public InterfaceGrafica() {
		
		informacoesJogo = new JLabel[5];
		
		for(int i = 0; i < imagens.length; i++) {
			imagens[i] = new ImageIcon("fundo\\fundo" + i + ".png");
		}
		
		grid.setLayout(new GridLayout(3, 3, 10, 10));
		grid.setBounds(70,100,300,300);
		for(int i = 0; i < 9; i++) {
			grid.add(botao[i] = new JButton(""));
			botao[i].setFont(new Font("serif", Font.BOLD, 48));
			botao[i].setForeground(new Color(100,100,100));
		}
		
		informacoes = new JLabel();
		informacoes.setBounds(430,40,265,430);
		informacoes.setBorder(BorderFactory.createTitledBorder(null, "Informações do Jogo", 0, 2, new Font("serif", Font.PLAIN, 18), cor));
		
		informacoesJogo[3] = new JLabel();
		informacoesJogo[3].setBounds(50,40,350,30);
		informacoesJogo[3].setForeground(cor);
		
		informacoesJogo[0] = new JLabel("Número de Vitórias:  " + 0);
		informacoesJogo[0].setBounds(50,65,350,30);
		informacoesJogo[0].setForeground(cor);
		addSeparador(20, 110, 215, 10, 0);
		
		informacoesJogo[4] = new JLabel();
		informacoesJogo[4].setBounds(50,120,350,30);
		informacoesJogo[4].setForeground(cor);
		
		informacoesJogo[1] = new JLabel("Número de Vitórias:  " + 0);
		informacoesJogo[1].setBounds(50,145,350,30);
		informacoesJogo[1].setForeground(cor);
		addSeparador(20, 190, 215, 10, 0);
		
		informacoesJogo[2] = new JLabel("Número de Empates:  " + 0);
		informacoesJogo[2].setBounds(50,200,350,30);
		informacoesJogo[2].setForeground(cor);

		botao[9] = new JButton("Novo Jogo");
		botao[9].setBounds(45,290,180,40);
		
		botao[10] = new JButton("Sair do Jogo");
		botao[10].setBounds(45,340,180,40);
		
		for(int i = 0; i < informacoesJogo.length; i++) {
			informacoes.add(informacoesJogo[i]);
		}
		
		informacoes.add(botao[9]);
		informacoes.add(botao[10]);
		
		fundo.add(grid);
		fundo.add(informacoes);
		
		addMenuFlutuante();
		addEventoMenuFlutuante();
		
		jogoDaVelha.Jogada(jogador1, jogador2, botao, informacoesJogo, m);
		personalizar = new TelaPersonalizacao(botao, informacoesJogo,this,"", true);
		
		add(fundo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,527);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	
	public void addNome(Jogador jogador1, Jogador jogador2) {
		this.jogador1.setNome(jogador1.getNome());
		this.jogador2.setNome(jogador2.getNome());
		informacoesJogo[3].setText(jogador1.getNome() + "  |   Simbolo   X");
		informacoesJogo[4].setText(jogador2.getNome() + "  |   Simbolo   O");
	}
	
	public void addMenuFlutuante() {
		
		fonte.addActionListener(new TratadoerDeItens());
		novoJogo.addActionListener(new TratadoerDeItens());
		trocarjogador.addActionListener(new TratadoerDeItens());
		fechar.addActionListener(new TratadoerDeItens());
		sair.addActionListener(new TratadoerDeItens());
		
		JMenu personalizar = new JMenu("Personalizar");
		JMenu opcoes = new JMenu("Opções de Jogo");
		JMenu Fundo = new JMenu("Fundo");
		
		personalizar.add(Fundo);
		personalizar.addSeparator();
		personalizar.add(fonte);
		
		opcoes.add(novoJogo);
		opcoes.add(trocarjogador);
		opcoes.addSeparator();
		opcoes.add(fechar);
		
		menuFlutuante.add(personalizar);
		menuFlutuante.add(opcoes);
		menuFlutuante.addSeparator();
		menuFlutuante.add(sair);

		itens = new JRadioButtonMenuItem[imagens.length];
		
		for(int i = 0; i < imagens.length; i++) {
			itens[i] = new JRadioButtonMenuItem(nomeDasImagens[i]);
			Fundo.add(itens[i]);
			umaImagem.add(itens[i]);
			itens[i].addActionListener(new TratadoerDeItens());
			
		}
		
		fundo.setIcon(imagens[4]);
		
	}
	
	public void addEventoMenuFlutuante() {
		
		fundo.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evento) {
				verificarDisparo(evento);
			}
			
			public void mouseReleased(MouseEvent evento){
				verificarDisparo(evento);
			}
			
			private void verificarDisparo(MouseEvent evento){
				if(evento.isPopupTrigger()) {
					menuFlutuante.show(evento.getComponent(), evento.getX(), evento.getY());
				}
			}
			
		});
		
	}
	
	public void addSeparador(int x, int y, int altura, int largura, int tipo){
		
		informacoes.add(separador = new JSeparator(tipo));
		separador.setBounds(x,y,altura,largura);
		separador.setForeground(cor);
		
	}
	
	private class TratadoerDeItens implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i = 0; i < imagens.length; i++) {
				if(e.getSource() == itens[i]) {
					fundo.setIcon(imagens[i]);
				}
		
			}
			
			if(e.getSource() == fonte) {
				personalizar.setVisible(true);
			} else if(e.getSource() == novoJogo) {
				jogoDaVelha.limparCampos(botao);
				jogoDaVelha.zerarValores(informacoesJogo, jogador1, jogador2, m);
			} else if(e.getSource() == trocarjogador) {
				dispose();
				new NomeJogador();
			} else if(e.getSource() == sair || e.getSource() == fechar) {
				System.exit(0);
			}
			
		}
		
	}
	
}
