import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NotificationService } from '../../services/notification.service';

@Component({
  selector: 'app-notification',
  standalone: true,
  imports: [CommonModule],
  // Component-level provider — this creates a NEW NotificationService
  // instance scoped to this component (and its children), separate from
  // any other instance elsewhere. Two <app-notification> tags on the same
  // page would each keep their own notification list; adding one in one
  // instance never shows up in the other.
  providers: [NotificationService],
  templateUrl: './notification.component.html',
  styleUrl: './notification.component.css'
})
export class NotificationComponent {
  constructor(private notificationService: NotificationService) {}

  get notifications(): string[] {
    return this.notificationService.getAll();
  }

  addNotification(): void {
    this.notificationService.add('New notification at ' + new Date().toLocaleTimeString());
  }
}