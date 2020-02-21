package componentes;

import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MenuEmergente extends JPopupMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenuItem mENegrita;
	private JMenuItem mECursiva;
	private JMenuItem mESubrayado;
	
	private JMenuItem mETextIzq;
	private JMenuItem mETextCentro;
	private JMenuItem mETextDerecha;
	private JMenuItem mETextJustificado;
	
	//Iconos
	private ImageIcon iconNegrita;
	private ImageIcon iconCursiva;
	private ImageIcon iconSubrayado;
	private ImageIcon iconTextIzq;
	private ImageIcon iconTextCentro;
	private ImageIcon iconTextDerecha;
	private ImageIcon iconTextJustificado;

	public MenuEmergente() {
		
		//Iconos
		iconNegrita = new ImageIcon("./multimedia/images/estiloneg.png","negrita");
		iconCursiva = new ImageIcon("./multimedia/images/estilocur.png","cursiva");
		iconSubrayado = new ImageIcon("./multimedia/images/estilosub.png","subrayado");
		iconTextIzq = new ImageIcon("./multimedia/images/alinearizq.png","alinear izquierda");
		iconTextCentro = new ImageIcon("./multimedia/images/alinearcentro.png","alinear centro");
		iconTextDerecha = new ImageIcon("./multimedia/images/alinearder.png","alinear derecha");
		iconTextJustificado = new ImageIcon("./multimedia/images/alinearjust.png","justificar");
		
		mENegrita  =  new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_negrita"),iconNegrita);
		mECursiva = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_cursiva"),iconCursiva);
		mESubrayado  = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_subrayado"),iconSubrayado);
		
		mETextIzq = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_izquierda"),iconTextIzq);
		mETextCentro = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_centro"),iconTextCentro);
		mETextDerecha = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_derecha"),iconTextDerecha);
		mETextJustificado = new JMenuItem(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_justificado"),iconTextJustificado);
		
		this.add(mENegrita);
		this.add(mECursiva);
		this.add(mESubrayado);
		this.add(mETextIzq);
		this.add(mETextCentro);
		this.add(mETextDerecha);
		this.add(mETextJustificado);
	}

	public JMenuItem getmENegrita() {
		return mENegrita;
	}

	public void setmENegrita(JMenuItem mENegrita) {
		this.mENegrita = mENegrita;
	}

	public JMenuItem getmECursiva() {
		return mECursiva;
	}

	public void setmECursiva(JMenuItem mECursiva) {
		this.mECursiva = mECursiva;
	}

	public JMenuItem getmESubrayado() {
		return mESubrayado;
	}

	public void setmESubrayado(JMenuItem mESubrayado) {
		this.mESubrayado = mESubrayado;
	}

	public JMenuItem getmETextIzq() {
		return mETextIzq;
	}

	public void setmETextIzq(JMenuItem mETextIzq) {
		this.mETextIzq = mETextIzq;
	}

	public JMenuItem getmETextCentro() {
		return mETextCentro;
	}

	public void setmETextCentro(JMenuItem mETextCentro) {
		this.mETextCentro = mETextCentro;
	}

	public JMenuItem getmETextDerecha() {
		return mETextDerecha;
	}

	public void setmETextDerecha(JMenuItem mETextDerecha) {
		this.mETextDerecha = mETextDerecha;
	}

	public JMenuItem getmETextJustificado() {
		return mETextJustificado;
	}

	public void setmETextJustificado(JMenuItem mETextJustificado) {
		this.mETextJustificado = mETextJustificado;
	}

	public ImageIcon getIconNegrita() {
		return iconNegrita;
	}

	public void setIconNegrita(ImageIcon iconNegrita) {
		this.iconNegrita = iconNegrita;
	}

	public ImageIcon getIconCursiva() {
		return iconCursiva;
	}

	public void setIconCursiva(ImageIcon iconCursiva) {
		this.iconCursiva = iconCursiva;
	}

	public ImageIcon getIconSubrayado() {
		return iconSubrayado;
	}

	public void setIconSubrayado(ImageIcon iconSubrayado) {
		this.iconSubrayado = iconSubrayado;
	}

	public ImageIcon getIconTextIzq() {
		return iconTextIzq;
	}

	public void setIconTextIzq(ImageIcon iconTextIzq) {
		this.iconTextIzq = iconTextIzq;
	}

	public ImageIcon getIconTextCentro() {
		return iconTextCentro;
	}

	public void setIconTextCentro(ImageIcon iconTextCentro) {
		this.iconTextCentro = iconTextCentro;
	}

	public ImageIcon getIconTextDerecha() {
		return iconTextDerecha;
	}

	public void setIconTextDerecha(ImageIcon iconTextDerecha) {
		this.iconTextDerecha = iconTextDerecha;
	}

	public ImageIcon getIconTextJustificado() {
		return iconTextJustificado;
	}

	public void setIconTextJustificado(ImageIcon iconTextJustificado) {
		this.iconTextJustificado = iconTextJustificado;
	}
	
}
