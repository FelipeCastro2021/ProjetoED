package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class TelaAluno extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public TelaAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSemGrupo = new JLabel("Voc\u00EA n\u00E3o tem grupo");
		lblSemGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSemGrupo.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSemGrupo.setBounds(135, 67, 211, 31);
		contentPane.add(lblSemGrupo);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBackground(new Color(187, 187, 187));
		panel.setBounds(0, 0, 493, 38);
		contentPane.add(panel);
		
		JLabel lblIntroducao = new JLabel(" Introdu\u00E7\u00E3o");
		lblIntroducao.setHorizontalAlignment(SwingConstants.LEFT);
		lblIntroducao.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblIntroducao);
		lblIntroducao.setBackground(new Color(187, 187, 187));
		lblIntroducao.setFont(new Font("Arial", Font.BOLD, 24));
		
		JButton btnNewButton = new JButton("Clique aqui e crie seu grupo");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAlunoCadGrupo modalAluno = new TelaAlunoCadGrupo();
				modalAluno.setVisible(true);
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(43, 107, 423, 134);
		contentPane.add(btnNewButton);
	}
}
