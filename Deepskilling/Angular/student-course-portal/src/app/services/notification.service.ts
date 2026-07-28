import { Injectable } from '@angular/core';

// Deliberately not providedIn: 'root' — this only becomes available where
// a component explicitly lists it in its own `providers` array.
@Injectable()
export class NotificationService {
  private notifications: string[] = [];

  add(message: string): void {
    this.notifications.push(message);
  }

  getAll(): string[] {
    return this.notifications;
  }
}