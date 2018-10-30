package ru.maminspapin.example.sweater.repos;

import org.springframework.data.repository.CrudRepository;
import ru.maminspapin.example.sweater.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
