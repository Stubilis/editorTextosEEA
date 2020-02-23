package funcionalidad;

import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

import componentes.BarraHerramientas;
import componentes.EditorTexto;
import componentes.MenuEmergente;

public class FuncionalidadIdiomas {
	
	EditorTexto editorTexto;
	
	private JMenu menu1;	//fichero
	private JMenu menu2;	//fuente
	private JMenu menu3;	//estilo
	private JMenu menu4;	//parrafo
	private JMenu menu5;	//tamanyo
	private JMenu menu6;	//color
	private JMenu menu7;	//acerca de
	private JMenu menu8;	//idioma
	private JMenu menu9;	//tema
	
	private JMenu subMenu;
	
	private JMenuItem mAbrirHTML;
	private JMenuItem mAbrirRTF;
	private JMenuItem mGuardarHTML;
	private JMenuItem mGuardarRTF;
	
	private JMenuItem mCastellano;
	private JMenuItem mIngles;
	private JMenuItem mFrances;
	
	private JButton jbEspanyol;
	private JButton jbIngles;
	private JButton jbFrances;
	
	private JMenuItem mAbrir;
	private JMenuItem mGuardar;
	private JMenuItem mSalir;
	
	private  JCheckBoxMenuItem mNegrita;
	private JCheckBoxMenuItem mCursiva;
	private JCheckBoxMenuItem mSubrayado;
	
	private JMenuItem mTextIzq;
	private JMenuItem mTextCentro;
	private JMenuItem mTextDerecha;
	private JMenuItem mTextJustificado;
	private JMenuItem mColorFuente;
	
	private JMenuItem mAcercaDe;
	
	private JMenuItem mENegrita;
	private JMenuItem mECursiva;
	private JMenuItem mESubrayado;
	
	private JMenuItem mETextIzq;
	private JMenuItem mETextCentro;
	private JMenuItem mETextDerecha;
	private JMenuItem mETextJustificado;
	
	//barra de herraminetas
	
	private JButton jbAbrir;
	private JButton jbGuardar;
	private JButton jbSalir;
			
	private JToggleButton jtbNegrita;
	private JToggleButton jtbCursiva;	
	private JToggleButton jtbSubrayado;
			
	private JButton jbTextIzq;
	private JButton jbTextCentro;	
	private JButton jbTextDerecha;
	private JButton jbTextJustificado;
			
	private JComboBox<String> cbFuente;
	private JComboBox<String> cbTamanyoLetra;
			
	private JButton jbCambiarColorFuente;
	private JButton jbAnyadirImg;
			
	private JToggleButton jbCorreccion;
	
	private JMenuItem mDefaultAcryl;
	private JMenuItem mGreenAcryl;
	private JMenuItem mLemmonAcryl;
	private JMenuItem mRedAcryl;
	
	private JMenuItem mDefaultAero;
	private JMenuItem mGreenAero;
	private JMenuItem mGoldAero;
	
	
	private JMenuItem mDefaultAluminium;
	
	private JMenuItem mDefaultBernstein;
	
	private JMenuItem mDefaultFast;
	private JMenuItem mBlueFast;
	private JMenuItem mGreenFast;
	
	private JMenuItem mDefaultGraphite;
	private JMenuItem mBlueGraphite;
	private JMenuItem mGreenGraphite;
	
	private JMenuItem mDefaultHifi;
	
	private JMenuItem mDefaultLuna;
	
	private JMenuItem mDefaultMcWin;
	
	private JMenuItem mDefaultMint;
	
	private JMenuItem mDefaultNoire;
	
	private JMenuItem mDefaultSmart;
	private JMenuItem mGoldSmart;
	private JMenuItem mGreenSmart;
	private JMenuItem mBrownSmart;
	private JMenuItem mLemmonSmart;
	private JMenuItem mGraySmart;
	

	//En esta clase vamos a encargarnos de la traduccion del editor
	//Encontramos tres metodos encargados cada uno de cambiar los diferentes elementos a cada idioma
	//Ademas de cambiar la locale de elementos como los JOptionPane que sino no se verían afectados
	
	public FuncionalidadIdiomas(EditorTexto editorTexto) {
		
		this.editorTexto = editorTexto;
		
		//menuSuperior
		this.menu1 = editorTexto.getMenuSuperior().getMenu1();
		this.menu2 = editorTexto.getMenuSuperior().getMenu2();
		this.menu3 = editorTexto.getMenuSuperior().getMenu3();
		this.menu4 = editorTexto.getMenuSuperior().getMenu4();
		this.menu5 = editorTexto.getMenuSuperior().getMenu5();
		this.menu6 = editorTexto.getMenuSuperior().getMenu6();
		this.menu7 = editorTexto.getMenuSuperior().getMenu7();
		this.menu8 = editorTexto.getMenuSuperior().getMenu8();
		this.menu9 = editorTexto.getMenuSuperior().getMenu9();
		
		this.mAbrir = editorTexto.getMenuSuperior().getmAbrir();
		this.mGuardar =editorTexto.getMenuSuperior().getmGuardar();
		this.mSalir = editorTexto.getMenuSuperior().getmSalir();
		this.mAbrirHTML = editorTexto.getMenuSuperior().getmAbrirHTML();
		this.mAbrirRTF = editorTexto.getMenuSuperior().getmAbrirRTF();	
		this.mGuardarHTML = editorTexto.getMenuSuperior().getmGuardarHTML();
		this.mGuardarRTF = editorTexto.getMenuSuperior().getmGuardarRTF();
		
		subMenu = editorTexto.getMenuSuperior().getSubMenu();
		
		this.mNegrita  = editorTexto.getMenuSuperior().getmNegrita();
		this.mCursiva = editorTexto.getMenuSuperior().getmCursiva();	
		this.mSubrayado  =  editorTexto.getMenuSuperior().getmSubrayado();
		
		this.mTextIzq = editorTexto.getMenuSuperior().getmTextIzq();
		this.mTextCentro =  editorTexto.getMenuSuperior().getmTextCentro();
		this.mTextDerecha =  editorTexto.getMenuSuperior().getmTextDerecha();
		this.mTextJustificado = editorTexto.getMenuSuperior().getmTextJustificado();
		this.mColorFuente = editorTexto.getMenuSuperior().getmColorFuente();
		this.mAcercaDe = editorTexto.getMenuSuperior().getmAcercaDe();
		
		//menuEmergente
		this.mENegrita  = editorTexto.getLamina().getMenuEmergente().getmENegrita();
		this.mECursiva = editorTexto.getLamina().getMenuEmergente().getmECursiva();
		this.mESubrayado  = editorTexto.getLamina().getMenuEmergente().getmESubrayado();
		
		this.mETextIzq = editorTexto.getLamina().getMenuEmergente().getmETextIzq();
		this.mETextCentro = editorTexto.getLamina().getMenuEmergente().getmETextCentro();
		this.mETextDerecha = editorTexto.getLamina().getMenuEmergente().getmETextDerecha();
		this.mETextJustificado =  editorTexto.getLamina().getMenuEmergente().getmETextJustificado();
		
		//BarraHerramientas
		
		this.jbAbrir = editorTexto.getLamina().getBarraHerramientas().getJbAbrir();
		this.jbGuardar = editorTexto.getLamina().getBarraHerramientas().getJbGuardar();
		this.jbSalir = editorTexto.getLamina().getBarraHerramientas().getJbSalir();
		
		this.jbAnyadirImg = editorTexto.getLamina().getBarraHerramientas().getJbAnyadirImg();
		
		this.mNegrita = editorTexto.getMenuSuperior().getmNegrita();
		this.mCursiva = editorTexto.getMenuSuperior().getmCursiva();
		this.mSubrayado = editorTexto.getMenuSuperior().getmSubrayado();
		

		this.jtbNegrita = editorTexto.getLamina().getBarraHerramientas().getJtbNegrita();
		this.jtbCursiva = editorTexto.getLamina().getBarraHerramientas().getJtbCursiva();
		this.jtbSubrayado = editorTexto.getLamina().getBarraHerramientas().getJtbSubrayado();
		
		this.cbTamanyoLetra = editorTexto.getLamina().getBarraHerramientas().getCbTamanyoLetra();
		this.cbFuente = editorTexto.getLamina().getBarraHerramientas().getCbFuente();
		
		this.jbTextIzq = editorTexto.getLamina().getBarraHerramientas().getJbTextIzq();
		this.jbTextCentro = editorTexto.getLamina().getBarraHerramientas().getJbTextCentro();
		this.jbTextDerecha = editorTexto.getLamina().getBarraHerramientas().getJbTextDerecha();
		this.jbTextJustificado = editorTexto.getLamina().getBarraHerramientas().getJbTextJustificado();
		this.jbCambiarColorFuente =editorTexto.getLamina().getBarraHerramientas().getJbCambiarColorFuente();
		this.jbCorreccion = editorTexto.getLamina().getBarraHerramientas().getJbCorreccion();
		
		//Temas
		
		this.mDefaultAcryl= editorTexto.getMenuSuperior().getmDefaultAcryl();
		this.mGreenAcryl= editorTexto.getMenuSuperior().getmGreenAcryl();
		this.mLemmonAcryl= editorTexto.getMenuSuperior().getmLemmonAcryl();
		this.mRedAcryl = editorTexto.getMenuSuperior().getmRedAcryl();
		
		this.mDefaultAero = editorTexto.getMenuSuperior().getmDefaultAero();
		this.mGreenAero = editorTexto.getMenuSuperior().getmGreenAero();
		this.mGoldAero = editorTexto.getMenuSuperior().getmGoldAero();
		
		this.mDefaultAluminium = editorTexto.getMenuSuperior().getmDefaultAluminium();
		
		this.mDefaultBernstein = editorTexto.getMenuSuperior().getmDefaultBernstein();
		
		this.mDefaultFast = editorTexto.getMenuSuperior().getmDefaultFast();
		this.mBlueFast = editorTexto.getMenuSuperior().getmBlueFast();
		this.mGreenFast = editorTexto.getMenuSuperior().getmGreenFast();
		
		this.mDefaultGraphite = editorTexto.getMenuSuperior().getmDefaultGraphite();
		this.mBlueGraphite = editorTexto.getMenuSuperior().getmBlueGraphite();
		this.mGreenGraphite = editorTexto.getMenuSuperior().getmGreenGraphite();
		
		this.mDefaultHifi = editorTexto.getMenuSuperior().getmDefaultHifi();
		
		this.mDefaultLuna = editorTexto.getMenuSuperior().getmDefaultLuna();
		
		this.mDefaultMcWin = editorTexto.getMenuSuperior().getmDefaultMcWin();
		
		this.mDefaultMint = editorTexto.getMenuSuperior().getmDefaultMint();
		
		this.mDefaultNoire = editorTexto.getMenuSuperior().getmDefaultNoire();
		
		this.mDefaultSmart = editorTexto.getMenuSuperior().getmDefaultSmart();
		this.mGoldSmart = editorTexto.getMenuSuperior().getmGoldSmart();
		this.mGreenSmart = editorTexto.getMenuSuperior().getmGreenSmart();
		this.mBrownSmart = editorTexto.getMenuSuperior().getmBrownSmart();
		this.mLemmonSmart = editorTexto.getMenuSuperior().getmLemmonSmart();
		this.mGraySmart = editorTexto.getMenuSuperior().getmGraySmart();
		
		//.......Idiomas........................
		
		mCastellano = editorTexto.getMenuSuperior().getmCastellano();
		mIngles = editorTexto.getMenuSuperior().getmIngles();
		mFrances = editorTexto.getMenuSuperior().getmFrances();
		
		jbEspanyol = editorTexto.getLamina().getBarraHerramientas().getJbEspanyol();
		jbIngles = editorTexto.getLamina().getBarraHerramientas().getJbIngles();
		jbFrances = editorTexto.getLamina().getBarraHerramientas().getJbFrances();
		
		mCastellano.addActionListener(e -> {cambiarIdiomaES(e);});
		mIngles.addActionListener(e -> {cambiarIdiomaEN(e);});
		mFrances.addActionListener(e -> {cambiarIdiomaFR(e);});
		jbEspanyol.addActionListener(e -> {cambiarIdiomaES(e);});
		jbIngles.addActionListener(e -> {cambiarIdiomaEN(e);});
		jbFrances.addActionListener(e -> {cambiarIdiomaFR(e);});
	}

	private void cambiarIdiomaFR(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Locale currentLocale = new Locale("fr","FR");
		editorTexto.setLocale(currentLocale);
		JOptionPane.setDefaultLocale(currentLocale);
		BarraHerramientas.setDefaultLocale(currentLocale);
		MenuEmergente.setDefaultLocale(currentLocale);
		
		//titulos
		editorTexto.setTitle((ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_titulo_frame")));
		//menu superior
		mAbrir.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrir"));
		mGuardar.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardar"));
		mSalir.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_salir"));
		
		subMenu.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_mas"));
		mAbrirHTML.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrirHTML"));
		mAbrirRTF.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrirRTF"));
		mGuardarHTML.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardarHTML"));
		mGuardarRTF.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardarRTF"));
		
		mNegrita.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
		mCursiva.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
		mSubrayado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));
	
		mTextIzq.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
		mTextCentro.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
		mTextDerecha.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
		mTextJustificado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
		
		mColorFuente.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_color"));
		
		mAcercaDe.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_acercad"));
		
		mCastellano.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_es"));
		mIngles.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_en"));
		mFrances.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_fr"));
		
		menu1.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu1"));
		menu2.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu2"));
		menu3.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu3"));
		menu4.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu4"));
		menu5.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu5"));
		menu6.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu6"));
		menu7.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu7"));
		menu8.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu8"));
		menu9.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu9"));
		
		//menuEmergente
		mENegrita.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
		mECursiva.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
		mESubrayado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));
		
		mETextIzq.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
		mETextCentro.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
		mETextDerecha.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
		mETextJustificado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
		
		//barraHerramientas
		jbAbrir.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrir"));
		jbGuardar.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardar"));
		jbSalir.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_salir"));
		
		cbTamanyoLetra.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu5"));

		jtbNegrita.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
		jtbCursiva.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
		jtbSubrayado.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));
		
		jbTextIzq.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
		jbTextCentro.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
		jbTextDerecha.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
		jbTextJustificado.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
		cbFuente.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu2"));
		
		jbAnyadirImg.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_anyadir_img"));
		
		jbCambiarColorFuente.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_color"));
		
		jbEspanyol.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_es"));
		jbFrances.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_en"));
		jbIngles.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_fr"));
		
		jbCorreccion.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_boton_corregir"));
		jbCorreccion.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_boton_corregir"));
		
		//Temas
		mDefaultAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		mGreenAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
		mLemmonAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_limon"));
		mRedAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_rojo"));
		//
		mDefaultAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		mGoldAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_dorado"));
		mGreenAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
		//
		mDefaultAluminium.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		//
		mDefaultBernstein.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		//
		mDefaultFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		mBlueFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_azul"));
		mGreenFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
		//
		mDefaultGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		mBlueGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_azul"));
		mGreenGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
		//
		mDefaultHifi.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		//
		mDefaultLuna.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		//
		mDefaultMcWin.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		//
		mDefaultMint.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		//
		mDefaultNoire.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		//
		mDefaultSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
		mGoldSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_dorado"));
		mGreenSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
		mBrownSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_marron"));
		mLemmonSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_limon"));
		mGraySmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_gris"));
		//
	
	}

	private void cambiarIdiomaEN(ActionEvent e) {
		// TODO Auto-generated method stub

		Locale currentLocale = Locale.ENGLISH;
	editorTexto.setLocale(currentLocale);
	JOptionPane.setDefaultLocale(currentLocale);
	///titulos
	editorTexto.setTitle((ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_titulo_frame")));
	//menu superior
	mAbrir.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrir"));
	mGuardar.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardar"));
	mSalir.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_salir"));
	
	subMenu.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_mas"));
	mAbrirHTML.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrirHTML"));
	mAbrirRTF.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrirRTF"));
	mGuardarHTML.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardarHTML"));
	mGuardarRTF.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardarRTF"));
	
	mNegrita.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
	mCursiva.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
	mSubrayado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));

	mTextIzq.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
	mTextCentro.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
	mTextDerecha.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
	mTextJustificado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
	
	mColorFuente.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_color"));
	
	mAcercaDe.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_acercad"));
	
	mCastellano.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_es"));
	mIngles.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_en"));
	mFrances.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_fr"));
	
	menu1.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu1"));
	menu2.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu2"));
	menu3.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu3"));
	menu4.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu4"));
	menu5.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu5"));
	menu6.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu6"));
	menu7.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu7"));
	menu8.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu8"));
	menu9.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu9"));
	
	//menuEmergente
	mENegrita.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
	mECursiva.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
	mESubrayado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));
	
	mETextIzq.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
	mETextCentro.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
	mETextDerecha.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
	mETextJustificado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
	
	//barraHerramientas
	jbAbrir.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrir"));
	jbGuardar.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardar"));
	jbSalir.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_salir"));
	
	cbTamanyoLetra.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu5"));

	jtbNegrita.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
	jtbCursiva.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
	jtbSubrayado.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));
	
	jbTextIzq.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
	jbTextCentro.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
	jbTextDerecha.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
	jbTextJustificado.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
	cbFuente.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu2"));
	
	jbAnyadirImg.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_anyadir_img"));
	
	jbCambiarColorFuente.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_color"));
	
	jbEspanyol.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_es"));
	jbFrances.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_en"));
	jbIngles.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_fr"));
	
	jbCorreccion.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_boton_corregir"));
	jbCorreccion.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_boton_corregir"));
	
	//Temas
	mDefaultAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	mGreenAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
	mLemmonAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_limon"));
	mRedAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_rojo"));
	//
	mDefaultAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	mGoldAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_dorado"));
	mGreenAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
	//
	mDefaultAluminium.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	//
	mDefaultBernstein.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	//
	mDefaultFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	mBlueFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_azul"));
	mGreenFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
	//
	mDefaultGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	mBlueGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_azul"));
	mGreenGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
	//
	mDefaultHifi.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	//
	mDefaultLuna.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	//
	mDefaultMcWin.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	//
	mDefaultMint.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	//
	mDefaultNoire.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	//
	mDefaultSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
	mGoldSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_dorado"));
	mGreenSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
	mBrownSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_marron"));
	mLemmonSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_limon"));
	mGraySmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_gris"));
	//

			}

	private void cambiarIdiomaES(ActionEvent e) {
		// TODO Auto-generated method stub
	Locale currentLocale = new Locale("es","ES");
	editorTexto.setLocale(currentLocale);
	JOptionPane.setDefaultLocale(currentLocale);
	//titulos
			editorTexto.setTitle((ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_titulo_frame")));
			//menu superior
			mAbrir.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrir"));
			mGuardar.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardar"));
			mSalir.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_salir"));
			
			subMenu.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_mas"));
			mAbrirHTML.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrirHTML"));
			mAbrirRTF.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrirRTF"));
			mGuardarHTML.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardarHTML"));
			mGuardarRTF.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardarRTF"));
			
			
			mNegrita.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
			mCursiva.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
			mSubrayado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));
		
			mTextIzq.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
			mTextCentro.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
			mTextDerecha.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
			mTextJustificado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
			
			mColorFuente.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_color"));
			
			mAcercaDe.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_acercad"));
			
			mCastellano.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_es"));
			mIngles.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_en"));
			mFrances.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_fr"));
			
			menu1.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu1"));
			menu2.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu2"));
			menu3.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu3"));
			menu4.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu4"));
			menu5.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu5"));
			menu6.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu6"));
			menu7.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu7"));
			menu8.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu8"));
			menu9.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu9"));
			
			//menuEmergente
			mENegrita.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
			mECursiva.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
			mESubrayado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));
			
			mETextIzq.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
			mETextCentro.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
			mETextDerecha.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
			mETextJustificado.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
			
			//barraHerramientas
			jbAbrir.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_abrir"));
			jbGuardar.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_guardar"));
			jbSalir.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_salir"));
			
			cbTamanyoLetra.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu5"));

			jtbNegrita.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_negrita"));
			jtbCursiva.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_cursiva"));
			jtbSubrayado.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_subrayado"));
			
			jbTextIzq.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_izquierda"));
			jbTextCentro.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_centro"));
			jbTextDerecha.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_derecha"));
			jbTextJustificado.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_justificado"));
			cbFuente.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu2"));
			
			jbAnyadirImg.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_anyadir_img"));
			
			jbCambiarColorFuente.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_color"));
			
			jbEspanyol.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_es"));
			jbFrances.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_en"));
			jbIngles.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_menu_fr"));
			
			jbCorreccion.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_boton_corregir"));
			jbCorreccion.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_boton_corregir"));
			
			//Temas
			mDefaultAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			mGreenAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
			mLemmonAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_limon"));
			mRedAcryl.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_rojo"));
			//
			mDefaultAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			mGoldAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_dorado"));
			mGreenAero.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
			//
			mDefaultAluminium.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			//
			mDefaultBernstein.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			//
			mDefaultFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			mBlueFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_azul"));
			mGreenFast.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
			//
			mDefaultGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			mBlueGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_azul"));
			mGreenGraphite.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
			//
			mDefaultHifi.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			//
			mDefaultLuna.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			//
			mDefaultMcWin.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			//
			mDefaultMint.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			//
			mDefaultNoire.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			//
			mDefaultSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_predeterminado"));
			mGoldSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_dorado"));
			mGreenSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_verde"));
			mBrownSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_marron"));
			mLemmonSmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_limon"));
			mGraySmart.setText(ResourceBundle.getBundle("resources.Etiquetas",currentLocale).getString("tag_tema_gris"));
			//
		
		
		
	}

}
