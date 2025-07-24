import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user.model';
import { environment } from '../../../enviroments/environment';

@Injectable({ providedIn: 'root' })
export class UserService {
  private baseUrl = environment.apiUrl;
  private apiUrl = `${this.baseUrl}/api/users`;

  constructor(private http: HttpClient) {}

  getUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.apiUrl);
  }
}
