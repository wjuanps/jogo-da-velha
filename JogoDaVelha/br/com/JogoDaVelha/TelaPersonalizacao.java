package br.com.JogoDaVelha;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class TelaPersonalizacao extends JDialog implements ChangeListener, ItemListener {
		
	private JLabel fundo = new JLabel(new ImageIcon("fundo\\FundoTela.png"));

	private JSlider slider[], tamfonte;
	private JTextArea area2 = new JTextArea();
	private JScrollPane scrol = new JScrollPane(area2);
	
	private JLabel laFonte, laCor;
	
	private String[]EstiloFonte = {
			"Escolha o estilo", "Serif", "Monospaced","Times New Roman", "Segoe Script", "Castellar", 
			"Algerian", "Forte", "Chiller", "Impact", "Jokerman", "Mistral", "Onyx", 
			"PlayBill", "Papyrus", "Pristina", "Parchment", "Vijaya", "Vivaldi", "Vladimir Script",
			"Viner Hand ITC", "Rage Italic", "Arabic Typesetting", "Bauhaus 93", "Blackadder ITC", "Viner Hand ITC"
	};
	
	private String[] estilo = {"Negrito","Italico"};
	private String[] strRadio = {"Botão","Texto"};
	
	private JRadioButton jrb[] = new JRadioButton[estilo.length];
	
	private JComboBox<String> nomeFonte = new JComboBox<String>();
	
	private ButtonGroup grupo = new ButtonGroup();
	private JRadioButton radioBotao[] = new JRadioButton[2];

	private JButton btnbotao, cancelar;

	private int estilo2;
	private int x = 200, y = 255;
	
	public TelaPersonalizacao(JButton botao[], JLabel texto[], Frame janela, String titulo, boolean modal) {
		
		super(janela, titulo, modal);
		
		btnbotao = new JButton(new ImageIcon("fundo\\botao1.png"));
		btnbotao.setBounds(200,310,100,30);
		
		cancelar = new JButton(new ImageIcon("fundo\\botao2.png"));
		cancelar.setBounds(320,310,100,30);
		
		nomeFonte.setModel(new DefaultComboBoxModel<String>(EstiloFonte));
		nomeFonte.setBounds(250,20,200,30);
		nomeFonte.setBorder(BorderFactory.createLineBorder(new Color(64,207,227),0));
		nomeFonte.setBackground(new Color(64,207,227));
		nomeFonte.setMaximumRowCount(10);
		nomeFonte.setForeground(Color.BLACK);
		nomeFonte.addItemListener(this);
		
		scrol.setBounds(20,20,220,120);
		area2.setBorder(BorderFactory.createTitledBorder(null,"Pré-Visualização", 1, 2, new Font("serif", Font.BOLD, 15), Color.BLACK));
		area2.setEditable(false);
		
		slider = new JSlider[3];
		
		for(int i = 0; i < estilo.length; i++){
			fundo.add(jrb[i] = new JRadioButton(estilo[i]));
			jrb[i].setBounds(y,60,80,30);
			jrb[i].setBackground(new Color(64,207,227));
			jrb[i].addItemListener(this);
			y += 80;
		}
		
		for(int i = 0; i < slider.length; i++){
			fundo.add(slider[i] = new JSlider(JSlider.HORIZONTAL, 0,255,0));
			slider[i].setBounds(20,x,150,30);
			slider[i].setBackground(new Color(64,207,227));
			slider[i].addChangeListener(this);
			x += 30;
		}
		
		int x = 40;
		for(int i = 0; i < strRadio.length; i++) {
			fundo.add(radioBotao[i] = new JRadioButton(strRadio[i]));
			radioBotao[i].setBounds(x,310,70,30);
			grupo.add(radioBotao[i]);
			
			x += 70;
			
		}
		
		laCor = new JLabel("Configuração da cor");
		laCor.setBounds(20,150,200,30);
		
		tamfonte = new JSlider(JSlider.HORIZONTAL, 10,90,15);
		tamfonte.setBounds(200,200,200,50);
		tamfonte.setBackground(new Color(64,207,227));
		tamfonte.setPaintTrack(false);
		tamfonte.setMinorTickSpacing(1);
		tamfonte.setMajorTickSpacing(10);
		tamfonte.setPaintTicks(true);
		tamfonte.setPaintLabels(true);
		tamfonte.addChangeListener(this);
		
		laFonte = new JLabel("Tamanho da fonte: " + String.valueOf(tamfonte.getValue()));
		laFonte.setBounds(200,150,500,30);
		
		fundo.add(scrol);
		fundo.add(nomeFonte);
		fundo.add(tamfonte);
		fundo.add(laFonte);
		fundo.add(btnbotao);
		fundo.add(cancelar);
		fundo.add(laCor);
		
		add(fundo);
		
		personalizar(botao, texto);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(470,410);
		setResizable(false);
		setVisible(false);
		stateChanged(null);
		setLocationRelativeTo(null);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		area2.setForeground(new Color(slider[0].getValue(), slider[1].getValue(), slider[2].getValue()));
		area2.setText("R: "+slider[0].getValue()+"\nG: "+slider[1].getValue()+"\nB: "+slider[2].getValue());
		area2.setFont(new Font(area2.getFont().getName(), estilo2, Integer.valueOf(tamfonte.getValue())));
		laFonte.setText(("Tamanho da fonte: " + String.valueOf(tamfonte.getValue())));
		repaint();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			area2.setFont(new Font(EstiloFonte[nomeFonte.getSelectedIndex()], estilo2, Integer.valueOf(tamfonte.getValue())));
		} 
		if(jrb[0].isSelected()){
			estilo2 = Font.BOLD;
		}
		if(jrb[1].isSelected()){
			estilo2 = Font.ITALIC;
		}
		if(jrb[0].isSelected() && jrb[1].isSelected()){
			estilo2 = Font.BOLD | Font.ITALIC;
		}
		if(!jrb[0].isSelected() && !jrb[1].isSelected()){
			estilo2 = Font.PLAIN;
		}
		area2.setFont(new Font(area2.getFont().getName(), estilo2, Integer.valueOf(tamfonte.getValue())));
		repaint();
	}

	public void personalizar(JButton botao[], JLabel texto[]) {
		
		btnbotao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(radioBotao[0].isSelected()) {
					for(int i = 0; i < 9; i++) {
						botao[i].setFont(area2.getFont());
						botao[i].setForeground(area2.getForeground());
					}
					
					repaint();
					setVisible(false);
					
				} else if(radioBotao[1].isSelected()) {
					for(int i = 0; i < texto.length; i++) {
						texto[i].setFont(area2.getFont());
						texto[i].setForeground(area2.getForeground());
					}
				
					repaint();
					setVisible(false);

				} else {
					JOptionPane.showMessageDialog(null, "Selecione o que você deseja alterar");
				}
				
			}
			
		});
		
		cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		
	}
	
}