package funcionalidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

import componentes.EditorTexto;

public class FuncionalidadMenuSuperior implements ActionListener{
	
	//Implementamos un action listener

	private JMenuItem mArial;
	private JMenuItem mVerdana;
	private JMenuItem mCourier;
	private JMenuItem mImpact;
	
	private JCheckBoxMenuItem mNegrita;
	private JCheckBoxMenuItem mCursiva;
	private JCheckBoxMenuItem mSubrayado;
	
	private JMenuItem mTextIzq;
	private JMenuItem mTextCentro;
	private JMenuItem mTextDerecha;
	private JMenuItem mTextJustificado;
	
	private JRadioButtonMenuItem mTamanyo10;
	private JRadioButtonMenuItem  mTamanyo14;
	private JRadioButtonMenuItem  mTamanyo18;
	private JRadioButtonMenuItem  mTamanyo22;
	
	private JComboBox<String> cbFuente;
	private JComboBox<String> cbTamanyoLetra;
	
	//Para mantener la coherencia
	private JToggleButton jtbNegrita;
	private JToggleButton jtbCursiva;	
	private JToggleButton jtbSubrayado;
	
	public FuncionalidadMenuSuperior(EditorTexto editorTexto) {
		
		//Necesitamos pasarle un EditorTexto para relacionar los botones del menu superior con los 
		//botones declarados en esta clase
		
		this.mArial  =editorTexto.getMenuSuperior().getmArial();
		this.mVerdana  =editorTexto.getMenuSuperior().getmVerdana();
		this.mCourier  = editorTexto.getMenuSuperior().getmCourier();
		this.mImpact  =editorTexto.getMenuSuperior().getmImpact();
		
		this.mNegrita  = editorTexto.getMenuSuperior().getmNegrita();
		this.mCursiva = editorTexto.getMenuSuperior().getmCursiva();	
		this.mSubrayado  =  editorTexto.getMenuSuperior().getmSubrayado();
		
		this.mTextIzq = editorTexto.getMenuSuperior().getmTextIzq();
		this.mTextCentro =  editorTexto.getMenuSuperior().getmTextCentro();
		this.mTextDerecha =  editorTexto.getMenuSuperior().getmTextDerecha();
		this.mTextJustificado = editorTexto.getMenuSuperior().getmTextJustificado();
		
		this.mTamanyo10 = editorTexto.getMenuSuperior().getmTamanyo10();
		this.mTamanyo14 = editorTexto.getMenuSuperior().getmTamanyo14();
		this.mTamanyo18 = editorTexto.getMenuSuperior().getmTamanyo18();
		this.mTamanyo22 = editorTexto.getMenuSuperior().getmTamanyo22();
		
		this.cbFuente = editorTexto.getLamina().getBarraHerramientas().getCbFuente();
		this.cbTamanyoLetra = editorTexto.getLamina().getBarraHerramientas().getCbTamanyoLetra();
		this.jtbNegrita = editorTexto.getLamina().getBarraHerramientas().getJtbNegrita();
		this.jtbCursiva = editorTexto.getLamina().getBarraHerramientas().getJtbCursiva();
		this.jtbSubrayado  =editorTexto.getLamina().getBarraHerramientas().getJtbSubrayado();
		
		
		//A�adimos atajos de teclado 
		mNegrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));	//Ctrl + N
		mCursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));	//Ctrl + K
		mSubrayado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));	//Ctrl + S		
		
		//A�adimos un actionListener a cada bot�n del menu y le pasamos this (Fms) como argumento
		//Para poder hacer esto hemos tenido que implementar un action listener en la clase
		
		mArial.addActionListener(this);
		mVerdana.addActionListener(this);
		mCourier.addActionListener(this);
		mImpact.addActionListener(this);	
		mTamanyo10.addActionListener(this);
		mTamanyo14.addActionListener(this);
		mTamanyo18.addActionListener(this);
		mTamanyo22.addActionListener(this);	
		mNegrita.addActionListener(this);
		mCursiva.addActionListener(this);
		mSubrayado.addActionListener(this);	
		mTextIzq.addActionListener(this);
		mTextCentro.addActionListener(this);
		mTextDerecha.addActionListener(this);	
		mTextJustificado.addActionListener(this);
		
	}

	
	//Disponemos de un unico m�todo actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		//Utilizamos un switch 
		 switch(e.getActionCommand()) {
		 //Como el switch utiliza un String debemos asegurarnos de que esten todas las traducciones
		 //Sino al cambiar de idioma los botones dejar�n de funcionar
		 
		 //Para simplificar el funcionamiento del editor y ademas mantener la coherencia, al pulsar
		 //un bot�n del menuSuperior le mandaremos un click al bot�n equivalente situado en la barra de herramientas
		 //No debemos preocuparnos por mantenr la cocherencia ya que de eso se encargan los m�todos de FuncionalidadBarraHerramientas
		 
		  case "Negrita": jtbNegrita.doClick(); break;
		  case "Cursiva": jtbCursiva.doClick();break;
		  case "Subrayado": jtbSubrayado.doClick();break;
		  
		  case "Bold": jtbNegrita.doClick(); break;
		  case "Italic": jtbCursiva.doClick();break;
		  case "Underline": jtbSubrayado.doClick();break;
		  
		  case "Gras": jtbNegrita.doClick(); break;
		  case "Italique": jtbCursiva.doClick();break;
		  case "Soulign�": jtbSubrayado.doClick();break;
		  
		  case "Izquierda": new StyledEditorKit.AlignmentAction("alinearIzq",StyleConstants.ALIGN_LEFT).actionPerformed(e);break;
		  case "Centro": new StyledEditorKit.AlignmentAction("alinearCentro",StyleConstants.ALIGN_CENTER).actionPerformed(e);break;
		  case "Derecha": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_RIGHT).actionPerformed(e);break;
		  case "Justificado": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_JUSTIFIED).actionPerformed(e);break;
		  
		  case "Align left": new StyledEditorKit.AlignmentAction("alinearIzq",StyleConstants.ALIGN_LEFT).actionPerformed(e);break;
		  case "Align center": new StyledEditorKit.AlignmentAction("alinearCentro",StyleConstants.ALIGN_CENTER).actionPerformed(e);break;
		  case "Align right": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_RIGHT).actionPerformed(e);break;
		  case "Align justify": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_JUSTIFIED).actionPerformed(e);break;
		  
		  case "Aligner � gauche": new StyledEditorKit.AlignmentAction("alinearIzq",StyleConstants.ALIGN_LEFT).actionPerformed(e);break;
		  case "Aligner le centre": new StyledEditorKit.AlignmentAction("alinearCentro",StyleConstants.ALIGN_CENTER).actionPerformed(e);break;
		  case "Aligner � droite": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_RIGHT).actionPerformed(e);break;
		  case "Aligner justifi�": new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_JUSTIFIED).actionPerformed(e);break;
		 
		  //Al seleccionar una fuente en el menu, se la pasaremos al comboBox y lo activaremos para cambiar la fuente
		  case "Arial":	 cbFuente.setSelectedItem("Arial"); cbFuente.actionPerformed(e); break;
		  case "Verdana": cbFuente.setSelectedItem("Verdana"); cbFuente.actionPerformed(e); break;
		  case "Courier": cbFuente.setSelectedItem("Courier New"); cbFuente.actionPerformed(e); break;
		  case "Impact": cbFuente.setSelectedItem("Impact");  cbFuente.actionPerformed(e);break;
		  //Los botones del tama�o estan dentro de un grupo por lo que no debemos preocuparnos por 
		  // deseleccionarlos. La funcionalidad es igual que con la fuente
		  case "10": cbTamanyoLetra.setSelectedItem("10");cbTamanyoLetra.actionPerformed(e);break;
		  case "14": cbTamanyoLetra.setSelectedItem("14");cbTamanyoLetra.actionPerformed(e);break;
		  case "18": cbTamanyoLetra.setSelectedItem("18");cbTamanyoLetra.actionPerformed(e);break;
		  case "22": cbTamanyoLetra.setSelectedItem("22");cbTamanyoLetra.actionPerformed(e);break;
		  
		 }	 			 
	}

}
