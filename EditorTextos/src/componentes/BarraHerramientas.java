package componentes;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class BarraHerramientas extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
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
		private JColorChooser jccElegirColorFuente;
		
		private JButton jbEspanyol;
		private JButton jbIngles;
		private JButton jbFrances;
		
		private JToggleButton jbCorreccion;
		
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
		private ImageIcon iconBanderaEspanya;
		private ImageIcon iconBanderaFrancia;
		private ImageIcon iconBanderaInglesa;
		private ImageIcon iconAnyadirImg;
		
		
		public BarraHerramientas() {
			//Iconos
			iconAbrir = new ImageIcon("./multimedia/images/abrir.png");
			iconGuardar = new ImageIcon("./multimedia/images/guardar.png");
			iconSalir = new ImageIcon("./multimedia/images/cerrar.png");
			iconNegrita = new ImageIcon("./multimedia/images/estiloneg.png");
			iconCursiva = new ImageIcon("./multimedia/images/estilocur.png");
			iconSubrayado = new ImageIcon("./multimedia/images/estilosub.png");
			iconTextIzq = new ImageIcon("./multimedia/images/alinearizq.png");
			iconTextCentro = new ImageIcon("./multimedia/images/alinearcentro.png");
			iconTextDerecha = new ImageIcon("./multimedia/images/alinearder.png");
			iconTextJustificado = new ImageIcon("./multimedia/images/alinearjust.png");
			iconColorFuente = new ImageIcon("./multimedia/images/colorfuente.png");
			iconBanderaEspanya = new ImageIcon("./multimedia/images/banderaespanya.png");
			iconBanderaFrancia = new ImageIcon("./multimedia/images/banderafrancia.png");
			iconBanderaInglesa = new ImageIcon("./multimedia/images/banderainglesa.png");
			iconAnyadirImg = new ImageIcon("./multimedia/images/anyadirimagen.png");
			
			
			// Inicializacion 
			
			jbAbrir = new JButton(iconAbrir);
			jbAbrir.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_abrir"));
			jbGuardar = new JButton(iconGuardar);
			jbGuardar.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_guardar"));
			jbSalir = new JButton(iconSalir);
			jbSalir.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_salir"));
			
			cbTamanyoLetra = new JComboBox<String>();
			cbTamanyoLetra.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu5"));
			Dimension tamanyoMax = new Dimension(50, 50);
			cbTamanyoLetra.setMaximumSize(tamanyoMax);

			jtbNegrita = new JToggleButton(iconNegrita);
			jtbNegrita.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_negrita"));
			jtbCursiva = new JToggleButton(iconCursiva);
			jtbCursiva.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_cursiva"));
			jtbSubrayado = new JToggleButton(iconSubrayado);
			jtbSubrayado.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_subrayado"));
			
			jbTextIzq = new JButton(iconTextIzq);
			jbTextIzq.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_izquierda"));
			jbTextCentro = new JButton(iconTextCentro);
			jbTextCentro.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_centro"));
			jbTextDerecha = new JButton(iconTextDerecha);
			jbTextDerecha.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_derecha"));
			jbTextJustificado = new JButton(iconTextJustificado);
			jbTextJustificado.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_justificado"));
			cbFuente = new JComboBox<String>();
			cbFuente.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu2"));
			Dimension tamanyoMaxCBF = new Dimension(250, 50);
			cbFuente.setMaximumSize(tamanyoMaxCBF);
			
			jbAnyadirImg = new JButton(iconAnyadirImg);
			jbAnyadirImg.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_anyadir_img"));
			
			jbCambiarColorFuente = new JButton(iconColorFuente);
			jbCambiarColorFuente.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_color"));
			jccElegirColorFuente = new JColorChooser();
			
			jbEspanyol = new JButton(iconBanderaEspanya);
			jbEspanyol.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_es"));
			jbFrances = new JButton(iconBanderaFrancia);
			jbFrances.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_en"));
			jbIngles = new JButton(iconBanderaInglesa);
			jbIngles.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_menu_fr"));
			
			jbCorreccion = new JToggleButton(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_boton_corregir"));
			jbCorreccion.setToolTipText(ResourceBundle.getBundle("resources.Etiquetas").getString("tag_boton_corregir"));
			//
			
			//lista de todas las fuentes instaladas
			
			String listaFuentes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
			for (int i = 0; i < listaFuentes.length; i++) {	
			cbFuente.addItem(listaFuentes[i]);
			}
			
			cbFuente.setSelectedItem("Arial");
			//lista tamanyos letra
			String listaTamanyo[] = new String[72];
			for (int i = 1; i < listaTamanyo.length; i++) {	
				listaTamanyo[i-1]=String.valueOf(i);
			}
			for (int i = 0; i < listaTamanyo.length; i++) {	
				cbTamanyoLetra.addItem(listaTamanyo[i]);
			}
			cbTamanyoLetra.setSelectedIndex(11); //inicio tamanyo 12	
			
			
			//
			this.addSeparator();
			this.add(jbAbrir);
			this.add(jbGuardar);
			this.add(jbSalir);
			this.addSeparator();
			this.add(cbFuente);	
			this.addSeparator();
			this.add(jtbNegrita);
			this.add(jtbCursiva);
			this.add(jtbSubrayado);
			this.add(jbCambiarColorFuente);
			this.add(jbTextIzq);
			this.add(jbTextCentro);
			this.add(jbTextDerecha);
			this.add(jbTextJustificado);
			this.add(jbAnyadirImg);
			this.addSeparator();
			this.add(cbTamanyoLetra);
			this.addSeparator();
			this.add(jbEspanyol);
			this.add(jbIngles);
			this.add(jbFrances);
			this.addSeparator();
			this.add(jbCorreccion);
			
			this.setFloatable(false);
			
		}

		public JButton getJbAnyadirImg() {
			return jbAnyadirImg;
		}

		public void setJbAnyadirImg(JButton jbAnyadirImg) {
			this.jbAnyadirImg = jbAnyadirImg;
		}

		public void setJbSalir(JButton jbSalir) {
			this.jbSalir = jbSalir;
		}

		public JButton getJbAbrir() {
			return jbAbrir;
		}

		public void setJbAbrir(JButton jbAbrir) {
			this.jbAbrir = jbAbrir;
		}

		public JButton getJbGuardar() {
			return jbGuardar;
		}

		public void setJbGuardar(JButton jbGuardar) {
			this.jbGuardar = jbGuardar;
		}

		public JToggleButton getJtbNegrita() {
			return jtbNegrita;
		}

		public void setJtbNegrita(JToggleButton jtbNegrita) {
			this.jtbNegrita = jtbNegrita;
		}

		public JToggleButton getJtbCursiva() {
			return jtbCursiva;
		}

		public void setJtbCursiva(JToggleButton jtbCursiva) {
			this.jtbCursiva = jtbCursiva;
		}

		public JToggleButton getJtbSubrayado() {
			return jtbSubrayado;
		}

		public void setJtbSubrayado(JToggleButton jtbSubrayado) {
			this.jtbSubrayado = jtbSubrayado;
		}

		public JButton getJbTextIzq() {
			return jbTextIzq;
		}

		public void setJbTextIzq(JButton jbTextIzq) {
			this.jbTextIzq = jbTextIzq;
		}

		public JButton getJbTextCentro() {
			return jbTextCentro;
		}

		public void setJbTextCentro(JButton jbTextCentro) {
			this.jbTextCentro = jbTextCentro;
		}

		public JButton getJbTextDerecha() {
			return jbTextDerecha;
		}

		public void setJbTextDerecha(JButton jbTextDerecha) {
			this.jbTextDerecha = jbTextDerecha;
		}

		public JButton getJbTextJustificado() {
			return jbTextJustificado;
		}

		public void setJbTextJustificado(JButton jbTextJustificado) {
			this.jbTextJustificado = jbTextJustificado;
		}

		public JComboBox<String> getCbFuente() {
			return cbFuente;
		}

		public void setCbFuente(JComboBox<String> cbFuente) {
			this.cbFuente = cbFuente;
		}

		public JComboBox<String> getCbTamanyoLetra() {
			return cbTamanyoLetra;
		}

		public void setCbTamanyoLetra(JComboBox<String> cbTamanyoLetra) {
			this.cbTamanyoLetra = cbTamanyoLetra;
		}

		public JButton getJbCambiarColorFuente() {
			return jbCambiarColorFuente;
		}

		public void setJbCambiarColorFuente(JButton jbCambiarColorFuente) {
			this.jbCambiarColorFuente = jbCambiarColorFuente;
		}

		public JColorChooser getJccElegirColorFuente() {
			return jccElegirColorFuente;
		}

		public void setJccElegirColorFuente(JColorChooser jccElegirColorFuente) {
			this.jccElegirColorFuente = jccElegirColorFuente;
		}

		public JButton getJbSalir() {
			// TODO Auto-generated method stub
			return this.jbSalir;
		}

		public JButton getJbEspanyol() {
			return jbEspanyol;
		}

		public void setJbEspanyol(JButton jbEspanyol) {
			this.jbEspanyol = jbEspanyol;
		}

		public JButton getJbIngles() {
			return jbIngles;
		}

		public void setJbIngles(JButton jbIngles) {
			this.jbIngles = jbIngles;
		}

		public JButton getJbFrances() {
			return jbFrances;
		}

		public void setJbFrances(JButton jbFrances) {
			this.jbFrances = jbFrances;
		}

		public JToggleButton getJbCorreccion() {
			return jbCorreccion;
		}

		public void setJbCorreccion(JToggleButton jbCorreccion) {
			this.jbCorreccion = jbCorreccion;
		}

		
		
}
