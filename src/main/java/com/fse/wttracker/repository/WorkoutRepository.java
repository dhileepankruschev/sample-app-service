package com.fse.wttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fse.wttracker.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Integer> {

}
