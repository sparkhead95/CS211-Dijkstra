package uk.ac.aber.chh57;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class ImagePanel extends javax.swing.JPanel implements
		java.awt.event.MouseListener, java.awt.event.MouseMotionListener,
		javax.swing.Scrollable {

	// ***************** Constructors ***********************
	
	ImagePanel(java.awt.image.BufferedImage img){
		
	}
	
	// **************** Global Variables ********************
	
	public static int VIEW_IMAGE;
	public static int VIEW_EDGES;
	private static final long serialVersionUID = 1L;
	
	// ******************************************************
	public Dimension getPreferredScrollableViewportSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getScrollableBlockIncrement(Rectangle arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean getScrollableTracksViewportHeight() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean getScrollableTracksViewportWidth() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getScrollableUnitIncrement(Rectangle arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void paintComponent(java.awt.Graphics g) {

	}
	
	public void setImage(java.awt.image.BufferedImage img){
		
	}

	public void setSnapper(ISnapper s){
		
	}
	
	public void setViewMode(int vm){
		
	}
}
