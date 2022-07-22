package pro.sky.java.coursework5.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.java.coursework5.telegrambot.model.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    List<NotificationTask> findAllByDateTime(LocalDateTime dateTime);
}
