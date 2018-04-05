package test1.selenium.selenium;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class JavaMailPop3Reader {

    public static void main(String args[]) throws Exception {

        //http://www.sql.ru/forum/1195541/javamail-smtp-i-yandex
        // mail server connection parameters
        Properties props = new Properties();
/*      props.put("mail.smtp.host", "smtp.yandex.ru");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "995");
        props.put("mail.smtp.socketFactory.port", "995");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");*/

        props.put("mail.pop.host", "pop.yandex.ru");
        props.put("mail.pop.auth", "true");
        props.put("mail.pop.port", "995");
        props.put("mail.pop.socketFactory.port", "995");
        props.put("mail.pop.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("altairsx", "fkmafvfqr");
                    }
                });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("altairsx@ya.ru"));
       // message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("a@grasoff.net"));
        message.setSubject("Subject");
        message.setText("Text");

        //Transport.send(message);

    }}