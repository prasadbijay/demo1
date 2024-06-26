package Adancejavapractice;
import java.awt.*;
import java.awt.event.*;

   			class DemoJava extends Frame implements Runnable {
		    private Thread thread;
		    private Image image;
		    private int delay;
		    private boolean showImage;

		    public DemoJava() {
		        // Set the title of the frame
		        setTitle("This home page: ");

		        // Load the image
		        image = Toolkit.getDefaultToolkit().getImage("car.png");

		        // Initialize delay and showImage flag
		        delay = 200; // milliseconds
		        showImage = true;

		        // Set frame properties
		        setSize(300, 300);
		        setLayout(null);
		        setVisible(true);

		        // Create and start the thread
		        thread = new Thread(this);
		        thread.start();
		    }

		    public void run() {
		        while (true) {
		            try {
		                // Toggle the showImage flag
		                showImage = !showImage;

		                // Repaint the frame to show/hide the image
		                repaint();

		                // Sleep for the specified delay
		                Thread.sleep(delay);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    }

		    public void paint(Graphics g) {
		        // Call the paint method of the parent class
		        super.paint(g);

		        // Draw the image if showImage is true
		        if (showImage) {
		            // Adjust the position and size of the image as needed
		            g.drawImage(image, 100, 100, 100, 100, this);
		        }
		    }

		    public static void main(String[] args) {
		        new DemoJava();
		    }
		


	}


