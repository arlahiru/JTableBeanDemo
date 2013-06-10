/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lahiru.jtable.demo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lahiru Ruhunage
 */
public class BeanTableDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Bean Table Model Demo");

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Create a jTable
        JTable table = new JTable();

        JScrollPane scrollPane = new JScrollPane(table);
        
        //Create three demo objects to bind with the table
        final Person one = new Person("One", 10, "test", "test");
        final Person two = new Person("Two", 20, "test", "test");
        final Person three = new Person("Three", 30, "test", "test");

        //Bean table model
        final BeanTableModel model = new BeanTableModel(Person.class);

        //Row table model
        //final PersonTableModel model = new PersonTableModel();

        //Add demo objects to the table model
        model.addRow(one);
        model.addRow(two);
        model.addRow(three);
        
        //Set table model to the jTable
        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        /* Create a panel to show table change when an object update */
        
        JLabel lblName = new JLabel();

        lblName.setText("Row 1 Name");

        final JTextField txtName = new JTextField();
        
        txtName.setPreferredSize(new Dimension(100,20));

        txtName.setText(one.getName());

        JButton btn = new JButton();

        btn.setText("Update");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Simply set object name and it will propagate to table automatically
                one.setName(txtName.getText());

                model.fireTableDataChanged();
                
            }
        });

        JPanel south = new JPanel();

        south.add(lblName);
        south.add(txtName);
        south.add(btn);

        frame.getContentPane().add(scrollPane);

        frame.getContentPane().add( south,BorderLayout.SOUTH );

        frame.setVisible(true);

        frame.pack();


    }
}
