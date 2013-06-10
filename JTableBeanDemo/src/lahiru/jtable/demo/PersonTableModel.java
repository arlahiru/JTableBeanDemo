/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lahiru.jtable.demo;

import java.util.Arrays;
import lahiru.jtable.demo.BeanTableModel;
import lahiru.jtable.demo.Person;

/**
 *
 * @author Lahiru Ruhunage
 */
public class PersonTableModel extends RowTableModel<Person> {

    private static String[] COLUMN_NAMES = {
        "Name",
        "Age",
        "Nationality",
        "Status"
    };

    public PersonTableModel() {

        super(Arrays.asList(COLUMN_NAMES));

        setRowClass(Person.class);

        setColumnClass(1, Integer.class);

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = getRow(rowIndex);

        switch (columnIndex) {
            case 0:
                return person.getName();
            case 1:
                return person.getAge();
            case 2:
                return person.getNationality();
            case 3:
                return person.getStatus();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        Person person = getRow(row);

        switch (column) {
            case 0:
                person.setName((String) value);
                break;
            case 1:
                person.setAge((Integer) value);
                break;
            case 2:
                person.setNationality((String) value);
                break;
            case 3:
                person.setStatus((String) value);
                break;
        }
    }
}
