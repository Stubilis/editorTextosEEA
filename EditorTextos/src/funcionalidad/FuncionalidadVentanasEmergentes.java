package funcionalidad;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.EditorKit;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.rtf.RTFEditorKit;

import componentes.EditorTexto;
import componentes.PanelTexto;

public class FuncionalidadVentanasEmergentes {
	
	private EditorTexto editorTexto;
	
	private PanelTexto jTextPane;
	
	private JButton jbAbrir;
	private JButton jbGuardar;
	private JButton jbSalir;
	
	private JButton jbAnyadirImg;
	
	private JMenuItem mAbrir;
	private JMenuItem mAbrirHTML;
	private JMenuItem mAbrirRTF;
	private JMenuItem mGuardarSinFormato;
	private JMenuItem mGuardarHTML;
	private JMenuItem mGuardarRTF;
	private JMenuItem mSalir;
	
	private JMenuItem mAcercaDe;
	private JButton jbCambiarColorFuente;
	private JMenuItem mColorFuente;
	
	//
	String pregunta;
	String titVentana;
	
	
	public FuncionalidadVentanasEmergentes (EditorTexto editorTexto) {
		
		this.editorTexto = editorTexto;
		
		
		this.jTextPane = editorTexto.getLamina().getjTextPane();
		
		this.jbAbrir = editorTexto.getLamina().getBarraHerramientas().getJbAbrir();
		this.jbGuardar = editorTexto.getLamina().getBarraHerramientas().getJbGuardar();
		this.jbSalir = editorTexto.getLamina().getBarraHerramientas().getJbSalir();
		
		this.jbAnyadirImg = editorTexto.getLamina().getBarraHerramientas().getJbAnyadirImg();
		
		this.mAbrir = editorTexto.getMenuSuperior().getmAbrir();
		this.mAbrirHTML = editorTexto.getMenuSuperior().getmAbrirHTML();
		this.mAbrirRTF = editorTexto.getMenuSuperior().getmAbrirRTF();
		
		this.mGuardarSinFormato = editorTexto.getMenuSuperior().getmGuardar();
		this.mGuardarHTML = editorTexto.getMenuSuperior().getmGuardarHTML();
		this.mGuardarRTF = editorTexto.getMenuSuperior().getmGuardarRTF();
		
		this.mSalir = editorTexto.getMenuSuperior().getmSalir();
		
		this.jbCambiarColorFuente =editorTexto.getLamina().getBarraHerramientas().getJbCambiarColorFuente();
		this.mColorFuente = editorTexto.getMenuSuperior().getmColorFuente();
		
		this.mAcercaDe = editorTexto.getMenuSuperior().getmAcercaDe();
		
		jbAbrir.addActionListener(e -> {abrirFichero(); });	
		jbGuardar.addActionListener(e -> {guardarFichero(); });	
		jbSalir.addActionListener(e -> {salir(e);});
		
		mAbrir.addActionListener(e -> {abrirFichero(); });	
		mAbrirHTML.addActionListener(e -> {abrirHTML(); });	
		mAbrirRTF.addActionListener(e -> {abrirRTF(); });	
		
		mGuardarSinFormato.addActionListener(e -> {guardarFichero(); });	
		mGuardarHTML.addActionListener(e -> {guardarHTML(); });	
		mGuardarRTF.addActionListener(e -> {guardarRTF(); });	
		
		
		mSalir.addActionListener(e -> {salir(e);});
		
		jbCambiarColorFuente.addActionListener(e -> {cambiarColorFuente(e); });	
		mColorFuente.addActionListener(e -> {cambiarColorFuente(e); });	
		
		mAcercaDe.addActionListener(e ->{mostrarInformacion(e); });
		
		jbAnyadirImg.addActionListener(e -> { insertarImg();});
	}
	
	
	private void insertarImg() {
		
		File archivoImg = elegirImg();
		if (archivoImg != null) {
		ImageIcon img = new ImageIcon(archivoImg.toString());	
		jTextPane.insertIcon(img);
		}
	}
	
	private File elegirImg() {
		// TODO Auto-generated method stub
		Locale locale = editorTexto.getLocale();
		JFileChooser explorador = new JFileChooser();
		String msg = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_buscar_img");
		String ok = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_abrir_abrir");
		explorador.setDialogTitle(msg);
		explorador.setApproveButtonText(ok);
		
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("png", "jpg", "gif");
		explorador.setFileFilter(filtro);
		 if (explorador.showOpenDialog(editorTexto) == JFileChooser.APPROVE_OPTION) {
			return explorador.getSelectedFile();
		}
		else {
			return null;
		}
	
	}
	
	

	private void guardarFichero() {
		
		Locale locale = editorTexto.getLocale();
		
		JFileChooser explorador = new JFileChooser();
		
		String msg = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_guardar_guardar");
		String ok = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_guardar_guardar");
		
		explorador.setDialogTitle(msg);
		explorador.setApproveButtonText(ok);
		if (JFileChooser.APPROVE_OPTION == explorador.showSaveDialog(null))
		{
		String ruta = explorador.getSelectedFile().getPath();
		try
		{
		PrintWriter writer = new PrintWriter(ruta);
		writer.print(this.jTextPane.getText());
		writer.close();
		}catch (Exception e2)
		{
		System.out.println(e2.getMessage());
		}
		}
	}
	
	
	private void abrirFichero() {
		Locale locale = editorTexto.getLocale();
		
		JFileChooser explorador = new JFileChooser();
		String msg = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_abrir_abrir");
		String ok = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_abrir_abrir");
		
		explorador.setDialogTitle(msg);
		explorador.setApproveButtonText(ok);
		
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("TXT","txt");

		explorador.setFileFilter(filtro);
		if (explorador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
		String ruta = explorador.getSelectedFile().getPath();
		try
		{
		BufferedReader reader = new BufferedReader(new FileReader(ruta));
		String textoTotal="";
		String linea = reader.readLine();
		while (linea != null)
		{
		textoTotal = textoTotal + linea + System.getProperty("line.separator");
		linea = reader.readLine();
		}
		this.jTextPane.setText(textoTotal);
		reader.close();
		}catch (Exception e1)
		{
		System.out.println(e1.getMessage());
		}
		}
	
	}
	private void abrirHTML() {
		// TODO Auto-generated method stub
		this.jTextPane.setText("");
		Locale locale = editorTexto.getLocale();
		JFileChooser explorador = new JFileChooser();
		String msg = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_abrir_abrir");
		String ok = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_abrir_abrir");
		
		explorador.setDialogTitle(msg);
		explorador.setApproveButtonText(ok);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("HTML","html");
		explorador.setFileFilter(filtro);
		if (explorador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
		String ruta = explorador.getSelectedFile().getPath();
		try
		{
		// read html from file
		this.jTextPane.setContentType("text/html");
		EditorKit rtfKit =  this.jTextPane.getEditorKitForContentType("text/html");
		rtfKit.read(new FileReader(ruta), this.jTextPane.getDocument(), 0);
		rtfKit = null;

		// convert to text
				EditorKit txtKit =  this.jTextPane.getEditorKitForContentType("text/plain");
				Writer writer = new StringWriter();
				txtKit.write(writer,this.jTextPane.getDocument(), 0,  this.jTextPane.getDocument().getLength());
				writer.close();
	
		}catch (Exception e1)
		{
		System.out.println(e1.getMessage());
		}
		}
	
	}
	
		public void abrirRTF() {
		
		this.jTextPane.setText("");
		
		Locale locale = editorTexto.getLocale();
		JFileChooser explorador = new JFileChooser();
		String msg = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_abrir_abrir");
		String ok = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_abrir_abrir");
		
		explorador.setDialogTitle(msg);
		explorador.setApproveButtonText(ok);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("doc","rtf");
		explorador.setFileFilter(filtro);
		if (explorador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
		String ruta = explorador.getSelectedFile().getPath();
		try
		{
		// read rtf from file
		this.jTextPane.setContentType("text/rtf");
		EditorKit rtfKit =  this.jTextPane.getEditorKitForContentType("text/rtf");
		rtfKit.read(new FileReader(ruta), this.jTextPane.getDocument(), 0);
		rtfKit = null;

		// convert to text
				EditorKit txtKit =  this.jTextPane.getEditorKitForContentType("text/plain");
				Writer writer = new StringWriter();
				txtKit.write(writer,this.jTextPane.getDocument(), 0,  this.jTextPane.getDocument().getLength());
				writer.close();
	
		}catch (Exception e1)
		{
		System.out.println(e1.getMessage());
		}
		}
	
	}

	private void salir(ActionEvent e) {
		// TODO Auto-generated method stub
		Locale locale = editorTexto.getLocale();		
		pregunta = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_salir_pregunta");
		titVentana = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_salir_titulo");
		int	respuesta =JOptionPane.showConfirmDialog(null,pregunta,titVentana,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
		if(respuesta == JOptionPane.YES_OPTION) {
			 editorTexto.dispose();
		 }
	}
		 
	private void cambiarColorFuente(ActionEvent e) {
		Locale locale = editorTexto.getLocale();
		JColorChooser ventanaColor = new JColorChooser();
		ventanaColor.setLocale(locale);
		Color color = JColorChooser.showDialog(null, ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_tit_color"), Color.black);
		new StyledEditorKit.ForegroundAction("cambiarColor", color).actionPerformed(e);
	}
	private void mostrarInformacion(ActionEvent e) {
		// TODO Auto-generated method stub
		 Locale locale = editorTexto.getLocale();
		 String mensaje =  ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_msg_acercad");
		 String titulo =ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_tit_acercad");
		 new JOptionPane();
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void guardarHTML() {
		Locale locale = editorTexto.getLocale();
		
		JFileChooser explorador = new JFileChooser();
		
		String msg = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_guardar_guardar");
		String ok = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_guardar_guardar");
		
		explorador.setDialogTitle(msg);
		explorador.setApproveButtonText(ok);
		if (JFileChooser.APPROVE_OPTION == explorador.showSaveDialog(null))
		{
		String filename = explorador.getSelectedFile().toString();
			   if (!filename .endsWith(".html"))  filename += ".html";
			   
		StyledDocument doc = this.jTextPane.getStyledDocument();
		HTMLEditorKit kit = new HTMLEditorKit();
		BufferedOutputStream out;
		
		String ruta = explorador.getSelectedFile().getPath();
		try
		{	
		out = new BufferedOutputStream( new FileOutputStream(ruta));
		kit.write(out, doc, doc.getStartPosition().getOffset(), doc.getLength());
		out.close();
		
		}catch (Exception e2)
		{
		System.out.println(e2.getMessage());
		}
		}
		
	}
	
	public void guardarRTF() {
		
		Locale locale = editorTexto.getLocale();
		
		JFileChooser explorador = new JFileChooser();
		
		String msg = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_guardar_guardar");
		String ok = ResourceBundle.getBundle("resources.Etiquetas",locale).getString("tag_guardar_guardar");
		
		explorador.setDialogTitle(msg);
		explorador.setApproveButtonText(ok);
		if (JFileChooser.APPROVE_OPTION == explorador.showSaveDialog(null))
		{
		StyledDocument doc = this.jTextPane.getStyledDocument();
		RTFEditorKit kit = new RTFEditorKit();
		BufferedOutputStream out;
		String ruta = explorador.getSelectedFile().getPath();
		try
		{	
		out = new BufferedOutputStream( new FileOutputStream(ruta));
		kit.write(out, doc, doc.getStartPosition().getOffset(), doc.getLength());
		out.close();
		
		}catch (Exception e2)
		{
		System.out.println(e2.getMessage());
		}
		}
		
	}
	
	
			

}
