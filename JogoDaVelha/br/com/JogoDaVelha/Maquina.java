package br.com.JogoDaVelha;

import java.util.Random;

import javax.swing.JButton;

public class Maquina extends Jogador {

	private static final int POSICAO_ZERO = 0;
	private static final int POSICAO_UM = 1;
	private static final int POSICAO_DOIS = 2;
	private static final int POSICAO_TRES = 3;
	private static final int POSICAO_QUATRO = 4;
	private static final int POSICAO_CINCO = 5;
	private static final int POSICAO_SEIS = 6;
	private static final int POSICAO_SETE = 7;
	private static final int POSICAO_OITO = 8;
	
	private boolean emPerigo = false;
	private boolean vitoria = false;
	public boolean primeiraJogada = true;
	
	private int posicaoDefesa;
	private int posicaoAtaque;
	
	private Random gerar = new Random();
	
	public boolean isEmPerigo(JButton botao[]) {
		
		//////////////////////////////
		//// Verifivar Linhas ////////
		//////////////////////////////
		if (botao[0].getText().equals("X")
				&& botao[1].getText().equals("X")
				&& botao[2].getText().equals("")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_DOIS;
			
		} else if(botao[0].getText().equals("X")
				&& botao[1].getText().equals("")
				&& botao[2].getText().equals("X")) {

			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_UM;
			
		} else if(botao[0].getText().equals("")
				&& botao[1].getText().equals("X")
				&& botao[2].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_ZERO;
			
		} else if(botao[3].getText().equals("X")
				&& botao[4].getText().equals("X")
				&& botao[5].getText().equals("")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = 5;
			
		} else if(botao[3].getText().equals("X")
				&& botao[4].getText().equals("")
				&& botao[5].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_QUATRO;
			
		} else if(botao[3].getText().equals("")
				&& botao[4].getText().equals("X")
				&& botao[5].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_TRES;
			
		} else if(botao[6].getText().equals("X")
				&& botao[7].getText().equals("X")
				&& botao[8].getText().equals("")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_OITO;
			
		} else if(botao[6].getText().equals("X")
				&& botao[7].getText().equals("")
				&& botao[8].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_SETE;
			
		} else if(botao[6].getText().equals("")
				&& botao[7].getText().equals("X")
				&& botao[8].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_SEIS;
			
		} else 
			
		/////////////////////////////////
		//// Verifivar Colunas //////////
		/////////////////////////////////
		if(botao[0].getText().equals("X")
				&& botao[3].getText().equals("X")
				&& botao[6].getText().equals("")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_SEIS;
			
		} else if(botao[0].getText().equals("X")
				&& botao[3].getText().equals("")
				&& botao[6].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_TRES;
			
		} else if(botao[0].getText().equals("")
				&& botao[3].getText().equals("X")
				&& botao[6].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_ZERO;
			
		} else if(botao[1].getText().equals("X")
				&& botao[4].getText().equals("X")
				&& botao[7].getText().equals("")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_SETE;
			
		} else if(botao[1].getText().equals("X")
				&& botao[4].getText().equals("")
				&& botao[7].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_QUATRO;
			
		} else if(botao[1].getText().equals("")
				&& botao[4].getText().equals("X")
				&& botao[7].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_UM;
			
		} else if(botao[2].getText().equals("X")
				&& botao[5].getText().equals("X")
				&& botao[8].getText().equals("")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_OITO;
			
		} else if(botao[2].getText().equals("X")
				&& botao[5].getText().equals("")
				&& botao[8].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_CINCO;
			
		} else if(botao[2].getText().equals("")
				&& botao[5].getText().equals("X")
				&& botao[8].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_DOIS;
			
		} else 
			
		///////////////////////////////////
		//// Verificar Diagonais //////////
		///////////////////////////////////
		if(botao[0].getText().equals("X")
				&& botao[4].getText().equals("X")
				&& botao[8].getText().equals("")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_OITO;
			
		} else if(botao[0].getText().equals("X")
				&& botao[4].getText().equals("")
				&& botao[8].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_QUATRO;
			
		} else if(botao[0].getText().equals("")
				&& botao[4].getText().equals("X")
				&& botao[8].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_ZERO;
			
		} else if(botao[2].getText().equals("X")
				&& botao[4].getText().equals("X")
				&& botao[6].getText().equals("")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_SEIS;
			
		} else if(botao[2].getText().equals("X")
				&& botao[4].getText().equals("")
				&& botao[6].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_QUATRO;
			
		} else if(botao[2].getText().equals("")
				&& botao[4].getText().equals("X")
				&& botao[6].getText().equals("X")) {
			
			if (!emPerigo) {
				emPerigo = true;
			}
			
			posicaoDefesa = POSICAO_DOIS;
			
		} else {
			
			if (emPerigo) 
				emPerigo = false;
			
		}
		
		return emPerigo;
		
	}
	
	public boolean vitoria(JButton botao[]) {
		
		/////////////////////////////////
		//// Verifivar Linhas ///////////
		/////////////////////////////////
		if(botao[0].getText().equals("O")
				&& botao[1].getText().equals("O")
				&& botao[2].getText().equals("")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_DOIS;
			
		} else if(botao[0].getText().equals("O")
				&& botao[1].getText().equals("")
				&& botao[2].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_UM;
			
		} else if(botao[0].getText().equals("")
				&& botao[1].getText().equals("O")
				&& botao[2].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_ZERO;
			
		} else if(botao[3].getText().equals("O")
				&& botao[4].getText().equals("O")
				&& botao[5].getText().equals("")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_CINCO;
			
		} else if(botao[3].getText().equals("O")
				&& botao[4].getText().equals("")
				&& botao[5].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_QUATRO;
			
		} else if(botao[3].getText().equals("")
				&& botao[4].getText().equals("O")
				&& botao[5].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_TRES;
			
		} else if(botao[6].getText().equals("O")
				&& botao[7].getText().equals("O")
				&& botao[8].getText().equals("")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_OITO;
			
		} else if(botao[6].getText().equals("O")
				&& botao[7].getText().equals("")
				&& botao[8].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_SETE;
			
		} else if(botao[6].getText().equals("")
				&& botao[7].getText().equals("O")
				&& botao[8].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_SEIS;
			
		} else 
			
		///////////////////////////////
		//// Verifivar Colunas ////////
		///////////////////////////////
		if(botao[0].getText().equals("O")
				&& botao[3].getText().equals("O")
				&& botao[6].getText().equals("")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_SEIS;
			
		} else if(botao[0].getText().equals("O")
				&& botao[3].getText().equals("")
				&& botao[6].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_TRES;
			
		} else if(botao[0].getText().equals("")
				&& botao[3].getText().equals("O")
				&& botao[6].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_ZERO;
			
		} else if(botao[1].getText().equals("O")
				&& botao[4].getText().equals("O")
				&& botao[7].getText().equals("")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_SETE;
			
		} else if(botao[1].getText().equals("O")
				&& botao[4].getText().equals("")
				&& botao[7].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_QUATRO;
			
		} else if(botao[1].getText().equals("")
				&& botao[4].getText().equals("O")
				&& botao[7].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_UM;
			
		} else if(botao[2].getText().equals("O")
				&& botao[5].getText().equals("O")
				&& botao[8].getText().equals("")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_OITO;
			
		} else if(botao[2].getText().equals("O")
				&& botao[5].getText().equals("")
				&& botao[8].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_CINCO;
			
		} else if(botao[2].getText().equals("")
				&& botao[5].getText().equals("O")
				&& botao[8].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_DOIS;
			
		} else 
		
		/////////////////////////////////
		//// Verificar Diagonais ////////
		/////////////////////////////////
		if(botao[0].getText().equals("O")
				&& botao[4].getText().equals("O")
				&& botao[8].getText().equals("")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_OITO;
			
		} else if(botao[0].getText().equals("O")
				&& botao[4].getText().equals("")
				&& botao[8].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_QUATRO;
			
		} else if(botao[0].getText().equals("")
				&& botao[4].getText().equals("O")
				&& botao[8].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_ZERO;
			
		} else if(botao[2].getText().equals("O")
				&& botao[4].getText().equals("O")
				&& botao[6].getText().equals("")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_SEIS;
			
		} else if(botao[2].getText().equals("O")
				&& botao[4].getText().equals("")
				&& botao[6].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_QUATRO;
			
		} else if(botao[2].getText().equals("")
				&& botao[4].getText().equals("O")
				&& botao[6].getText().equals("O")) {
			
			if (!vitoria) {
				vitoria = true;
			}
			
			posicaoAtaque = POSICAO_DOIS;
			
		} else {
			
			if (vitoria)
				vitoria = false;
			
		}
		
		return vitoria;
		
	}
	
	public void elaborarAtaque(JButton botao[]) {
		
		/////////////////////////////
		//// Verifivar Linhas ///////
		/////////////////////////////
		if(botao[0].getText().equals("O") && botao[1].getText().equals("") && botao[2].getText().equals("")) {
			
			if(botao[6].getText().equals("O") && botao[4].getText().equals("") || 
					botao[8].getText().equals("O") && botao[5].getText().equals("")) {
				
				botao[2].setText("O");
				
			} else if(botao[7].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[1].setText("O");
				
			} else {
				
				botao[2].setText("O");
				
			}
			
		} else if(botao[0].getText().equals("") && botao[1].getText().equals("O") && botao[2].getText().equals("")) {
			
			if(botao[6].getText().equals("O") && botao[3].getText().equals("") ||
					botao[8].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[0].setText("O");
				
			} else if(botao[6].getText().equals("O") && botao[4].getText().equals("") || botao[8].getText().equals("O") && botao[5].getText().equals("")) {
				
				botao[2].setText("O");
				
			} else {
				
				botao[0].setText("O");
				
			}
			
		} else if(botao[0].getText().equals("") && botao[1].getText().equals("") && botao[2].getText().equals("O")) {
			
			if(botao[6].getText().equals("O") && botao[3].getText().equals("") || 
					botao[8].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[0].setText("O");
				
			} else if(botao[7].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[1].setText("O");
				
			} else {
				
				botao[0].setText("O");
				
			}
			
		} else if(botao[3].getText().equals("O") && botao[4].getText().equals("") && botao[5].getText().equals("")) {

			if(botao[0].getText().equals("O") && botao[8].getText().equals("") || botao[1].getText().equals("O") && botao[7].getText().equals("")
					|| botao[2].getText().equals("O") && botao[6].getText().equals("") || botao[8].getText().equals("O") && botao[0].getText().equals("")
					|| botao[7].getText().equals("O") && botao[1].getText().equals("") || botao[6].getText().equals("O") && botao[2].getText().equals("")) {
				
				botao[4].setText("O");
				
			} else if(botao[2].getText().equals("O") && botao[8].getText().equals("") || 
					botao[8].getText().equals("O") && botao[2].getText().equals("")) {
				
				botao[5].setText("O");
				
			} else {
				
				botao[5].setText("O");
				
			}
			
		} else if(botao[3].getText().equals("") && botao[4].getText().equals("O") && botao[5].getText().equals("")) {

			if(botao[2].getText().equals("O") && botao[8].getText().equals("") || 
					botao[8].getText().equals("O") && botao[2].getText().equals("")) {
				
				botao[5].setText("O"); 
				
			} else if(botao[0].getText().equals("O") && botao[6].getText().equals("") ||
					botao[6].getText().equals("O") && botao[0].getText().equals("")) {
				
				botao[3].setText("O"); 
				
			} else {
				
				botao[3].setText("O"); 
				
			}
			
		} else if(botao[3].getText().equals("") && botao[4].getText().equals("") && botao[5].getText().equals("O")) {
		
			if(botao[0].getText().equals("O") && botao[8].getText().equals("") || botao[1].getText().equals("O") && botao[7].getText().equals("")
					|| botao[2].getText().equals("O") && botao[6].getText().equals("") || botao[8].getText().equals("O") && botao[0].getText().equals("")
					|| botao[7].getText().equals("O") && botao[1].getText().equals("") || botao[6].getText().equals("O") && botao[2].getText().equals("")) {
				
				botao[4].setText("O");
				
			} else if(botao[0].getText().equals("O") && botao[6].getText().equals("") || 
					botao[6].getText().equals("O") && botao[0].getText().equals("")) {
				
				botao[3].setText("O");
				
			} else {
				
				botao[3].setText("O");
				
			}
			
		} else if(botao[6].getText().equals("O") && botao[7].getText().equals("") && botao[8].getText().equals("")) {

			if(botao[2].getText().equals("O") && botao[5].getText().equals("") ||
					botao[0].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[8].setText("O");
				
			} else if(botao[1].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[7].setText("O");
				
			} else {
				
				botao[8].setText("O");
				
			}
		
		} else if(botao[6].getText().equals("") && botao[7].getText().equals("O") && botao[8].getText().equals("")) {

			if(botao[0].getText().equals("O") && botao[3].getText().equals("") ||
					botao[2].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[6].setText("O");
				
			} else if(botao[0].getText().equals("O") && botao[4].getText().equals("") || 
					botao[2].getText().equals("O") && botao[5].getText().equals("")) {
				
				botao[8].setText("O");
				
			} else {
				
				botao[6].setText("O");
				
			}
			
		} else if(botao[6].getText().equals("") && botao[7].getText().equals("") && botao[8].getText().equals("O")) {

			if(botao[0].getText().equals("O") && botao[3].getText().equals("") || 
					botao[2].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[6].setText("O");
				
			} else if(botao[1].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[7].setText("O");
				
			} else {
				
				botao[6].setText("O");
				
			}
			
		} else 
			
		/////////////////////////////
		//// Verifivar Colunas //////
		/////////////////////////////
		if(botao[0].getText().equals("O") && botao[3].getText().equals("") && botao[6].getText().equals("")) {

			if(botao[2].getText().equals("O") && botao[4].getText().equals("") ||
					botao[8].getText().equals("O") && botao[7].getText().equals("")) {
				
				botao[6].setText("O");
				
			} else if(botao[5].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[3].setText("O");
				
			} else {
				
				botao[6].setText("O");
				
			}
			
		} else if(botao[0].getText().equals("") && botao[3].getText().equals("O") && botao[6].getText().equals("")) {

			if(botao[2].getText().equals("O") && botao[1].getText().equals("") || 
					botao[8].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[0].setText("O");
				
			} else if(botao[2].getText().equals("O") && botao[4].getText().equals("") || 
					botao[8].getText().equals("O") && botao[7].getText().equals("")) {
				
				botao[6].setText("O");
				
			} else {
				
				botao[0].setText("O");
				
			}
			
		} else if(botao[0].getText().equals("") && botao[3].getText().equals("") && botao[6].getText().equals("O")) {

			if(botao[2].getText().equals("O") && botao[1].getText().equals("") ||
					botao[8].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[0].setText("O");
				
			} else if(botao[5].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[3].setText("O");
				
			} else {
				
				botao[0].setText("O");
				
			}
			
		} else if(botao[1].getText().equals("O") && botao[4].getText().equals("") && botao[7].getText().equals("")) {

			if(botao[0].getText().equals("O") && botao[8].getText().equals("") || botao[5].getText().equals("O") && botao[3].getText().equals("")
					|| botao[2].getText().equals("O") && botao[6].getText().equals("") || botao[8].getText().equals("O") && botao[0].getText().equals("")
					|| botao[3].getText().equals("O") && botao[5].getText().equals("") || botao[6].getText().equals("O") && botao[2].getText().equals("")) {
				
				botao[4].setText("O");
				
			} else if(botao[6].getText().equals("O") && botao[8].getText().equals("") ||
					botao[8].getText().equals("O") && botao[6].getText().equals("")) {
				
				botao[7].setText("O");
				
			} else {
				
				botao[7].setText("O");
				
			}
			
		} else if(botao[1].getText().equals("") && botao[4].getText().equals("O") && botao[7].getText().equals("")) {

			if(botao[6].getText().equals("O") && botao[8].getText().equals("") || 
					botao[8].getText().equals("O") && botao[6].getText().equals("")) {
				
				botao[7].setText("O");
				
			} else if(botao[0].getText().equals("O") && botao[2].getText().equals("") ||
					botao[2].getText().equals("O") && botao[0].getText().equals("")) {
				
				botao[1].setText("O");
				
			} else {
				
				botao[1].setText("O");
				
			}
			
		} else if(botao[1].getText().equals("") && botao[4].getText().equals("") && botao[7].getText().equals("O")) {

			if(botao[0].getText().equals("O") && botao[8].getText().equals("") || botao[5].getText().equals("O") && botao[3].getText().equals("")
					|| botao[2].getText().equals("O") && botao[6].getText().equals("") || botao[8].getText().equals("O") && botao[0].getText().equals("")
					|| botao[3].getText().equals("O") && botao[5].getText().equals("") || botao[6].getText().equals("O") && botao[2].getText().equals("")) {
				
				botao[4].setText("O");
				
			} else if(botao[0].getText().equals("O") && botao[2].getText().equals("") || 
					botao[2].getText().equals("O") && botao[0].getText().equals("")) {
				
				botao[1].setText("O");
				
			} else {
				
				botao[1].setText("O");
				
			}
			
		} else if(botao[2].getText().equals("O") && botao[5].getText().equals("") && botao[8].getText().equals("")) {

			if(botao[0].getText().equals("O") && botao[4].getText().equals("") || 
					botao[6].getText().equals("O") && botao[7].getText().equals("")) {
				
				botao[8].setText("O");
				
			} else if(botao[3].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[5].setText("O");
				
			} else {
				
				botao[8].setText("O");
				
			}
			
		} else if(botao[2].getText().equals("") && botao[5].getText().equals("O") && botao[8].getText().equals("")) {

			if(botao[6].getText().equals("O") && botao[4].getText().equals("") || 
					botao[0].getText().equals("O") && botao[1].getText().equals("")) {
				
				botao[2].setText("O");
				
			} else if(botao[0].getText().equals("O") && botao[4].getText().equals("") ||
					botao[6].getText().equals("O") && botao[7].getText().equals("")) {
				
				botao[8].setText("O");
				
			} else {
				
				botao[8].setText("O");
				
			}
			
		} else if(botao[2].getText().equals("") && botao[5].getText().equals("") && botao[8].getText().equals("O")) {

			if(botao[0].getText().equals("O") && botao[6].getText().equals("") ||
					botao[6].getText().equals("O") && botao[7].getText().equals("")) {
				
				botao[2].setText("O");
				
			} else if(botao[3].getText().equals("O") && botao[4].getText().equals("")) {
				
				botao[5].setText("O");
				
			} else {
				
				botao[2].setText("O");
				
			}
			
		} else 
			
		///////////////////////////////
		///// Verificar Diagonais /////
		///////////////////////////////
		if(botao[0].getText().equals("O") && botao[4].getText().equals("") && botao[8].getText().equals("")) {

			if(botao[1].getText().equals("O") && botao[7].getText().equals("") || botao[5].getText().equals("O") && botao[3].getText().equals("")
					|| botao[2].getText().equals("O") && botao[6].getText().equals("") || botao[7].getText().equals("O") && botao[1].getText().equals("")
					|| botao[3].getText().equals("O") && botao[5].getText().equals("") || botao[6].getText().equals("O") && botao[2].getText().equals("")) {
				
				botao[4].setText("O");
				
			} else {
				
				botao[8].setText("O");
				
			}
			
		} else if(botao[0].getText().equals("") && botao[4].getText().equals("O") && botao[8].getText().equals("")) {

			if(botao[2].getText().equals("O") && botao[1].getText().equals("") || 
					botao[6].getText().equals("O") && botao[3].getText().equals("")) {
				
				botao[0].setText("O");
				
			} else {
				
				botao[8].setText("O");
				
			}
			
		} else if(botao[0].getText().equals("") && botao[4].getText().equals("") && botao[8].getText().equals("O")) {

			if(botao[1].getText().equals("O") && botao[7].getText().equals("") || botao[5].getText().equals("O") && botao[3].getText().equals("")
					|| botao[2].getText().equals("O") && botao[6].getText().equals("") || botao[7].getText().equals("O") && botao[1].getText().equals("")
					|| botao[3].getText().equals("O") && botao[5].getText().equals("") || botao[6].getText().equals("O") && botao[2].getText().equals("")) {
				
				botao[4].setText("O");
				
			} else {
				
				botao[0].setText("O");
				
			}
			
		} else if(botao[2].getText().equals("O") && botao[4].getText().equals("") && botao[6].getText().equals("")) {

			if(botao[1].getText().equals("O") && botao[7].getText().equals("") || botao[5].getText().equals("O") && botao[3].getText().equals("")
					|| botao[0].getText().equals("O") && botao[8].getText().equals("") || botao[7].getText().equals("O") && botao[1].getText().equals("")
					|| botao[3].getText().equals("O") && botao[5].getText().equals("") || botao[8].getText().equals("O") && botao[0].getText().equals("")) {
				
				botao[4].setText("O");
				
			} else {
				
				botao[6].setText("O");
				
			}
			
		} else if(botao[2].getText().equals("") && botao[4].getText().equals("O") && botao[6].getText().equals("")) {

			if(botao[0].getText().equals("O") && botao[1].getText().equals("") || 
					botao[8].getText().equals("O") && botao[5].getText().equals("")) {
				
				botao[2].setText("O");
				
			} else {
				
				botao[6].setText("O");
				
			}
			
		} else if(botao[2].getText().equals("") && botao[4].getText().equals("") && botao[6].getText().equals("O")) {

			if(botao[1].getText().equals("O") && botao[7].getText().equals("") || botao[5].getText().equals("O") && botao[3].getText().equals("")
					|| botao[0].getText().equals("O") && botao[8].getText().equals("") || botao[7].getText().equals("O") && botao[1].getText().equals("")
					|| botao[3].getText().equals("O") && botao[5].getText().equals("") || botao[8].getText().equals("O") && botao[0].getText().equals("")) {
				
				botao[4].setText("O");
				
			} else {
				
				botao[2].setText("O");
				
			}
			
		} else {

			jogadaAleatoria(botao);
			
		}
		
	}
	
	public void defender(JButton botao[]) {
		
		if (botao[posicaoDefesa].getText().equals("")) {
			
			botao[posicaoDefesa].setText("O"); 
			
		}
		
	}
	
	public void jogadaAleatoria(JButton botao[]) {
		
		try {
		
			int posicao = gerar.nextInt(9);
			
			if (botao[posicao].getText().equals("")) {
				
				botao[posicao].setText("O");
				
			} else {
				
				jogadaAleatoria(botao);
				
			}
			
		} catch (Exception erro) {
			
			return;
			
		}
		
	}
	
	public void atacar(JButton botao[]) {
		
		try {
			
			if (primeiraJogada && botao[0].getText().equals("X") || primeiraJogada && botao[2].getText().equals("X")
					|| primeiraJogada && botao[6].getText().equals("X") || primeiraJogada && botao[8].getText().equals("X")) {
				
				if (botao[4].getText().equals("")) {
					
					botao[4].setText("O");
					
				} else {
					
					jogadaAleatoria(botao);
					
				}
				
				primeiraJogada = false;
				
			} else if (primeiraJogada) {
				
				jogadaAleatoria(botao);
				primeiraJogada = false;
				
			} else {
				
				elaborarAtaque(botao);
			
			}
			
		} catch (Exception erro) {
			return;
		}
		
	}
	
	public void jogadaMaquina(JButton botao[], boolean jogou) {
		
		try {
			
			if (jogou) {
				Thread.sleep(500);
			}
				
			if (vitoria(botao)) {
				
				if (botao[posicaoAtaque].getText().equals("")) {
					botao[posicaoAtaque].setText("O");
				}
				
			} else if (isEmPerigo(botao)) { 
				
				defender(botao);
				
			} else {
				
				atacar(botao);
				
			}
			
		} catch(InterruptedException e) {
			
			return;
			
		}
		
	}

}
