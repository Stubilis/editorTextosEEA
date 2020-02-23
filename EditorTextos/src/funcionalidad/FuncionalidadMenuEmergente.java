package funcionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

import componentes.EditorTexto;
import componentes.MenuEmergente;

public class FuncionalidadMenuEmergente implements ActionListener{
	
	//El menu emergente funciona de la misma forma que el menu superior, sus elementos simplemente se encargan de 
	//activar a sus equivalentes en la barra de herramientas

	private MenuEmergente  menuEm;
	
	private JMenuItem mENegrita;
	private JMenuItem mECursiva;
	private JMenuItem mESubrayado;
	
	private JMenuItem mETextIzq;
	private JMenuItem mETextCentro;
	private JMenuItem mETextDerecha;
	private JMenuItem mETextJustificado;
	
	private JToggleButton jtbNegrita;
	private JToggleButton jtbCursiva;	
	private JToggleButton jtbSubrayado;
	
	public FuncionalidadMenuEmergente(EditorTexto editorTexto) {
				
		this.mENegrita  = editorTexto.getLamina().getMenuEmergente().getmENegrita();
		this.mECursiva = editorTexto.getLamina().getMenuEmergente().getmECursiva();
		this.mESubrayado  = editorTexto.getLamina().getMenuEmergente().getmESubrayado();
		
		this.mETextIzq = editorTexto.getLamina().getMenuEmergente().getmETextIzq();
		this.mETextCentro = editorTexto.getLamina().getMenuEmergente().getmETextCentro();
		this.mETextDerecha = editorTexto.getLamina().getMenuEmergente().getmETextDerecha();
		this.mETextJustificado =  editorTexto.getLamina().getMenuEmergente().getmETextJustificado();
		
		this.jtbNegrita = editorTexto.getLamina().getBarraHerramientas().getJtbNegrita();
		this.jtbCursiva = editorTexto.getLamina().getBarraHerramientas().getJtbCursiva();
		this.jtbSubrayado  =editorTexto.getLamina().getBarraHerramientas().getJtbSubrayado();
		
		mENegrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		mECursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
		mESubrayado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
		
		
		mENegrita.addActionListener(this);
		mECursiva.addActionListener(this);
		mESubrayado.addActionListener(this);
		mETextIzq.addActionListener(this);
		mETextCentro.addActionListener(this);
		mETextDerecha.addActionListener(this);
		mETextJustificado.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		 
		 switch(e.getActionCommand()) {
		  case "Negrita": jtbNegrita.doClick(); break;
		  case "Cursiva": jtbCursiva.doClick();break;
		  case "Subrayado": jtbSubrayado.doClick();break;
		  
		  case "Bold": jtbNegrita.doClick(); break;
		  case "Italic": jtbCursiva.doClick();break;
		  case "Underline": jtbSubrayado.doClick();break;
		  
		  case "Gras": jtbNegrita.doClick(); break;
		  case "Italique": jtbCursiva.doClick();break;
		  case "Souligné": jtbSubrayado.doClick();break;
		  
		  case "Izquierda": new StyledEditorKit.AlignmentAction("alinearIzq",StyleConstants.ALIGN_LEFT).actionPerformed(e);break;
		  case "Centro": new StyledEditorKit.AlignmentAction("alinearCentro",StyleConstants.ALIGN_CENTER).actionPerformed(e);break;
		  case "Derecha": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_RIGHT).actionPerformed(e);break;
		  case "Justificado": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_JUSTIFIED).actionPerformed(e);break;
		  
		  case "Align left": new StyledEditorKit.AlignmentAction("alinearIzq",StyleConstants.ALIGN_LEFT).actionPerformed(e);break;
		  case "Align center": new StyledEditorKit.AlignmentAction("alinearCentro",StyleConstants.ALIGN_CENTER).actionPerformed(e);break;
		  case "Align right": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_RIGHT).actionPerformed(e);break;
		  case "Align justify": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_JUSTIFIED).actionPerformed(e);break;
		  
		  case "Aligner à gauche": new StyledEditorKit.AlignmentAction("alinearIzq",StyleConstants.ALIGN_LEFT).actionPerformed(e);break;
		  case "Aligner le centre": new StyledEditorKit.AlignmentAction("alinearCentro",StyleConstants.ALIGN_CENTER).actionPerformed(e);break;
		  case "Aligner à droite": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_RIGHT).actionPerformed(e);break;
		  case "Aligner justifié": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_JUSTIFIED).actionPerformed(e);break;
		  
		 }	 			 
	}
}
