package com.fse.wttracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fse.wttracker.model.Workout;
import com.fse.wttracker.repository.WorkoutRepository;

@RestController
@CrossOrigin
@RequestMapping("/workout")
public class WorkoutTrackerController {

	@Autowired
	private WorkoutRepository workoutRepository;

	@RequestMapping(value = "/fetchall", method = RequestMethod.GET)
	public List<Workout> getAllWorkouts() {

		/*
		 * Workout workout1 = new Workout(1, "Morning run for 5 mins from svc");
		 * Workout workout2 = new Workout(2,
		 * "Boxing practice for 10 mins from svc"); Workout workout3 = new
		 * Workout(3, "Chest and tricep workout for 10 mins from svc"); Workout
		 * workout4 = new Workout(4, "Evening walk for 30 mins from svc");
		 * 
		 * List<Workout> workoutList = new ArrayList<>();
		 * workoutList.add(workout1); workoutList.add(workout2);
		 * workoutList.add(workout3); workoutList.add(workout4);
		 */

		return workoutRepository.findAll();
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveWorkout(@RequestBody Workout workout) {

		workoutRepository.save(workout);
	}

}
