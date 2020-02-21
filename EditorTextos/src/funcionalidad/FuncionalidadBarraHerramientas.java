package funcionalidad;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;

import com.inet.jortho.FileUserDictionary;
import com.inet.jortho.SpellChecker;

import componentes.EditorTexto;
import componentes.Lamina;
import componentes.MenuEmergente;

public class FuncionalidadBarraHerramientas {
	
	private EditorTexto editorTexto;
	
	private Lamina lamina;
	
	private MenuEmergente menuEmergente;
	private FuncionalidadMenuEmergente fme;
		
	private JToggleButton jtbNegrita;
	private JToggleButton jtbCursiva;	
	private JToggleButton jtbSubrayado;
	
	private JButton jbTextIzq;
	private JButton jbTextCentro;	
	private JButton jbTextDerecha;
	private JButton jbTextJustificado;
	
	private JToggleButton jbCorrecion;
	
	private JComboBox<String> cbFuente;
	private JComboBox<String> cbTamanyoLetra;
	
	//Necesario para mantener la coherencia
	private  JCheckBoxMenuItem mNegrita;
	private JCheckBoxMenuItem mCursiva;
	private JCheckBoxMenuItem mSubrayado;
	private JRadioButtonMenuItem mTamanyo10;
	private JRadioButtonMenuItem  mTamanyo14;
	private JRadioButtonMenuItem  mTamanyo18;
	private JRadioButtonMenuItem  mTamanyo22;
	
	public FuncionalidadBarraHerramientas(EditorTexto editorTexto) {
		
		this.editorTexto = editorTexto;
		this.menuEmergente =(MenuEmergente) editorTexto.getLamina().getjTextPane().getComponentPopupMenu();
		this.fme = editorTexto.getFme();
		
		
		this.mNegrita = editorTexto.getMenuSuperior().getmNegrita();
		this.mCursiva = editorTexto.getMenuSuperior().getmCursiva();
		this.mSubrayado = editorTexto.getMenuSuperior().getmSubrayado();
		this.mTamanyo10 = editorTexto.getMenuSuperior().getmTamanyo10();
		this.mTamanyo14 = editorTexto.getMenuSuperior().getmTamanyo14();
		this.mTamanyo18 = editorTexto.getMenuSuperior().getmTamanyo18();
		this.mTamanyo22 = editorTexto.getMenuSuperior().getmTamanyo22();
		
		this.lamina = editorTexto.getLamina();

		this.jtbNegrita = lamina.getBarraHerramientas().getJtbNegrita();
		this.jtbCursiva = lamina.getBarraHerramientas().getJtbCursiva();
		this.jtbSubrayado = lamina.getBarraHerramientas().getJtbSubrayado();
		
		this.cbTamanyoLetra = lamina.getBarraHerramientas().getCbTamanyoLetra();
		this.cbFuente = lamina.getBarraHerramientas().getCbFuente();
		
		this.jbTextIzq = lamina.getBarraHerramientas().getJbTextIzq();
		this.jbTextCentro = lamina.getBarraHerramientas().getJbTextCentro();
		this.jbTextDerecha = lamina.getBarraHerramientas().getJbTextDerecha();
		this.jbTextJustificado = lamina.getBarraHerramientas().getJbTextJustificado();
		
		this.jbCorrecion = lamina.getBarraHerramientas().getJbCorreccion();
		
		jtbNegrita.addActionListener(e -> {cambiarEstiloNegrita(e);});
		jtbCursiva.addActionListener(e -> {cambiarEstiloCursiva(e);});
		jtbSubrayado.addActionListener(e -> {cambiarEstiloSubrayado(e);});		
		jbTextIzq.addActionListener(new StyledEditorKit.AlignmentAction("alinearIzq",StyleConstants.ALIGN_LEFT));
		jbTextCentro.addActionListener(new StyledEditorKit.AlignmentAction("alinearCentro",StyleConstants.ALIGN_CENTER));
		jbTextDerecha.addActionListener(new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_RIGHT));	
		jbTextJustificado.addActionListener(new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_JUSTIFIED));
		cbTamanyoLetra.addActionListener(e -> {cambiarTamanyo(e);});
		cbFuente.addActionListener(e -> {cambiarFuenteSeleccionada(e); });	
		jbCorrecion.addActionListener(e ->{corregir();});
	}
	
	private void cambiarFuenteSeleccionada(ActionEvent e) {	
		String nombreFuente =cbFuente.getSelectedItem().toString();		
		new StyledEditorKit.FontFamilyAction("cambiar Fuente", nombreFuente).actionPerformed(e);
		
	}
	private void cambiarEstiloNegrita(ActionEvent e) {
		new StyledEditorKit.BoldAction().actionPerformed(e);
		mNegrita.setSelected(jtbNegrita.isSelected());
	}
	private void cambiarEstiloCursiva(ActionEvent e) {
		new StyledEditorKit.ItalicAction().actionPerformed(e);
		mCursiva.setSelected(jtbCursiva.isSelected());
	}
	private void cambiarEstiloSubrayado(ActionEvent e){;
		new StyledEditorKit.UnderlineAction().actionPerformed(e);
		mSubrayado.setSelected(jtbSubrayado.isSelected());
	}
	private void cambiarTamanyo(ActionEvent e) {
		int tamanyo =Integer.parseInt(cbTamanyoLetra.getSelectedItem().toString());
		FontSizeAction fontAction  = new StyledEditorKit.FontSizeAction(String.valueOf(tamanyo), tamanyo);
		fontAction.actionPerformed(e);		
		switch (tamanyo) {
		case 10:mTamanyo10.setSelected(true);break;
		case 14:mTamanyo14.setSelected(true);break;
		case 18:mTamanyo18.setSelected(true);break;
		case 22:mTamanyo22.setSelected(true);break;
		
		}
	}
	private void corregir() {
		
		if(jbCorrecion.isSelected()) {		
		fme = this.editorTexto.getFme();
		this.lamina.getjTextPane().setComponentPopupMenu(null);
		SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
		SpellChecker.registerDictionaries(null,null);
		SpellChecker.register(this.lamina.getjTextPane());
		
		}
		else {
			SpellChecker.unregister(this.lamina.getjTextPane());
			this.editorTexto.getLamina().getjTextPane().setComponentPopupMenu(menuEmergente);
			this.editorTexto.setFme(fme);
			
		}
	}
}
