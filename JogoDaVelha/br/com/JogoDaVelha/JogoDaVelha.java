package br.com.JogoDaVelha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JogoDaVelha {

    private int vitoriasJogador1 = 0;
    private int vitoriasJogador2 = 0;
    private int vitoriasMaquina = 0;
    private int empates = 0;
    
    private boolean jogou = false;
    
	public void jogadorAtivo(Jogador jogador1, Jogador jogador2, JButton botao[], JLabel vitoria[], Maquina maquina) {
		
		if(jogador1.isAtivo()) {
			jogador1.setAtivo(false);
			
			if(jogador2 != null) {
				jogador2.setAtivo(true);
			} 
			
			if(maquina != null){
				maquina.setAtivo(true);
				jogou = true;
			}
			
		} else {
			jogador1.setAtivo(true);
			
			if(jogador2 != null) {
				jogador2.setAtivo(false);
			}
			
			if(maquina != null) {
				maquina.setAtivo(false);
				jogou = false;
			}
			
		}
		
		jogadorVencedor(jogador1, jogador2, "X", botao, vitoria, maquina);
		jogadorVencedor(jogador1, jogador2, "O", botao, vitoria, maquina);
		
	}

	public void jogadorVencedor(Jogador jogador1, Jogador jogador2, String vencedor, JButton botao[], JLabel vitoria[], Maquina maquina) {
		
		if(botao[0].getText().equals(vencedor) &&
				botao[1].getText().equals(vencedor) &&
				botao[2].getText().equals(vencedor)) {
			if(botao[0].getText().equals("X")) {
				vencedor("Jogador 1", jogador1, jogador2, botao, vitoria, maquina);
			} else {
				if(jogador2 != null) {
					vencedor("Jogador 2", jogador1, jogador2, botao, vitoria, maquina);
				} 
				
				if(maquina != null) {
					vencedor("Maquina", jogador1, jogador2, botao, vitoria, maquina);
				}
				
			}
		} else if(botao[3].getText().equals(vencedor) &&
					botao[4].getText().equals(vencedor) &&
					botao[5].getText().equals(vencedor)) {
			if(botao[3].getText().equals("X")) {
				vencedor("Jogador 1", jogador1, jogador2, botao, vitoria, maquina);
			} else {
				if(jogador2 != null) {
					vencedor("Jogador 2", jogador1, jogador2, botao, vitoria, maquina);
				} 

				if(maquina != null){
					vencedor("Maquina", jogador1, jogador2, botao, vitoria, maquina);
				}
			}
		} else if(botao[6].getText().equals(vencedor) &&
					botao[7].getText().equals(vencedor) &&
					botao[8].getText().equals(vencedor)) {
			if(botao[7].getText().equals("X")) {
				vencedor("Jogador 1", jogador1, jogador2, botao, vitoria, maquina);
			} else {
				if(jogador2 != null) {
					vencedor("Jogador 2", jogador1, jogador2, botao, vitoria, maquina);
				} 

				if(maquina != null){
					vencedor("Maquina", jogador1, jogador2, botao, vitoria, maquina);
				}
			}
		} else if(botao[0].getText().equals(vencedor) &&
					botao[3].getText().equals(vencedor) &&
					botao[6].getText().equals(vencedor)) {
			if(botao[0].getText().equals("X")) {
				vencedor("Jogador 1", jogador1, jogador2, botao, vitoria, maquina);
			} else {
				if(jogador2 != null) {
					vencedor("Jogador 2", jogador1, jogador2, botao, vitoria, maquina);
				} 

				if(maquina != null){
					vencedor("Maquina", jogador1, jogador2, botao, vitoria, maquina);
				}
			}
		} else if(botao[1].getText().equals(vencedor) &&
					botao[4].getText().equals(vencedor) &&
					botao[7].getText().equals(vencedor)) {
			if(botao[1].getText().equals("X")) {
				vencedor("Jogador 1", jogador1, jogador2, botao, vitoria, maquina);
			} else {
				if(jogador2 != null) {
					vencedor("Jogador 2", jogador1, jogador2, botao, vitoria, maquina);
				} 

				if(maquina != null){
					vencedor("Maquina", jogador1, jogador2, botao, vitoria, maquina);
				}
			}
		} else if(botao[2].getText().equals(vencedor) &&
					botao[5].getText().equals(vencedor) &&
					botao[8].getText().equals(vencedor)) {
			if(botao[2].getText().equals("X")) {
				vencedor("Jogador 1", jogador1, jogador2, botao, vitoria, maquina);
			} else {
				if(jogador2 != null) {
					vencedor("Jogador 2", jogador1, jogador2, botao, vitoria, maquina);
				} 

				if(maquina != null){
					vencedor("Maquina", jogador1, jogador2, botao, vitoria, maquina);
				}
			}
		} else if(botao[0].getText().equals(vencedor) &&
					botao[4].getText().equals(vencedor) &&
					botao[8].getText().equals(vencedor)) {
			if(botao[0].getText().equals("X")) {
				vencedor("Jogador 1", jogador1, jogador2, botao, vitoria, maquina);
			} else {
				if(jogador2 != null) {
					vencedor("Jogador 2", jogador1, jogador2, botao, vitoria, maquina);
				} 

				if(maquina != null){
					vencedor("Maquina", jogador1, jogador2, botao, vitoria, maquina);
				}
			}
		} else if(botao[2].getText().equals(vencedor) &&
					botao[4].getText().equals(vencedor) &&
					botao[6].getText().equals(vencedor)) {
			if(botao[2].getText().equals("X")) {
				vencedor("Jogador 1", jogador1, jogador2, botao, vitoria, maquina);
			} else {
				if(jogador2 != null) {
					vencedor("Jogador 2", jogador1, jogador2, botao, vitoria, maquina);
				} 

				if(maquina != null){
					vencedor("Maquina", jogador1, jogador2, botao, vitoria, maquina);
				}
			}
		} 
		
		if(!botao[0].getText().equals("") &&
			!botao[1].getText().equals("") &&
			!botao[2].getText().equals("") &&
			!botao[3].getText().equals("") &&
			!botao[4].getText().equals("") &&
			!botao[5].getText().equals("") &&
			!botao[6].getText().equals("") &&
			!botao[7].getText().equals("") &&
			!botao[8].getText().equals("")) {
			
			vencedor("Empate", jogador1, jogador2, botao, vitoria, maquina);
			
		}
		
	}
	
	public void vencedor(String vencedor, Jogador jogador1, Jogador jogador2, JButton botao[], JLabel vitoria[], Maquina maquina)  {
		if(vencedor.equals("Jogador 1")) {
			JOptionPane.showMessageDialog(null, "Parabéns " + jogador1.getNome() + ", você venceu!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
			jogador1.setVitorias(++vitoriasJogador1);
			vitoria[0].setText("Número de Vitórias:  " + jogador1.getVitorias());
			if(maquina != null) {
				maquina.primeiraJogada = true;
			}
			limparCampos(botao);
		} else if(vencedor.equals("Jogador 2")) {
			JOptionPane.showMessageDialog(null, "Parabéns " + jogador2.getNome() + ", você venceu!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
			jogador2.setVitorias(++vitoriasJogador2);
			vitoria[1].setText("Número de Vitórias:  " + jogador2.getVitorias());
			limparCampos(botao);
		} else if(vencedor.equals("Maquina")) {
			maquina.primeiraJogada = true;
			JOptionPane.showMessageDialog(null, "A " + maquina.getNome() + " venceu!!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
			vitoria[1].setText("Número de Vitórias:  " + ++vitoriasMaquina);
			limparCampos(botao);
		} else if(vencedor.equals("Empate")) {
			if(maquina != null)
				maquina.primeiraJogada = true;
			JOptionPane.showMessageDialog(null, "Jogo Empatado!!");
			vitoria[2].setText("Número de Empates:  " + ++empates);
			limparCampos(botao);
		}

	}
	
	public void limparCampos(JButton botao[]) {
		for(int i = 0; i < 9; i++) {
			if(true) {
				botao[i].setText("");
			}
		}
	}
	
	public void zerarValores(JLabel texto[], Jogador jogador1, Jogador jogador2, Maquina maquina) {
		jogador1.setVitorias(0);
		vitoriasJogador1 = 0;
		empates = 0;
		texto[0].setText("Número de Vitórias:  " + jogador1.getVitorias());
		texto[2].setText("Número de Empates:  " + 0);
		
		if(jogador2 != null) {
			vitoriasJogador2 = 0;
			jogador2.setVitorias(0);
			texto[1].setText("Número de Vitórias:  " + jogador2.getVitorias());
		} 
		
		if(maquina != null){
			maquina.primeiraJogada = true;
			maquina.setVitorias(0);
			vitoriasMaquina = 0;
			texto[1].setText("Número de Vitórias:  " + maquina.getVitorias());
		}
		
	}
	
	public void Jogada(Jogador jogador1, Jogador jogador2, JButton botao[], JLabel vitoria[], Maquina maquina) {
		
		if(jogador2 != null)
			jogador2.setAtivo(false);
		
		if(maquina != null) {
			maquina.setAtivo(false);
		}
		
			
		for(int i = 0; i < botao.length; i++) {
			
			try {
				botao[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(e.getSource() == botao[0]){
							if(jogador1.isAtivo()) {
								if(botao[0].getText().equals("")) {
									botao[0].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[0].getText().equals("")) {
									if(jogador2 != null) {
										botao[0].setText("O");
									}
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
									
								}
								
							}
							
							
						} else if(e.getSource() == botao[1]){
							if(jogador1.isAtivo()) {
								if(botao[1].getText().equals("")) {
									botao[1].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[1].getText().equals("")) {
									if(jogador2 != null) {
										botao[1].setText("O");
									} 
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								
								}
								
							}
							
							
						} else if(e.getSource() == botao[2]){
							if(jogador1.isAtivo()) {
								if(botao[2].getText().equals("")) {
									botao[2].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[2].getText().equals("")) {
									if(jogador2 != null) {
										botao[2].setText("O");
									} 
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								
								}
								
							}
							
							
						} else if(e.getSource() == botao[3]){
							if(jogador1.isAtivo()) {
								if(botao[3].getText().equals("")) {
									botao[3].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[3].getText().equals("")) {
									if(jogador2 != null) {
										botao[3].setText("O");
									} 
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								
								}
								
							}
							
							
						} else if(e.getSource() == botao[4]){
							if(jogador1.isAtivo()) {
								if(botao[4].getText().equals("")) {
									botao[4].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[4].getText().equals("")) {
									if(jogador2 != null) {
										botao[4].setText("O");
									}
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								
								}
								
							}
							
							
							
						} else if(e.getSource() == botao[5]){
							if(jogador1.isAtivo()) {
								if(botao[5].getText().equals("")) {
									botao[5].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[5].getText().equals("")) {
									if(jogador2 != null) {
										botao[5].setText("O");
									}
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								
								}
								
							}
							
							
						} else if(e.getSource() == botao[6]){
							if(jogador1.isAtivo()) {
								if(botao[6].getText().equals("")) {
									botao[6].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[6].getText().equals("")) {
									if(jogador2 != null) {
										botao[6].setText("O");
									} 
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								
								}
								
							}
							
							
						} else if(e.getSource() == botao[7]){
							if(jogador1.isAtivo()) {
								if(botao[7].getText().equals("")) {
									botao[7].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[7].getText().equals("")) {
									if(jogador2 != null) {
										botao[7].setText("O");
									} 
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								
								}
								
							}
							
							
						} else if(e.getSource() == botao[8]){
							if(jogador1.isAtivo()) {
								if(botao[8].getText().equals("")) {
									botao[8].setText("X");
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
								}
							} else {
								if(botao[8].getText().equals("")) {
									if(jogador2 != null) {
										botao[8].setText("O");
									} 
									
									jogadorAtivo(jogador1, jogador2, botao, vitoria, maquina);
									
								}
								
							} 
							
						} else if(e.getSource() == botao[9]) {
							zerarValores(vitoria, jogador1, jogador2, maquina);
							limparCampos(botao);
						} else if(e.getSource() == botao[10]) {
							System.exit(0);
						}
						
						try {
							if(jogador2 == null) {
								jogador1.setAtivo(true);
							}
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
						if(maquina != null) {
							
							maquina.jogadaMaquina(botao, jogou);
							jogadorVencedor(jogador1, jogador2, "O", botao, vitoria, maquina);
							
						}
					
					}
					
				});

			} catch(Exception e) {
				
			}
			
		}
		
	}
	
}
