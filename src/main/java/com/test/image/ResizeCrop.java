/*
 * Created on Mar 23, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.image;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.geom.Area;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ResizeCrop {

    public static void main(String[] args) {
    	System.out.println("2");
        new ResizeCrop();
    }

    public ResizeCrop() {
    	System.out.println("3");
        EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
            	System.out.println("31");
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }
                System.out.println("32");
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(new BorderLayout());
                System.out.println("33");
                frame.getContentPane().add(new CropPane());
                frame.pack();
                System.out.println("34");
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                System.out.println("35");
            }
        });
    }

    public class CropPane extends JPanel implements MouseMotionListener {
    	
        private BufferedImage background;
        private Rectangle cropBounds;

        public CropPane() {
        	System.out.println("4");
            try {
            	System.out.println("41");
                background = ImageIO.read(new File("D:\\IMG00373.jpg"));
            } catch (IOException exp) {
                exp.printStackTrace();
            }
            System.out.println("42");
            MouseHandler handler = new MouseHandler();
            MouseMotionListener ml = null;
            System.out.println("43");
            addMouseListener(handler);
            //cast
            System.out.println("44");
            addMouseMotionListener(this);
        }

        //@Override
        public Dimension getPreferredSize() {
        	System.out.println("5");
            return new Dimension(background.getWidth(), background.getHeight());
        }

        protected Rectangle getCropBounds() {
        	System.out.println("6");
            Rectangle actualBounds = null;
            if (cropBounds != null) {
                int x = cropBounds.x;
                int y = cropBounds.y;
                int width = cropBounds.width;
                int height = cropBounds.height;

                if (width < 0) {
                    x += width;
                    width -= (width * 2);
                }
                if (height < 0) {
                    y += height;
                    height -= (height * 2);
                }

                actualBounds = new Rectangle(x, y, width, height);
                System.out.println(actualBounds);
            }
            return actualBounds;
        }

        //@Override
        protected void paintComponent(Graphics g) {
        	System.out.println("7");
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g.create();
            if (background != null) {
                int x = (getWidth() - background.getWidth()) / 2;
                int y = (getHeight() - background.getHeight()) / 2;
                g2d.drawImage(background, x, y, this);
            }
            System.out.println("8");
            Rectangle drawCrop = getCropBounds();
            if (drawCrop != null) {

                Area area = new Area(new Rectangle(0, 0, getWidth() - 1, getHeight() - 1));
                area.subtract(new Area(drawCrop));

                Color color = UIManager.getColor("List.selectionBackground");
                g2d.setColor(color);
                Composite composite = g2d.getComposite();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
                g2d.fill(area);
                g2d.setComposite(composite);
                g2d.draw(area);
            }
        }

        public class MouseHandler extends MouseAdapter {
        	
            //@Override
            public void mouseReleased(MouseEvent e) {
            	System.out.println("9");
                cropBounds = null;
                repaint();
            }

            //@Override
            public void mousePressed(MouseEvent e) {
                cropBounds = new Rectangle();
                cropBounds.setLocation(e.getPoint());
                repaint();
            }

            //@Override
            public void mouseDragged(MouseEvent e) {
                if (cropBounds != null) {
                    Point p = e.getPoint();
                    int width = p.x - cropBounds.x;
                    int height = p.y - cropBounds.y;
                    cropBounds.setSize(width, height);
                    repaint();
                }
            }
        }

		/* (non-Javadoc)
		 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
		 */
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
		 */
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
    }
}
