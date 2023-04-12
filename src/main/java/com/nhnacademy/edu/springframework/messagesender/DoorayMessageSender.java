package com.nhnacademy.edu.springframework.messagesender;

import com.nhn.dooray.client.DoorayHook;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.nhn.dooray.client.DoorayHookSender;

@Profile("default")
@Component("messageSender")
public class DoorayMessageSender implements MessageSender {

    @Override
    public boolean sendMessage(User user, String message) {
        new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/3204376758577275363/3514081992077299709/HOTTporbR6CBAVodltB-Dw")
                .send(DoorayHook.builder()
                        .botName("문은지")
                        .text("안녕하세요")
                        .build());
        return true;
    }
}
