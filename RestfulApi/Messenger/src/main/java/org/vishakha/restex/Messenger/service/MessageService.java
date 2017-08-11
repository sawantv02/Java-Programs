package org.vishakha.restex.Messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.vishakha.restex.Messenger.database.DatabaseClass;
import org.vishakha.restex.Messenger.model.*;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		
		messages.put(1L, new Message(1, "Hello World!", "vishakha"));
		Comment c1=new Comment(1, "comment 1 for message 1","vishu");
		messages.get(1).getComments().put(c1.getId(),c1);
		messages.put(2L, new Message(2, "Hello jersey!", "vishakha"));
		Comment c2=new Comment(2, "comment 1 for message 2","vishu");
		messages.get(2).getComments().put(c2.getId(),c2);
	}

	public List<Message> getAllMessages() {

		return new ArrayList<>(messages.values());

	}

	public List<Message> getAllMessagesByYear(int year) {
		List<Message> messagesByYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if (cal.get(Calendar.YEAR) == year)
				messagesByYear.add(message);
		}

		return messagesByYear;

	}

	public List<Message> getAllMessagesPaginated(int start, int size) {
		List<Message> list = new ArrayList<>(messages.values());
		if (start + size > list.size())
			return new ArrayList<Message>();
		return list.subList(start, start + size);
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0)
			return null;
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
