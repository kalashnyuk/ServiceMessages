package ru.home.srvmsg.service;

import java.util.List;

import ru.home.srvmsg.model.Message;
import ru.home.srvmsg.model.User;

public interface MessageService {
    public List<Message> listMessage(User user, String sort, String order);

    public void addMessage(Message message) throws Exception;

    public void deleteMessage(Integer id);

    public void deleteMessageByUser(User user);

    public Message getMessage(Integer id) throws Exception;
}
