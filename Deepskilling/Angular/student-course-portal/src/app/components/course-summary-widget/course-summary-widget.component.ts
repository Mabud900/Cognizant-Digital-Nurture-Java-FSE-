import { Component } from '@angular/core';
import { CourseService } from '../../services/course.service';

@Component({
  selector: 'app-course-summary-widget',
  standalone: true,
  imports: [],
  templateUrl: './course-summary-widget.component.html',
  styleUrl: './course-summary-widget.component.css'
})
export class CourseSummaryWidgetComponent {

  constructor(private courseService: CourseService) {}

  get totalCourses(): number {
    return this.courseService.getCourses().length;
  }

  addSampleCourse(): void {
    const newId = this.totalCourses + 1;
    this.courseService.addCourse({
      id: newId,
      name: 'Sample Course ' + newId,
      code: 'SC' + (100 + newId),
      credits: 3,
      gradeStatus: 'pending'
    });
  }
}