import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CourseCardComponent } from '../../components/course-card/course-card.component';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCardComponent],
  templateUrl: './course-list.component.html',
  styleUrl: './course-list.component.css'
})
export class CourseListComponent {

  courses = [
    { id: 1, name: 'Angular', code: 'CS101', credits: 4 },
    { id: 2, name: 'Java', code: 'CS102', credits: 3 },
    { id: 3, name: 'Spring Boot', code: 'CS103', credits: 3 },
    { id: 4, name: 'Data Structures', code: 'CS104', credits: 4 },
    { id: 5, name: 'Databases', code: 'CS105', credits: 3 }
  ];

  selectedCourseId: number | null = null;

  onEnroll(courseId: number): void {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;
  }
}