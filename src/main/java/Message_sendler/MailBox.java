package Message_sendler;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MailBox {

    private final List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        Message_sendler mailSender = new Message_sendler();
        for (MailInfo mailInfo: infos) {
            mailSender.sendMail(mailInfo);
        }
        infos.clear();
    }
}
