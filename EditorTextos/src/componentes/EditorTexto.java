package componentes;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import funcionalidad.FuncionalidadBarraHerramientas;
import funcionalidad.FuncionalidadIdiomas;
import funcionalidad.FuncionalidadMenuEmergente;
import funcionalidad.FuncionalidadMenuSuperior;
import funcionalidad.FuncionalidadTemas;
import funcionalidad.FuncionalidadVentanasEmergentes;



public class EditorTexto extends JFrame implements WindowListener{
	
	//WindowListener -> captura cambios en la ventana -> metodo windowClosing ->pregunta si quieres salir
	
	private static final long serialVersionUID = 1L;
	
	private MenuSuperior menuSuperior;
	private Lamina lamina;
	private FuncionalidadBarraHerramientas fbh;
	private FuncionalidadMenuSuperior fm;
	private FuncionalidadVentanasEmergentes fve;
	private FuncionalidadMenuEmergente fme;
	private FuncionalidadIdiomas fi;
	private FuncionalidadTemas ft;

	public EditorTexto() {
		
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		//titulo de la ventana
		this.setTitle(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_titulo_frame"));
		Image iconoFrame = pantalla.getImage("./multimedia/images/iconoaplicacion.png");
		//icono de la aplicación
		setIconImage(iconoFrame);
		
		setBounds(250,250,800,600);
		
		menuSuperior = new MenuSuperior();
		lamina = new Lamina();
		this.add(lamina);
		this.setJMenuBar(menuSuperior);
		
		fbh = new FuncionalidadBarraHerramientas(this);
		fm = new FuncionalidadMenuSuperior(this);
		fve = new FuncionalidadVentanasEmergentes(this);
		fme = new FuncionalidadMenuEmergente(this);
		fi = new FuncionalidadIdiomas(this);
		ft = new FuncionalidadTemas(this);
		
		this.setExtendedState(MAXIMIZED_BOTH);
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(this);
		setVisible(true);
	}
	
	public MenuSuperior getMenuSuperior() {
		return menuSuperior;
	}

	public void setMenuSuperior(MenuSuperior menuSuperior) {
		this.menuSuperior = menuSuperior;
	}

	public Lamina getLamina() {
		return lamina;
	}

	public void setLamina(Lamina lamina) {
		this.lamina = lamina;
	}

	public FuncionalidadBarraHerramientas getFbh() {
		return fbh;
	}

	public void setFbh(FuncionalidadBarraHerramientas fbh) {
		this.fbh = fbh;
	}

	public FuncionalidadMenuSuperior getFm() {
		return fm;
	}

	public void setFm(FuncionalidadMenuSuperior fm) {
		this.fm = fm;
	}

	public FuncionalidadVentanasEmergentes getFve() {
		return fve;
	}

	public void setFve(FuncionalidadVentanasEmergentes fve) {
		this.fve = fve;
	}

	public FuncionalidadMenuEmergente getFme() {
		return fme;
	}

	public void setFme(FuncionalidadMenuEmergente fme) {
		this.fme = fme;
	}

	public FuncionalidadIdiomas getFi() {
		return fi;
	}

	public void setFi(FuncionalidadIdiomas fi) {
		this.fi = fi;
	}

	public FuncionalidadTemas getFt() {
		return ft;
	}

	public void setFt(FuncionalidadTemas ft) {
		this.ft = ft;
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		Locale locale = this.getLocale();
		String pregunta = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_salir_pregunta");
		String titVentana = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_salir_titulo");		
		int	respuesta =JOptionPane.showConfirmDialog(null,pregunta,titVentana,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
		 if(respuesta == JOptionPane.YES_OPTION) {
		      System.exit(0);          
		 	}
		  }
	

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
