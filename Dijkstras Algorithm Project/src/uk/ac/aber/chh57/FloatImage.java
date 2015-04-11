package uk.ac.aber.chh57;

public class FloatImage extends java.lang.Object {

	// ************** Constructors *****************************

	// Constructs an empty FloatImage
	public FloatImage() {

	}

	// Constructs a FloatImage of the size specified
	public FloatImage(int w, int h) {

	}

	// Constructs a FloatImage of the size specified from a suitably sized array
	// of floats
	public FloatImage(int w, int h, float[] d) {

	}

	// Constructs a FloatImage of the size specified from a suitably sized array
	// of floats
	public FloatImage(int w, int h, double[] d) {

	}

	// *******************************************************
	
	// **************** Global Variables *********************
	
	private int width, height;
	
	// *******************************************************

	public boolean add(float w) {

	}

	public boolean add(FloatImage fimg) {

	}

	public boolean add(FloatImage fimg, float w) {

	}

	public void add(FloatImage fimg1, FloatImage fimg2) {

	}

	public void convertImage(java.awt.image.BufferedImage bimg) {

	}

	public static void convertImage(java.awt.image.BufferedImage img,
			FloatImage red, FloatImage green, FloatImage blue) {

	}

	public void convolve_x(FloatImage fimg, float[] filter, int m, int scale) {

	}

	public void convolve_y(FloatImage fimg, float[] filter, int m, int scale) {

	}

	public void convolve(float[] filter, int m, int scale) {

	}

	public void convolve(FloatImage fimg, float[][] filter, int m, int n,
			int scale) {

	}

	public void convolve(FloatImage fimg, FloatImage filter, int m, int n,
			int scale) {

	}

	public FloatImage copy() {

	}

	public void copy(FloatImage fimg) {

	}

	public boolean divide(FloatImage fimg, float tol) {

	}

	public void edgeMagnitude(FloatImage dx, FloatImage dy) {

	}

	public boolean exp() {

	}

	public boolean exp(FloatImage fimg) {

	}

	public float get_nocheck(int x, int y) {

	}

	public float get_sym(int x, int y) {

	}

	public float get(int i) {

	}

	public float get(int x, int y) {

	}

	public float[] getData() {

	}

	public int getHeight() {
		return height;
	}

	public java.awt.image.BufferedImage getImage() {

	}

	public int getWidth() {
		return width;
	}

	public void magnitude() {

	}

	public void magnitudeSquared() {

	}

	public boolean multiply(FloatImage fimg) {

	}

	public static java.awt.image.BufferedImage reconvertImage(FloatImage red,
			FloatImage green, FloatImage blue) {

	}

	public float sample(float x, float y) {

	}

	public boolean scale(float w) {

	}

	public void set_nocheck(int i, float v) {
		
	}

	public void set_nocheck(int x, int y, float v) {

	}
	
	public int set(int x, int y, float v){
		// Sets (x,y)=v if (x,y) is within the image
		
		// if (x,y) is within image {
		// (x,y)=v;
		return 1; 
		//}
		// else {
		//return 0;
		// }
		
	}

	public void setSize(int w, int h){
		width = w;
		height = h;
	}
	
	public FloatImage sobelEdge(double thresh){
		
	}
	
	public FloatImage sobelEdgeMag(){
		
	}
}
