package Message_sendler;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter @AllArgsConstructor
public class MailInfo {
    public Client client;
    public MailCode mailCode;

    public MailInfo(Client client) {
    }

    public String getText() {
        HashMap<String, String > templates = new HashMap<String, String>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", Integer.toString(client.getAge()));
        String text = mailCode.generateText();
        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }
}
