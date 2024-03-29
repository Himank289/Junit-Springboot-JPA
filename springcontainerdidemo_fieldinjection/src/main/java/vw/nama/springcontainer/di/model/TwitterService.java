package vw.nama.springcontainer.di.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier("TwitterService")
@Component
public class TwitterService implements MessageService{

    @Override
    public void sendMessage(String message){
        System.out.println("twitter service"+message);
    }
}
