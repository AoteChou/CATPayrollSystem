/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import CATPayrollSystem.Account;
import CATPayrollSystem.Agreement;
import CATPayrollSystem.BonusPaymentEvent;
import CATPayrollSystem.BonusRule;
import CATPayrollSystem.Employee;
import CATPayrollSystem.Entry;
import CATPayrollSystem.Event;
import CATPayrollSystem.EventType;
import CATPayrollSystem.JuniorDeveloperOverTimeRule;
import CATPayrollSystem.JuniorDeveloperRegularTimeRule;
import CATPayrollSystem.SeniorDeveloperOverTimeRule;
import CATPayrollSystem.SeniorDeveloperRegularTimeRule;
import CATPayrollSystem.TimeParser;
import CATPayrollSystem.WorkingEvent;
import static View.CATPayroll.employees;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.AccountException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author eddychou
 */
public class CATPayrollView extends javax.swing.JFrame {

    /**
     * Creates new form CATPayrollView
     */
    //public static Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
    public DefaultComboBoxModel employeeCBModel = new DefaultComboBoxModel<Employee>();

    private void initializeData() {

        Agreement caseyAgreement = new Agreement();
        caseyAgreement.getPostingRulesList().add(new JuniorDeveloperOverTimeRule());
        caseyAgreement.getPostingRulesList().add(new JuniorDeveloperRegularTimeRule());
        caseyAgreement.getPostingRulesList().add(new BonusRule());
        List<Account> caseyAccountList = new ArrayList<Account>();
        caseyAccountList.add(new Account(1111, 0));

        Agreement fadiAgreement = new Agreement();
        fadiAgreement.getPostingRulesList().add(new SeniorDeveloperRegularTimeRule());
        fadiAgreement.getPostingRulesList().add(new SeniorDeveloperOverTimeRule());
        fadiAgreement.getPostingRulesList().add(new BonusRule());

        List<Account> fadiAccountList = new ArrayList<Account>();
        fadiAccountList.add(new Account(2222, 0));

        //employees.put(1, new Employee(1, "Casey", caseyAgreement,caseyAccountList));
        //employees.put(2, new Employee(2, "Fadi", fadiAgreement,fadiAccountList));
        employeeCBModel.addElement(new Employee(1, "Casey", caseyAgreement, caseyAccountList));
        employeeCBModel.addElement(new Employee(2, "Fadi", fadiAgreement, fadiAccountList));

        employeeIDCombobox.setModel(employeeCBModel);

    }

    public CATPayrollView() {
        initComponents();
        initializeData();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        setSize((int)width, (int)height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seniorDeveloperOverTimeRule1 = new CATPayrollSystem.SeniorDeveloperOverTimeRule();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        eventTypeComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        employeeIDCombobox = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        hourWorkedTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        simulateEventButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        entryLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        entryTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        entryLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        aggregatedEntryList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eventTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Working Hours", "Bonus Payment"}));
        eventTypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eventTypeComboBoxItemStateChanged(evt);
            }
        });
        eventTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Event Type");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(eventTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setText("Employee");

        employeeIDCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "101", "102", "103", "104", "105", "201","202","203","204", "205","206" }));
        employeeIDCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        hourWorkedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourWorkedTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Hours Worked");

        simulateEventButton.setText("Simulate Event");
        simulateEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateEventButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(hourWorkedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simulateEventButton)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hourWorkedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(simulateEventButton)
                .addContainerGap())
        );

        entryLabel.setText("Current Accounting Entry");

        entryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Amount(£)", "Entry Time", "Event Time", "Event Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(entryTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entryLabel)
                .addContainerGap(537, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        entryLabel1.setText("Aggregated Entry List");

        aggregatedEntryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Amount(£)", "Entry Time", "Event Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(aggregatedEntryList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entryLabel1)
                .addContainerGap(549, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entryLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel1.setText("Total Salary (£):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(totalAmountLabel)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalAmountLabel))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventTypeComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_eventTypeComboBoxActionPerformed

    private void hourWorkedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourWorkedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourWorkedTextFieldActionPerformed

    private ArrayList<Event> createWorkingEvent(double workingHours, Employee employee) throws Exception {
        ArrayList<Event> events = new ArrayList<Event>();
        if (workingHours > 8) {

            Event tempEvent = new WorkingEvent(EventType.OvertimeHours, Calendar.getInstance().getTime(), employee, workingHours - 8);
            events.add(tempEvent);
            tempEvent = new WorkingEvent(EventType.RegularHours, Calendar.getInstance().getTime(), employee, 8);
            events.add(tempEvent);

            return events;
        } else if (workingHours <= 8) {
            Event tempEvent = new WorkingEvent(EventType.RegularHours, Calendar.getInstance().getTime(), employee, workingHours);
            events.add(tempEvent);

            return events;
        } else {
            throw new Exception("Bad working hours");
        }
    }

    private ArrayList<Event> createBonusEvent(double bonusAmnous, Employee employee) throws Exception {
        ArrayList<Event> events = new ArrayList<Event>();
        Event tempEvent = new BonusPaymentEvent(Calendar.getInstance().getTime(), employee, bonusAmnous);
        events.add(tempEvent);

        return events;
    }

    private void simulateEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateEventButtonActionPerformed

        String eventString = eventTypeComboBox.getSelectedItem().toString();
        if (eventString == "Working Hours") {
            performWorkingEvent();
        } else if (eventString == "Bonus Payment") {
            performBonusEvent();
        }


    }//GEN-LAST:event_simulateEventButtonActionPerformed

    private void performWorkingEvent() {
        double totalAmount =0.0; 
        try {
            // TODO add your handling code here:
            Double workingHours = Double.parseDouble(hourWorkedTextField.getText());
            Double regularHours=0.0;
            Double overtimeHours=0.0;

            if (workingHours > 8) {
                regularHours = 8.0;
                overtimeHours = workingHours - 8;
            } else {
                regularHours = workingHours;
            }

            ArrayList<Event> events = createWorkingEvent(workingHours, (Employee) employeeIDCombobox.getSelectedItem());
            ArrayList<Entry> resultingEntriesofAllEvents = new ArrayList<Entry>();

            for (Event event : events) {

                event.process();
                ArrayList<Entry> resultingEntries = (ArrayList<Entry>) event.getAccountingEntries();
                resultingEntriesofAllEvents.addAll(resultingEntries);

            }

            String columns[] = {"Employee ID", "Amount(£)", "Entry Time", "Event Time", "Event Type"};
            Object[][] resultingEntriesData = new Object[resultingEntriesofAllEvents.size()][5];
            for (int i = 0; i < resultingEntriesofAllEvents.size(); i++) {
                resultingEntriesData[i][0] = resultingEntriesofAllEvents.get(i).getEmployee().getEmployeeId();
                resultingEntriesData[i][1] = resultingEntriesofAllEvents.get(i).getAmount();
                resultingEntriesData[i][2] = TimeParser.parseTime(resultingEntriesofAllEvents.get(i).getEntryTime());
                resultingEntriesData[i][3] = TimeParser.parseTime(resultingEntriesofAllEvents.get(i).getEventTime());
                EventType eventType = resultingEntriesofAllEvents.get(i).getEventType();
                String eventTypeStirng="";
                if (eventType == EventType.RegularHours) {
                    eventTypeStirng = "Regular Hours ("+ regularHours+" h)";
                } else if (eventType == EventType.OvertimeHours){
                    eventTypeStirng = "Overtime Hours ("+ overtimeHours+" h)";
                }
                resultingEntriesData[i][4] = eventTypeStirng;

            }

            Employee currEmployee = (Employee) employeeIDCombobox.getSelectedItem();
            ArrayList<Account> employeeAccounts = (ArrayList<Account>) (currEmployee.getEmployeeAccountsList());

            String columns2[] = {"Employee ID", "Amount(£)", "Entry Time", "Event Time"};
            ArrayList<Entry> allAccouEntries = new ArrayList<Entry>();
            for (int i = 0; i < employeeAccounts.size(); i++) {

                Account account = employeeAccounts.get(i);
                ArrayList<Entry> entries = (ArrayList<Entry>) account.getAccountEntries();
                allAccouEntries.addAll(entries);

            }

            Object[][] allAccouEntriesData = new Object[allAccouEntries.size()][4];
            totalAmount = 0.0;
            for (int i = 0; i < allAccouEntries.size(); i++) {
                allAccouEntriesData[i][0] = allAccouEntries.get(i).getEmployee().getEmployeeId();
                allAccouEntriesData[i][1] = allAccouEntries.get(i).getAmount();
                totalAmount+=allAccouEntries.get(i).getAmount();
                allAccouEntriesData[i][2] = TimeParser.parseTime(allAccouEntries.get(i).getEntryTime());
                allAccouEntriesData[i][3] = TimeParser.parseTime(allAccouEntries.get(i).getEventTime());
            }

            DefaultTableModel defaultTableModel = new DefaultTableModel(resultingEntriesData, columns);
            DefaultTableModel aggregatedTableModel = new DefaultTableModel(allAccouEntriesData, columns2);

            entryTable.setModel(defaultTableModel);
            aggregatedEntryList.setModel(aggregatedTableModel);
            
            totalAmountLabel.setText(totalAmount +"");

        } catch (Exception ex) {
            Logger.getLogger(CATPayrollView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void performBonusEvent() {
        double totalAmount =0.0;

        try {
            // TODO add your handling code here:
            ArrayList<Event> events = createBonusEvent(Double.parseDouble(hourWorkedTextField.getText()), (Employee) employeeIDCombobox.getSelectedItem());
            ArrayList<Entry> resultingEntriesofAllEvents = new ArrayList<Entry>();

            for (Event event : events) {

                event.process();
                ArrayList<Entry> resultingEntries = (ArrayList<Entry>) event.getAccountingEntries();
                resultingEntriesofAllEvents.addAll(resultingEntries);

            }

            String columns[] = {"Employee ID", "Amount(£)", "Entry Time", "Event Time", "Event Type"};
            Object[][] resultingEntriesData = new Object[resultingEntriesofAllEvents.size()][5];
            for (int i = 0; i < resultingEntriesofAllEvents.size(); i++) {
                resultingEntriesData[i][0] = resultingEntriesofAllEvents.get(i).getEmployee().getEmployeeId();
                resultingEntriesData[i][1] = resultingEntriesofAllEvents.get(i).getAmount();
                resultingEntriesData[i][2] = TimeParser.parseTime(resultingEntriesofAllEvents.get(i).getEntryTime());
                resultingEntriesData[i][3] = TimeParser.parseTime(resultingEntriesofAllEvents.get(i).getEventTime());
                EventType eventType = resultingEntriesofAllEvents.get(i).getEventType();
                resultingEntriesData[i][4] = eventType.toString();

            }

            Employee currEmployee = (Employee) employeeIDCombobox.getSelectedItem();
            ArrayList<Account> employeeAccounts = (ArrayList<Account>) (currEmployee.getEmployeeAccountsList());

            String columns2[] = {"Employee ID", "Amount(£)", "Entry Time", "Event Time"};
            ArrayList<Entry> allAccouEntries = new ArrayList<Entry>();
            for (int i = 0; i < employeeAccounts.size(); i++) {

                Account account = employeeAccounts.get(i);
                ArrayList<Entry> entries = (ArrayList<Entry>) account.getAccountEntries();
                allAccouEntries.addAll(entries);

            }

            Object[][] allAccouEntriesData = new Object[allAccouEntries.size()][4];
            totalAmount = 0.0;
            for (int i = 0; i < allAccouEntries.size(); i++) {
                allAccouEntriesData[i][0] = allAccouEntries.get(i).getEmployee().getEmployeeId();
                allAccouEntriesData[i][1] = allAccouEntries.get(i).getAmount();
                totalAmount+=allAccouEntries.get(i).getAmount();
                allAccouEntriesData[i][2] = TimeParser.parseTime(allAccouEntries.get(i).getEntryTime());
                allAccouEntriesData[i][3] = TimeParser.parseTime(allAccouEntries.get(i).getEventTime());
            }

            DefaultTableModel defaultTableModel = new DefaultTableModel(resultingEntriesData, columns);
            DefaultTableModel aggregatedTableModel = new DefaultTableModel(allAccouEntriesData, columns2);

            entryTable.setModel(defaultTableModel);
            aggregatedEntryList.setModel(aggregatedTableModel);
            
            totalAmountLabel.setText(totalAmount+"");

        } catch (Exception ex) {
            Logger.getLogger(CATPayrollView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void employeeIDComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIDComboboxActionPerformed

    private void eventTypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eventTypeComboBoxItemStateChanged
        // TODO add your handling code here:
        String eventString = eventTypeComboBox.getSelectedItem().toString();
        if (eventString == "Working Hours") {
            jLabel6.setText("Working Hours");
        } else if (eventString == "Bonus Payment") {
            jLabel6.setText("Bonus Amount");
        }
    }//GEN-LAST:event_eventTypeComboBoxItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CATPayrollView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CATPayrollView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CATPayrollView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CATPayrollView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CATPayrollView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable aggregatedEntryList;
    private javax.swing.JComboBox employeeIDCombobox;
    private javax.swing.JLabel entryLabel;
    private javax.swing.JLabel entryLabel1;
    private javax.swing.JTable entryTable;
    private javax.swing.JComboBox eventTypeComboBox;
    private javax.swing.JTextField hourWorkedTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private CATPayrollSystem.SeniorDeveloperOverTimeRule seniorDeveloperOverTimeRule1;
    private javax.swing.JButton simulateEventButton;
    private javax.swing.JLabel totalAmountLabel;
    // End of variables declaration//GEN-END:variables
}
