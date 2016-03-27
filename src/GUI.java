import javax.swing.*;

/**
 * Created by students UA:FTI-EI De Laet Jan & Yigit Yunus Emre on 17/03/2016.
 */
public class GUI {

    //Main Pane
    public JPanel mainPanel;
    private JTabbedPane mainTabbedPanel;
    private JTextArea welcomeTitle;
    private JTextField loginText;
    private JTextArea userCfgTitle;
    private JList userCfgList;
    private JLabel PCBuilderIcon;
    private JProgressBar progressBar;

    //Main Tabbed Panes
    private JPanel catalogueTab;
    private JPanel compareTab;
    private JPanel wattTab;
    private JPanel compatibilityTab;
    private JPanel exportTab;

    //catalogue Tab
    private JTextArea detailsTextArea;
    private JTextArea detailsTitleTextArea;
    private JTextArea componentGroupTitle;
    private JTextArea specificComponentTitle;
    private JButton motherboardButton;
    private JButton CPUButton;
    private JButton RAMButton;
    private JButton GPUButton;
    private JButton PSUButton;
    private JButton drivesButton;
    private JButton addComponent;
    private JButton addCompare;
    private JLabel selectedComponentPicture;

    //Compare Tab
    private JTextArea component1;
    private JTextArea component2;
    private JList list1;
    private JList list2;
    private JButton compareButton;
    private JLabel picture1;
    private JLabel picture2;


    //Watt Usage Tab
    private JTextArea wattInfo;
    private JButton calculateButton;
    private JTextArea wattResults;

    //Compatibility Check Tab
    private JTextArea compatibilityInfo;
    private JButton compatibilityButton;
    private JTextArea compatibilityResults;

    //Export (offer file) Tab
    private JTextArea exportInfo;
    private JButton exportButton;
    private JTextArea exportResults;




}