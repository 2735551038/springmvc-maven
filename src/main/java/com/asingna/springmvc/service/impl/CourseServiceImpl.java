package com.asingna.springmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.asingna.springmvc.model.Chapter;
import com.asingna.springmvc.model.Course;
import com.asingna.springmvc.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService{
	
	public Course getCourseById(Integer courseId){
		Course course = new Course();
		course.setCourseId(courseId);
		course.setTitle("����ǳ��Java���߳�");
		course.setImgPath("resources/imgs/course-img.jpg");
		course.setLearningNum(12345);
		course.setLevel(2);
		course.setLevelDesc("�м�");
		course.setDuration(7200l);
		course.setDescr("���߳����ճ������еĳ���֪ʶ��Ҳ������֪ʶ��bala bala...");
		
		List<Chapter> chapters = new ArrayList<Chapter>();
		wrapChapterList(courseId, chapters);
		course.setChapterList(chapters);
		
		return course;
	}
	
	public void wrapChapterList(Integer courseId, List<Chapter> chapterList){
		
		Chapter chapter = new Chapter();
		chapter.setId(1);
		chapter.setCourseId(courseId);
		chapter.setOrder(1);
		chapter.setTitle("��1�� ���̱߳���֪ʶ����");
		chapter.setDesc("���½���������̱߳����صı�������");	
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(2);
		chapter.setCourseId(courseId);
		chapter.setOrder(2);
		chapter.setTitle("��2�� Java �̳߳�����");
		chapter.setDesc("Java���Բ�����̵߳�֧�֣���δ�����������ֹͣ�̡߳����ʹ�ó��õ��̷߳�������������������̵߳Ĵ���");
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(3);
		chapter.setCourseId(courseId);
		chapter.setOrder(3);
		chapter.setTitle("��3�� Java �̵߳���ȷֹͣ");
		chapter.setDesc("�������������ȷ��ֹͣһ���̣߳���Ҫ�߳�ͣ���ˣ������߳�ͣ�úá�");		
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(4);
		chapter.setCourseId(courseId);
		chapter.setOrder(4);
		chapter.setTitle("��4�� �߳̽���");
		chapter.setDesc("�����������̵߳Ľ������������ĳ���Ԥ����");		
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(5);
		chapter.setCourseId(courseId);
		chapter.setOrder(5);
		chapter.setTitle("��5�� ����չ��");
		chapter.setDesc("�򵥽��� Java ������ص��࣬�����õĶ��̱߳��ģ�͡�");		
		chapterList.add(chapter);
	}
}
