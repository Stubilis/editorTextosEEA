package componentes;



import javax.swing.JTextPane;
import javax.swing.event.MouseInputListener;


public class PanelTexto extends JTextPane implements MouseInputListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelTexto() {
		super();
		this.addMouseListener(this);
		

	   
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(this.getSelectedText());
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(this.getSelectedText());
	}

	@Override
	public void mouseDragged(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	

}
