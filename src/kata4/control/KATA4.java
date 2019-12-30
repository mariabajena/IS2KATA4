package kata4.control;

import java.util.List;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class KATA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = new String("C:\\Users\\Maria\\Documents\\email.txt.txt");
        /* I */ List<Mail> mailList = MailListReader.read(fileName);
        /* P */ Histogram histogram = MailHistogramBuilder.build(mailList);
        /* O */ HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        /* O */ histogramDisplay.execute();
    }
    
}
