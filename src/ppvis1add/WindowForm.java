package ppvis1add;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class WindowForm {
	public static Display display = new Display();
	public static RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
	public static Shell shell2 = new Shell(display, SWT.SHELL_TRIM);
	
	public void WindowConfig(String name) {
	     rowLayout.marginLeft = 10;
	     rowLayout.marginTop = 15;
	     rowLayout.marginRight = 15;
	     rowLayout.marginBottom = 25;
	     rowLayout.spacing = 5;
	     shell2.setText(name);
	     shell2.setLayout(rowLayout);
	 }
	
	 public void WindowOpen() {
	     int ShellWidth = 325;
	     int ShellHeight = 325; //375
	   
	     shell2.setSize(ShellWidth, ShellHeight);
	     shell2.open();
	     while (!shell2.isDisposed()) {
	         if (!display.readAndDispatch()) {
	             display.sleep();
	         }
	     }
	     display.dispose();
	 }
	 public static void Error(String ErrorNumber, String ErrorMessage) {
	     MessageBox mb = new MessageBox(shell2, SWT.ERROR | SWT.OK);
	     mb.setText(ErrorNumber);
	     mb.setMessage(ErrorMessage);
	     mb.open();
	 }
}
