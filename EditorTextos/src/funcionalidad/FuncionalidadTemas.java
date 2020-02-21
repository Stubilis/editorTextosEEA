package funcionalidad;

import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


import componentes.EditorTexto;

public class FuncionalidadTemas {
	
	private EditorTexto editorTexto;

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
	
	
	//
	String key ="EEA";
	String creador="EEA";
	
	public FuncionalidadTemas (EditorTexto editorTexto) {
		
		this.editorTexto = editorTexto;

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
		
		mDefaultAcryl.addActionListener(e -> { cambiarTemaAcril(e);});
		mGreenAcryl.addActionListener(e -> { cambiarTemaAcril(e);});
		mLemmonAcryl.addActionListener(e -> { cambiarTemaAcril(e);});
		mRedAcryl.addActionListener(e -> { cambiarTemaAcril(e);});
		
		mDefaultAero.addActionListener(e -> { cambiarTemaAero(e);});
		mGoldAero.addActionListener(e -> { cambiarTemaAero(e);});
		mGreenAero.addActionListener(e -> { cambiarTemaAero(e);});
		
		mDefaultFast.addActionListener(e -> { cambiarTemaFast(e);});
		mDefaultFast.addActionListener(e -> { cambiarTemaFast(e);});
		mGreenFast.addActionListener(e -> { cambiarTemaFast(e);});
		
		mDefaultGraphite.addActionListener(e -> { cambiarTemaGraphite(e);});
		mBlueGraphite.addActionListener(e -> { cambiarTemaGraphite(e);});
		mGreenGraphite.addActionListener(e -> { cambiarTemaGraphite(e);});

		mDefaultSmart.addActionListener(e -> { cambiarTemaSmart(e);});
		mGoldSmart.addActionListener(e -> { cambiarTemaSmart(e);});
		mGreenSmart.addActionListener(e -> { cambiarTemaSmart(e);});
		mBrownSmart.addActionListener(e -> { cambiarTemaSmart(e);});
		mLemmonSmart.addActionListener(e -> { cambiarTemaSmart(e);});
		mGraySmart.addActionListener(e -> { cambiarTemaSmart(e);});
		
		mDefaultAluminium.addActionListener(e -> { 
			  try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
					SwingUtilities.updateComponentTreeUI(editorTexto);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		mDefaultBernstein.addActionListener(e -> { 
			  try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
					SwingUtilities.updateComponentTreeUI(editorTexto);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		mDefaultHifi.addActionListener(e -> { 
			  try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
					SwingUtilities.updateComponentTreeUI(editorTexto);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		mDefaultLuna.addActionListener(e -> { 
			  try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
					SwingUtilities.updateComponentTreeUI(editorTexto);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		mDefaultMcWin.addActionListener(e -> { 
			  try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
					SwingUtilities.updateComponentTreeUI(editorTexto);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		mDefaultMint.addActionListener(e -> { 
			  try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
					SwingUtilities.updateComponentTreeUI(editorTexto);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		mDefaultNoire.addActionListener(e -> { 
			  try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
					SwingUtilities.updateComponentTreeUI(editorTexto);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private void cambiarTemaSmart(ActionEvent e) {
		// TODO Auto-generated method stub
		String tema = "Default";
		if(e.getSource().equals(mDefaultSmart))	tema = "Default";
		if(e.getSource().equals(mGreenSmart))	tema = "Green";
		if(e.getSource().equals(mGoldSmart))	tema = "Gold";
		if(e.getSource().equals(mBrownSmart))	tema = "Brown";
		if(e.getSource().equals(mLemmonSmart))	tema = "Lemmon";
		if(e.getSource().equals(mGraySmart))	tema = "Gray";
		com.jtattoo.plaf.smart.SmartLookAndFeel.setTheme(tema, key, creador);
		  try {
				UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
				SwingUtilities.updateComponentTreeUI(editorTexto);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}

	private void cambiarTemaGraphite(ActionEvent e) {
		// TODO Auto-generated method stub
		String tema = "Default";
		if(e.getSource().equals(mDefaultGraphite))	tema = "Default";
		if(e.getSource().equals(mGreenGraphite))	tema = "Green";
		if(e.getSource().equals(mBlueGraphite))	tema = "Blue";
		com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setTheme(tema, key, creador);
		  try {
				UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
				SwingUtilities.updateComponentTreeUI(editorTexto);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}

	private void cambiarTemaFast(ActionEvent e) {
		// TODO Auto-generated method stub
		String tema = "Default";
		if(e.getSource().equals(mDefaultFast))	tema = "Default";
		if(e.getSource().equals(mGreenFast))	tema = "Green";
		if(e.getSource().equals(mBlueFast))	tema = "Blue";
		com.jtattoo.plaf.fast.FastLookAndFeel.setTheme(tema, key, creador);
		  try {
				UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
				SwingUtilities.updateComponentTreeUI(editorTexto);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}

	private void cambiarTemaAero(ActionEvent e) {
		// TODO Auto-generated method stub
		String tema = "Default";
		if(e.getSource().equals(mDefaultAero))	tema = "Default";
		if(e.getSource().equals(mGreenAero))	tema = "Green";
		if(e.getSource().equals(mGoldAero))	tema = "Gold";
		com.jtattoo.plaf.aero.AeroLookAndFeel.setTheme(tema, key, creador);
		  try {
				UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
				SwingUtilities.updateComponentTreeUI(editorTexto);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}

	private void cambiarTemaAcril(ActionEvent e) {
		
	String tema = "Default";
		
	if(e.getSource().equals(mDefaultAcryl))	tema = "Default";
	if(e.getSource().equals(mGreenAcryl))	tema = "Green";
	if(e.getSource().equals(mLemmonAcryl))	tema = "Lemmon";
	if(e.getSource().equals(mRedAcryl))	tema = "Red";	
	      // setTheme(String themeName, String licenseKey, String logoString)
          com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme(tema, key, creador);
           
           // select the Look and Feel
           try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			SwingUtilities.updateComponentTreeUI(editorTexto);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	
	
	
	

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public EditorTexto getEditorTexto() {
		return editorTexto;
	}

	public void setEditorTexto(EditorTexto editorTexto) {
		this.editorTexto = editorTexto;
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

	public JMenuItem getmDefaultAluminium() {
		return mDefaultAluminium;
	}

	public void setmDefaultAluminium(JMenuItem mDefaultAluminium) {
		this.mDefaultAluminium = mDefaultAluminium;
	}

	public JMenuItem getmDefaultBernstein() {
		return mDefaultBernstein;
	}

	public void setmDefaultBernstein(JMenuItem mDefaultBernstein) {
		this.mDefaultBernstein = mDefaultBernstein;
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

	public JMenuItem getmDefaultHifi() {
		return mDefaultHifi;
	}

	public void setmDefaultHifi(JMenuItem mDefaultHifi) {
		this.mDefaultHifi = mDefaultHifi;
	}

	public JMenuItem getmDefaultLuna() {
		return mDefaultLuna;
	}

	public void setmDefaultLuna(JMenuItem mDefaultLuna) {
		this.mDefaultLuna = mDefaultLuna;
	}

	public JMenuItem getmDefaultMcWin() {
		return mDefaultMcWin;
	}

	public void setmDefaultMcWin(JMenuItem mDefaultMcWin) {
		this.mDefaultMcWin = mDefaultMcWin;
	}

	public JMenuItem getmDefaultMint() {
		return mDefaultMint;
	}

	public void setmDefaultMint(JMenuItem mDefaultMint) {
		this.mDefaultMint = mDefaultMint;
	}

	public JMenuItem getmDefaultNoire() {
		return mDefaultNoire;
	}

	public void setmDefaultNoire(JMenuItem mDefaultNoire) {
		this.mDefaultNoire = mDefaultNoire;
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
	
	
	
}
