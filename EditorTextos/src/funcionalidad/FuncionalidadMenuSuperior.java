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
	
	private JToggleButton jtbNegrita;
	private JToggleButton jtbCursiva;	
	private JToggleButton jtbSubrayado;
	
	public FuncionalidadMenuSuperior(EditorTexto editorTexto) {
		
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
		
		mNegrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		mCursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
		mSubrayado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
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
		  
		  case "Arial":	 cbFuente.setSelectedItem("Arial"); cbFuente.actionPerformed(e); break;
		  case "Verdana": cbFuente.setSelectedItem("Verdana"); cbFuente.actionPerformed(e); break;
		  case "Courier": cbFuente.setSelectedItem("Courier New"); cbFuente.actionPerformed(e); break;
		  case "Impact": cbFuente.setSelectedItem("Impact");  cbFuente.actionPerformed(e);break;
		  
		  case "10": cbTamanyoLetra.setSelectedItem("10");cbTamanyoLetra.actionPerformed(e);break;
		  case "14": cbTamanyoLetra.setSelectedItem("14");cbTamanyoLetra.actionPerformed(e);break;
		  case "18": cbTamanyoLetra.setSelectedItem("18");cbTamanyoLetra.actionPerformed(e);break;
		  case "22": cbTamanyoLetra.setSelectedItem("22");cbTamanyoLetra.actionPerformed(e);break;
		  
		 }	 			 
	}

}
