/*  
 *  Copyright (C) 2010  Luca Wehrstedt
 *
 *  This file is released under the GPLv2
 *  Read the file 'COPYING' for more information
 */

 package pucrs.s2b.pong;
 
import javax.swing.JFrame;
import javax.swing.Timer;

public class PongWindow extends JFrame {
	public PongWindow () {
		super ();
		
		setTitle ("Pong");
		setSize (640, 480);
		
		Pong content = new Pong (Player.KEYBOARD, Player.CPU_EASY);
		content.acceleration = true;
		getContentPane ().add (content);
		
		addMouseListener (content);
		addKeyListener (content);
		
		Timer timer = new Timer (20, content);
		timer.start ();
	}
}
