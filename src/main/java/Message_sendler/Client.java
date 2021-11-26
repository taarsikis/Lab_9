package Message_sendler;

import lombok.Getter;

@Getter
public class Client {
    private static int clientNum = 0;

    private int id, age;
    private String name;
    private Gender sex;

    public Client(String name, int age, Gender sex) {
        this.id = generateId();
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    private int generateId(){
        return clientNum++;
    }

    @Override
    public String toString() {
        return String.format("Client{id=%d, name=%s, age=%d, sex=%s}", getId(), getName(), getAge(), getSex());
    }
}
