package componentes;

import java.awt.BorderLayout;
import java.awt.ScrollPane;

import javax.swing.JPanel;




public class Lamina extends JPanel{

	private static final long serialVersionUID = 4606338651734409530L;
	private BarraHerramientas barraHerramientas;
	private BorderLayout layout;
	private PanelTexto jTextPane;
	private ScrollPane spScroll;
	private MenuEmergente menuEmergente;
	
	
	public Lamina() {
		
		
		menuEmergente = new MenuEmergente();
		spScroll = new ScrollPane();
		jTextPane = new PanelTexto();
		jTextPane.setComponentPopupMenu(menuEmergente);
		
		//JTextPane se inicia vacio 
		jTextPane.setText("");
		
		spScroll.add(jTextPane);
		//
		layout = new BorderLayout();
		this.setLayout(layout);
		barraHerramientas = new BarraHerramientas();
		this.add(barraHerramientas, BorderLayout.NORTH);
		this.add(spScroll);
		
	}


	public BarraHerramientas getBarraHerramientas() {
		return barraHerramientas;
	}


	public void setBarraHerramientas(BarraHerramientas barraHerramientas) {
		this.barraHerramientas = barraHerramientas;
	}


	public PanelTexto getjTextPane() {
		return jTextPane;
	}


	public void setjTextPane(PanelTexto jTextPane) {
		this.jTextPane = jTextPane;
	}


	public ScrollPane getSpScroll() {
		return spScroll;
	}


	public void setSpScroll(ScrollPane spScroll) {
		this.spScroll = spScroll;
	}


	public MenuEmergente getMenuEmergente() {
		return menuEmergente;
	}


	public void setMenuEmergente(MenuEmergente menuEmergente) {
		this.menuEmergente = menuEmergente;
	}




	
	

}
