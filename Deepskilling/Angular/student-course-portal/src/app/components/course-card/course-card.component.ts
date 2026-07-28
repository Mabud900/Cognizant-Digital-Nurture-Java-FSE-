import { Component, Input, Output, EventEmitter, OnChanges, SimpleChanges } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreditLabelPipe } from '../../pipes/credit-label.pipe';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [CommonModule, CreditLabelPipe],
  templateUrl: './course-card.component.html',
  styleUrl: './course-card.component.css'
})
export class CourseCardComponent implements OnChanges {
  @Input() course!: { id: number, name: string, code: string, credits: number, gradeStatus: 'passed' | 'failed' | 'pending' };
  @Output() enrollRequested = new EventEmitter<number>();

  isEnrolled = false;
  isExpanded = false;

  ngOnChanges(changes: SimpleChanges): void {
    console.log('Previous Value:', changes['course']?.previousValue);
    console.log('Current Value:', changes['course']?.currentValue);
  }

  onEnrollClick(): void {
    this.isEnrolled = true;
    this.enrollRequested.emit(this.course.id);
  }

  toggleExpand(): void {
    this.isExpanded = !this.isExpanded;
  }

  get cardClasses() {
    return {
      'card--enrolled': this.isEnrolled,
      'card--full': this.course.credits >= 4,
      'expanded': this.isExpanded
    };
  }

  get gradeBorderColor(): string {
    switch (this.course.gradeStatus) {
      case 'passed': return 'green';
      case 'failed': return 'red';
      default: return 'grey';
    }
  }
}