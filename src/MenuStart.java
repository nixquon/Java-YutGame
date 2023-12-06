import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuStart extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();

	MenuStart(String title) {
		super(title);

		setSize(600, 400);
		setLocation((screenSize.width - getSize().width) / 2, (screenSize.height - getSize().height) / 2); // center

		setIconImage(new ImageIcon("resource/images/sports_esports_Icon.png").getImage());

		MenuBar mb = new MenuBar();

		Menu mFile = new Menu("File");
		MenuItem miJoin = new MenuItem("Join", new MenuShortcut('N', false));
		MenuItem miExit = new MenuItem("Exit", new MenuShortcut('E', true));

		mFile.add(miJoin);
		mFile.addSeparator();
		mFile.add(miExit);

		Menu mEvent1 = new Menu("Event");
		Menu mEvent2 = new Menu("AddEvent");
		Menu mHelp = new Menu("Help");

		mb.add(mFile);
		mb.add(mEvent1);
		mb.add(mEvent2);
		mb.add(mHelp);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setMenuBar(mb);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MenuStart("Java Project È«Áö¼º");
	}
}
