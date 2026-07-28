import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCardComponent } from '../../components/course-card/course-card.component';
import { HighlightDirective } from '../../directives/highlight.directive';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCardComponent, HighlightDirective],
  templateUrl: './course-list.component.html',
  styleUrl: './course-list.component.css'
})
export class CourseListComponent {
  isLoading=true;

  courses = [
  { id: 1, name: 'Angular',         code: 'CS101', credits: 4, gradeStatus: 'passed' as const  },
  { id: 2, name: 'Java',            code: 'CS102', credits: 3, gradeStatus: 'pending'as const },
  { id: 3, name: 'Spring Boot',     code: 'CS103', credits: 3, gradeStatus: 'failed' as const },
  { id: 4, name: 'Data Structures', code: 'CS104', credits: 4, gradeStatus: 'passed' as const },
  { id: 5, name: 'Databases',       code: 'CS105', credits: 3, gradeStatus: 'pending'as const }
];

  selectedCourseId: number | null = null;

  ngOnInit(): void {
    setTimeout(() => {
      this.isLoading = false;
    }, 1500);
  }
  trackByCourseId(index: number, course: any): number {
    return course.id;
  }

  onEnroll(courseId: number): void {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;
  }
}