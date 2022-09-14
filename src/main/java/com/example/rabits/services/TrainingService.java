package com.example.rabits.services;

import com.example.rabits.models.Training;
import java.util.List;

public interface TrainingService {

  List<Training> findAll();

  void save(String type, String tasks);
}
