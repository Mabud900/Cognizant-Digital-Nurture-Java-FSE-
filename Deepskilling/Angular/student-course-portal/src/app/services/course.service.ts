import { Injectable } from '@angular/core';
import { Course } from '../models/course.model';

@Injectable({ providedIn: 'root' })
export class CourseService {

  private courses: Course[] = [
    { id: 1, name: 'Angular',         code: 'CS101', credits: 4, gradeStatus: 'passed'  },
    { id: 2, name: 'Java',            code: 'CS102', credits: 3, gradeStatus: 'pending' },
    { id: 3, name: 'Spring Boot',     code: 'CS103', credits: 3, gradeStatus: 'failed'  },
    { id: 4, name: 'Data Structures', code: 'CS104', credits: 4, gradeStatus: 'passed'  },
    { id: 5, name: 'Databases',       code: 'CS105', credits: 3, gradeStatus: 'pending' }
  ];

  getCourses(): Course[] {
    return this.courses;
  }

  getCourseById(id: number): Course | undefined {
    return this.courses.find(c => c.id === id);
  }

  addCourse(course: Course): void {
    this.courses.push(course);
  }
}