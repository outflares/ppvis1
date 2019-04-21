package ppvis1add;

import static ppvis1add.WindowForm.display;
import static ppvis1add.WindowForm.shell2;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

//import ppvis1add.Group;
import ppvis1add.WindowForm;

public class Group  {

	static Table table;
    static int x1;
    static int y1;
    static int x2;
    static int y2;
    static int width;
    static int height;
    public static volatile boolean TaskNotDone = true;
    static Thread thread1;

	
    public static Thread createThread1(Display display) {
		return new Thread(()-> {
			while (!Thread.currentThread().isInterrupted()) {
				while (TaskNotDone) {
					try {
						display.syncExec(() -> {
							
				    			TableItem item = table.getItem(y1);
				    			String txt = item.getText(x1);
				    			item.setText(x1, "");
				    			if(y1==height-1) {y1=0;}
				    			else {y1++;}
				    			TableItem item2 = table.getItem(y1);
				    			item2.setText(x1, txt);
				    		
				    			TableItem item4 = table.getItem(y2);
				    			String txt2 = item4.getText(x2);
				    			item4.setText(x2, "");
				    			if(y2==height-1) {y2=0;}
				    			else {y2++;}
				    			TableItem item5 = table.getItem(y2);
				    			item5.setText(x2, txt2);
				    	
							try {
                                Thread.sleep(300);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
                            }
						});
						if (!TaskNotDone) {
                            break;
                        }
						////////////
						display.syncExec(() -> {
							TableItem item = table.getItem(y1);
			    			String txt = item.getText(x1);
			    			item.setText(x1, "");
			    			if(y1==height-1) {y1=0;}
			    			else {y1++;}
			    			TableItem item2 = table.getItem(y1);
			    			item2.setText(x1, txt);
			    			
			    			TableItem item4 = table.getItem(y2);
			    			String txt2 = item4.getText(x2);
			    			item4.setText(x2, "");
			    			if(y2==height-1) {y2=0;}
			    			else {y2++;}
			    			TableItem item5 = table.getItem(y2);
			    			item5.setText(x2, txt2);
			    			
			    			try {
                                Thread.sleep(300);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
                            }
						});
						if (!TaskNotDone) {
                            break;
                        }
						////////////
						display.syncExec(() -> {
							TableItem item3 = table.getItem(y1);
				    		String txt = item3.getText(x1);
				    		item3.setText(x1,"");
				    		if (x1==width-1) {x1=0;}
				    		else {x1++;}
				    		item3.setText(x1,txt);
				    		
				    		TableItem item6 = table.getItem(y2);
				    		String txt2 = item6.getText(x2);
				    		item6.setText(x2,"");
				    		if (x2==width-1) {x2=0;}
				    		else {x2++;}
				    		item6.setText(x2,txt2);
				    		
				    		try {
                                Thread.sleep(300);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
                            }
						});
						if (!TaskNotDone) {
                            break;
                        }
						
						Thread.sleep(100);
					}catch(InterruptedException e){
						System.out.println("Exception handled"); 
						e.printStackTrace();
						Thread.currentThread().interrupt();
					}
				}
			}
		});
		
	}
    
    /*
	public static Thread createThread1(Display display) {
		return new Thread(()-> {
			while (!Thread.currentThread().isInterrupted()) {
				while (TaskNotDone == true) {
					try {
						display.syncExec(() -> {
							for(int i=0;i<2;i++) {
				    			TableItem item = table.getItem(y1);
				    			String txt = item.getText(x1);
				    			item.setText(x1, "");
				    			if(y1==height-1) {y1=0;}
				    			else {y1++;}
				    			TableItem item2 = table.getItem(y1);
				    			item2.setText(x1, txt);
							}
				    		
							TableItem item3 = table.getItem(y1);
				    		String txt = item3.getText(x1);
				    		item3.setText(x1,"");
				    		if (x1==width-1) {x1=0;}
				    		else {x1++;}
				    		item3.setText(x1,txt);
				    		
				    		
							for(int i=0;i<2;i++) {
				    			TableItem item4 = table.getItem(y2);
				    			String txt2 = item4.getText(x2);
				    			item4.setText(x2, "");
				    			if(y2==height-1) {y2=0;}
				    			else {y2++;}
				    			TableItem item5 = table.getItem(y2);
				    			item5.setText(x2, txt2);
							}

				    		TableItem item6 = table.getItem(y2);
				    		String txt2 = item6.getText(x2);
				    		item6.setText(x2,"");
				    		if (x2==width-1) {x2=0;}
				    		else {x2++;}
				    		item6.setText(x2,txt2);
				    	
							try {
                                Thread.sleep(700);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Group.class.getName()).log(Level.SEVERE, null, ex);
                            }
						});
						if (TaskNotDone != true) {
                            break;
                        }					
					
						Thread.sleep(50);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		});
		
	}
	*/
	
public static void CreateGroup6() {
		
		Composite bigTable = new Composite(shell2, SWT.NONE);
        bigTable.setLayout(new RowLayout(SWT.VERTICAL));
        
        Label btLabel1 = new Label(bigTable, SWT.NONE);
        btLabel1.setText("Num of columns (max 30): ");
        final Text text1 = new Text(bigTable, SWT.BORDER);
        
        Label btLabel2 = new Label(bigTable, SWT.NONE);
        btLabel2.setText("Num of rows (max 35): ");
        final Text text2 = new Text(bigTable, SWT.BORDER);
		
		final Button buttonCreate = new Button(bigTable, SWT.PUSH);
	    buttonCreate.setText(" Create ");
	    
	    final Button buttonStart = new Button(bigTable, SWT.NONE);
	    buttonStart.setText("START");
	    RowData rd = new RowData();
	    rd.width = 100;
	    buttonStart.setLayoutData(rd);
	    
	    final Button buttonStop = new Button(bigTable, SWT.NONE);
	    buttonStop.setText("STOP");
	    buttonStop.setLayoutData(rd);
	    	    
	    buttonCreate.addSelectionListener(new SelectionAdapter() {
	    	@Override
            public void widgetSelected(SelectionEvent arg0) {
	    		String empty = "0";
	    		if (text1.getText()=="" || text1.getText().equals(empty) || text2.getText()=="" || text2.getText().equals(empty)) {
	    			WindowForm.Error("Error 003", "Write proper sizes in!");
	    		}
	    		else {
	    			table = new Table(bigTable, SWT.MULTI | SWT.BORDER| SWT.FULL_SELECTION);
	    			table.setLinesVisible(true);
	    			width = Integer.parseInt(text1.getText()); //columns
	    			height = Integer.parseInt(text2.getText()); //rows
	    		
	    			final TableItem[] items = new TableItem[height];
	    			for (int i = 0; i < width; i++) { 
	    				new TableColumn(table, SWT.NONE).setWidth(50); 
        				}
	    			for (int i = 0; i < height; i++) { 
	    				items[i] = new TableItem(table, SWT.NONE); 
	    				table.pack();
	    				shell2.pack();
        				}
	    			
	    			//for (int i=0; i<2;i++) {
	    				x1 = (int)(Math.random()*width);
	    				System.out.println("x1 = "+x1);
	    				y1 = (int)(Math.random()*height);
	    				System.out.println("y1 = "+y1);
	    				TableItem item1 = table.getItem(y1);
	    				item1.setText(x1, "check");
	    				
	    				x2 = (int)(Math.random()*width);
	    				System.out.println("x2 = "+x2);
	    				y2 = (int)(Math.random()*height);
	    				System.out.println("y2 = "+y2);
	    				TableItem item2 = table.getItem(y2);
	    				item2.setText(x2, "check");
	    			//}
	    			
	    		}
	    	}
	    });
	    
	    buttonStart.addSelectionListener(new SelectionAdapter() {
	    	      	    	    	
	    	@Override
            public void widgetSelected(SelectionEvent arg0) {
	    		
	    		TaskNotDone = true;
                thread1 = createThread1(display);
                thread1.setDaemon(true);
                thread1.start();  	
	    	}
	    	
	    	
	    });

	    buttonStop.addSelectionListener(new SelectionAdapter() {
			@Override
            public void widgetSelected(SelectionEvent e) {
			   	TaskNotDone = false;
			   	try { 
		            thread1.interrupt(); 
		        } 
		        catch (Exception e1) { 
		            System.out.println("Exception handled"); 
		        }
			   	
            }
        });
	} 

}
