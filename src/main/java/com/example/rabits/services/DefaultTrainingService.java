package com.example.rabits.services;

import com.example.rabits.models.Training;
import com.example.rabits.repositories.TrainingRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DefaultTrainingService implements TrainingService {

  private final TrainingRepository trainingRepository;

  public DefaultTrainingService(TrainingRepository trainingRepository) {
    this.trainingRepository = trainingRepository;
  }

  @Override
  public List<Training> findAll() {
    return trainingRepository.findAll();
  }

  @Override
  public void save(String type, String tasks) {
    trainingRepository.save(new Training(type, tasks));
  }

}
