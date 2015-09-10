import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSlider;


public class GUI {
	
	private final JFrame frame;
	private JPanel contentPane;
	//private final EmbeddedMediaPlayerComponent mpc;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		
//		NativeLibrary.addSearchPath(
//	            RuntimeUtil.getLibVlcLibraryName(), "/Applications/vlc-2.0.0/VLC.app/Contents/MacOS/lib"
//	        );
//	    Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
//		
//		System.load("C:\\Path\\Of\\libvlc.dll");
//		
		frame = new JFrame("MyFirstMediaPlayer");
		frame.setVisible(true);
//		
//		mpc = new EmbeddedMediaPlayerComponent();
//		final EmbeddedMediaPlayer video = mpc.getMediaPlayer();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(67, 11, 296, 181);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setBounds(67, 226, 296, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Import File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File f = new File(frame, "Please select a video to import", true);
				f.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButton.setBounds(0, 0, 69, 20);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(113, 192, 29, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(81, 192, 29, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(144, 192, 29, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(175, 192, 29, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(207, 192, 29, 23);
		contentPane.add(btnNewButton_5);
		
		JSlider slider = new JSlider();
		slider.setBounds(246, 192, 99, 26);
		contentPane.add(slider);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(373, 225, 51, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(369, 192, 55, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(373, 158, 51, 23);
		contentPane.add(btnNewButton_8);
		
		
	    
	   // String[] mediaOptions = {""};
		
		//video.playMedia("sample_video_big_buck_bunny_1_minute.avi", mediaOptions);
	}
}

