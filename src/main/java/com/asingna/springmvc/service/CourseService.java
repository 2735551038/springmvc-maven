package com.asingna.springmvc.service;

import org.springframework.stereotype.Service;

import com.asingna.springmvc.model.Course;

@Service
public interface CourseService {
	Course getCourseById(Integer courseId);
}
