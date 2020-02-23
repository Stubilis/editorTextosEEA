package componentes;

import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuSuperior extends JMenuBar{

	private static final long serialVersionUID = 1L;
	
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
	
	private JMenuItem mAbrir;
	private JMenuItem mAbrirHTML;
	
     //	.....

	private JMenuItem mAbrirRTF;
	private JMenuItem mGuardarSinFormato;
	private JMenuItem mGuardarHTML;
	private JMenuItem mGuardarRTF;
	private JMenuItem mSalir;
	
	private JMenuItem mArial;
	private JMenuItem mVerdana;
	private JMenuItem mCourier;
	private JMenuItem mImpact;
	
	private  JCheckBoxMenuItem mNegrita;
	private JCheckBoxMenuItem mCursiva;
	private JCheckBoxMenuItem mSubrayado;
	
	private JMenuItem mTextIzq;
	private JMenuItem mTextCentro;
	private JMenuItem mTextDerecha;
	private JMenuItem mTextJustificado;
	
	private ButtonGroup grupoRadioButtons;
	private JRadioButtonMenuItem mTamanyo10;
	private JRadioButtonMenuItem  mTamanyo14;
	private JRadioButtonMenuItem  mTamanyo18;
	private JRadioButtonMenuItem  mTamanyo22;
	
	private JMenuItem mColorFuente;
	
	private JMenuItem mAcercaDe;
	
	private JMenuItem mCastellano;
	private JMenuItem mIngles;
	private JMenuItem mFrances;
	
	private JMenu temaAcryl;
	private JMenuItem mDefaultAcryl;
	private JMenuItem mGreenAcryl;
	private JMenuItem mLemmonAcryl;
	private JMenuItem mRedAcryl;
	
	private JMenu temaAero;
	private JMenuItem mDefaultAero;
	private JMenuItem mGreenAero;
	private JMenuItem mGoldAero;
	
	
	private JMenu temaAluminium;
	private JMenuItem mDefaultAluminium;
	
	private JMenu temaBernstein;
	private JMenuItem mDefaultBernstein;
	
	private JMenu temaFast;
	private JMenuItem mDefaultFast;
	private JMenuItem mBlueFast;
	private JMenuItem mGreenFast;
	
	private JMenu temaGraphite;
	private JMenuItem mDefaultGraphite;
	private JMenuItem mBlueGraphite;
	private JMenuItem mGreenGraphite;
	
	private JMenu temaHifi;
	private JMenuItem mDefaultHifi;
	
	private JMenu temaLuna;
	private JMenuItem mDefaultLuna;
	
	private JMenu temaMcWin;
	private JMenuItem mDefaultMcWin;
	
	private JMenu temaMint;
	private JMenuItem mDefaultMint;
	
	private JMenu temaNoire;
	private JMenuItem mDefaultNoire;
	
	private JMenu temaSmart;
	private JMenuItem mDefaultSmart;
	private JMenuItem mGoldSmart;
	private JMenuItem mGreenSmart;
	private JMenuItem mBrownSmart;
	private JMenuItem mLemmonSmart;
	private JMenuItem mGraySmart;
	
	//Iconos
	
	private ImageIcon iconAbrir;
	private ImageIcon iconGuardar;
	private ImageIcon iconSalir;
	private ImageIcon iconNegrita;
	private ImageIcon iconCursiva;
	private ImageIcon iconSubrayado;
	private ImageIcon iconTextIzq;
	private ImageIcon iconTextCentro;
	private ImageIcon iconTextDerecha;
	private ImageIcon iconTextJustificado;
	private ImageIcon iconColorFuente;
	private ImageIcon iconAcercaDe;
	private ImageIcon iconBanderaEspanya;
	private ImageIcon iconBanderaFrancia;
	private ImageIcon iconBanderaInglesa;
	

	public MenuSuperior() {
		//Iconos
		iconAbrir = new ImageIcon("./multimedia/images/abrir.png");
		iconGuardar = new ImageIcon("./multimedia/images/guardar.png","guardar");
		iconSalir = new ImageIcon("./multimedia/images/cerrar.png","salir");
		iconNegrita = new ImageIcon("./multimedia/images/estiloneg.png","negrita");
		iconCursiva = new ImageIcon("./multimedia/images/estilocur.png","cursiva");
		iconSubrayado = new ImageIcon("./multimedia/images/estilosub.png","subrayado");
		iconTextIzq = new ImageIcon("./multimedia/images/alinearizq.png","alinear izquierda");
		iconTextCentro = new ImageIcon("./multimedia/images/alinearcentro.png","alinear centro");
		iconTextDerecha = new ImageIcon("./multimedia/images/alinearder.png","alinear derecha");
		iconTextJustificado = new ImageIcon("./multimedia/images/alinearjust.png","justificar");
		iconColorFuente = new ImageIcon("./multimedia/images/colorfuente.png","cambiar color fuente");
		iconAcercaDe = new ImageIcon("./multimedia/images/bombilla.png","Acerca de");
		iconBanderaEspanya = new ImageIcon("./multimedia/images/banderaespanya.png","cambiar idioma");
		iconBanderaFrancia = new ImageIcon("./multimedia/images/banderafrancia.png","cambiar idioma");
		iconBanderaInglesa = new ImageIcon("./multimedia/images/banderainglesa.png","cambiar idioma");
		
		//Menú superior
		
		mAbrir = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_abrir"),iconAbrir);
		mAbrirHTML = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_abrirHTML"),iconAbrir);
		mAbrirRTF = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_abrirRTF"),iconAbrir);
		mGuardarSinFormato = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_guardar"),iconGuardar);
		mGuardarHTML = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_guardarHTML"),iconGuardar);
		mGuardarRTF = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_guardarRTF"),iconGuardar);
		mSalir = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_salir"),iconSalir);
		
		mArial  = new JMenuItem("Arial");
		mVerdana  = new JMenuItem("Verdana");
		mCourier  = new JMenuItem("Courier");
		mImpact  = new JMenuItem("Impact");
		
		mNegrita  =  new JCheckBoxMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_negrita"),iconNegrita);
		mCursiva = new JCheckBoxMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_cursiva"),iconCursiva);
		mSubrayado  = new JCheckBoxMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_subrayado"),iconSubrayado);
	
		mTextIzq = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_izquierda"),iconTextIzq);
		mTextCentro = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_centro"),iconTextCentro);
		mTextDerecha = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_derecha"),iconTextDerecha);
		mTextJustificado = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_justificado"),iconTextJustificado);
		
		mTamanyo10 = new JRadioButtonMenuItem("10");
		mTamanyo14 = new JRadioButtonMenuItem("14");
		mTamanyo18 = new JRadioButtonMenuItem("18");
		mTamanyo22 = new JRadioButtonMenuItem("22");
		
		mColorFuente = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_color"),iconColorFuente);
		
		mAcercaDe = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_acercad"),iconAcercaDe);
		
		mCastellano = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_es"),iconBanderaEspanya);
		mIngles = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_en"),iconBanderaInglesa);
		mFrances = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_fr"),iconBanderaFrancia);
		
		grupoRadioButtons = new ButtonGroup();
		grupoRadioButtons.add(mTamanyo10);
		grupoRadioButtons.add(mTamanyo14);
		grupoRadioButtons.add(mTamanyo18);
		grupoRadioButtons.add(mTamanyo22);
		
		mDefaultAcryl =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		mGreenAcryl = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_verde"));
		mLemmonAcryl =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_limon"));
		mRedAcryl =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_rojo"));
		//
		mDefaultAero = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		mGoldAero =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_dorado"));
		mGreenAero = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_verde"));
		//
		mDefaultAluminium = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		//
		mDefaultBernstein = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		//
		mDefaultFast =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		mBlueFast = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_azul"));
		mGreenFast =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_verde"));
		//
		mDefaultGraphite = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		mBlueGraphite = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_azul"));
		mGreenGraphite =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_verde"));
		//
		mDefaultHifi =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		//
		mDefaultLuna  = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		//
		mDefaultMcWin = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		//
		mDefaultMint= new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		//
		mDefaultNoire = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		//
		mDefaultSmart =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_predeterminado"));
		mGoldSmart =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_dorado"));
		mGreenSmart = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_verde"));
		mBrownSmart = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_marron"));
		mLemmonSmart = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_limon"));
		mGraySmart = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_tema_gris"));
		//
		
		
		menu1 = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu1"));
		menu2 = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu2"));
		menu3 = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu3"));
		menu4 = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu4"));
		menu5 = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu5"));
		menu6 = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu6"));
		menu7 = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu7"));
		menu8 = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu8"));
		menu9 =  new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu9"));
		
		//
		subMenu = new JMenu(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_mas"));
		
		subMenu.add(mGuardarHTML);
		subMenu.add(mGuardarRTF);
		subMenu.add(mAbrirHTML);
		subMenu.add(mAbrirRTF);
		
		//
		temaAcryl = new JMenu("Acryl");
		temaAcryl.add(mDefaultAcryl);
		temaAcryl.add(mGreenAcryl);
		temaAcryl.add(mLemmonAcryl);
		temaAcryl.add(mRedAcryl);
		
		temaAero = new JMenu("Aero");
		temaAero.add(mDefaultAero);
		temaAero.add(mGoldAero);
		temaAero.add(mGreenAero);
		
		temaAluminium = new JMenu("Aluminium");
		temaAluminium.add(mDefaultAluminium);
		
		temaBernstein = new JMenu("Bernstein");
		temaBernstein.add(mDefaultBernstein);
		
		temaFast = new JMenu("Fast");
		temaFast.add(mDefaultFast);
		temaFast.add(mBlueFast);
		temaFast.add(mGreenFast);
		
		temaGraphite = new JMenu("Graphite");
		temaGraphite.add(mDefaultGraphite);
		temaGraphite.add(mGreenGraphite);
		temaGraphite.add(mBlueGraphite);
		
		temaHifi = new JMenu("Hifi");
		temaHifi.add(mDefaultHifi);
		
		temaLuna = new JMenu("Luna");
		temaLuna.add(mDefaultLuna);
		
		temaMcWin = new JMenu("McWin");
		temaMcWin.add(mDefaultMcWin);
		
		temaMint = new JMenu("Mint");
		temaMint.add(mDefaultMint);
		
		temaNoire = new JMenu("Noire");
		temaNoire.add(mDefaultNoire);
		
		//
		temaSmart = new JMenu("Smart");
		temaSmart.add(mDefaultSmart);
		temaSmart.add(mGoldSmart);
		temaSmart.add(mGreenSmart);
		temaSmart.add(mBrownSmart);
		temaSmart.add(mLemmonSmart);
		temaSmart.add(mGraySmart);
		//
		
		
		
		
		
		//
		
		this.add(menu1);
		this.add(menu2);
		this.add(menu3);
		this.add(menu4);
		this.add(menu5);
		this.add(menu6);
		this.add(menu7);
		this.add(menu8);
		this.add(menu9);
		
		menu1.add(mAbrir);
		menu1.add(mGuardarSinFormato);
		menu1.add(mSalir);
		menu1.add(subMenu);

		menu2.add(mArial);
		menu2.add(mVerdana);
		menu2.add(mCourier);
		menu2.add(mImpact);
		
		menu3.add(mNegrita);
		menu3.add(mCursiva);
		menu3.add(mSubrayado);
		
		menu4.add(mTextIzq);
		menu4.add(mTextCentro);
		menu4.add(mTextDerecha);
		menu4.add(mTextJustificado);
		
		menu5.add(mTamanyo10);	
		menu5.add(mTamanyo14);	
		menu5.add(mTamanyo18);	
		menu5.add(mTamanyo22);	
		
		menu6.add(mColorFuente);
		
		menu7.add(mAcercaDe);
		
		menu8.add(mCastellano);
		menu8.add(mIngles);
		menu8.add(mFrances);
		
		menu9.add(temaAcryl);
		menu9.add(temaAero);
		menu9.add(temaAluminium);
		menu9.add(temaBernstein);
		menu9.add(temaFast);
		menu9.add(temaGraphite);
		menu9.add(temaFast);
		menu9.add(temaHifi);
		menu9.add(temaLuna);
		menu9.add(temaMcWin);
		menu9.add(temaMint);
		menu9.add(temaNoire);
		menu9.add(temaSmart);
		
		
	}


	public ImageIcon getIconAcercaDe() {
		return iconAcercaDe;
	}


	public void setIconAcercaDe(ImageIcon iconAcercaDe) {
		this.iconAcercaDe = iconAcercaDe;
	}


	public JMenu getMenu1() {
		return menu1;
	}


	public void setMenu1(JMenu menu1) {
		this.menu1 = menu1;
	}


	public JMenu getMenu2() {
		return menu2;
	}


	public void setMenu2(JMenu menu2) {
		this.menu2 = menu2;
	}


	public JMenu getMenu3() {
		return menu3;
	}


	public void setMenu3(JMenu menu3) {
		this.menu3 = menu3;
	}


	public JMenu getMenu4() {
		return menu4;
	}


	public void setMenu4(JMenu menu4) {
		this.menu4 = menu4;
	}


	public JMenu getMenu5() {
		return menu5;
	}


	public void setMenu5(JMenu menu5) {
		this.menu5 = menu5;
	}


	public JMenu getMenu6() {
		return menu6;
	}


	public void setMenu6(JMenu menu6) {
		this.menu6 = menu6;
	}


	public JMenu getMenu7() {
		return menu7;
	}


	public void setMenu7(JMenu menu7) {
		this.menu7 = menu7;
	}


	public JMenu getMenu8() {
		return menu8;
	}


	public void setMenu8(JMenu menu8) {
		this.menu8 = menu8;
	}


	public JMenuItem getmAbrir() {
		return mAbrir;
	}


	public void setmAbrir(JMenuItem mAbrir) {
		this.mAbrir = mAbrir;
	}


	public JMenuItem getmGuardar() {
		return mGuardarSinFormato;
	}


	public void setmGuardar(JMenuItem mGuardar) {
		this.mGuardarSinFormato = mGuardar;
	}


	public JMenuItem getmSalir() {
		return mSalir;
	}


	public void setmSalir(JMenuItem mSalir) {
		this.mSalir = mSalir;
	}


	public JMenuItem getmArial() {
		return mArial;
	}


	public void setmArial(JMenuItem mArial) {
		this.mArial = mArial;
	}


	public JMenuItem getmVerdana() {
		return mVerdana;
	}


	public void setmVerdana(JMenuItem mVerdana) {
		this.mVerdana = mVerdana;
	}


	public JMenuItem getmCourier() {
		return mCourier;
	}


	public void setmCourier(JMenuItem mCourier) {
		this.mCourier = mCourier;
	}


	public JMenuItem getmImpact() {
		return mImpact;
	}


	public void setmImpact(JMenuItem mImpact) {
		this.mImpact = mImpact;
	}


	public JCheckBoxMenuItem getmNegrita() {
		return mNegrita;
	}


	public void setmNegrita(JCheckBoxMenuItem mNegrita) {
		this.mNegrita = mNegrita;
	}


	public JCheckBoxMenuItem getmCursiva() {
		return mCursiva;
	}


	public void setmCursiva(JCheckBoxMenuItem mCursiva) {
		this.mCursiva = mCursiva;
	}


	public JCheckBoxMenuItem getmSubrayado() {
		return mSubrayado;
	}


	public void setmSubrayado(JCheckBoxMenuItem mSubrayado) {
		this.mSubrayado = mSubrayado;
	}


	public JMenuItem getmTextIzq() {
		return mTextIzq;
	}


	public void setmTextIzq(JMenuItem mTextIzq) {
		this.mTextIzq = mTextIzq;
	}


	public JMenuItem getmTextCentro() {
		return mTextCentro;
	}


	public void setmTextCentro(JMenuItem mTextCentro) {
		this.mTextCentro = mTextCentro;
	}


	public JMenuItem getmTextDerecha() {
		return mTextDerecha;
	}


	public void setmTextDerecha(JMenuItem mTextDerecha) {
		this.mTextDerecha = mTextDerecha;
	}


	public JMenuItem getmTextJustificado() {
		return mTextJustificado;
	}


	public void setmTextJustificado(JMenuItem mTextJustificado) {
		this.mTextJustificado = mTextJustificado;
	}


	public JRadioButtonMenuItem getmTamanyo10() {
		return mTamanyo10;
	}


	public void setmTamanyo10(JRadioButtonMenuItem mTamanyo10) {
		this.mTamanyo10 = mTamanyo10;
	}


	public JRadioButtonMenuItem getmTamanyo14() {
		return mTamanyo14;
	}


	public void setmTamanyo14(JRadioButtonMenuItem mTamanyo14) {
		this.mTamanyo14 = mTamanyo14;
	}


	public JRadioButtonMenuItem getmTamanyo18() {
		return mTamanyo18;
	}


	public void setmTamanyo18(JRadioButtonMenuItem mTamanyo18) {
		this.mTamanyo18 = mTamanyo18;
	}


	public JRadioButtonMenuItem getmTamanyo22() {
		return mTamanyo22;
	}


	public void setmTamanyo22(JRadioButtonMenuItem mTamanyo22) {
		this.mTamanyo22 = mTamanyo22;
	}


	public JMenuItem getmColorFuente() {
		return mColorFuente;
	}


	public void setmColorFuente(JMenuItem mColorFuente) {
		this.mColorFuente = mColorFuente;
	}


	public JMenuItem getmAcercaDe() {
		return mAcercaDe;
	}


	public void setmAcercaDe(JMenuItem mAcercaDe) {
		this.mAcercaDe = mAcercaDe;
	}


	public JMenuItem getmCastellano() {
		return mCastellano;
	}


	public void setmCastellano(JMenuItem mCastellano) {
		this.mCastellano = mCastellano;
	}


	public JMenuItem getmIngles() {
		return mIngles;
	}


	public void setmIngles(JMenuItem mIngles) {
		this.mIngles = mIngles;
	}


	public JMenuItem getmFrances() {
		return mFrances;
	}


	public void setmFrances(JMenuItem mFrances) {
		this.mFrances = mFrances;
	}


	public JMenuItem getmAbrirHTML() {
		return mAbrirHTML;
	}


	public void setmAbrirHTML(JMenuItem mAbrirHTML) {
		this.mAbrirHTML = mAbrirHTML;
	}


	public JMenuItem getmAbrirRTF() {
		return mAbrirRTF;
	}


	public void setmAbrirRTF(JMenuItem mAbrirRTF) {
		this.mAbrirRTF = mAbrirRTF;
	}


	public JMenuItem getmGuardarSinFormato() {
		return mGuardarSinFormato;
	}


	public void setmGuardarSinFormato(JMenuItem mGuardarSinFormato) {
		this.mGuardarSinFormato = mGuardarSinFormato;
	}


	public JMenuItem getmGuardarHTML() {
		return mGuardarHTML;
	}


	public void setmGuardarHTML(JMenuItem mGuardarHTML) {
		this.mGuardarHTML = mGuardarHTML;
	}


	public JMenuItem getmGuardarRTF() {
		return mGuardarRTF;
	}


	public void setmGuardarRTF(JMenuItem mGuardarRTF) {
		this.mGuardarRTF = mGuardarRTF;
	}


	public JMenu getMenu9() {
		return menu9;
	}


	public void setMenu9(JMenu menu9) {
		this.menu9 = menu9;
	}


	public JMenu getSubMenu() {
		return subMenu;
	}


	public void setSubMenu(JMenu subMenu) {
		this.subMenu = subMenu;
	}


	public ButtonGroup getGrupoRadioButtons() {
		return grupoRadioButtons;
	}


	public void setGrupoRadioButtons(ButtonGroup grupoRadioButtons) {
		this.grupoRadioButtons = grupoRadioButtons;
	}


	public JMenu getTemaAcryl() {
		return temaAcryl;
	}


	public void setTemaAcryl(JMenu temaAcryl) {
		this.temaAcryl = temaAcryl;
	}


	public JMenuItem getmDefaultAcryl() {
		return mDefaultAcryl;
	}


	public void setmDefaultAcryl(JMenuItem mDefaultAcryl) {
		this.mDefaultAcryl = mDefaultAcryl;
	}


	public JMenuItem getmGreenAcryl() {
		return mGreenAcryl;
	}


	public void setmGreenAcryl(JMenuItem mGreenAcryl) {
		this.mGreenAcryl = mGreenAcryl;
	}


	public JMenuItem getmLemmonAcryl() {
		return mLemmonAcryl;
	}


	public void setmLemmonAcryl(JMenuItem mLemmonAcryl) {
		this.mLemmonAcryl = mLemmonAcryl;
	}


	public JMenuItem getmRedAcryl() {
		return mRedAcryl;
	}


	public void setmRedAcryl(JMenuItem mRedAcryl) {
		this.mRedAcryl = mRedAcryl;
	}


	public JMenu getTemaAero() {
		return temaAero;
	}


	public void setTemaAero(JMenu temaAero) {
		this.temaAero = temaAero;
	}


	public JMenuItem getmDefaultAero() {
		return mDefaultAero;
	}


	public void setmDefaultAero(JMenuItem mDefaultAero) {
		this.mDefaultAero = mDefaultAero;
	}


	public JMenuItem getmGreenAero() {
		return mGreenAero;
	}


	public void setmGreenAero(JMenuItem mGreenAero) {
		this.mGreenAero = mGreenAero;
	}


	public JMenuItem getmGoldAero() {
		return mGoldAero;
	}


	public void setmGoldAero(JMenuItem mGoldAero) {
		this.mGoldAero = mGoldAero;
	}


	public JMenu getTemaAluminium() {
		return temaAluminium;
	}


	public void setTemaAluminium(JMenu temaAluminium) {
		this.temaAluminium = temaAluminium;
	}


	public JMenuItem getmDefaultAluminium() {
		return mDefaultAluminium;
	}


	public void setmDefaultAluminium(JMenuItem mDefaultAluminium) {
		this.mDefaultAluminium = mDefaultAluminium;
	}


	public JMenu getTemaBernstein() {
		return temaBernstein;
	}


	public void setTemaBernstein(JMenu temaBernstein) {
		this.temaBernstein = temaBernstein;
	}


	public JMenuItem getmDefaultBernstein() {
		return mDefaultBernstein;
	}


	public void setmDefaultBernstein(JMenuItem mDefaultBernstein) {
		this.mDefaultBernstein = mDefaultBernstein;
	}


	public JMenu getTemaFast() {
		return temaFast;
	}


	public void setTemaFast(JMenu temaFast) {
		this.temaFast = temaFast;
	}


	public JMenuItem getmDefaultFast() {
		return mDefaultFast;
	}


	public void setmDefaultFast(JMenuItem mDefaultFast) {
		this.mDefaultFast = mDefaultFast;
	}


	public JMenuItem getmBlueFast() {
		return mBlueFast;
	}


	public void setmBlueFast(JMenuItem mBlueFast) {
		this.mBlueFast = mBlueFast;
	}


	public JMenuItem getmGreenFast() {
		return mGreenFast;
	}


	public void setmGreenFast(JMenuItem mGreenFast) {
		this.mGreenFast = mGreenFast;
	}


	public JMenu getTemaGraphite() {
		return temaGraphite;
	}


	public void setTemaGraphite(JMenu temaGraphite) {
		this.temaGraphite = temaGraphite;
	}


	public JMenuItem getmDefaultGraphite() {
		return mDefaultGraphite;
	}


	public void setmDefaultGraphite(JMenuItem mDefaultGraphite) {
		this.mDefaultGraphite = mDefaultGraphite;
	}


	public JMenuItem getmBlueGraphite() {
		return mBlueGraphite;
	}


	public void setmBlueGraphite(JMenuItem mBlueGraphite) {
		this.mBlueGraphite = mBlueGraphite;
	}


	public JMenuItem getmGreenGraphite() {
		return mGreenGraphite;
	}


	public void setmGreenGraphite(JMenuItem mGreenGraphite) {
		this.mGreenGraphite = mGreenGraphite;
	}


	public JMenu getTemaHifi() {
		return temaHifi;
	}


	public void setTemaHifi(JMenu temaHifi) {
		this.temaHifi = temaHifi;
	}


	public JMenuItem getmDefaultHifi() {
		return mDefaultHifi;
	}


	public void setmDefaultHifi(JMenuItem mDefaultHifi) {
		this.mDefaultHifi = mDefaultHifi;
	}


	public JMenu getTemaLuna() {
		return temaLuna;
	}


	public void setTemaLuna(JMenu temaLuna) {
		this.temaLuna = temaLuna;
	}


	public JMenuItem getmDefaultLuna() {
		return mDefaultLuna;
	}


	public void setmDefaultLuna(JMenuItem mDefaultLuna) {
		this.mDefaultLuna = mDefaultLuna;
	}


	public JMenu getTemaMcWin() {
		return temaMcWin;
	}


	public void setTemaMcWin(JMenu temaMcWin) {
		this.temaMcWin = temaMcWin;
	}


	public JMenuItem getmDefaultMcWin() {
		return mDefaultMcWin;
	}


	public void setmDefaultMcWin(JMenuItem mDefaultMcWin) {
		this.mDefaultMcWin = mDefaultMcWin;
	}


	public JMenu getTemaMint() {
		return temaMint;
	}


	public void setTemaMint(JMenu temaMint) {
		this.temaMint = temaMint;
	}


	public JMenuItem getmDefaultMint() {
		return mDefaultMint;
	}


	public void setmDefaultMint(JMenuItem mDefaultMint) {
		this.mDefaultMint = mDefaultMint;
	}


	public JMenu getTemaNoire() {
		return temaNoire;
	}


	public void setTemaNoire(JMenu temaNoire) {
		this.temaNoire = temaNoire;
	}


	public JMenuItem getmDefaultNoire() {
		return mDefaultNoire;
	}


	public void setmDefaultNoire(JMenuItem mDefaultNoire) {
		this.mDefaultNoire = mDefaultNoire;
	}


	public JMenu getTemaSmart() {
		return temaSmart;
	}


	public void setTemaSmart(JMenu temaSmart) {
		this.temaSmart = temaSmart;
	}


	public JMenuItem getmDefaultSmart() {
		return mDefaultSmart;
	}


	public void setmDefaultSmart(JMenuItem mDefaultSmart) {
		this.mDefaultSmart = mDefaultSmart;
	}


	public JMenuItem getmGoldSmart() {
		return mGoldSmart;
	}


	public void setmGoldSmart(JMenuItem mGoldSmart) {
		this.mGoldSmart = mGoldSmart;
	}


	public JMenuItem getmGreenSmart() {
		return mGreenSmart;
	}


	public void setmGreenSmart(JMenuItem mGreenSmart) {
		this.mGreenSmart = mGreenSmart;
	}


	public JMenuItem getmBrownSmart() {
		return mBrownSmart;
	}


	public void setmBrownSmart(JMenuItem mBrownSmart) {
		this.mBrownSmart = mBrownSmart;
	}


	public JMenuItem getmLemmonSmart() {
		return mLemmonSmart;
	}


	public void setmLemmonSmart(JMenuItem mLemmonSmart) {
		this.mLemmonSmart = mLemmonSmart;
	}


	public JMenuItem getmGraySmart() {
		return mGraySmart;
	}


	public void setmGraySmart(JMenuItem mGraySmart) {
		this.mGraySmart = mGraySmart;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
