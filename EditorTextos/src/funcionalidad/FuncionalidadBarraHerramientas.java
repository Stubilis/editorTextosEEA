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

//La biblioteca JOrtho simplifica el proceso para poder corregir el texto en tiempo real
import com.inet.jortho.FileUserDictionary;
import com.inet.jortho.SpellChecker;

import componentes.EditorTexto;
import componentes.Lamina;
import componentes.MenuEmergente;

public class FuncionalidadBarraHerramientas {
	
	//Necesitamos crear un objeto EditorTexto
	
	private EditorTexto editorTexto;
	
	private Lamina lamina;
	
	private MenuEmergente menuEmergente;
	private FuncionalidadMenuEmergente fme;
	//...
		
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
	
	//Necesario para mantener la coherencia de la interfaz
	//Si pulsamos un botón de la barra de herramientas que efectua un cambio 
	//El menu superior debería reflejarlo a su vez 
	
	private  JCheckBoxMenuItem mNegrita;
	private JCheckBoxMenuItem mCursiva;
	private JCheckBoxMenuItem mSubrayado;
	private JRadioButtonMenuItem mTamanyo10;
	private JRadioButtonMenuItem  mTamanyo14;
	private JRadioButtonMenuItem  mTamanyo18;
	private JRadioButtonMenuItem  mTamanyo22;
	
	public FuncionalidadBarraHerramientas(EditorTexto editorTexto) {
		
		this.editorTexto = editorTexto;
		//Es necesario capturar el menú emergente y la funcionalidad del menu emergente 
		//del editorTexto que pasamos al constructor, ya que con uno de los métodos 
		//tendremos que cambiarlo 
		this.menuEmergente =(MenuEmergente) editorTexto.getLamina().getjTextPane().getComponentPopupMenu();
		this.fme = editorTexto.getFme();
		
		//Debemos relacionar los botones que hemos creado en esta clase con los de editorTexto,
		//Sino los botones del editor no harán nada
		//Igualmente debemos declarar un objeto FuncionalidadBarraHerramientas en el editor
		//Es decir, tenemos que relacionar de forma bi-direccional los elementos si queremos que funcionen
		
		this.mNegrita = editorTexto.getMenuSuperior().getmNegrita();
		//
		
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
		
		//Una vez inicializados todos los componentes, les añadimos un actionListener a cada uno 
		// para que cuando pulsemos un botón llamen a sus respectivos métodos
		
		jtbNegrita.addActionListener(e -> {cambiarEstiloNegrita(e);});
		jtbCursiva.addActionListener(e -> {cambiarEstiloCursiva(e);});
		jtbSubrayado.addActionListener(e -> {cambiarEstiloSubrayado(e);});	
		
		//Al tratarse de una accion simple de una sola linea lo podemos declarar directamente dentro del listener.
		//Como usamos PanelTexto que proviene de JTextPane es muy sencillo modificar los diferentes formatos del texto
		
		jbTextIzq.addActionListener(new StyledEditorKit.AlignmentAction("alinearIzq",StyleConstants.ALIGN_LEFT));
		jbTextCentro.addActionListener(new StyledEditorKit.AlignmentAction("alinearCentro",StyleConstants.ALIGN_CENTER));
		jbTextDerecha.addActionListener(new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_RIGHT));	
		jbTextJustificado.addActionListener(new StyledEditorKit.AlignmentAction("alinearDer",StyleConstants.ALIGN_JUSTIFIED));
		
		cbTamanyoLetra.addActionListener(e -> {cambiarTamanyo(e);});
		cbFuente.addActionListener(e -> {cambiarFuenteSeleccionada(e); });	
		
		//Mejora : Al pulsar en jbCorreccion llamaremos al método corregir que resaltará las faltas de ortografía 
		//Además cambiará el menu emergente por otro que nos permitirá añadir nuevas palabras al diccionario o 
		//corregir nuestras faltas con diferentes sugerencias 
		jbCorrecion.addActionListener(e ->{corregir();});
	}
	
	private void cambiarFuenteSeleccionada(ActionEvent e) {	
		//Capturamos la fuente seleccionada en el comboBox
		String nombreFuente =cbFuente.getSelectedItem().toString();
		new StyledEditorKit.FontFamilyAction("cambiar Fuente", nombreFuente).actionPerformed(e);
		
	}
	private void cambiarEstiloNegrita(ActionEvent e) {
		//Realizamos el cambio de estilo
		new StyledEditorKit.BoldAction().actionPerformed(e);
		//Para mantener la coherencia, nos aseguraremos que mNegrita
		//situado en el menu superior esté en el mismo estado que jtbNegrita 
		mNegrita.setSelected(jtbNegrita.isSelected());
	}
	private void cambiarEstiloCursiva(ActionEvent e) {
		new StyledEditorKit.ItalicAction().actionPerformed(e);
		//Para mantener la coherencia, nos aseguraremos que mCursiva
		//situado en el menu superior esté en el mismo estado que jtbCursiva 
		mCursiva.setSelected(jtbCursiva.isSelected());
	}
	private void cambiarEstiloSubrayado(ActionEvent e){
		//Realizamos el cambio de estilo
		new StyledEditorKit.UnderlineAction().actionPerformed(e);
		//Para mantener la coherencia, nos aseguraremos que mSubrayado
				//situado en el menu superior esté en el mismo estado que jtbSubrayado 
		mSubrayado.setSelected(jtbSubrayado.isSelected());
	}
	private void cambiarTamanyo(ActionEvent e) {
		//Capturamos el tamaño seleccionado en el comboBox
		int tamanyo =Integer.parseInt(cbTamanyoLetra.getSelectedItem().toString());
		FontSizeAction fontAction  = new StyledEditorKit.FontSizeAction(String.valueOf(tamanyo), tamanyo);
		fontAction.actionPerformed(e);	
		//Si el tamaño seleccionado coincide con alguna de las opciones del menu superior se marca
		switch (tamanyo) {
		case 10:mTamanyo10.setSelected(true);break;
		case 14:mTamanyo14.setSelected(true);break;
		case 18:mTamanyo18.setSelected(true);break;
		case 22:mTamanyo22.setSelected(true);break;
		
		}
	}
	
	//Mejora
	private void corregir() {
		//Cuando jbCorrecion esta seleccionado
		if(jbCorrecion.isSelected()) {	
			//Guardamos la funcionalidad del menuEmergente del editor
		fme = this.editorTexto.getFme();
			//El menu Emergente pasa a ser null dentro del JTextPane 
		this.lamina.getjTextPane().setComponentPopupMenu(null);
		//Hacemos un setUserDictionary y creamos un nuevo FileUserDictionary
		SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
		//Registramos los diccionarios en null, null, en el directorio raiz
		SpellChecker.registerDictionaries(null,null);
		//Registramos el JTextPane
		SpellChecker.register(this.lamina.getjTextPane());
		//listo
		
		}
		else {
			//Sacamos el JTextPane 
			SpellChecker.unregister(this.lamina.getjTextPane());
			//Volvemos a poner el menuEmergente original
			this.editorTexto.getLamina().getjTextPane().setComponentPopupMenu(menuEmergente);
			//Volvemos a implementar la funcionalidad del menu emergente en el editor de textos
			this.editorTexto.setFme(fme);
			//Sino hacemos this.editorTexto.setFme entonces aparecerá el menu emergente con normalidad al 
			//pulsar el botón pero no tendrá ninguna funcionalidad
			
		}
	}
}
